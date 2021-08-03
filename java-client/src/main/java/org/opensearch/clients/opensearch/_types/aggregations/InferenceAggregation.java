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
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.aggregations.InferenceAggregation
public final class InferenceAggregation extends PipelineAggregationBase {
	private final String modelId;

	@Nullable
	private final InferenceConfigContainer inferenceConfig;

	// ---------------------------------------------------------------------------------------------

	protected InferenceAggregation(Builder builder) {
		super(builder);
		this.modelId = Objects.requireNonNull(builder.modelId, "model_id");
		this.inferenceConfig = builder.inferenceConfig;

	}

	/**
	 * API name: {@code model_id}
	 */
	public String modelId() {
		return this.modelId;
	}

	/**
	 * API name: {@code inference_config}
	 */
	@Nullable
	public InferenceConfigContainer inferenceConfig() {
		return this.inferenceConfig;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("model_id");
		generator.write(this.modelId);

		if (this.inferenceConfig != null) {

			generator.writeKey("inference_config");
			this.inferenceConfig.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceAggregation}.
	 */
	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<InferenceAggregation> {
		private String modelId;

		@Nullable
		private InferenceConfigContainer inferenceConfig;

		/**
		 * API name: {@code model_id}
		 */
		public Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * API name: {@code inference_config}
		 */
		public Builder inferenceConfig(@Nullable InferenceConfigContainer value) {
			this.inferenceConfig = value;
			return this;
		}

		/**
		 * API name: {@code inference_config}
		 */
		public Builder inferenceConfig(
				Function<InferenceConfigContainer.Builder, ObjectBuilder<InferenceConfigContainer>> fn) {
			return this.inferenceConfig(fn.apply(new InferenceConfigContainer.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InferenceAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceAggregation build() {

			return new InferenceAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for InferenceAggregation
	 */
	public static final JsonpDeserializer<InferenceAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, InferenceAggregation::setupInferenceAggregationDeserializer);

	protected static void setupInferenceAggregationDeserializer(
			DelegatingDeserializer<InferenceAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::inferenceConfig, InferenceConfigContainer.DESERIALIZER, "inference_config");

	}

}
