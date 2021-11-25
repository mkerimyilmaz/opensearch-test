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

package org.opensearch.clients.opensearch.indices;

import org.opensearch.clients.opensearch._types.ErrorResponse;
import org.opensearch.clients.opensearch._types.RequestBase;
import org.opensearch.clients.opensearch.indices.get_index_template.IndexTemplate;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.transport.Endpoint;
import org.opensearch.clients.transport.SimpleEndpoint;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.simulate_template.Request
@JsonpDeserializable
public class SimulateTemplateRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean create;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final String name;

	private final IndexTemplate template;

	// ---------------------------------------------------------------------------------------------

	private SimulateTemplateRequest(Builder builder) {

		this.create = builder.create;
		this.masterTimeout = builder.masterTimeout;
		this.name = builder.name;
		this.template = ModelTypeHelper.requireNonNull(builder.template, this, "template");

	}

	public static SimulateTemplateRequest of(Function<Builder, ObjectBuilder<SimulateTemplateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If true, the template passed in the body is only used if no existing
	 * templates match the same index patterns. If false, the simulation uses the
	 * template with the highest priority. Note that the template is not permanently
	 * added or updated in either case; it is only used for the simulation.
	 * <p>
	 * API name: {@code create}
	 */
	@Nullable
	public final Boolean create() {
		return this.create;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Name of the index template to simulate. To test a template configuration
	 * before you add it to the cluster, omit this parameter and specify the
	 * template configuration in the request body.
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * Required - Request body.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final IndexTemplate template() {
		return this.template;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.template.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulateTemplateRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SimulateTemplateRequest> {
		@Nullable
		private Boolean create;

		@Nullable
		private String masterTimeout;

		@Nullable
		private String name;

		private IndexTemplate template;

		/**
		 * If true, the template passed in the body is only used if no existing
		 * templates match the same index patterns. If false, the simulation uses the
		 * template with the highest priority. Note that the template is not permanently
		 * added or updated in either case; it is only used for the simulation.
		 * <p>
		 * API name: {@code create}
		 */
		public final Builder create(@Nullable Boolean value) {
			this.create = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Name of the index template to simulate. To test a template configuration
		 * before you add it to the cluster, omit this parameter and specify the
		 * template configuration in the request body.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder template(IndexTemplate value) {
			this.template = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder template(Function<IndexTemplate.Builder, ObjectBuilder<IndexTemplate>> fn) {
			return this.template(fn.apply(new IndexTemplate.Builder()).build());
		}

		/**
		 * Builds a {@link SimulateTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateTemplateRequest build() {
			_checkSingleUse();

			return new SimulateTemplateRequest(this);
		}
	}

	public static final JsonpDeserializer<SimulateTemplateRequest> _DESERIALIZER = createSimulateTemplateRequestDeserializer();
	protected static JsonpDeserializer<SimulateTemplateRequest> createSimulateTemplateRequestDeserializer() {

		JsonpDeserializer<IndexTemplate> valueDeserializer = IndexTemplate._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.template(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.simulate_template}".
	 */
	public static final Endpoint<SimulateTemplateRequest, SimulateTemplateResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_index_template");
					buf.append("/_simulate");
					return buf.toString();
				}
				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_index_template");
					buf.append("/_simulate");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.create != null) {
					params.put("create", String.valueOf(request.create));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, SimulateTemplateResponse._DESERIALIZER);
}
