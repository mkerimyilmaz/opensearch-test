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

package org.opensearch.clients.opensearch.indices.get_mapping;

import org.opensearch.clients.opensearch._types.mapping.TypeMapping;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.get_mapping.IndexMappingRecord
@JsonpDeserializable
public class IndexMappingRecord implements JsonpSerializable {
	@Nullable
	private final TypeMapping item;

	private final TypeMapping mappings;

	// ---------------------------------------------------------------------------------------------

	private IndexMappingRecord(Builder builder) {

		this.item = builder.item;
		this.mappings = ModelTypeHelper.requireNonNull(builder.mappings, this, "mappings");

	}

	public static IndexMappingRecord of(Function<Builder, ObjectBuilder<IndexMappingRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code item}
	 */
	@Nullable
	public final TypeMapping item() {
		return this.item;
	}

	/**
	 * Required - API name: {@code mappings}
	 */
	public final TypeMapping mappings() {
		return this.mappings;
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

		if (this.item != null) {
			generator.writeKey("item");
			this.item.serialize(generator, mapper);

		}
		generator.writeKey("mappings");
		this.mappings.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexMappingRecord}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexMappingRecord> {
		@Nullable
		private TypeMapping item;

		private TypeMapping mappings;

		/**
		 * API name: {@code item}
		 */
		public final Builder item(@Nullable TypeMapping value) {
			this.item = value;
			return this;
		}

		/**
		 * API name: {@code item}
		 */
		public final Builder item(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.item(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * Required - API name: {@code mappings}
		 */
		public final Builder mappings(TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Required - API name: {@code mappings}
		 */
		public final Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * Builds a {@link IndexMappingRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexMappingRecord build() {
			_checkSingleUse();

			return new IndexMappingRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexMappingRecord}
	 */
	public static final JsonpDeserializer<IndexMappingRecord> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexMappingRecord::setupIndexMappingRecordDeserializer, Builder::build);

	protected static void setupIndexMappingRecordDeserializer(DelegatingDeserializer<IndexMappingRecord.Builder> op) {

		op.add(Builder::item, TypeMapping._DESERIALIZER, "item");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");

	}

}
