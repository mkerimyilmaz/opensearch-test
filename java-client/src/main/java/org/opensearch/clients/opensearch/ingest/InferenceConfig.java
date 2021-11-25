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

package org.opensearch.clients.opensearch.ingest;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.InferenceConfig
@JsonpDeserializable
public class InferenceConfig implements JsonpSerializable {
	@Nullable
	private final InferenceConfigRegression regression;

	// ---------------------------------------------------------------------------------------------

	private InferenceConfig(Builder builder) {

		this.regression = builder.regression;

	}

	public static InferenceConfig of(Function<Builder, ObjectBuilder<InferenceConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code regression}
	 */
	@Nullable
	public final InferenceConfigRegression regression() {
		return this.regression;
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

		if (this.regression != null) {
			generator.writeKey("regression");
			this.regression.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceConfig}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<InferenceConfig> {
		@Nullable
		private InferenceConfigRegression regression;

		/**
		 * API name: {@code regression}
		 */
		public final Builder regression(@Nullable InferenceConfigRegression value) {
			this.regression = value;
			return this;
		}

		/**
		 * API name: {@code regression}
		 */
		public final Builder regression(
				Function<InferenceConfigRegression.Builder, ObjectBuilder<InferenceConfigRegression>> fn) {
			return this.regression(fn.apply(new InferenceConfigRegression.Builder()).build());
		}

		/**
		 * Builds a {@link InferenceConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceConfig build() {
			_checkSingleUse();

			return new InferenceConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceConfig}
	 */
	public static final JsonpDeserializer<InferenceConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InferenceConfig::setupInferenceConfigDeserializer, Builder::build);

	protected static void setupInferenceConfigDeserializer(DelegatingDeserializer<InferenceConfig.Builder> op) {

		op.add(Builder::regression, InferenceConfigRegression._DESERIALIZER, "regression");

	}

}
