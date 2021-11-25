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

package org.opensearch.client.opensearch._types.aggregations;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import java.util.function.Function;

// typedef: _types.aggregations.VariableWidthHistogramAggregate
@JsonpDeserializable
public class VariableWidthHistogramAggregate extends MultiBucketAggregateBase<VariableWidthHistogramBucket>
		implements
			AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private VariableWidthHistogramAggregate(Builder builder) {
		super(builder);

	}

	public static VariableWidthHistogramAggregate of(
			Function<Builder, ObjectBuilder<VariableWidthHistogramAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "variable_width_histogram";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VariableWidthHistogramAggregate}.
	 */
	public static class Builder extends MultiBucketAggregateBase.AbstractBuilder<VariableWidthHistogramBucket, Builder>
			implements
				ObjectBuilder<VariableWidthHistogramAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link VariableWidthHistogramAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VariableWidthHistogramAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new VariableWidthHistogramAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link VariableWidthHistogramAggregate}
	 */
	public static final JsonpDeserializer<VariableWidthHistogramAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, VariableWidthHistogramAggregate::setupVariableWidthHistogramAggregateDeserializer,
					Builder::build);

	protected static void setupVariableWidthHistogramAggregateDeserializer(
			DelegatingDeserializer<VariableWidthHistogramAggregate.Builder> op) {
		setupMultiBucketAggregateBaseDeserializer(op,
				VariableWidthHistogramBucket._DESERIALIZER);

	}

}
