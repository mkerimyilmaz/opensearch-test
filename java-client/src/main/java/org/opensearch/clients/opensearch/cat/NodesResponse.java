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

package org.opensearch.clients.opensearch.cat;

import org.opensearch.clients.opensearch.cat.nodes.NodesRecord;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.util.List;
import java.util.function.Function;

// typedef: cat.nodes.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/cat/nodes/CatNodesResponse.ts#L22-L24">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodesResponse implements JsonpSerializable {
	private final List<NodesRecord> valueBody;

	// ---------------------------------------------------------------------------------------------

	private NodesResponse(Builder builder) {

		this.valueBody = ApiTypeHelper.unmodifiableRequired(builder.valueBody, this, "valueBody");

	}

	public static NodesResponse of(Function<Builder, ObjectBuilder<NodesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final List<NodesRecord> valueBody() {
		return this.valueBody;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (NodesRecord item0 : this.valueBody) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodesResponse}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodesResponse> {
		private List<NodesRecord> valueBody;

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>valueBody</code>.
		 */
		public final Builder valueBody(List<NodesRecord> list) {
			this.valueBody = _listAddAll(this.valueBody, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 * <p>
		 * Adds one or more values to <code>valueBody</code>.
		 */
		public final Builder valueBody(NodesRecord value, NodesRecord... values) {
			this.valueBody = _listAdd(this.valueBody, value, values);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 * <p>
		 * Adds a value to <code>valueBody</code> using a builder lambda.
		 */
		public final Builder valueBody(Function<NodesRecord.Builder, ObjectBuilder<NodesRecord>> fn) {
			return valueBody(fn.apply(new NodesRecord.Builder()).build());
		}

		/**
		 * Builds a {@link NodesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodesResponse build() {
			_checkSingleUse();

			return new NodesResponse(this);
		}
	}

	public static final JsonpDeserializer<NodesResponse> _DESERIALIZER = createNodesResponseDeserializer();
	protected static JsonpDeserializer<NodesResponse> createNodesResponseDeserializer() {

		JsonpDeserializer<List<NodesRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(NodesRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(),
				(parser, mapper) -> new Builder().valueBody(valueDeserializer.deserialize(parser, mapper)).build());
	}

}
