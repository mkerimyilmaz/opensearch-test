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

import org.opensearch.clients.base.BooleanResponse;
import org.opensearch.clients.base.ElasticsearchError;
import org.opensearch.clients.base.Endpoint;
import org.opensearch.clients.elasticsearch._types.RequestBase;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.exists_template.Request
public final class ExistsTemplateRequest extends RequestBase {
	private final List<String> name;

	@Nullable
	private final Boolean flatSettings;

	@Nullable
	private final Boolean local;

	@Nullable
	private final JsonValue masterTimeout;

	// ---------------------------------------------------------------------------------------------

	protected ExistsTemplateRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.flatSettings = builder.flatSettings;
		this.local = builder.local;
		this.masterTimeout = builder.masterTimeout;

	}

	/**
	 * API name: {@code name}
	 */
	public List<String> name() {
		return this.name;
	}

	/**
	 * API name: {@code flat_settings}
	 */
	@Nullable
	public Boolean flatSettings() {
		return this.flatSettings;
	}

	/**
	 * API name: {@code local}
	 */
	@Nullable
	public Boolean local() {
		return this.local;
	}

	/**
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExistsTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<ExistsTemplateRequest> {
		private List<String> name;

		@Nullable
		private Boolean flatSettings;

		@Nullable
		private Boolean local;

		@Nullable
		private JsonValue masterTimeout;

		/**
		 * API name: {@code name}
		 */
		public Builder name(List<String> value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String... value) {
			this.name = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #name(List)}, creating the list if needed.
		 */
		public Builder addName(String value) {
			if (this.name == null) {
				this.name = new ArrayList<>();
			}
			this.name.add(value);
			return this;
		}

		/**
		 * API name: {@code flat_settings}
		 */
		public Builder flatSettings(@Nullable Boolean value) {
			this.flatSettings = value;
			return this;
		}

		/**
		 * API name: {@code local}
		 */
		public Builder local(@Nullable Boolean value) {
			this.local = value;
			return this;
		}

		/**
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Builds a {@link ExistsTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExistsTemplateRequest build() {

			return new ExistsTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.exists_template}".
	 */
	public static final Endpoint<ExistsTemplateRequest, BooleanResponse, ElasticsearchError> ENDPOINT = new Endpoint.Boolean<>(
			// Request method
			request -> {
				return "HEAD";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_template");
					buf.append("/");
					buf.append(request.name.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.flatSettings != null) {
					params.put("flat_settings", String.valueOf(request.flatSettings));
				}
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, null);
}
