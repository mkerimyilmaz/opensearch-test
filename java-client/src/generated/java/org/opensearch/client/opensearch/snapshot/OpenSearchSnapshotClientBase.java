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

package org.opensearch.client.opensearch.snapshot;

import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch._types.OpenSearchException;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.util.ObjectBuilder;

/**
 * Client for the snapshot namespace.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public abstract class OpenSearchSnapshotClientBase<Self extends OpenSearchSnapshotClientBase<Self>> extends ApiClient<
    OpenSearchTransport,
    Self> {
    public OpenSearchSnapshotClientBase(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    // ----- Endpoint: snapshot.cleanup_repository

    /**
     * Removes stale data from repository.
     */
    public CleanupRepositoryResponse cleanupRepository(CleanupRepositoryRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequest(request, CleanupRepositoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Removes stale data from repository.
     *
     * @param fn a function that initializes a builder to create the {@link CleanupRepositoryRequest}
     */
    public final CleanupRepositoryResponse cleanupRepository(
        Function<CleanupRepositoryRequest.Builder, ObjectBuilder<CleanupRepositoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return cleanupRepository(fn.apply(new CleanupRepositoryRequest.Builder()).build());
    }

    // ----- Endpoint: snapshot.clone

    /**
     * Clones indexes from one snapshot into another snapshot in the same repository.
     */
    public CloneSnapshotResponse clone(CloneSnapshotRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequest(request, CloneSnapshotRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Clones indexes from one snapshot into another snapshot in the same repository.
     *
     * @param fn a function that initializes a builder to create the {@link CloneSnapshotRequest}
     */
    public final CloneSnapshotResponse clone(Function<CloneSnapshotRequest.Builder, ObjectBuilder<CloneSnapshotRequest>> fn)
        throws IOException, OpenSearchException {
        return clone(fn.apply(new CloneSnapshotRequest.Builder()).build());
    }

    // ----- Endpoint: snapshot.create

    /**
     * Creates a snapshot in a repository.
     */
    public CreateSnapshotResponse create(CreateSnapshotRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequest(request, CreateSnapshotRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates a snapshot in a repository.
     *
     * @param fn a function that initializes a builder to create the {@link CreateSnapshotRequest}
     */
    public final CreateSnapshotResponse create(Function<CreateSnapshotRequest.Builder, ObjectBuilder<CreateSnapshotRequest>> fn)
        throws IOException, OpenSearchException {
        return create(fn.apply(new CreateSnapshotRequest.Builder()).build());
    }

    // ----- Endpoint: snapshot.create_repository

    /**
     * Creates a repository.
     */
    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequest(request, CreateRepositoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates a repository.
     *
     * @param fn a function that initializes a builder to create the {@link CreateRepositoryRequest}
     */
    public final CreateRepositoryResponse createRepository(
        Function<CreateRepositoryRequest.Builder, ObjectBuilder<CreateRepositoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return createRepository(fn.apply(new CreateRepositoryRequest.Builder()).build());
    }

    // ----- Endpoint: snapshot.delete_repository

    /**
     * Deletes a repository.
     */
    public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequest(request, DeleteRepositoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a repository.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteRepositoryRequest}
     */
    public final DeleteRepositoryResponse deleteRepository(
        Function<DeleteRepositoryRequest.Builder, ObjectBuilder<DeleteRepositoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteRepository(fn.apply(new DeleteRepositoryRequest.Builder()).build());
    }

    // ----- Endpoint: snapshot.get

    /**
     * Returns information about a snapshot.
     */
    public GetSnapshotResponse get(GetSnapshotRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequest(request, GetSnapshotRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about a snapshot.
     *
     * @param fn a function that initializes a builder to create the {@link GetSnapshotRequest}
     */
    public final GetSnapshotResponse get(Function<GetSnapshotRequest.Builder, ObjectBuilder<GetSnapshotRequest>> fn) throws IOException,
        OpenSearchException {
        return get(fn.apply(new GetSnapshotRequest.Builder()).build());
    }

    // ----- Endpoint: snapshot.get_repository

    /**
     * Returns information about a repository.
     */
    public GetRepositoryResponse getRepository(GetRepositoryRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequest(request, GetRepositoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about a repository.
     *
     * @param fn a function that initializes a builder to create the {@link GetRepositoryRequest}
     */
    public final GetRepositoryResponse getRepository(Function<GetRepositoryRequest.Builder, ObjectBuilder<GetRepositoryRequest>> fn)
        throws IOException, OpenSearchException {
        return getRepository(fn.apply(new GetRepositoryRequest.Builder()).build());
    }

    /**
     * Returns information about a repository.
     */
    public final GetRepositoryResponse getRepository() throws IOException, OpenSearchException {
        return getRepository(new GetRepositoryRequest.Builder().build());
    }

    // ----- Endpoint: snapshot.verify_repository

    /**
     * Verifies a repository.
     */
    public VerifyRepositoryResponse verifyRepository(VerifyRepositoryRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequest(request, VerifyRepositoryRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Verifies a repository.
     *
     * @param fn a function that initializes a builder to create the {@link VerifyRepositoryRequest}
     */
    public final VerifyRepositoryResponse verifyRepository(
        Function<VerifyRepositoryRequest.Builder, ObjectBuilder<VerifyRepositoryRequest>> fn
    ) throws IOException, OpenSearchException {
        return verifyRepository(fn.apply(new VerifyRepositoryRequest.Builder()).build());
    }
}
