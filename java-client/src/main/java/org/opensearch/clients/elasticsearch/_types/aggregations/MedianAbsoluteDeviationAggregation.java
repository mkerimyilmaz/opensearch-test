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

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MedianAbsoluteDeviationAggregation

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/aggregations/metric.ts#L90-L92">API
 *      specification</a>
 */
@JsonpDeserializable
public class MedianAbsoluteDeviationAggregation extends FormatMetricAggregationBase implements AggregationVariant {
	@Nullable
	private final Double compression;

	// ---------------------------------------------------------------------------------------------

	private MedianAbsoluteDeviationAggregation(Builder builder) {
		super(builder);

		this.compression = builder.compression;

	}

	public static MedianAbsoluteDeviationAggregation of(
			Function<Builder, ObjectBuilder<MedianAbsoluteDeviationAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.MedianAbsoluteDeviation;
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
	 * Builder for {@link MedianAbsoluteDeviationAggregation}.
	 */

	public static class Builder extends FormatMetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MedianAbsoluteDeviationAggregation> {
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
		 * Builds a {@link MedianAbsoluteDeviationAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MedianAbsoluteDeviationAggregation build() {
			_checkSingleUse();

			return new MedianAbsoluteDeviationAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MedianAbsoluteDeviationAggregation}
	 */
	public static final JsonpDeserializer<MedianAbsoluteDeviationAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					MedianAbsoluteDeviationAggregation::setupMedianAbsoluteDeviationAggregationDeserializer);

	protected static void setupMedianAbsoluteDeviationAggregationDeserializer(
			ObjectDeserializer<MedianAbsoluteDeviationAggregation.Builder> op) {
		setupFormatMetricAggregationBaseDeserializer(op);
		op.add(Builder::compression, JsonpDeserializer.doubleDeserializer(), "compression");

	}

}
