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

package org.opensearch.client.opensearch.core;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.transport.Endpoint;
import org.opensearch.client.transport.endpoints.SimpleEndpoint;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: _global.delete_by_query_rethrottle.Request

/**
 * Changes the number of requests per second for a particular Delete By Query
 * operation.
 *
 */

public class DeleteByQueryRethrottleRequest extends RequestBase {
    @Nullable
    private final Long requestsPerSecond;

    private final String taskId;

    // ---------------------------------------------------------------------------------------------

    private DeleteByQueryRethrottleRequest(Builder builder) {

        this.requestsPerSecond = builder.requestsPerSecond;
        this.taskId = ApiTypeHelper.requireNonNull(builder.taskId, this, "taskId");

    }

    public static DeleteByQueryRethrottleRequest of(Function<Builder, ObjectBuilder<DeleteByQueryRethrottleRequest>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * The throttle to set on this request in floating sub-requests per second. -1
     * means set no throttle.
     * <p>
     * API name: {@code requests_per_second}
     */
    @Nullable
    public final Long requestsPerSecond() {
        return this.requestsPerSecond;
    }

    /**
     * Required - The task id to rethrottle
     * <p>
     * API name: {@code task_id}
     */
    public final String taskId() {
        return this.taskId;
    }

    public Builder toBuilder() {
        return new Builder().requestsPerSecond(requestsPerSecond).taskId(taskId);
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link DeleteByQueryRethrottleRequest}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DeleteByQueryRethrottleRequest> {
        @Nullable
        private Long requestsPerSecond;

        private String taskId;

        /**
         * The throttle to set on this request in floating sub-requests per second. -1
         * means set no throttle.
         * <p>
         * API name: {@code requests_per_second}
         */
        public final Builder requestsPerSecond(@Nullable Long value) {
            this.requestsPerSecond = value;
            return this;
        }

        /**
         * Required - The task id to rethrottle
         * <p>
         * API name: {@code task_id}
         */
        public final Builder taskId(String value) {
            this.taskId = value;
            return this;
        }

        /**
         * Builds a {@link DeleteByQueryRethrottleRequest}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public DeleteByQueryRethrottleRequest build() {
            _checkSingleUse();

            return new DeleteByQueryRethrottleRequest(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Endpoint "{@code delete_by_query_rethrottle}".
     */
    public static final Endpoint<DeleteByQueryRethrottleRequest, DeleteByQueryRethrottleResponse, ErrorResponse> _ENDPOINT =
        new SimpleEndpoint<>(

            // Request method
            request -> {
                return "POST";

            },

            // Request path
            request -> {
                final int _taskId = 1 << 0;

                int propsSet = 0;

                propsSet |= _taskId;

                if (propsSet == (_taskId)) {
                    StringBuilder buf = new StringBuilder();
                    buf.append("/_delete_by_query");
                    buf.append("/");
                    SimpleEndpoint.pathEncode(request.taskId, buf);
                    buf.append("/_rethrottle");
                    return buf.toString();
                }
                throw SimpleEndpoint.noPathTemplateFound("path");

            },

            // Request parameters
            request -> {
                Map<String, String> params = new HashMap<>();
                if (request.requestsPerSecond != null) {
                    params.put("requests_per_second", String.valueOf(request.requestsPerSecond));
                }
                return params;

            },
            SimpleEndpoint.emptyMap(),
            false,
            DeleteByQueryRethrottleResponse._DESERIALIZER
        );
}
