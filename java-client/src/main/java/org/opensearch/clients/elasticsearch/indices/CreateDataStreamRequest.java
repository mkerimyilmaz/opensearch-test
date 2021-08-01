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

import org.opensearch.clients.base.ElasticsearchError;
import org.opensearch.clients.base.Endpoint;
import org.opensearch.clients.elasticsearch._types.RequestBase;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.Collections;
import java.util.Objects;

// typedef: indices.create_data_stream.Request
public final class CreateDataStreamRequest extends RequestBase {
	private final String name;

	// ---------------------------------------------------------------------------------------------

	protected CreateDataStreamRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateDataStreamRequest}.
	 */
	public static class Builder implements ObjectBuilder<CreateDataStreamRequest> {
		private String name;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link CreateDataStreamRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateDataStreamRequest build() {

			return new CreateDataStreamRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.create_data_stream}".
	 */
	public static final Endpoint<CreateDataStreamRequest, CreateDataStreamResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_data_stream");
					buf.append("/");
					buf.append(request.name);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, CreateDataStreamResponse.DESERIALIZER);
}
