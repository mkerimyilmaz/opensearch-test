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

package org.opensearch.clients.opensearch._types.aggregations;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: _types.aggregations.GeoBoundsAggregate
@JsonpDeserializable
public class GeoBoundsAggregate extends AggregateBase implements AggregateVariant {
	private final GeoBounds bounds;

	// ---------------------------------------------------------------------------------------------

	private GeoBoundsAggregate(Builder builder) {
		super(builder);

		this.bounds = ModelTypeHelper.requireNonNull(builder.bounds, this, "bounds");

	}

	public static GeoBoundsAggregate of(Function<Builder, ObjectBuilder<GeoBoundsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "geo_bounds";
	}

	/**
	 * Required - API name: {@code bounds}
	 */
	public final GeoBounds bounds() {
		return this.bounds;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("bounds");
		this.bounds.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoBoundsAggregate}.
	 */
	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoBoundsAggregate> {
		private GeoBounds bounds;

		/**
		 * Required - API name: {@code bounds}
		 */
		public final Builder bounds(GeoBounds value) {
			this.bounds = value;
			return this;
		}

		/**
		 * Required - API name: {@code bounds}
		 */
		public final Builder bounds(Function<GeoBounds.Builder, ObjectBuilder<GeoBounds>> fn) {
			return this.bounds(fn.apply(new GeoBounds.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoBoundsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoBoundsAggregate build() {
			_checkSingleUse();

			return new GeoBoundsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoBoundsAggregate}
	 */
	public static final JsonpDeserializer<GeoBoundsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoBoundsAggregate::setupGeoBoundsAggregateDeserializer, Builder::build);

	protected static void setupGeoBoundsAggregateDeserializer(DelegatingDeserializer<GeoBoundsAggregate.Builder> op) {
		setupAggregateBaseDeserializer(op);
		op.add(Builder::bounds, GeoBounds._DESERIALIZER, "bounds");

	}

}
