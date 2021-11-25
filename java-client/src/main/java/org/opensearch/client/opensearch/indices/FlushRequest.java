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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.indices;

<<<<<<< HEAD
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.ExpandWildcardOptions;
=======
import org.opensearch.client.base.OpenSearchError;
import org.opensearch.client.base.Endpoint;
>>>>>>> 1cbedd1b (Use org.opensearch instead of org.elasticsearch in client code (#8))
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.transport.Endpoint;
import org.opensearch.client.transport.SimpleEndpoint;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.flush.Request

public class FlushRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoIndices;

	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean force;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final Boolean waitIfOngoing;

	// ---------------------------------------------------------------------------------------------

	private FlushRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.force = builder.force;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.waitIfOngoing = builder.waitIfOngoing;

	}

	public static FlushRequest of(Function<Builder, ObjectBuilder<FlushRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Whether to ignore if a wildcard indices expression resolves into no concrete
	 * indices. (This includes <code>_all</code> string or when no indices have been
	 * specified)
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Whether a flush should be forced even if it is not necessarily needed ie. if
	 * no changes will be committed to the index. This is useful if transaction log
	 * IDs should be incremented even if no uncommitted changes are present. (This
	 * setting can be considered as internal)
	 * <p>
	 * API name: {@code force}
	 */
	@Nullable
	public final Boolean force() {
		return this.force;
	}

	/**
	 * Whether specified concrete indices should be ignored when unavailable
	 * (missing or closed)
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * A comma-separated list of index names; use <code>_all</code> or empty string
	 * for all indices
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * If set to true the flush operation will block until the flush can be executed
	 * if another flush operation is already executing. The default is true. If set
	 * to false the flush will be skipped iff if another flush operation is already
	 * running.
	 * <p>
	 * API name: {@code wait_if_ongoing}
	 */
	@Nullable
	public final Boolean waitIfOngoing() {
		return this.waitIfOngoing;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FlushRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FlushRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean force;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<String> index;

		@Nullable
		private Boolean waitIfOngoing;

		/**
		 * Whether to ignore if a wildcard indices expression resolves into no concrete
		 * indices. (This includes <code>_all</code> string or when no indices have been
		 * specified)
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * Whether a flush should be forced even if it is not necessarily needed ie. if
		 * no changes will be committed to the index. This is useful if transaction log
		 * IDs should be incremented even if no uncommitted changes are present. (This
		 * setting can be considered as internal)
		 * <p>
		 * API name: {@code force}
		 */
		public final Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * Whether specified concrete indices should be ignored when unavailable
		 * (missing or closed)
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * A comma-separated list of index names; use <code>_all</code> or empty string
		 * for all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names; use <code>_all</code> or empty string
		 * for all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * If set to true the flush operation will block until the flush can be executed
		 * if another flush operation is already executing. The default is true. If set
		 * to false the flush will be skipped iff if another flush operation is already
		 * running.
		 * <p>
		 * API name: {@code wait_if_ongoing}
		 */
		public final Builder waitIfOngoing(@Nullable Boolean value) {
			this.waitIfOngoing = value;
			return this;
		}

		/**
		 * Builds a {@link FlushRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FlushRequest build() {
			_checkSingleUse();

			return new FlushRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.flush}".
	 */
<<<<<<< HEAD
	public static final Endpoint<FlushRequest, FlushResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
=======
	public static final Endpoint<FlushRequest, FlushResponse, OpenSearchError> ENDPOINT = new Endpoint.Simple<>(
>>>>>>> 1cbedd1b (Use org.opensearch instead of org.elasticsearch in client code (#8))
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_flush");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_flush");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ModelTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.force != null) {
					params.put("force", String.valueOf(request.force));
				}
				if (request.waitIfOngoing != null) {
					params.put("wait_if_ongoing", String.valueOf(request.waitIfOngoing));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, FlushResponse._DESERIALIZER);
}
