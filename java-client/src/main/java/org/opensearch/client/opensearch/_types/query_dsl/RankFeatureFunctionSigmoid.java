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

package org.opensearch.client.opensearch._types.query_dsl;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.util.function.Function;

// typedef: _types.query_dsl.RankFeatureFunctionSigmoid
@JsonpDeserializable
public class RankFeatureFunctionSigmoid extends RankFeatureFunction implements JsonpSerializable {
	private final float pivot;

	private final float exponent;

	// ---------------------------------------------------------------------------------------------

	private RankFeatureFunctionSigmoid(Builder builder) {

		this.pivot = ModelTypeHelper.requireNonNull(builder.pivot, this, "pivot");
		this.exponent = ModelTypeHelper.requireNonNull(builder.exponent, this, "exponent");

	}

	public static RankFeatureFunctionSigmoid of(Function<Builder, ObjectBuilder<RankFeatureFunctionSigmoid>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code pivot}
	 */
	public final float pivot() {
		return this.pivot;
	}

	/**
	 * Required - API name: {@code exponent}
	 */
	public final float exponent() {
		return this.exponent;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("pivot");
		generator.write(this.pivot);

		generator.writeKey("exponent");
		generator.write(this.exponent);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankFeatureFunctionSigmoid}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RankFeatureFunctionSigmoid> {
		private Float pivot;

		private Float exponent;

		/**
		 * Required - API name: {@code pivot}
		 */
		public final Builder pivot(float value) {
			this.pivot = value;
			return this;
		}

		/**
		 * Required - API name: {@code exponent}
		 */
		public final Builder exponent(float value) {
			this.exponent = value;
			return this;
		}

		/**
		 * Builds a {@link RankFeatureFunctionSigmoid}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankFeatureFunctionSigmoid build() {
			_checkSingleUse();

			return new RankFeatureFunctionSigmoid(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankFeatureFunctionSigmoid}
	 */
	public static final JsonpDeserializer<RankFeatureFunctionSigmoid> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, RankFeatureFunctionSigmoid::setupRankFeatureFunctionSigmoidDeserializer, Builder::build);

	protected static void setupRankFeatureFunctionSigmoidDeserializer(
			DelegatingDeserializer<RankFeatureFunctionSigmoid.Builder> op) {

		op.add(Builder::pivot, JsonpDeserializer.floatDeserializer(), "pivot");
		op.add(Builder::exponent, JsonpDeserializer.floatDeserializer(), "exponent");

	}

}
