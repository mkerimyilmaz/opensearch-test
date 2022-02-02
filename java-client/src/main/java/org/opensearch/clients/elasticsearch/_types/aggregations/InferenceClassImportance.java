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
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;

// typedef: _types.aggregations.InferenceClassImportance

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/aggregations/Aggregate.ts#L621-L624">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferenceClassImportance implements JsonpSerializable {
	private final String className;

	private final double importance;

	// ---------------------------------------------------------------------------------------------

	private InferenceClassImportance(Builder builder) {

		this.className = ApiTypeHelper.requireNonNull(builder.className, this, "className");
		this.importance = ApiTypeHelper.requireNonNull(builder.importance, this, "importance");

	}

	public static InferenceClassImportance of(Function<Builder, ObjectBuilder<InferenceClassImportance>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code class_name}
	 */
	public final String className() {
		return this.className;
	}

	/**
	 * Required - API name: {@code importance}
	 */
	public final double importance() {
		return this.importance;
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

		generator.writeKey("class_name");
		generator.write(this.className);

		generator.writeKey("importance");
		generator.write(this.importance);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceClassImportance}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<InferenceClassImportance> {
		private String className;

		private Double importance;

		/**
		 * Required - API name: {@code class_name}
		 */
		public final Builder className(String value) {
			this.className = value;
			return this;
		}

		/**
		 * Required - API name: {@code importance}
		 */
		public final Builder importance(double value) {
			this.importance = value;
			return this;
		}

		/**
		 * Builds a {@link InferenceClassImportance}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceClassImportance build() {
			_checkSingleUse();

			return new InferenceClassImportance(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceClassImportance}
	 */
	public static final JsonpDeserializer<InferenceClassImportance> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InferenceClassImportance::setupInferenceClassImportanceDeserializer);

	protected static void setupInferenceClassImportanceDeserializer(
			ObjectDeserializer<InferenceClassImportance.Builder> op) {

		op.add(Builder::className, JsonpDeserializer.stringDeserializer(), "class_name");
		op.add(Builder::importance, JsonpDeserializer.doubleDeserializer(), "importance");

	}

}
