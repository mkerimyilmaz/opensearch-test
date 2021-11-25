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

package org.opensearch.clients.opensearch._types.query_dsl;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.GeoShapeQuery
@JsonpDeserializable
public class GeoShapeQuery extends QueryBase implements QueryVariant {
	private final String field;

	private final GeoShapeFieldQuery shape;

	@Nullable
	private final Boolean ignoreUnmapped;

	// ---------------------------------------------------------------------------------------------

	private GeoShapeQuery(Builder builder) {
		super(builder);
		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.shape = ModelTypeHelper.requireNonNull(builder.shape, this, "shape");

		this.ignoreUnmapped = builder.ignoreUnmapped;

	}

	public static GeoShapeQuery of(Function<Builder, ObjectBuilder<GeoShapeQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "geo_shape";
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
	public final GeoShapeFieldQuery shape() {
		return this.shape;
	}

	/**
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public final Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeKey(this.field);
		this.shape.serialize(generator, mapper);

		super.serializeInternal(generator, mapper);
		if (this.ignoreUnmapped != null) {
			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoShapeQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<GeoShapeQuery> {
		private String field;

		private GeoShapeFieldQuery shape;

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
		public final Builder shape(GeoShapeFieldQuery value) {
			this.shape = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder shape(Function<GeoShapeFieldQuery.Builder, ObjectBuilder<GeoShapeFieldQuery>> fn) {
			return this.shape(fn.apply(new GeoShapeFieldQuery.Builder()).build());
		}

		@Nullable
		private Boolean ignoreUnmapped;

		/**
		 * API name: {@code ignore_unmapped}
		 */
		public final Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoShapeQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoShapeQuery build() {
			_checkSingleUse();

			return new GeoShapeQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoShapeQuery}
	 */
	public static final JsonpDeserializer<GeoShapeQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoShapeQuery::setupGeoShapeQueryDeserializer, Builder::build);

	protected static void setupGeoShapeQueryDeserializer(DelegatingDeserializer<GeoShapeQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.field(name);
			builder.shape(GeoShapeFieldQuery._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
