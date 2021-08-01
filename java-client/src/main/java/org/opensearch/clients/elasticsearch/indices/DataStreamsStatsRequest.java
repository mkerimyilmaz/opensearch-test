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

package org.opensearch.clients.elasticsearch.indices;

import jakarta.json.JsonValue;
import org.opensearch.clients.base.ElasticsearchError;
import org.opensearch.clients.base.Endpoint;
import org.opensearch.clients.elasticsearch._types.RequestBase;
import org.opensearch.clients.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

// typedef: indices.data_streams_stats.Request
public final class DataStreamsStatsRequest extends RequestBase {
	@Nullable
	private final String name;

	@Nullable
	private final JsonValue expandWildcards;

	@Nullable
	private final Boolean human;

	// ---------------------------------------------------------------------------------------------

	protected DataStreamsStatsRequest(Builder builder) {

		this.name = builder.name;
		this.expandWildcards = builder.expandWildcards;
		this.human = builder.human;

	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public JsonValue expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * API name: {@code human}
	 */
	@Nullable
	public Boolean human() {
		return this.human;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamsStatsRequest}.
	 */
	public static class Builder implements ObjectBuilder<DataStreamsStatsRequest> {
		@Nullable
		private String name;

		@Nullable
		private JsonValue expandWildcards;

		@Nullable
		private Boolean human;

		/**
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable JsonValue value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * API name: {@code human}
		 */
		public Builder human(@Nullable Boolean value) {
			this.human = value;
			return this;
		}

		/**
		 * Builds a {@link DataStreamsStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamsStatsRequest build() {

			return new DataStreamsStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.data_streams_stats}".
	 */
	public static final Endpoint<DataStreamsStatsRequest, DataStreamsStatsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_data_stream");
					buf.append("/_stats");
					return buf.toString();
				}
				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_data_stream");
					buf.append("/");
					buf.append(request.name);
					buf.append("/_stats");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.expandWildcards != null) {
					params.put("expand_wildcards", request.expandWildcards.toString());
				}
				if (request.human != null) {
					params.put("human", String.valueOf(request.human));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, DataStreamsStatsResponse.DESERIALIZER);
}
