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

package org.opensearch.client.opensearch._types.aggregations;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.RateAggregation
@JsonpDeserializable
public class RateAggregation extends FormatMetricAggregationBase implements AggregationVariant {
	@Nullable
	private final DateInterval unit;

	@Nullable
	private final RateMode mode;

	// ---------------------------------------------------------------------------------------------

	private RateAggregation(Builder builder) {
		super(builder);

		this.unit = builder.unit;
		this.mode = builder.mode;

	}

	public static RateAggregation of(Function<Builder, ObjectBuilder<RateAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "rate";
	}

	/**
	 * API name: {@code unit}
	 */
	@Nullable
	public final DateInterval unit() {
		return this.unit;
	}

	/**
	 * API name: {@code mode}
	 */
	@Nullable
	public final RateMode mode() {
		return this.mode;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.unit != null) {
			generator.writeKey("unit");
			this.unit.serialize(generator, mapper);
		}
		if (this.mode != null) {
			generator.writeKey("mode");
			this.mode.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RateAggregation}.
	 */
	public static class Builder extends FormatMetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RateAggregation> {
		@Nullable
		private DateInterval unit;

		@Nullable
		private RateMode mode;

		/**
		 * API name: {@code unit}
		 */
		public final Builder unit(@Nullable DateInterval value) {
			this.unit = value;
			return this;
		}

		/**
		 * API name: {@code mode}
		 */
		public final Builder mode(@Nullable RateMode value) {
			this.mode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RateAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RateAggregation build() {
			_checkSingleUse();

			return new RateAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RateAggregation}
	 */
	public static final JsonpDeserializer<RateAggregation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RateAggregation::setupRateAggregationDeserializer, Builder::build);

	protected static void setupRateAggregationDeserializer(DelegatingDeserializer<RateAggregation.Builder> op) {
		setupFormatMetricAggregationBaseDeserializer(op);
		op.add(Builder::unit, DateInterval._DESERIALIZER, "unit");
		op.add(Builder::mode, RateMode._DESERIALIZER, "mode");

	}

}
