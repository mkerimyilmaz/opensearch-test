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

package org.opensearch.client.opensearch.nodes;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.OpenSearchException;
import org.opensearch.client.transport.JsonEndpoint;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.util.ObjectBuilder;

/**
 * Client for the nodes namespace.
 */
public class OpenSearchNodesAsyncClient extends ApiClient<OpenSearchTransport, OpenSearchNodesAsyncClient> {

    public OpenSearchNodesAsyncClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchNodesAsyncClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchNodesAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchNodesAsyncClient(this.transport, transportOptions);
    }

    // ----- Endpoint: nodes.hot_threads

    /**
     * Returns information about hot threads on each node in the cluster.
     *
     *
     */

    public CompletableFuture<HotThreadsResponse> hotThreads(HotThreadsRequest request) throws IOException, OpenSearchException {
        @SuppressWarnings("unchecked")
        JsonEndpoint<HotThreadsRequest, HotThreadsResponse, ErrorResponse> endpoint = (JsonEndpoint<
            HotThreadsRequest,
            HotThreadsResponse,
            ErrorResponse>) HotThreadsRequest._ENDPOINT;

        return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
    }

    /**
     * Returns information about hot threads on each node in the cluster.
     *
     * @param fn
     *            a function that initializes a builder to create the
     *            {@link HotThreadsRequest}
     *
     */

    public final CompletableFuture<HotThreadsResponse> hotThreads(Function<HotThreadsRequest.Builder, ObjectBuilder<HotThreadsRequest>> fn)
        throws IOException, OpenSearchException {
        return hotThreads(fn.apply(new HotThreadsRequest.Builder()).build());
    }

    /**
     * Returns information about hot threads on each node in the cluster.
     *
     *
     */

    public CompletableFuture<HotThreadsResponse> hotThreads() throws IOException, OpenSearchException {
        return this.transport.performRequestAsync(
            new HotThreadsRequest.Builder().build(),
            HotThreadsRequest._ENDPOINT,
            this.transportOptions
        );
    }

    // ----- Endpoint: nodes.info

    /**
     * Returns information about nodes in the cluster.
     *
     *
     */

    public CompletableFuture<NodesInfoResponse> info(NodesInfoRequest request) throws IOException, OpenSearchException {
        @SuppressWarnings("unchecked")
        JsonEndpoint<NodesInfoRequest, NodesInfoResponse, ErrorResponse> endpoint = (JsonEndpoint<
            NodesInfoRequest,
            NodesInfoResponse,
            ErrorResponse>) NodesInfoRequest._ENDPOINT;

        return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
    }

    /**
     * Returns information about nodes in the cluster.
     *
     * @param fn
     *            a function that initializes a builder to create the
     *            {@link NodesInfoRequest}
     *
     */

    public final CompletableFuture<NodesInfoResponse> info(Function<NodesInfoRequest.Builder, ObjectBuilder<NodesInfoRequest>> fn)
        throws IOException, OpenSearchException {
        return info(fn.apply(new NodesInfoRequest.Builder()).build());
    }

    /**
     * Returns information about nodes in the cluster.
     *
     *
     */

    public CompletableFuture<NodesInfoResponse> info() throws IOException, OpenSearchException {
        return this.transport.performRequestAsync(
            new NodesInfoRequest.Builder().build(),
            NodesInfoRequest._ENDPOINT,
            this.transportOptions
        );
    }

    // ----- Endpoint: nodes.reload_secure_settings

    /**
     * Reloads secure settings.
     */

    public CompletableFuture<ReloadSecureSettingsResponse> reloadSecureSettings(ReloadSecureSettingsRequest request) throws IOException,
        OpenSearchException {
        @SuppressWarnings("unchecked")
        JsonEndpoint<ReloadSecureSettingsRequest, ReloadSecureSettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<
            ReloadSecureSettingsRequest,
            ReloadSecureSettingsResponse,
            ErrorResponse>) ReloadSecureSettingsRequest._ENDPOINT;

        return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
    }

    /**
     * Reloads secure settings.
     *
     * @param fn
     *            a function that initializes a builder to create the
     *            {@link ReloadSecureSettingsRequest}
     */

    public final CompletableFuture<ReloadSecureSettingsResponse> reloadSecureSettings(
        Function<ReloadSecureSettingsRequest.Builder, ObjectBuilder<ReloadSecureSettingsRequest>> fn
    ) throws IOException, OpenSearchException {
        return reloadSecureSettings(fn.apply(new ReloadSecureSettingsRequest.Builder()).build());
    }

    /**
     * Reloads secure settings.
     */

    public CompletableFuture<ReloadSecureSettingsResponse> reloadSecureSettings() throws IOException, OpenSearchException {
        return this.transport.performRequestAsync(
            new ReloadSecureSettingsRequest.Builder().build(),
            ReloadSecureSettingsRequest._ENDPOINT,
            this.transportOptions
        );
    }

    // ----- Endpoint: nodes.stats

    /**
     * Returns statistical information about nodes in the cluster.
     *
     *
     */

    public CompletableFuture<NodesStatsResponse> stats(NodesStatsRequest request) throws IOException, OpenSearchException {
        @SuppressWarnings("unchecked")
        JsonEndpoint<NodesStatsRequest, NodesStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<
            NodesStatsRequest,
            NodesStatsResponse,
            ErrorResponse>) NodesStatsRequest._ENDPOINT;

        return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
    }

    /**
     * Returns statistical information about nodes in the cluster.
     *
     * @param fn
     *            a function that initializes a builder to create the
     *            {@link NodesStatsRequest}
     */

    public final CompletableFuture<NodesStatsResponse> stats(Function<NodesStatsRequest.Builder, ObjectBuilder<NodesStatsRequest>> fn)
        throws IOException, OpenSearchException {
        return stats(fn.apply(new NodesStatsRequest.Builder()).build());
    }

    /**
     * Returns statistical information about nodes in the cluster.
     *
     *
     */

    public CompletableFuture<NodesStatsResponse> stats() throws IOException, OpenSearchException {
        return this.transport.performRequestAsync(
            new NodesStatsRequest.Builder().build(),
            NodesStatsRequest._ENDPOINT,
            this.transportOptions
        );
    }

    // ----- Endpoint: nodes.usage

    /**
     * Returns low-level information about REST actions usage on nodes.
     *
     *
     */

    public CompletableFuture<NodesUsageResponse> usage(NodesUsageRequest request) throws IOException, OpenSearchException {
        @SuppressWarnings("unchecked")
        JsonEndpoint<NodesUsageRequest, NodesUsageResponse, ErrorResponse> endpoint = (JsonEndpoint<
            NodesUsageRequest,
            NodesUsageResponse,
            ErrorResponse>) NodesUsageRequest._ENDPOINT;

        return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
    }

    /**
     * Returns low-level information about REST actions usage on nodes.
     *
     * @param fn
     *            a function that initializes a builder to create the
     *            {@link NodesUsageRequest}
     *
     */

    public final CompletableFuture<NodesUsageResponse> usage(Function<NodesUsageRequest.Builder, ObjectBuilder<NodesUsageRequest>> fn)
        throws IOException, OpenSearchException {
        return usage(fn.apply(new NodesUsageRequest.Builder()).build());
    }

    /**
     * Returns low-level information about REST actions usage on nodes.
     *
     *
     */

    public CompletableFuture<NodesUsageResponse> usage() throws IOException, OpenSearchException {
        return this.transport.performRequestAsync(
            new NodesUsageRequest.Builder().build(),
            NodesUsageRequest._ENDPOINT,
            this.transportOptions
        );
    }

}
