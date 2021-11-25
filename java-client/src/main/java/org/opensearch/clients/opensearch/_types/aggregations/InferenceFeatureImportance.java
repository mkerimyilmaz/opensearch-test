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

package org.opensearch.clients.opensearch._types.aggregations;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.InferenceFeatureImportance
@JsonpDeserializable
public class InferenceFeatureImportance implements JsonpSerializable {
	private final String featureName;

	@Nullable
	private final Double importance;

	private final List<InferenceClassImportance> classes;

	// ---------------------------------------------------------------------------------------------

	private InferenceFeatureImportance(Builder builder) {

		this.featureName = ModelTypeHelper.requireNonNull(builder.featureName, this, "featureName");
		this.importance = builder.importance;
		this.classes = ModelTypeHelper.unmodifiable(builder.classes);

	}

	public static InferenceFeatureImportance of(Function<Builder, ObjectBuilder<InferenceFeatureImportance>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code feature_name}
	 */
	public final String featureName() {
		return this.featureName;
	}

	/**
	 * API name: {@code importance}
	 */
	@Nullable
	public final Double importance() {
		return this.importance;
	}

	/**
	 * API name: {@code classes}
	 */
	public final List<InferenceClassImportance> classes() {
		return this.classes;
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

		generator.writeKey("feature_name");
		generator.write(this.featureName);

		if (this.importance != null) {
			generator.writeKey("importance");
			generator.write(this.importance);

		}
		if (ModelTypeHelper.isDefined(this.classes)) {
			generator.writeKey("classes");
			generator.writeStartArray();
			for (InferenceClassImportance item0 : this.classes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceFeatureImportance}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<InferenceFeatureImportance> {
		private String featureName;

		@Nullable
		private Double importance;

		@Nullable
		private List<InferenceClassImportance> classes;

		/**
		 * Required - API name: {@code feature_name}
		 */
		public final Builder featureName(String value) {
			this.featureName = value;
			return this;
		}

		/**
		 * API name: {@code importance}
		 */
		public final Builder importance(@Nullable Double value) {
			this.importance = value;
			return this;
		}

		/**
		 * API name: {@code classes}
		 */
		public final Builder classes(@Nullable List<InferenceClassImportance> value) {
			this.classes = value;
			return this;
		}

		/**
		 * API name: {@code classes}
		 */
		public final Builder classes(InferenceClassImportance... value) {
			this.classes = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code classes}
		 */
		@SafeVarargs
		public final Builder classes(
				Function<InferenceClassImportance.Builder, ObjectBuilder<InferenceClassImportance>>... fns) {
			this.classes = new ArrayList<>(fns.length);
			for (Function<InferenceClassImportance.Builder, ObjectBuilder<InferenceClassImportance>> fn : fns) {
				this.classes.add(fn.apply(new InferenceClassImportance.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link InferenceFeatureImportance}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceFeatureImportance build() {
			_checkSingleUse();

			return new InferenceFeatureImportance(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceFeatureImportance}
	 */
	public static final JsonpDeserializer<InferenceFeatureImportance> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, InferenceFeatureImportance::setupInferenceFeatureImportanceDeserializer, Builder::build);

	protected static void setupInferenceFeatureImportanceDeserializer(
			DelegatingDeserializer<InferenceFeatureImportance.Builder> op) {

		op.add(Builder::featureName, JsonpDeserializer.stringDeserializer(), "feature_name");
		op.add(Builder::importance, JsonpDeserializer.doubleDeserializer(), "importance");
		op.add(Builder::classes, JsonpDeserializer.arrayDeserializer(InferenceClassImportance._DESERIALIZER),
				"classes");

	}

}
