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

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.function.Function;

// typedef: _types.aggregations.CardinalityAggregate
@JsonpDeserializable
public class CardinalityAggregate extends AggregateBase implements AggregateVariant {
	private final long value;

	// ---------------------------------------------------------------------------------------------

	private CardinalityAggregate(Builder builder) {
		super(builder);

		this.value = ModelTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static CardinalityAggregate of(Function<Builder, ObjectBuilder<CardinalityAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "cardinality";
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final long value() {
		return this.value;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("value");
		generator.write(this.value);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CardinalityAggregate}.
	 */
	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CardinalityAggregate> {
		private Long value;

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(long value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CardinalityAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CardinalityAggregate build() {
			_checkSingleUse();

			return new CardinalityAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CardinalityAggregate}
	 */
	public static final JsonpDeserializer<CardinalityAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CardinalityAggregate::setupCardinalityAggregateDeserializer, Builder::build);

	protected static void setupCardinalityAggregateDeserializer(
			DelegatingDeserializer<CardinalityAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::value, JsonpDeserializer.longDeserializer(), "value");

	}

}
