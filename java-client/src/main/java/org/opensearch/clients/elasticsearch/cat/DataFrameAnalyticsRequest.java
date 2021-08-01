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

package org.opensearch.clients.elasticsearch.cat;

import jakarta.json.JsonValue;
import org.opensearch.clients.base.ElasticsearchError;
import org.opensearch.clients.base.Endpoint;
import org.opensearch.clients.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

// typedef: cat.data_frame_analytics.Request
public final class DataFrameAnalyticsRequest extends CatRequestBase {
	@Nullable
	private final String id;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final JsonValue bytes;

	// ---------------------------------------------------------------------------------------------

	protected DataFrameAnalyticsRequest(Builder builder) {

		this.id = builder.id;
		this.allowNoMatch = builder.allowNoMatch;
		this.bytes = builder.bytes;

	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * API name: {@code bytes}
	 */
	@Nullable
	public JsonValue bytes() {
		return this.bytes;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataFrameAnalyticsRequest}.
	 */
	public static class Builder implements ObjectBuilder<DataFrameAnalyticsRequest> {
		@Nullable
		private String id;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private JsonValue bytes;

		/**
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code allow_no_match}
		 */
		public Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * API name: {@code bytes}
		 */
		public Builder bytes(@Nullable JsonValue value) {
			this.bytes = value;
			return this;
		}

		/**
		 * Builds a {@link DataFrameAnalyticsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataFrameAnalyticsRequest build() {

			return new DataFrameAnalyticsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.ml_data_frame_analytics}".
	 */
	public static final Endpoint<DataFrameAnalyticsRequest, DataFrameAnalyticsResponse, ElasticsearchError> ENDPOINT =
		new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					return buf.toString();
				}
				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				if (request.bytes != null) {
					params.put("bytes", request.bytes.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, DataFrameAnalyticsResponse.DESERIALIZER);
}
