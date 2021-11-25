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

package org.opensearch.clients.elasticsearch.ingest;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonData;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.InferenceProcessor
@JsonpDeserializable
public class InferenceProcessor extends ProcessorBase implements ProcessorVariant {
	private final String modelId;

	private final String targetField;

	private final Map<String, JsonData> fieldMap;

	@Nullable
	private final InferenceConfig inferenceConfig;

	// ---------------------------------------------------------------------------------------------

	private InferenceProcessor(Builder builder) {
		super(builder);

		this.modelId = ModelTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.targetField = ModelTypeHelper.requireNonNull(builder.targetField, this, "targetField");
		this.fieldMap = ModelTypeHelper.unmodifiable(builder.fieldMap);
		this.inferenceConfig = builder.inferenceConfig;

	}

	public static InferenceProcessor of(Function<Builder, ObjectBuilder<InferenceProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "inference";
	}

	/**
	 * Required - API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Required - API name: {@code target_field}
	 */
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * API name: {@code field_map}
	 */
	public final Map<String, JsonData> fieldMap() {
		return this.fieldMap;
	}

	/**
	 * API name: {@code inference_config}
	 */
	@Nullable
	public final InferenceConfig inferenceConfig() {
		return this.inferenceConfig;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("model_id");
		generator.write(this.modelId);

		generator.writeKey("target_field");
		generator.write(this.targetField);

		if (ModelTypeHelper.isDefined(this.fieldMap)) {
			generator.writeKey("field_map");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.fieldMap.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.inferenceConfig != null) {
			generator.writeKey("inference_config");
			this.inferenceConfig.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<InferenceProcessor> {
		private String modelId;

		private String targetField;

		@Nullable
		private Map<String, JsonData> fieldMap;

		@Nullable
		private InferenceConfig inferenceConfig;

		/**
		 * Required - API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Required - API name: {@code target_field}
		 */
		public final Builder targetField(String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * API name: {@code field_map}
		 */
		public final Builder fieldMap(@Nullable Map<String, JsonData> value) {
			this.fieldMap = value;
			return this;
		}

		/**
		 * API name: {@code inference_config}
		 */
		public final Builder inferenceConfig(@Nullable InferenceConfig value) {
			this.inferenceConfig = value;
			return this;
		}

		/**
		 * API name: {@code inference_config}
		 */
		public final Builder inferenceConfig(Function<InferenceConfig.Builder, ObjectBuilder<InferenceConfig>> fn) {
			return this.inferenceConfig(fn.apply(new InferenceConfig.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InferenceProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceProcessor build() {
			_checkSingleUse();

			return new InferenceProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceProcessor}
	 */
	public static final JsonpDeserializer<InferenceProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InferenceProcessor::setupInferenceProcessorDeserializer, Builder::build);

	protected static void setupInferenceProcessorDeserializer(DelegatingDeserializer<InferenceProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::fieldMap, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "field_map");
		op.add(Builder::inferenceConfig, InferenceConfig._DESERIALIZER, "inference_config");

	}

}
