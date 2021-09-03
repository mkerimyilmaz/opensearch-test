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

package co.elastic.clients.elasticsearch._global.rank_eval;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.RankEvalMetricDiscountedCumulativeGain
public final class RankEvalMetricDiscountedCumulativeGain extends RankEvalMetricBase {
	@Nullable
	private final Boolean normalize;

	// ---------------------------------------------------------------------------------------------

	protected RankEvalMetricDiscountedCumulativeGain(Builder builder) {
		super(builder);
		this.normalize = builder.normalize;

	}

	/**
	 * If set to true, this metric will calculate the Normalized DCG.
	 * <p>
	 * API name: {@code normalize}
	 */
	@Nullable
	public Boolean normalize() {
		return this.normalize;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.normalize != null) {

			generator.writeKey("normalize");
			generator.write(this.normalize);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalMetricDiscountedCumulativeGain}.
	 */
	public static class Builder extends RankEvalMetricBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RankEvalMetricDiscountedCumulativeGain> {
		@Nullable
		private Boolean normalize;

		/**
		 * If set to true, this metric will calculate the Normalized DCG.
		 * <p>
		 * API name: {@code normalize}
		 */
		public Builder normalize(@Nullable Boolean value) {
			this.normalize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankEvalMetricDiscountedCumulativeGain}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalMetricDiscountedCumulativeGain build() {

			return new RankEvalMetricDiscountedCumulativeGain(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RankEvalMetricDiscountedCumulativeGain
	 */
	public static final JsonpDeserializer<RankEvalMetricDiscountedCumulativeGain> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					RankEvalMetricDiscountedCumulativeGain::setupRankEvalMetricDiscountedCumulativeGainDeserializer);

	protected static void setupRankEvalMetricDiscountedCumulativeGainDeserializer(
			DelegatingDeserializer<RankEvalMetricDiscountedCumulativeGain.Builder> op) {
		RankEvalMetricBase.setupRankEvalMetricBaseDeserializer(op);
		op.add(Builder::normalize, JsonpDeserializer.booleanDeserializer(), "normalize");

	}

}
