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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ccr.unfollow.Request
public final class UnfollowRequest extends RequestBase {
	private final String index;

	// ---------------------------------------------------------------------------------------------

	public UnfollowRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");

	}

	/**
	 * The name of the follower index that should be turned into a regular index.
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UnfollowRequest}.
	 */
	public static class Builder implements ObjectBuilder<UnfollowRequest> {
		private String index;

		/**
		 * The name of the follower index that should be turned into a regular index.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Builds a {@link UnfollowRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UnfollowRequest build() {

			return new UnfollowRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.unfollow}".
	 */
	public static final Endpoint<UnfollowRequest, UnfollowResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/_ccr");
					buf.append("/unfollow");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, UnfollowResponse.DESERIALIZER);
}
