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

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;

import javax.annotation.Nullable;

// typedef: _types.aggregations.StringStatsAggregation
public final class StringStatsAggregation extends MetricAggregationBase {
	@Nullable
	private final Boolean showDistribution;

	// ---------------------------------------------------------------------------------------------

	protected StringStatsAggregation(Builder builder) {
		super(builder);
		this.showDistribution = builder.showDistribution;

	}

	/**
	 * API name: {@code show_distribution}
	 */
	@Nullable
	public Boolean showDistribution() {
		return this.showDistribution;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.showDistribution != null) {

			generator.writeKey("show_distribution");
			generator.write(this.showDistribution);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StringStatsAggregation}.
	 */
	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StringStatsAggregation> {
		@Nullable
		private Boolean showDistribution;

		/**
		 * API name: {@code show_distribution}
		 */
		public Builder showDistribution(@Nullable Boolean value) {
			this.showDistribution = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StringStatsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StringStatsAggregation build() {

			return new StringStatsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for StringStatsAggregation
	 */
	public static final JsonpDeserializer<StringStatsAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, StringStatsAggregation::setupStringStatsAggregationDeserializer);

	protected static void setupStringStatsAggregationDeserializer(
			DelegatingDeserializer<StringStatsAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::showDistribution, JsonpDeserializer.booleanDeserializer(), "show_distribution");

	}

}
