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

package org.opensearch.clients.opensearch._types.query_dsl;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.GeoPolygonQuery

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/query_dsl/geo.ts#L63-L71">API
 *      specification</a>
 * @deprecated 7.12.0 Use geo-shape instead.
 */
@Deprecated
@JsonpDeserializable
public class GeoPolygonQuery extends QueryBase implements QueryVariant {
	private final String field;

	private final GeoPolygonPoints polygon;

	@Nullable
	private final GeoValidationMethod validationMethod;

	@Nullable
	private final Boolean ignoreUnmapped;

	// ---------------------------------------------------------------------------------------------

	private GeoPolygonQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.polygon = ApiTypeHelper.requireNonNull(builder.polygon, this, "polygon");

		this.validationMethod = builder.validationMethod;
		this.ignoreUnmapped = builder.ignoreUnmapped;

	}

	public static GeoPolygonQuery of(Function<Builder, ObjectBuilder<GeoPolygonQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.GeoPolygon;
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
	public final GeoPolygonPoints polygon() {
		return this.polygon;
	}

	/**
	 * API name: {@code validation_method}
	 */
	@Nullable
	public final GeoValidationMethod validationMethod() {
		return this.validationMethod;
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
		this.polygon.serialize(generator, mapper);

		super.serializeInternal(generator, mapper);
		if (this.validationMethod != null) {
			generator.writeKey("validation_method");
			this.validationMethod.serialize(generator, mapper);
		}
		if (this.ignoreUnmapped != null) {
			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoPolygonQuery}.
	 */
	@Deprecated
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<GeoPolygonQuery> {
		private String field;

		private GeoPolygonPoints polygon;

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
		public final Builder polygon(GeoPolygonPoints value) {
			this.polygon = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder polygon(Function<GeoPolygonPoints.Builder, ObjectBuilder<GeoPolygonPoints>> fn) {
			return this.polygon(fn.apply(new GeoPolygonPoints.Builder()).build());
		}

		@Nullable
		private GeoValidationMethod validationMethod;

		@Nullable
		private Boolean ignoreUnmapped;

		/**
		 * API name: {@code validation_method}
		 */
		public final Builder validationMethod(@Nullable GeoValidationMethod value) {
			this.validationMethod = value;
			return this;
		}

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
		 * Builds a {@link GeoPolygonQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoPolygonQuery build() {
			_checkSingleUse();

			return new GeoPolygonQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoPolygonQuery}
	 */
	public static final JsonpDeserializer<GeoPolygonQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoPolygonQuery::setupGeoPolygonQueryDeserializer);

	protected static void setupGeoPolygonQueryDeserializer(ObjectDeserializer<GeoPolygonQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::validationMethod, GeoValidationMethod._DESERIALIZER, "validation_method");
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.field(name);
			builder.polygon(GeoPolygonPoints._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
