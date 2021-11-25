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

package org.opensearch.clients.opensearch._types.aggregations;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.ExtendedStatsAggregation
@JsonpDeserializable
public class ExtendedStatsAggregation extends FormatMetricAggregationBase implements AggregationVariant {
	@Nullable
	private final Double sigma;

	// ---------------------------------------------------------------------------------------------

	private ExtendedStatsAggregation(Builder builder) {
		super(builder);

		this.sigma = builder.sigma;

	}

	public static ExtendedStatsAggregation of(Function<Builder, ObjectBuilder<ExtendedStatsAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "extended_stats";
	}

	/**
	 * API name: {@code sigma}
	 */
	@Nullable
	public final Double sigma() {
		return this.sigma;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.sigma != null) {
			generator.writeKey("sigma");
			generator.write(this.sigma);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExtendedStatsAggregation}.
	 */
	public static class Builder extends FormatMetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ExtendedStatsAggregation> {
		@Nullable
		private Double sigma;

		/**
		 * API name: {@code sigma}
		 */
		public final Builder sigma(@Nullable Double value) {
			this.sigma = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExtendedStatsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExtendedStatsAggregation build() {
			_checkSingleUse();

			return new ExtendedStatsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExtendedStatsAggregation}
	 */
	public static final JsonpDeserializer<ExtendedStatsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExtendedStatsAggregation::setupExtendedStatsAggregationDeserializer, Builder::build);

	protected static void setupExtendedStatsAggregationDeserializer(
			DelegatingDeserializer<ExtendedStatsAggregation.Builder> op) {
		setupFormatMetricAggregationBaseDeserializer(op);
		op.add(Builder::sigma, JsonpDeserializer.doubleDeserializer(), "sigma");

	}

}
