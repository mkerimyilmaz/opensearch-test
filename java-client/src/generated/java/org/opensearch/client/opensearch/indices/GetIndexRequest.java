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

package org.opensearch.client.opensearch.indices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.ExpandWildcard;
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.opensearch._types.Time;
import org.opensearch.client.transport.Endpoint;
import org.opensearch.client.transport.endpoints.SimpleEndpoint;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: indices.get.Request

/**
 * Returns information about one or more indexes.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class GetIndexRequest extends RequestBase {

    @Nullable
    private final Boolean allowNoIndices;

    @Nullable
    private final Time clusterManagerTimeout;

    @Nonnull
    private final List<ExpandWildcard> expandWildcards;

    @Nullable
    private final Boolean flatSettings;

    @Nullable
    private final Boolean ignoreUnavailable;

    @Nullable
    private final Boolean includeDefaults;

    @Nonnull
    private final List<String> index;

    @Nullable
    private final Boolean local;

    @Deprecated
    @Nullable
    private final Time masterTimeout;

    // ---------------------------------------------------------------------------------------------

    private GetIndexRequest(Builder builder) {
        this.allowNoIndices = builder.allowNoIndices;
        this.clusterManagerTimeout = builder.clusterManagerTimeout;
        this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
        this.flatSettings = builder.flatSettings;
        this.ignoreUnavailable = builder.ignoreUnavailable;
        this.includeDefaults = builder.includeDefaults;
        this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
        this.local = builder.local;
        this.masterTimeout = builder.masterTimeout;
    }

    public static GetIndexRequest of(Function<GetIndexRequest.Builder, ObjectBuilder<GetIndexRequest>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * If false, the request returns an error if any wildcard expression, index alias, or _all value targets only missing or closed indexes.
     * This behavior applies even if the request targets other open indexes. For example, a request targeting foo*,bar* returns an error if
     * an index starts with foo but no index starts with bar.
     * <p>
     * API name: {@code allow_no_indices}
     * </p>
     */
    @Nullable
    public final Boolean allowNoIndices() {
        return this.allowNoIndices;
    }

    /**
     * Operation timeout for connection to cluster-manager node.
     * <p>
     * API name: {@code cluster_manager_timeout}
     * </p>
     */
    @Nullable
    public final Time clusterManagerTimeout() {
        return this.clusterManagerTimeout;
    }

    /**
     * Type of index that wildcard expressions can match. If the request can target data streams, this argument determines whether wildcard
     * expressions match hidden data streams. Supports comma-separated values, such as open,hidden.
     * <p>
     * API name: {@code expand_wildcards}
     * </p>
     */
    @Nonnull
    public final List<ExpandWildcard> expandWildcards() {
        return this.expandWildcards;
    }

    /**
     * If true, returns settings in flat format.
     * <p>
     * API name: {@code flat_settings}
     * </p>
     */
    @Nullable
    public final Boolean flatSettings() {
        return this.flatSettings;
    }

    /**
     * If false, requests that target a missing index return an error.
     * <p>
     * API name: {@code ignore_unavailable}
     * </p>
     */
    @Nullable
    public final Boolean ignoreUnavailable() {
        return this.ignoreUnavailable;
    }

    /**
     * If true, return all default settings in the response.
     * <p>
     * API name: {@code include_defaults}
     * </p>
     */
    @Nullable
    public final Boolean includeDefaults() {
        return this.includeDefaults;
    }

    /**
     * Required - Comma-separated list of data streams, indexes, and index aliases used to limit the request. Wildcard expressions (*) are
     * supported.
     * <p>
     * API name: {@code index}
     * </p>
     */
    @Nonnull
    public final List<String> index() {
        return this.index;
    }

    /**
     * If true, the request retrieves information from the local node only. Defaults to false, which means information is retrieved from the
     * master node.
     * <p>
     * API name: {@code local}
     * </p>
     */
    @Nullable
    public final Boolean local() {
        return this.local;
    }

    /**
     * Period to wait for a connection to the master node. If no response is received before the timeout expires, the request fails and
     * returns an error.
     * <p>
     * API name: {@code master_timeout}
     * </p>
     */
    @Deprecated
    @Nullable
    public final Time masterTimeout() {
        return this.masterTimeout;
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link GetIndexRequest}.
     */
    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetIndexRequest> {
        @Nullable
        private Boolean allowNoIndices;
        @Nullable
        private Time clusterManagerTimeout;
        @Nullable
        private List<ExpandWildcard> expandWildcards;
        @Nullable
        private Boolean flatSettings;
        @Nullable
        private Boolean ignoreUnavailable;
        @Nullable
        private Boolean includeDefaults;
        private List<String> index;
        @Nullable
        private Boolean local;
        @Nullable
        private Time masterTimeout;

        /**
         * If false, the request returns an error if any wildcard expression, index alias, or _all value targets only missing or closed
         * indexes. This behavior applies even if the request targets other open indexes. For example, a request targeting foo*,bar* returns
         * an error if an index starts with foo but no index starts with bar.
         * <p>
         * API name: {@code allow_no_indices}
         * </p>
         */
        public final Builder allowNoIndices(@Nullable Boolean value) {
            this.allowNoIndices = value;
            return this;
        }

        /**
         * Operation timeout for connection to cluster-manager node.
         * <p>
         * API name: {@code cluster_manager_timeout}
         * </p>
         */
        public final Builder clusterManagerTimeout(@Nullable Time value) {
            this.clusterManagerTimeout = value;
            return this;
        }

        /**
         * Operation timeout for connection to cluster-manager node.
         * <p>
         * API name: {@code cluster_manager_timeout}
         * </p>
         */
        public final Builder clusterManagerTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
            return clusterManagerTimeout(fn.apply(new Time.Builder()).build());
        }

        /**
         * Type of index that wildcard expressions can match. If the request can target data streams, this argument determines whether
         * wildcard expressions match hidden data streams. Supports comma-separated values, such as open,hidden.
         * <p>
         * API name: {@code expand_wildcards}
         * </p>
         *
         * <p>
         * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
         * </p>
         */
        public final Builder expandWildcards(List<ExpandWildcard> list) {
            this.expandWildcards = _listAddAll(this.expandWildcards, list);
            return this;
        }

        /**
         * Type of index that wildcard expressions can match. If the request can target data streams, this argument determines whether
         * wildcard expressions match hidden data streams. Supports comma-separated values, such as open,hidden.
         * <p>
         * API name: {@code expand_wildcards}
         * </p>
         *
         * <p>
         * Adds one or more values to <code>expandWildcards</code>.
         * </p>
         */
        public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
            this.expandWildcards = _listAdd(this.expandWildcards, value, values);
            return this;
        }

        /**
         * If true, returns settings in flat format.
         * <p>
         * API name: {@code flat_settings}
         * </p>
         */
        public final Builder flatSettings(@Nullable Boolean value) {
            this.flatSettings = value;
            return this;
        }

        /**
         * If false, requests that target a missing index return an error.
         * <p>
         * API name: {@code ignore_unavailable}
         * </p>
         */
        public final Builder ignoreUnavailable(@Nullable Boolean value) {
            this.ignoreUnavailable = value;
            return this;
        }

        /**
         * If true, return all default settings in the response.
         * <p>
         * API name: {@code include_defaults}
         * </p>
         */
        public final Builder includeDefaults(@Nullable Boolean value) {
            this.includeDefaults = value;
            return this;
        }

        /**
         * Required - Comma-separated list of data streams, indexes, and index aliases used to limit the request. Wildcard expressions (*)
         * are supported.
         * <p>
         * API name: {@code index}
         * </p>
         *
         * <p>
         * Adds all elements of <code>list</code> to <code>index</code>.
         * </p>
         */
        public final Builder index(List<String> list) {
            this.index = _listAddAll(this.index, list);
            return this;
        }

        /**
         * Required - Comma-separated list of data streams, indexes, and index aliases used to limit the request. Wildcard expressions (*)
         * are supported.
         * <p>
         * API name: {@code index}
         * </p>
         *
         * <p>
         * Adds one or more values to <code>index</code>.
         * </p>
         */
        public final Builder index(String value, String... values) {
            this.index = _listAdd(this.index, value, values);
            return this;
        }

        /**
         * If true, the request retrieves information from the local node only. Defaults to false, which means information is retrieved from
         * the master node.
         * <p>
         * API name: {@code local}
         * </p>
         */
        public final Builder local(@Nullable Boolean value) {
            this.local = value;
            return this;
        }

        /**
         * Period to wait for a connection to the master node. If no response is received before the timeout expires, the request fails and
         * returns an error.
         * <p>
         * API name: {@code master_timeout}
         * </p>
         */
        @Deprecated
        public final Builder masterTimeout(@Nullable Time value) {
            this.masterTimeout = value;
            return this;
        }

        /**
         * Period to wait for a connection to the master node. If no response is received before the timeout expires, the request fails and
         * returns an error.
         * <p>
         * API name: {@code master_timeout}
         * </p>
         */
        @Deprecated
        public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
            return masterTimeout(fn.apply(new Time.Builder()).build());
        }

        /**
         * Builds a {@link GetIndexRequest}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        public GetIndexRequest build() {
            _checkSingleUse();

            return new GetIndexRequest(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Endpoint "{@code indices.get}".
     */
    public static final Endpoint<GetIndexRequest, GetIndexResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
        // Request method
        request -> "GET",
        // Request path
        request -> {
            StringBuilder buf = new StringBuilder();
            buf.append("/");
            SimpleEndpoint.pathEncode(String.join(",", request.index), buf);
            return buf.toString();
        },
        // Request parameters
        request -> {
            Map<String, String> params = new HashMap<>();
            if (request.allowNoIndices != null) {
                params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
            }
            if (request.clusterManagerTimeout != null) {
                params.put("cluster_manager_timeout", request.clusterManagerTimeout._toJsonString());
            }
            if (ApiTypeHelper.isDefined(request.expandWildcards)) {
                params.put("expand_wildcards", request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
            }
            if (request.flatSettings != null) {
                params.put("flat_settings", String.valueOf(request.flatSettings));
            }
            if (request.ignoreUnavailable != null) {
                params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
            }
            if (request.includeDefaults != null) {
                params.put("include_defaults", String.valueOf(request.includeDefaults));
            }
            if (request.local != null) {
                params.put("local", String.valueOf(request.local));
            }
            if (request.masterTimeout != null) {
                params.put("master_timeout", request.masterTimeout._toJsonString());
            }
            return params;
        },
        SimpleEndpoint.emptyMap(),
        false,
        GetIndexResponse._DESERIALIZER
    );

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hashCode(this.allowNoIndices);
        result = 31 * result + Objects.hashCode(this.clusterManagerTimeout);
        result = 31 * result + Objects.hashCode(this.expandWildcards);
        result = 31 * result + Objects.hashCode(this.flatSettings);
        result = 31 * result + Objects.hashCode(this.ignoreUnavailable);
        result = 31 * result + Objects.hashCode(this.includeDefaults);
        result = 31 * result + this.index.hashCode();
        result = 31 * result + Objects.hashCode(this.local);
        result = 31 * result + Objects.hashCode(this.masterTimeout);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        GetIndexRequest other = (GetIndexRequest) o;
        return Objects.equals(this.allowNoIndices, other.allowNoIndices)
            && Objects.equals(this.clusterManagerTimeout, other.clusterManagerTimeout)
            && Objects.equals(this.expandWildcards, other.expandWildcards)
            && Objects.equals(this.flatSettings, other.flatSettings)
            && Objects.equals(this.ignoreUnavailable, other.ignoreUnavailable)
            && Objects.equals(this.includeDefaults, other.includeDefaults)
            && this.index.equals(other.index)
            && Objects.equals(this.local, other.local)
            && Objects.equals(this.masterTimeout, other.masterTimeout);
    }
}
