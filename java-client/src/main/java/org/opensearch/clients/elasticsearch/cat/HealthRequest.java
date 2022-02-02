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

import org.opensearch.clients.elasticsearch._types.ErrorResponse;
import org.opensearch.clients.transport.Endpoint;
import org.opensearch.clients.transport.endpoints.SimpleEndpoint;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;

import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.health.Request

/**
 * Returns a concise representation of the cluster health.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/cat/health/CatHealthRequest.ts#L22-L31">API
 *      specification</a>
 */

public class HealthRequest extends CatRequestBase {
	@Nullable
	private final Boolean ts;

	// ---------------------------------------------------------------------------------------------

	private HealthRequest(Builder builder) {

		this.ts = builder.ts;

	}

	public static HealthRequest of(Function<Builder, ObjectBuilder<HealthRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Set to false to disable timestamping
	 * <p>
	 * API name: {@code ts}
	 */
	@Nullable
	public final Boolean ts() {
		return this.ts;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HealthRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HealthRequest> {
		@Nullable
		private Boolean ts;

		/**
		 * Set to false to disable timestamping
		 * <p>
		 * API name: {@code ts}
		 */
		public final Builder ts(@Nullable Boolean value) {
			this.ts = value;
			return this;
		}

		/**
		 * Builds a {@link HealthRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HealthRequest build() {
			_checkSingleUse();

			return new HealthRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.health}".
	 */
	public static final Endpoint<HealthRequest, HealthResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.health",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_cat/health";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.ts != null) {
					params.put("ts", String.valueOf(request.ts));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, HealthResponse._DESERIALIZER);
}
