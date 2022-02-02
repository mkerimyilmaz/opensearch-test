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

package org.opensearch.clients.opensearch.dangling_indices;

import org.opensearch.clients.opensearch.dangling_indices.list_dangling_indices.DanglingIndex;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.util.List;
import java.util.function.Function;

// typedef: dangling_indices.list_dangling_indices.Response

@JsonpDeserializable
public class ListDanglingIndicesResponse implements JsonpSerializable {
	private final List<DanglingIndex> danglingIndices;

	// ---------------------------------------------------------------------------------------------

	private ListDanglingIndicesResponse(Builder builder) {

		this.danglingIndices = ApiTypeHelper.unmodifiableRequired(builder.danglingIndices, this, "danglingIndices");

	}

	public static ListDanglingIndicesResponse of(Function<Builder, ObjectBuilder<ListDanglingIndicesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code dangling_indices}
	 */
	public final List<DanglingIndex> danglingIndices() {
		return this.danglingIndices;
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

		if (ApiTypeHelper.isDefined(this.danglingIndices)) {
			generator.writeKey("dangling_indices");
			generator.writeStartArray();
			for (DanglingIndex item0 : this.danglingIndices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ListDanglingIndicesResponse}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ListDanglingIndicesResponse> {
		private List<DanglingIndex> danglingIndices;

		/**
		 * Required - API name: {@code dangling_indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>danglingIndices</code>.
		 */
		public final Builder danglingIndices(List<DanglingIndex> list) {
			this.danglingIndices = _listAddAll(this.danglingIndices, list);
			return this;
		}

		/**
		 * Required - API name: {@code dangling_indices}
		 * <p>
		 * Adds one or more values to <code>danglingIndices</code>.
		 */
		public final Builder danglingIndices(DanglingIndex value, DanglingIndex... values) {
			this.danglingIndices = _listAdd(this.danglingIndices, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code dangling_indices}
		 * <p>
		 * Adds a value to <code>danglingIndices</code> using a builder lambda.
		 */
		public final Builder danglingIndices(Function<DanglingIndex.Builder, ObjectBuilder<DanglingIndex>> fn) {
			return danglingIndices(fn.apply(new DanglingIndex.Builder()).build());
		}

		/**
		 * Builds a {@link ListDanglingIndicesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ListDanglingIndicesResponse build() {
			_checkSingleUse();

			return new ListDanglingIndicesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ListDanglingIndicesResponse}
	 */
	public static final JsonpDeserializer<ListDanglingIndicesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ListDanglingIndicesResponse::setupListDanglingIndicesResponseDeserializer);

	protected static void setupListDanglingIndicesResponseDeserializer(
			ObjectDeserializer<ListDanglingIndicesResponse.Builder> op) {

		op.add(Builder::danglingIndices, JsonpDeserializer.arrayDeserializer(DanglingIndex._DESERIALIZER),
				"dangling_indices");

	}

}
