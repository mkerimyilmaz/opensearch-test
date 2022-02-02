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

package org.opensearch.clients.elasticsearch._types.aggregations;

import org.opensearch.clients.elasticsearch._types.GeoLine;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;

// typedef: _types.aggregations.GeoLineAggregate

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/aggregations/Aggregate.ts#L727-L731">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoLineAggregate extends AggregateBase implements AggregateVariant {
	private final String type;

	private final GeoLine geometry;

	// ---------------------------------------------------------------------------------------------

	private GeoLineAggregate(Builder builder) {
		super(builder);

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.geometry = ApiTypeHelper.requireNonNull(builder.geometry, this, "geometry");

	}

	public static GeoLineAggregate of(Function<Builder, ObjectBuilder<GeoLineAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.GeoLine;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code geometry}
	 */
	public final GeoLine geometry() {
		return this.geometry;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("geometry");
		this.geometry.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoLineAggregate}.
	 */

	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoLineAggregate> {
		private String type;

		private GeoLine geometry;

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code geometry}
		 */
		public final Builder geometry(GeoLine value) {
			this.geometry = value;
			return this;
		}

		/**
		 * Required - API name: {@code geometry}
		 */
		public final Builder geometry(Function<GeoLine.Builder, ObjectBuilder<GeoLine>> fn) {
			return this.geometry(fn.apply(new GeoLine.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoLineAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoLineAggregate build() {
			_checkSingleUse();

			return new GeoLineAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoLineAggregate}
	 */
	public static final JsonpDeserializer<GeoLineAggregate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoLineAggregate::setupGeoLineAggregateDeserializer);

	protected static void setupGeoLineAggregateDeserializer(ObjectDeserializer<GeoLineAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::geometry, GeoLine._DESERIALIZER, "geometry");

	}

}
