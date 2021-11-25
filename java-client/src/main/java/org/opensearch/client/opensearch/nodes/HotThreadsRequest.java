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

package org.opensearch.client.opensearch.nodes;

import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.opensearch._types.ThreadType;
import org.opensearch.client.transport.Endpoint;
import org.opensearch.client.transport.SimpleEndpoint;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: nodes.hot_threads.Request

public class HotThreadsRequest extends RequestBase {
	@Nullable
	private final Boolean ignoreIdleThreads;

	@Nullable
	private final String interval;

	private final List<String> nodeId;

	@Nullable
	private final Long snapshots;

	@Nullable
	private final ThreadType threadType;

	@Nullable
	private final Long threads;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	private HotThreadsRequest(Builder builder) {

		this.ignoreIdleThreads = builder.ignoreIdleThreads;
		this.interval = builder.interval;
		this.nodeId = ModelTypeHelper.unmodifiable(builder.nodeId);
		this.snapshots = builder.snapshots;
		this.threadType = builder.threadType;
		this.threads = builder.threads;
		this.timeout = builder.timeout;

	}

	public static HotThreadsRequest of(Function<Builder, ObjectBuilder<HotThreadsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Don't show threads that are in known-idle places, such as waiting on a socket
	 * select or pulling from an empty task queue (default: true)
	 * <p>
	 * API name: {@code ignore_idle_threads}
	 */
	@Nullable
	public final Boolean ignoreIdleThreads() {
		return this.ignoreIdleThreads;
	}

	/**
	 * The interval for the second sampling of threads
	 * <p>
	 * API name: {@code interval}
	 */
	@Nullable
	public final String interval() {
		return this.interval;
	}

	/**
	 * A comma-separated list of node IDs or names to limit the returned
	 * information; use <code>_local</code> to return information from the node
	 * you're connecting to, leave empty to get information from all nodes
	 * <p>
	 * API name: {@code node_id}
	 */
	public final List<String> nodeId() {
		return this.nodeId;
	}

	/**
	 * Number of samples of thread stacktrace (default: 10)
	 * <p>
	 * API name: {@code snapshots}
	 */
	@Nullable
	public final Long snapshots() {
		return this.snapshots;
	}

	/**
	 * API name: {@code thread_type}
	 */
	@Nullable
	public final ThreadType threadType() {
		return this.threadType;
	}

	/**
	 * Specify the number of threads to provide information for (default: 3)
	 * <p>
	 * API name: {@code threads}
	 */
	@Nullable
	public final Long threads() {
		return this.threads;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HotThreadsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HotThreadsRequest> {
		@Nullable
		private Boolean ignoreIdleThreads;

		@Nullable
		private String interval;

		@Nullable
		private List<String> nodeId;

		@Nullable
		private Long snapshots;

		@Nullable
		private ThreadType threadType;

		@Nullable
		private Long threads;

		@Nullable
		private String timeout;

		/**
		 * Don't show threads that are in known-idle places, such as waiting on a socket
		 * select or pulling from an empty task queue (default: true)
		 * <p>
		 * API name: {@code ignore_idle_threads}
		 */
		public final Builder ignoreIdleThreads(@Nullable Boolean value) {
			this.ignoreIdleThreads = value;
			return this;
		}

		/**
		 * The interval for the second sampling of threads
		 * <p>
		 * API name: {@code interval}
		 */
		public final Builder interval(@Nullable String value) {
			this.interval = value;
			return this;
		}

		/**
		 * A comma-separated list of node IDs or names to limit the returned
		 * information; use <code>_local</code> to return information from the node
		 * you're connecting to, leave empty to get information from all nodes
		 * <p>
		 * API name: {@code node_id}
		 */
		public final Builder nodeId(@Nullable List<String> value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * A comma-separated list of node IDs or names to limit the returned
		 * information; use <code>_local</code> to return information from the node
		 * you're connecting to, leave empty to get information from all nodes
		 * <p>
		 * API name: {@code node_id}
		 */
		public final Builder nodeId(String... value) {
			this.nodeId = Arrays.asList(value);
			return this;
		}

		/**
		 * Number of samples of thread stacktrace (default: 10)
		 * <p>
		 * API name: {@code snapshots}
		 */
		public final Builder snapshots(@Nullable Long value) {
			this.snapshots = value;
			return this;
		}

		/**
		 * API name: {@code thread_type}
		 */
		public final Builder threadType(@Nullable ThreadType value) {
			this.threadType = value;
			return this;
		}

		/**
		 * Specify the number of threads to provide information for (default: 3)
		 * <p>
		 * API name: {@code threads}
		 */
		public final Builder threads(@Nullable Long value) {
			this.threads = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link HotThreadsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HotThreadsRequest build() {
			_checkSingleUse();

			return new HotThreadsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code nodes.hot_threads}".
	 */
	public static final Endpoint<HotThreadsRequest, HotThreadsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.nodeId()))
					propsSet |= _nodeId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/hot_threads");
					return buf.toString();
				}
				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					buf.append("/hot_threads");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.snapshots != null) {
					params.put("snapshots", String.valueOf(request.snapshots));
				}
				if (request.threadType != null) {
					params.put("thread_type", request.threadType.jsonValue());
				}
				if (request.threads != null) {
					params.put("threads", String.valueOf(request.threads));
				}
				if (request.interval != null) {
					params.put("interval", request.interval);
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				if (request.ignoreIdleThreads != null) {
					params.put("ignore_idle_threads", String.valueOf(request.ignoreIdleThreads));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, HotThreadsResponse._DESERIALIZER);
}
