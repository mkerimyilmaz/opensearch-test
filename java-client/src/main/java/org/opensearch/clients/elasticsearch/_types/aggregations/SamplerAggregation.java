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
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.SamplerAggregation
@JsonpDeserializable
public class SamplerAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final Integer shardSize;

	// ---------------------------------------------------------------------------------------------

	private SamplerAggregation(Builder builder) {
		super(builder);

		this.shardSize = builder.shardSize;

	}

	public static SamplerAggregation of(Function<Builder, ObjectBuilder<SamplerAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "sampler";
	}

	/**
	 * API name: {@code shard_size}
	 */
	@Nullable
	public final Integer shardSize() {
		return this.shardSize;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.shardSize != null) {
			generator.writeKey("shard_size");
			generator.write(this.shardSize);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SamplerAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SamplerAggregation> {
		@Nullable
		private Integer shardSize;

		/**
		 * API name: {@code shard_size}
		 */
		public final Builder shardSize(@Nullable Integer value) {
			this.shardSize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SamplerAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SamplerAggregation build() {
			_checkSingleUse();

			return new SamplerAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SamplerAggregation}
	 */
	public static final JsonpDeserializer<SamplerAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SamplerAggregation::setupSamplerAggregationDeserializer, Builder::build);

	protected static void setupSamplerAggregationDeserializer(DelegatingDeserializer<SamplerAggregation.Builder> op) {
		setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");

	}

}
