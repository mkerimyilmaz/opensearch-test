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

package org.opensearch.clients.opensearch.indices.get_field_mapping;

import org.opensearch.clients.opensearch._types.mapping.FieldMapping;
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

import java.util.function.Function;

// typedef: indices.get_field_mapping.TypeFieldMappings

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/indices/get_field_mapping/types.ts#L24-L26">API
 *      specification</a>
 */
@JsonpDeserializable
public class TypeFieldMappings implements JsonpSerializable {
	private final FieldMapping mappings;

	// ---------------------------------------------------------------------------------------------

	private TypeFieldMappings(Builder builder) {

		this.mappings = ApiTypeHelper.requireNonNull(builder.mappings, this, "mappings");

	}

	public static TypeFieldMappings of(Function<Builder, ObjectBuilder<TypeFieldMappings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code mappings}
	 */
	public final FieldMapping mappings() {
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

		generator.writeKey("mappings");
		this.mappings.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TypeFieldMappings}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TypeFieldMappings> {
		private FieldMapping mappings;

		/**
		 * Required - API name: {@code mappings}
		 */
		public final Builder mappings(FieldMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Required - API name: {@code mappings}
		 */
		public final Builder mappings(Function<FieldMapping.Builder, ObjectBuilder<FieldMapping>> fn) {
			return this.mappings(fn.apply(new FieldMapping.Builder()).build());
		}

		/**
		 * Builds a {@link TypeFieldMappings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TypeFieldMappings build() {
			_checkSingleUse();

			return new TypeFieldMappings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TypeFieldMappings}
	 */
	public static final JsonpDeserializer<TypeFieldMappings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TypeFieldMappings::setupTypeFieldMappingsDeserializer);

	protected static void setupTypeFieldMappingsDeserializer(ObjectDeserializer<TypeFieldMappings.Builder> op) {

		op.add(Builder::mappings, FieldMapping._DESERIALIZER, "mappings");

	}

}
