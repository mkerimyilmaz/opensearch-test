/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.opensearch.client.transport.rest_client;

import org.opensearch.client.opensearch._types.OpensearchException;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.NdJsonpSerializable;
import org.opensearch.client.transport.BooleanEndpoint;
import org.opensearch.client.transport.BooleanResponse;
import org.opensearch.client.transport.Endpoint;
import org.opensearch.client.transport.Transport;
import org.opensearch.client.transport.TransportOptions;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.util.EntityUtils;
import org.opensearch.client.Cancellable;
import org.opensearch.client.Request;
import org.opensearch.client.Response;
import org.opensearch.client.ResponseException;
import org.opensearch.client.ResponseListener;
import org.opensearch.client.RestClient;
import org.opensearch.client.RequestOptions;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class RestClientTransport implements Transport {

    private final RestClient restClient;
    private final JsonpMapper mapper;
    private final TransportOptions transportOptions;

    public RestClientTransport(RestClient restClient, JsonpMapper mapper, @Nullable TransportOptions options) {
        this.restClient = restClient;
        this.mapper = mapper;
        this.transportOptions = options == null ? TransportOptions.DEFAULT : options;
    }

    public RestClientTransport(RestClient restClient, JsonpMapper mapper) {
        this(restClient, mapper, null);
    }

    /**
     * Creates a new {@link #RestClientTransport} with specific request options.
     */
    public RestClientTransport withRequestOptions(@Nullable TransportOptions options) {
        return new RestClientTransport(this.restClient, this.mapper, options);
    }

    @Override
    public JsonpMapper jsonpMapper() {
        return mapper;
    }

    @Override
    public Map<String, String> headers() {
        Map<String, String> headers = new HashMap<>();
        transportOptions.headers().forEach(header -> {
            headers.put(header.name(), header.value());
        });
        return headers;
    }

    @Override
    public Map<String, String> queryParameters() {
        Map<String, String> queryParameters = new HashMap<>();
        transportOptions.queryParameters().forEach(parameter -> {
            queryParameters.put(parameter.name(), parameter.value());
        });
        return queryParameters;
    }

    @Override
    public void close() throws IOException {
        this.restClient.close();
    }

    public <RequestT, ResponseT, ErrorT> ResponseT performRequest(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint,
        @Nullable TransportOptions options
    ) throws IOException {

        Request clientReq = prepareLowLevelRequest(request, endpoint, options);
        Response clientResp = restClient.performRequest(clientReq);
        return getHighLevelResponse(clientResp, endpoint);
    }

    public <RequestT, ResponseT, ErrorT> CompletableFuture<ResponseT> performRequestAsync(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint,
        @Nullable TransportOptions options
    ) {
        Request clientReq = prepareLowLevelRequest(request, endpoint, options);

        RequestFuture<ResponseT> future = new RequestFuture<>();

        future.cancellable = restClient.performRequestAsync(clientReq, new ResponseListener() {
            @Override
            public void onSuccess(Response clientResp) {
                try {
                    ResponseT response = getHighLevelResponse(clientResp, endpoint);
                    future.complete(response);
                } catch (Exception e) {
                    future.completeExceptionally(e);
                }
            }

            @Override
            public void onFailure(Exception e) {
                future.completeExceptionally(e);
            }
        });

        return future;
    }

    private static class RequestFuture<T> extends CompletableFuture<T> {
        private volatile Cancellable cancellable;

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            boolean cancelled = super.cancel(mayInterruptIfRunning);
            if (cancelled && cancellable != null) {
                cancellable.cancel();
            }
            return cancelled;
        }
    }

    private <RequestT> Request prepareLowLevelRequest(
        RequestT request,
        Endpoint<RequestT, ?, ?> endpoint,
        @Nullable TransportOptions options
    ) {
        String method = endpoint.method(request);
        String path = endpoint.requestUrl(request);
        Map<String, String> params = endpoint.queryParameters(request);

        Request clientReq = new Request(method, path);
        RequestOptions.Builder optBuilder = RequestOptions.DEFAULT.toBuilder();
        headers().forEach(optBuilder::addHeader);
        // TODO - Fix
//        queryParameters().forEach(optBuilder::addParameter);
        clientReq.addParameters(params);
        clientReq.setOptions(optBuilder.build());

        if (endpoint.hasRequestBody()) {
            // Request has a body and must implement JsonpSerializable or NdJsonpSerializable
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            if (request instanceof NdJsonpSerializable) {
                writeNdJson((NdJsonpSerializable) request, baos);
            } else {
                JsonGenerator generator = mapper.jsonProvider().createGenerator(baos);
                mapper.serialize(request, generator);
                generator.close();
            }

            clientReq.setEntity(new ByteArrayEntity(baos.toByteArray(), ContentType.APPLICATION_JSON));
        }
        // Request parameter intercepted by LLRC
        clientReq.addParameter("ignore", "400,401,403,404,405");
        return clientReq;
    }

    /**
     * Write an nd-json value by serializing each of its items on a separate line, recursing if its items themselves implement
     * {@link NdJsonpSerializable} to flattening nested structures.
     */
    private void writeNdJson(NdJsonpSerializable value, ByteArrayOutputStream baos) {
        Iterator<?> values = value._serializables();
        while(values.hasNext()) {
            Object item = values.next();
            if (item instanceof NdJsonpSerializable && item != value) { // do not recurse on the item itself
                writeNdJson((NdJsonpSerializable) item, baos);
            } else {
                JsonGenerator generator = mapper.jsonProvider().createGenerator(baos);
                mapper.serialize(item, generator);
                generator.close();
                baos.write('\n');
            }
        }
    }

    private <ResponseT, ErrorT> ResponseT getHighLevelResponse(
        Response clientResp,
        Endpoint<?, ResponseT, ErrorT> endpoint
    ) throws IOException {

        try {
            int statusCode = clientResp.getStatusLine().getStatusCode();

            if (endpoint.isError(statusCode)) {
                // API error
                ErrorT error = null;
                try {
                    JsonpDeserializer<ErrorT> errorParser = endpoint.errorParser(statusCode);
                    if (errorParser != null) {
                        // Expecting a body
                        InputStream content = clientResp.getEntity().getContent();
                        JsonParser parser = mapper.jsonProvider().createParser(content);
                        error = errorParser.deserialize(parser, mapper);
                    }
                } catch (Exception ex) {
                    // Cannot decode error
                    ResponseException respEx = new ResponseException(clientResp);
                    respEx.initCause(ex);
                    throw respEx;
                }

                // TODO: have the endpoint provide the exception constructor
                throw new OpensearchException((ErrorResponse) error);

            } else if (endpoint instanceof BooleanEndpoint) {
                BooleanEndpoint<?> bep = (BooleanEndpoint<?>) endpoint;

                @SuppressWarnings("unchecked")
                ResponseT response = (ResponseT) new BooleanResponse(bep.getResult(statusCode));

                return response;

            } else {
                // Successful response
                ResponseT response = null;
                JsonpDeserializer<ResponseT> responseParser = endpoint.responseParser();
                if (responseParser != null) {
                    // Expecting a body
                    try (InputStream content = clientResp.getEntity().getContent()) {
                        JsonParser parser = mapper.jsonProvider().createParser(content);
                        response = responseParser.deserialize(parser, mapper);
                    }
                }
                return response;
            }
        } finally {
            EntityUtils.consume(clientResp.getEntity());
        }
    }
}
