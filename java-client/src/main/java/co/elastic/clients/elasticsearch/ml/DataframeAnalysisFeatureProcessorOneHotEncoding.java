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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysisFeatureProcessorOneHotEncoding
public final class DataframeAnalysisFeatureProcessorOneHotEncoding
		implements
			DataframeAnalysisFeatureProcessor,
			JsonpSerializable {
	private final String field;

	private final String hotMap;

	// ---------------------------------------------------------------------------------------------

	public DataframeAnalysisFeatureProcessorOneHotEncoding(Builder builder) {

		this.field = Objects.requireNonNull(builder.field, "field");
		this.hotMap = Objects.requireNonNull(builder.hotMap, "hot_map");

	}

	/**
	 * {@link DataframeAnalysisFeatureProcessor} variant type
	 */
	@Override
	public String _type() {
		return "one_hot_encoding";
	}

	/**
	 * The name of the field to encode.
	 * <p>
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * The one hot map mapping the field value with the column name.
	 * <p>
	 * API name: {@code hot_map}
	 */
	public String hotMap() {
		return this.hotMap;
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
		generator.writeStartObject(_type());

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("hot_map");
		generator.write(this.hotMap);

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalysisFeatureProcessorOneHotEncoding}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalysisFeatureProcessorOneHotEncoding> {
		private String field;

		private String hotMap;

		/**
		 * The name of the field to encode.
		 * <p>
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * The one hot map mapping the field value with the column name.
		 * <p>
		 * API name: {@code hot_map}
		 */
		public Builder hotMap(String value) {
			this.hotMap = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalysisFeatureProcessorOneHotEncoding}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalysisFeatureProcessorOneHotEncoding build() {

			return new DataframeAnalysisFeatureProcessorOneHotEncoding(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<DataframeAnalysisFeatureProcessorOneHotEncoding.Builder, DataframeAnalysisFeatureProcessorOneHotEncoding.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(
					DataframeAnalysisFeatureProcessorOneHotEncoding::setupDataframeAnalysisFeatureProcessorOneHotEncodingDeserializer);

	protected static void setupDataframeAnalysisFeatureProcessorOneHotEncodingDeserializer(
			DelegatingDeserializer<DataframeAnalysisFeatureProcessorOneHotEncoding.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::hotMap, JsonpDeserializer.stringDeserializer(), "hot_map");

	}

}
