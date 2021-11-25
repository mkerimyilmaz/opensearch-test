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
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.DerivativeAggregate
@JsonpDeserializable
public class DerivativeAggregate extends SingleMetricAggregateBase implements AggregateVariant {
	@Nullable
	private final Double normalizedValue;

	@Nullable
	private final String normalizedValueAsString;

	// ---------------------------------------------------------------------------------------------

	private DerivativeAggregate(Builder builder) {
		super(builder);

		this.normalizedValue = builder.normalizedValue;
		this.normalizedValueAsString = builder.normalizedValueAsString;

	}

	public static DerivativeAggregate of(Function<Builder, ObjectBuilder<DerivativeAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "derivative";
	}

	/**
	 * API name: {@code normalized_value}
	 */
	@Nullable
	public final Double normalizedValue() {
		return this.normalizedValue;
	}

	/**
	 * API name: {@code normalized_value_as_string}
	 */
	@Nullable
	public final String normalizedValueAsString() {
		return this.normalizedValueAsString;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.normalizedValue != null) {
			generator.writeKey("normalized_value");
			generator.write(this.normalizedValue);

		}
		if (this.normalizedValueAsString != null) {
			generator.writeKey("normalized_value_as_string");
			generator.write(this.normalizedValueAsString);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DerivativeAggregate}.
	 */
	public static class Builder extends SingleMetricAggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DerivativeAggregate> {
		@Nullable
		private Double normalizedValue;

		@Nullable
		private String normalizedValueAsString;

		/**
		 * API name: {@code normalized_value}
		 */
		public final Builder normalizedValue(@Nullable Double value) {
			this.normalizedValue = value;
			return this;
		}

		/**
		 * API name: {@code normalized_value_as_string}
		 */
		public final Builder normalizedValueAsString(@Nullable String value) {
			this.normalizedValueAsString = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DerivativeAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DerivativeAggregate build() {
			_checkSingleUse();

			return new DerivativeAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DerivativeAggregate}
	 */
	public static final JsonpDeserializer<DerivativeAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DerivativeAggregate::setupDerivativeAggregateDeserializer, Builder::build);

	protected static void setupDerivativeAggregateDeserializer(DelegatingDeserializer<DerivativeAggregate.Builder> op) {
		SingleMetricAggregateBase.setupSingleMetricAggregateBaseDeserializer(op);
		op.add(Builder::normalizedValue, JsonpDeserializer.doubleDeserializer(), "normalized_value");
		op.add(Builder::normalizedValueAsString, JsonpDeserializer.stringDeserializer(), "normalized_value_as_string");

	}

}
