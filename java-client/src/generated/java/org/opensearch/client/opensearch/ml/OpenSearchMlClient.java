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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.ml;

import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.OpenSearchException;
import org.opensearch.client.transport.JsonEndpoint;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.util.ObjectBuilder;

/**
 * Client for the ml namespace.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class OpenSearchMlClient extends ApiClient<OpenSearchTransport, OpenSearchMlClient> {
    public OpenSearchMlClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchMlClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchMlClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchMlClient(this.transport, transportOptions);
    }

    // ----- Endpoint: ml.delete_model_group

    /**
     * Deletes a model group.
     */
    public DeleteModelGroupResponse deleteModelGroup(DeleteModelGroupRequest request) throws IOException, OpenSearchException {
        @SuppressWarnings("unchecked")
        JsonEndpoint<DeleteModelGroupRequest, DeleteModelGroupResponse, ErrorResponse> endpoint = (JsonEndpoint<
            DeleteModelGroupRequest,
            DeleteModelGroupResponse,
            ErrorResponse>) DeleteModelGroupRequest._ENDPOINT;

        return this.transport.performRequest(request, endpoint, this.transportOptions);
    }

    /**
     * Deletes a model group.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteModelGroupRequest}
     */
    public final DeleteModelGroupResponse deleteModelGroup(
        Function<DeleteModelGroupRequest.Builder, ObjectBuilder<DeleteModelGroupRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteModelGroup(fn.apply(new DeleteModelGroupRequest.Builder()).build());
    }

    // ----- Endpoint: ml.register_model

    /**
     * Registers a model.
     */
    public RegisterModelResponse registerModel(RegisterModelRequest request) throws IOException, OpenSearchException {
        @SuppressWarnings("unchecked")
        JsonEndpoint<RegisterModelRequest, RegisterModelResponse, ErrorResponse> endpoint = (JsonEndpoint<
            RegisterModelRequest,
            RegisterModelResponse,
            ErrorResponse>) RegisterModelRequest._ENDPOINT;

        return this.transport.performRequest(request, endpoint, this.transportOptions);
    }

    /**
     * Registers a model.
     *
     * @param fn a function that initializes a builder to create the {@link RegisterModelRequest}
     */
    public final RegisterModelResponse registerModel(Function<RegisterModelRequest.Builder, ObjectBuilder<RegisterModelRequest>> fn)
        throws IOException, OpenSearchException {
        return registerModel(fn.apply(new RegisterModelRequest.Builder()).build());
    }

    // ----- Endpoint: ml.register_model_group

    /**
     * Registers a model group.
     */
    public RegisterModelGroupResponse registerModelGroup(RegisterModelGroupRequest request) throws IOException, OpenSearchException {
        @SuppressWarnings("unchecked")
        JsonEndpoint<RegisterModelGroupRequest, RegisterModelGroupResponse, ErrorResponse> endpoint = (JsonEndpoint<
            RegisterModelGroupRequest,
            RegisterModelGroupResponse,
            ErrorResponse>) RegisterModelGroupRequest._ENDPOINT;

        return this.transport.performRequest(request, endpoint, this.transportOptions);
    }

    /**
     * Registers a model group.
     *
     * @param fn a function that initializes a builder to create the {@link RegisterModelGroupRequest}
     */
    public final RegisterModelGroupResponse registerModelGroup(
        Function<RegisterModelGroupRequest.Builder, ObjectBuilder<RegisterModelGroupRequest>> fn
    ) throws IOException, OpenSearchException {
        return registerModelGroup(fn.apply(new RegisterModelGroupRequest.Builder()).build());
    }
}
