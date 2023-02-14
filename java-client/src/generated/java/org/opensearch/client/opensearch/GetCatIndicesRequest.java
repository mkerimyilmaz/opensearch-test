package org.opensearch.client.opensearch;

import org.opensearch.client.opensearch._types.*;

import org.opensearch.client.transport.*;
import org.opensearch.client.transport.endpoints.*;
import org.opensearch.client.util.*;

import java.util.*;
import java.util.function.Function;
import javax.annotation.*;

/**
 * Returns information about indices: number of primaries and replicas, document counts, disk size,
 * etc.
 */
public class GetCatIndicesRequest extends RequestBase {
    private final int bytes;
    private final String clusterManagerTimeout;
    private final ExpandWildcards expandWildcards;
    private final String format;
    private final HealthStatus health;
    private final boolean includeUnloadedSegments;
    private final String masterTimeout;
    private final boolean pri;
    private final String time;

    public GetCatIndicesRequest(Builder builder) {
        this.bytes = builder.bytes;
        this.clusterManagerTimeout = builder.clusterManagerTimeout;
        this.expandWildcards = builder.expandWildcards;
        this.format = builder.format;
        this.health = builder.health;
        this.includeUnloadedSegments = builder.includeUnloadedSegments;
        this.masterTimeout = builder.masterTimeout;
        this.pri = builder.pri;
        this.time = builder.time;
    }

    public static GetCatIndicesRequest of(
            Function<Builder, ObjectBuilder<GetCatIndicesRequest>> fn) {
        return fn.apply(new Builder()).build();
    }

    public final int bytes() {
        return this.bytes;
    }

    public final String clusterManagerTimeout() {
        return this.clusterManagerTimeout;
    }

    public final ExpandWildcards expandWildcards() {
        return this.expandWildcards;
    }

    public final String format() {
        return this.format;
    }

    public final HealthStatus health() {
        return this.health;
    }

    public final boolean includeUnloadedSegments() {
        return this.includeUnloadedSegments;
    }

    public final String masterTimeout() {
        return this.masterTimeout;
    }

    public final boolean pri() {
        return this.pri;
    }

    public final String time() {
        return this.time;
    }

    /** Builder for {@link GetCatIndicesRequest}. */
    public static class Builder extends ObjectBuilderBase
            implements ObjectBuilder<GetCatIndicesRequest> {
        private int bytes;
        private String clusterManagerTimeout;
        private ExpandWildcards expandWildcards;
        private String format;
        private HealthStatus health;
        private boolean includeUnloadedSegments;
        private String masterTimeout;
        private boolean pri;
        private String time;

        public final Builder bytes(int value) {
            this.bytes = value;
            return this;
        }

        public final Builder clusterManagerTimeout(String value) {
            this.clusterManagerTimeout = value;
            return this;
        }

        public final Builder expandWildcards(ExpandWildcards value) {
            this.expandWildcards = value;
            return this;
        }

        public final Builder expandWildcards(
                Function<ExpandWildcards.Builder, ObjectBuilder<ExpandWildcards>> fn) {
            return expandWildcards(fn.apply(new ExpandWildcards.Builder()).build());
        }

        public final Builder format(String value) {
            this.format = value;
            return this;
        }

        public final Builder health(HealthStatus value) {
            this.health = value;
            return this;
        }

        public final Builder health(
                Function<HealthStatus.Builder, ObjectBuilder<HealthStatus>> fn) {
            return health(fn.apply(new HealthStatus.Builder()).build());
        }

        public final Builder includeUnloadedSegments(boolean value) {
            this.includeUnloadedSegments = value;
            return this;
        }

        public final Builder masterTimeout(String value) {
            this.masterTimeout = value;
            return this;
        }

        public final Builder pri(boolean value) {
            this.pri = value;
            return this;
        }

        public final Builder time(String value) {
            this.time = value;
            return this;
        }

        /**
         * Builds a {@link GetCatIndicesRequest}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        public GetCatIndicesRequest build() {
            _checkSingleUse();

            return new GetCatIndicesRequest(this);
        }
    }

    public static final Endpoint<GetCatIndicesRequest, GetCatIndicesResponse, ErrorResponse>
            _ENDPOINT =
                    new SimpleEndpoint<>(
                            // Request method
                            request -> {
                                return "get";
                            },
                            // Request path
                            request -> {
                                return "/_cat/indices";
                            },
                            // Request parameters
                            request -> {
                                Map<String, String> params = new HashMap<>();
                                if (request.bytes != null) {
                                    params.put("bytes", String.valueOf(request.bytes));
                                }
                                if (request.clusterManagerTimeout != null) {
                                    params.put(
                                            "cluster_manager_timeout",
                                            request.clusterManagerTimeout);
                                }
                                if (request.expandWildcards != null) {
                                    params.put(
                                            "expand_wildcards",
                                            request.expandWildcards.jsonValue());
                                }
                                if (request.format != null) {
                                    params.put("format", request.format);
                                }
                                if (request.health != null) {
                                    params.put("health", request.health.jsonValue());
                                }
                                if (request.includeUnloadedSegments != null) {
                                    params.put(
                                            "include_unloaded_segments",
                                            String.valueOf(request.includeUnloadedSegments));
                                }
                                if (request.masterTimeout != null) {
                                    params.put("master_timeout", request.masterTimeout);
                                }
                                if (request.pri != null) {
                                    params.put("pri", String.valueOf(request.pri));
                                }
                                if (request.time != null) {
                                    params.put("time", request.time);
                                }
                                return params;
                            },
                            SimpleEndpoint.emptyMap(),
                            false,
                            GetCatIndicesResponse._DESERIALIZER);
}
