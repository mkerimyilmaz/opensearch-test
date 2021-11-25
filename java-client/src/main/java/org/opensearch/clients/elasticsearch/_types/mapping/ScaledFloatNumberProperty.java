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

package org.opensearch.clients.elasticsearch._types.mapping;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.ScaledFloatNumberProperty
@JsonpDeserializable
public class ScaledFloatNumberProperty extends NumberPropertyBase implements PropertyVariant {
	@Nullable
	private final Boolean coerce;

	@Nullable
	private final Double nullValue;

	@Nullable
	private final Double scalingFactor;

	// ---------------------------------------------------------------------------------------------

	private ScaledFloatNumberProperty(Builder builder) {
		super(builder);

		this.coerce = builder.coerce;
		this.nullValue = builder.nullValue;
		this.scalingFactor = builder.scalingFactor;

	}

	public static ScaledFloatNumberProperty of(Function<Builder, ObjectBuilder<ScaledFloatNumberProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "scaled_float";
	}

	/**
	 * API name: {@code coerce}
	 */
	@Nullable
	public final Boolean coerce() {
		return this.coerce;
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public final Double nullValue() {
		return this.nullValue;
	}

	/**
	 * API name: {@code scaling_factor}
	 */
	@Nullable
	public final Double scalingFactor() {
		return this.scalingFactor;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "scaled_float");
		super.serializeInternal(generator, mapper);
		if (this.coerce != null) {
			generator.writeKey("coerce");
			generator.write(this.coerce);

		}
		if (this.nullValue != null) {
			generator.writeKey("null_value");
			generator.write(this.nullValue);

		}
		if (this.scalingFactor != null) {
			generator.writeKey("scaling_factor");
			generator.write(this.scalingFactor);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScaledFloatNumberProperty}.
	 */
	public static class Builder extends NumberPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ScaledFloatNumberProperty> {
		@Nullable
		private Boolean coerce;

		@Nullable
		private Double nullValue;

		@Nullable
		private Double scalingFactor;

		/**
		 * API name: {@code coerce}
		 */
		public final Builder coerce(@Nullable Boolean value) {
			this.coerce = value;
			return this;
		}

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable Double value) {
			this.nullValue = value;
			return this;
		}

		/**
		 * API name: {@code scaling_factor}
		 */
		public final Builder scalingFactor(@Nullable Double value) {
			this.scalingFactor = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ScaledFloatNumberProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScaledFloatNumberProperty build() {
			_checkSingleUse();

			return new ScaledFloatNumberProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScaledFloatNumberProperty}
	 */
	public static final JsonpDeserializer<ScaledFloatNumberProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ScaledFloatNumberProperty::setupScaledFloatNumberPropertyDeserializer, Builder::build);

	protected static void setupScaledFloatNumberPropertyDeserializer(
			DelegatingDeserializer<ScaledFloatNumberProperty.Builder> op) {
		setupNumberPropertyBaseDeserializer(op);
		op.add(Builder::coerce, JsonpDeserializer.booleanDeserializer(), "coerce");
		op.add(Builder::nullValue, JsonpDeserializer.doubleDeserializer(), "null_value");
		op.add(Builder::scalingFactor, JsonpDeserializer.doubleDeserializer(), "scaling_factor");

		op.ignore("type");
	}

}
