/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

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

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

package org.opensearch.client.opensearch.tasks;

import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.OpenSearchException;
import org.opensearch.client.transport.JsonEndpoint;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.util.ObjectBuilder;

/**
 * Client for the tasks namespace.
 */
public class OpenSearchTasksClient extends OpenSearchTasksClientBase<OpenSearchTasksClient> {

    public OpenSearchTasksClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchTasksClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchTasksClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchTasksClient(this.transport, transportOptions);
    }

    // ----- Endpoint: tasks.get

    /**
     * Returns information about a task.
     *
     *
     */

    public GetTasksResponse get(GetTasksRequest request) throws IOException, OpenSearchException {
        @SuppressWarnings("unchecked")
        JsonEndpoint<GetTasksRequest, GetTasksResponse, ErrorResponse> endpoint = (JsonEndpoint<
            GetTasksRequest,
            GetTasksResponse,
            ErrorResponse>) GetTasksRequest._ENDPOINT;

        return this.transport.performRequest(request, endpoint, this.transportOptions);
    }

    /**
     * Returns information about a task.
     *
     * @param fn
     *            a function that initializes a builder to create the
     *            {@link GetTasksRequest}
     *
     */

    public final GetTasksResponse get(Function<GetTasksRequest.Builder, ObjectBuilder<GetTasksRequest>> fn) throws IOException,
        OpenSearchException {
        return get(fn.apply(new GetTasksRequest.Builder()).build());
    }
}
