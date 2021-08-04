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

package org.opensearch.clients.opensearch.core;

import org.opensearch.clients.opensearch._types.ErrorResponse;
import org.opensearch.clients.opensearch._types.RequestBase;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.transport.Endpoint;
import org.opensearch.clients.transport.endpoints.SimpleEndpoint;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.clear_scroll.Request

/**
 * Explicitly clears the search context for a scroll.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_global/clear_scroll/ClearScrollRequest.ts#L23-L35">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClearScrollRequest extends RequestBase implements JsonpSerializable {
	private final List<String> scrollId;

	// ---------------------------------------------------------------------------------------------

	private ClearScrollRequest(Builder builder) {

		this.scrollId = ApiTypeHelper.unmodifiable(builder.scrollId);

	}

	public static ClearScrollRequest of(Function<Builder, ObjectBuilder<ClearScrollRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code scroll_id}
	 */
	public final List<String> scrollId() {
		return this.scrollId;
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

		if (ApiTypeHelper.isDefined(this.scrollId)) {
			generator.writeKey("scroll_id");
			generator.writeStartArray();
			for (String item0 : this.scrollId) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearScrollRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClearScrollRequest> {
		@Nullable
		private List<String> scrollId;

		/**
		 * API name: {@code scroll_id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>scrollId</code>.
		 */
		public final Builder scrollId(List<String> list) {
			this.scrollId = _listAddAll(this.scrollId, list);
			return this;
		}

		/**
		 * API name: {@code scroll_id}
		 * <p>
		 * Adds one or more values to <code>scrollId</code>.
		 */
		public final Builder scrollId(String value, String... values) {
			this.scrollId = _listAdd(this.scrollId, value, values);
			return this;
		}

		/**
		 * Builds a {@link ClearScrollRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearScrollRequest build() {
			_checkSingleUse();

			return new ClearScrollRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClearScrollRequest}
	 */
	public static final JsonpDeserializer<ClearScrollRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClearScrollRequest::setupClearScrollRequestDeserializer);

	protected static void setupClearScrollRequestDeserializer(ObjectDeserializer<ClearScrollRequest.Builder> op) {

		op.add(Builder::scrollId, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"scroll_id");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code clear_scroll}".
	 */
	public static final Endpoint<ClearScrollRequest, ClearScrollResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/clear_scroll",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				return "/_search/scroll";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, ClearScrollResponse._DESERIALIZER);
}
