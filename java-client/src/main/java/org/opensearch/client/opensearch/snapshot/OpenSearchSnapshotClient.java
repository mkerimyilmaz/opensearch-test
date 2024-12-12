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

package org.opensearch.client.opensearch.snapshot;

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
 * Client for the snapshot namespace.
 */
public class OpenSearchSnapshotClient extends OpenSearchSnapshotClientBase<OpenSearchSnapshotClient> {

    public OpenSearchSnapshotClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchSnapshotClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchSnapshotClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchSnapshotClient(this.transport, transportOptions);
    }

    // ----- Endpoint: snapshot.create

    /**
     * Creates a snapshot in a repository.
     *
     *
     */

    public CreateSnapshotResponse create(CreateSnapshotRequest request) throws IOException, OpenSearchException {
        @SuppressWarnings("unchecked")
        JsonEndpoint<CreateSnapshotRequest, CreateSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<
            CreateSnapshotRequest,
            CreateSnapshotResponse,
            ErrorResponse>) CreateSnapshotRequest._ENDPOINT;

        return this.transport.performRequest(request, endpoint, this.transportOptions);
    }

    // ----- Endpoint: snapshot.delete

    /**
     * Deletes a snapshot.
     *
     *
     */

    public DeleteSnapshotResponse delete(DeleteSnapshotRequest request) throws IOException, OpenSearchException {
        @SuppressWarnings("unchecked")
        JsonEndpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<
            DeleteSnapshotRequest,
            DeleteSnapshotResponse,
            ErrorResponse>) DeleteSnapshotRequest._ENDPOINT;

        return this.transport.performRequest(request, endpoint, this.transportOptions);
    }

    /**
     * Deletes a snapshot.
     *
     * @param fn
     *            a function that initializes a builder to create the
     *            {@link DeleteSnapshotRequest}
     *
     */

    public final DeleteSnapshotResponse delete(Function<DeleteSnapshotRequest.Builder, ObjectBuilder<DeleteSnapshotRequest>> fn)
        throws IOException, OpenSearchException {
        return delete(fn.apply(new DeleteSnapshotRequest.Builder()).build());
    }

    // ----- Endpoint: snapshot.restore

    /**
     * Restores a snapshot.
     *
     *
     */

    public RestoreResponse restore(RestoreRequest request) throws IOException, OpenSearchException {
        @SuppressWarnings("unchecked")
        JsonEndpoint<RestoreRequest, RestoreResponse, ErrorResponse> endpoint = (JsonEndpoint<
            RestoreRequest,
            RestoreResponse,
            ErrorResponse>) RestoreRequest._ENDPOINT;

        return this.transport.performRequest(request, endpoint, this.transportOptions);
    }

    /**
     * Restores a snapshot.
     *
     * @param fn
     *            a function that initializes a builder to create the
     *            {@link RestoreRequest}
     *
     */

    public final RestoreResponse restore(Function<RestoreRequest.Builder, ObjectBuilder<RestoreRequest>> fn) throws IOException,
        OpenSearchException {
        return restore(fn.apply(new RestoreRequest.Builder()).build());
    }

    // ----- Endpoint: snapshot.status

    /**
     * Returns information about the status of a snapshot.
     *
     *
     */

    public SnapshotStatusResponse status(SnapshotStatusRequest request) throws IOException, OpenSearchException {
        @SuppressWarnings("unchecked")
        JsonEndpoint<SnapshotStatusRequest, SnapshotStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<
            SnapshotStatusRequest,
            SnapshotStatusResponse,
            ErrorResponse>) SnapshotStatusRequest._ENDPOINT;

        return this.transport.performRequest(request, endpoint, this.transportOptions);
    }

    /**
     * Returns information about the status of a snapshot.
     *
     * @param fn
     *            a function that initializes a builder to create the
     *            {@link SnapshotStatusRequest}
     *
     */

    public final SnapshotStatusResponse status(Function<SnapshotStatusRequest.Builder, ObjectBuilder<SnapshotStatusRequest>> fn)
        throws IOException, OpenSearchException {
        return status(fn.apply(new SnapshotStatusRequest.Builder()).build());
    }

    /**
     * Returns information about the status of a snapshot.
     *
     *
     */

    public SnapshotStatusResponse status() throws IOException, OpenSearchException {
        return this.transport.performRequest(
            new SnapshotStatusRequest.Builder().build(),
            SnapshotStatusRequest._ENDPOINT,
            this.transportOptions
        );
    }
}
