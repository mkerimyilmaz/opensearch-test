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

// typedef: _types.aggregations.BoxplotAggregation
@JsonpDeserializable
public class BoxplotAggregation extends MetricAggregationBase implements AggregationVariant {
	@Nullable
	private final Double compression;

	// ---------------------------------------------------------------------------------------------

	private BoxplotAggregation(Builder builder) {
		super(builder);

		this.compression = builder.compression;

	}

	public static BoxplotAggregation of(Function<Builder, ObjectBuilder<BoxplotAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "boxplot";
	}

	/**
	 * API name: {@code compression}
	 */
	@Nullable
	public final Double compression() {
		return this.compression;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.compression != null) {
			generator.writeKey("compression");
			generator.write(this.compression);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BoxplotAggregation}.
	 */
	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BoxplotAggregation> {
		@Nullable
		private Double compression;

		/**
		 * API name: {@code compression}
		 */
		public final Builder compression(@Nullable Double value) {
			this.compression = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BoxplotAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BoxplotAggregation build() {
			_checkSingleUse();

			return new BoxplotAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BoxplotAggregation}
	 */
	public static final JsonpDeserializer<BoxplotAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BoxplotAggregation::setupBoxplotAggregationDeserializer, Builder::build);

	protected static void setupBoxplotAggregationDeserializer(DelegatingDeserializer<BoxplotAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::compression, JsonpDeserializer.doubleDeserializer(), "compression");

	}

}
