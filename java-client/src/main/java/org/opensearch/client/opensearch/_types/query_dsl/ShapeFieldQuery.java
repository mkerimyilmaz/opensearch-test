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

package org.opensearch.client.opensearch._types.query_dsl;

import org.opensearch.client.opensearch._types.ShapeRelation;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonData;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.ShapeFieldQuery
@JsonpDeserializable
public class ShapeFieldQuery implements JsonpSerializable {
	@Nullable
	private final Boolean ignoreUnmapped;

	@Nullable
	private final FieldLookup indexedShape;

	@Nullable
	private final ShapeRelation relation;

	@Nullable
	private final JsonData shape;

	// ---------------------------------------------------------------------------------------------

	private ShapeFieldQuery(Builder builder) {

		this.ignoreUnmapped = builder.ignoreUnmapped;
		this.indexedShape = builder.indexedShape;
		this.relation = builder.relation;
		this.shape = builder.shape;

	}

	public static ShapeFieldQuery of(Function<Builder, ObjectBuilder<ShapeFieldQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public final Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	/**
	 * API name: {@code indexed_shape}
	 */
	@Nullable
	public final FieldLookup indexedShape() {
		return this.indexedShape;
	}

	/**
	 * API name: {@code relation}
	 */
	@Nullable
	public final ShapeRelation relation() {
		return this.relation;
	}

	/**
	 * API name: {@code shape}
	 */
	@Nullable
	public final JsonData shape() {
		return this.shape;
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

		if (this.ignoreUnmapped != null) {
			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}
		if (this.indexedShape != null) {
			generator.writeKey("indexed_shape");
			this.indexedShape.serialize(generator, mapper);

		}
		if (this.relation != null) {
			generator.writeKey("relation");
			this.relation.serialize(generator, mapper);
		}
		if (this.shape != null) {
			generator.writeKey("shape");
			this.shape.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShapeFieldQuery}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ShapeFieldQuery> {
		@Nullable
		private Boolean ignoreUnmapped;

		@Nullable
		private FieldLookup indexedShape;

		@Nullable
		private ShapeRelation relation;

		@Nullable
		private JsonData shape;

		/**
		 * API name: {@code ignore_unmapped}
		 */
		public final Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		/**
		 * API name: {@code indexed_shape}
		 */
		public final Builder indexedShape(@Nullable FieldLookup value) {
			this.indexedShape = value;
			return this;
		}

		/**
		 * API name: {@code indexed_shape}
		 */
		public final Builder indexedShape(Function<FieldLookup.Builder, ObjectBuilder<FieldLookup>> fn) {
			return this.indexedShape(fn.apply(new FieldLookup.Builder()).build());
		}

		/**
		 * API name: {@code relation}
		 */
		public final Builder relation(@Nullable ShapeRelation value) {
			this.relation = value;
			return this;
		}

		/**
		 * API name: {@code shape}
		 */
		public final Builder shape(@Nullable JsonData value) {
			this.shape = value;
			return this;
		}

		/**
		 * Builds a {@link ShapeFieldQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShapeFieldQuery build() {
			_checkSingleUse();

			return new ShapeFieldQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShapeFieldQuery}
	 */
	public static final JsonpDeserializer<ShapeFieldQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShapeFieldQuery::setupShapeFieldQueryDeserializer, Builder::build);

	protected static void setupShapeFieldQueryDeserializer(DelegatingDeserializer<ShapeFieldQuery.Builder> op) {

		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");
		op.add(Builder::indexedShape, FieldLookup._DESERIALIZER, "indexed_shape");
		op.add(Builder::relation, ShapeRelation._DESERIALIZER, "relation");
		op.add(Builder::shape, JsonData._DESERIALIZER, "shape");

	}

}
