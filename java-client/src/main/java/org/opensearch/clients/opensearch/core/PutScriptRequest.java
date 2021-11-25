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

package org.opensearch.clients.opensearch.core;

import org.opensearch.clients.opensearch._types.ErrorResponse;
import org.opensearch.clients.opensearch._types.RequestBase;
import org.opensearch.clients.opensearch._types.StoredScript;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.transport.Endpoint;
import org.opensearch.clients.transport.SimpleEndpoint;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.put_script.Request
@JsonpDeserializable
public class PutScriptRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String context;

	private final String id;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final StoredScript script;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	private PutScriptRequest(Builder builder) {

		this.context = builder.context;
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.masterTimeout = builder.masterTimeout;
		this.script = builder.script;
		this.timeout = builder.timeout;

	}

	public static PutScriptRequest of(Function<Builder, ObjectBuilder<PutScriptRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Script context
	 * <p>
	 * API name: {@code context}
	 */
	@Nullable
	public final String context() {
		return this.context;
	}

	/**
	 * Required - Script ID
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final StoredScript script() {
		return this.script;
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

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutScriptRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutScriptRequest> {
		@Nullable
		private String context;

		private String id;

		@Nullable
		private String masterTimeout;

		@Nullable
		private StoredScript script;

		@Nullable
		private String timeout;

		/**
		 * Script context
		 * <p>
		 * API name: {@code context}
		 */
		public final Builder context(@Nullable String value) {
			this.context = value;
			return this;
		}

		/**
		 * Required - Script ID
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable StoredScript value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(Function<StoredScript.Builder, ObjectBuilder<StoredScript>> fn) {
			return this.script(fn.apply(new StoredScript.Builder()).build());
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
		 * Builds a {@link PutScriptRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutScriptRequest build() {
			_checkSingleUse();

			return new PutScriptRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutScriptRequest}
	 */
	public static final JsonpDeserializer<PutScriptRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutScriptRequest::setupPutScriptRequestDeserializer, Builder::build);

	protected static void setupPutScriptRequestDeserializer(DelegatingDeserializer<PutScriptRequest.Builder> op) {

		op.add(Builder::script, StoredScript._DESERIALIZER, "script");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code put_script}".
	 */
	public static final Endpoint<PutScriptRequest, PutScriptResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _context = 1 << 0;
				final int _id = 1 << 1;

				int propsSet = 0;

				if (request.context() != null)
					propsSet |= _context;
				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_scripts");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				if (propsSet == (_id | _context)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_scripts");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.context, buf);
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
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutScriptResponse._DESERIALIZER);
}
