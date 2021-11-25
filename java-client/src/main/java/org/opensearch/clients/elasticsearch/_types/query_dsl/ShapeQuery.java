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

package org.opensearch.clients.elasticsearch._types.query_dsl;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.function.Function;

// typedef: _types.query_dsl.ShapeQuery
@JsonpDeserializable
public class ShapeQuery extends QueryBase implements QueryVariant {
	private final String field;

	private final ShapeFieldQuery shape;

	// ---------------------------------------------------------------------------------------------

	private ShapeQuery(Builder builder) {
		super(builder);
		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.shape = ModelTypeHelper.requireNonNull(builder.shape, this, "shape");

	}

	public static ShapeQuery of(Function<Builder, ObjectBuilder<ShapeQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "shape";
	}

	/**
	 * Required -
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required -
	 */
	public final ShapeFieldQuery shape() {
		return this.shape;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeKey(this.field);
		this.shape.serialize(generator, mapper);

		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShapeQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<ShapeQuery> {
		private String field;

		private ShapeFieldQuery shape;

		/**
		 * Required -
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder shape(ShapeFieldQuery value) {
			this.shape = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder shape(Function<ShapeFieldQuery.Builder, ObjectBuilder<ShapeFieldQuery>> fn) {
			return this.shape(fn.apply(new ShapeFieldQuery.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShapeQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShapeQuery build() {
			_checkSingleUse();

			return new ShapeQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShapeQuery}
	 */
	public static final JsonpDeserializer<ShapeQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShapeQuery::setupShapeQueryDeserializer, Builder::build);

	protected static void setupShapeQueryDeserializer(DelegatingDeserializer<ShapeQuery.Builder> op) {
		setupQueryBaseDeserializer(op);

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.field(name);
			builder.shape(ShapeFieldQuery._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
