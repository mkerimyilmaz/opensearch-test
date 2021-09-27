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

import co.elastic.clients.elasticsearch.ml.evaluate_data_frame.DataframeClassificationSummary;
import co.elastic.clients.elasticsearch.ml.evaluate_data_frame.DataframeOutlierDetectionSummary;
import co.elastic.clients.elasticsearch.ml.evaluate_data_frame.DataframeRegressionSummary;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.Response
@JsonpDeserializable
public final class EvaluateDataFrameResponse implements JsonpSerializable {
	@Nullable
	private final DataframeClassificationSummary classification;

	@Nullable
	private final DataframeOutlierDetectionSummary outlierDetection;

	@Nullable
	private final DataframeRegressionSummary regression;

	// ---------------------------------------------------------------------------------------------

	public EvaluateDataFrameResponse(Builder builder) {

		this.classification = builder.classification;
		this.outlierDetection = builder.outlierDetection;
		this.regression = builder.regression;

	}

	/**
	 * API name: {@code classification}
	 */
	@Nullable
	public DataframeClassificationSummary classification() {
		return this.classification;
	}

	/**
	 * API name: {@code outlier_detection}
	 */
	@Nullable
	public DataframeOutlierDetectionSummary outlierDetection() {
		return this.outlierDetection;
	}

	/**
	 * API name: {@code regression}
	 */
	@Nullable
	public DataframeRegressionSummary regression() {
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

		if (this.classification != null) {

			generator.writeKey("classification");
			this.classification.serialize(generator, mapper);

		}
		if (this.outlierDetection != null) {

			generator.writeKey("outlier_detection");
			this.outlierDetection.serialize(generator, mapper);

		}
		if (this.regression != null) {

			generator.writeKey("regression");
			this.regression.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EvaluateDataFrameResponse}.
	 */
	public static class Builder implements ObjectBuilder<EvaluateDataFrameResponse> {
		@Nullable
		private DataframeClassificationSummary classification;

		@Nullable
		private DataframeOutlierDetectionSummary outlierDetection;

		@Nullable
		private DataframeRegressionSummary regression;

		/**
		 * API name: {@code classification}
		 */
		public Builder classification(@Nullable DataframeClassificationSummary value) {
			this.classification = value;
			return this;
		}

		/**
		 * API name: {@code classification}
		 */
		public Builder classification(
				Function<DataframeClassificationSummary.Builder, ObjectBuilder<DataframeClassificationSummary>> fn) {
			return this.classification(fn.apply(new DataframeClassificationSummary.Builder()).build());
		}

		/**
		 * API name: {@code outlier_detection}
		 */
		public Builder outlierDetection(@Nullable DataframeOutlierDetectionSummary value) {
			this.outlierDetection = value;
			return this;
		}

		/**
		 * API name: {@code outlier_detection}
		 */
		public Builder outlierDetection(
				Function<DataframeOutlierDetectionSummary.Builder, ObjectBuilder<DataframeOutlierDetectionSummary>> fn) {
			return this.outlierDetection(fn.apply(new DataframeOutlierDetectionSummary.Builder()).build());
		}

		/**
		 * API name: {@code regression}
		 */
		public Builder regression(@Nullable DataframeRegressionSummary value) {
			this.regression = value;
			return this;
		}

		/**
		 * API name: {@code regression}
		 */
		public Builder regression(
				Function<DataframeRegressionSummary.Builder, ObjectBuilder<DataframeRegressionSummary>> fn) {
			return this.regression(fn.apply(new DataframeRegressionSummary.Builder()).build());
		}

		/**
		 * Builds a {@link EvaluateDataFrameResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EvaluateDataFrameResponse build() {

			return new EvaluateDataFrameResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EvaluateDataFrameResponse}
	 */
	public static final JsonpDeserializer<EvaluateDataFrameResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EvaluateDataFrameResponse::setupEvaluateDataFrameResponseDeserializer, Builder::build);

	protected static void setupEvaluateDataFrameResponseDeserializer(
			DelegatingDeserializer<EvaluateDataFrameResponse.Builder> op) {

		op.add(Builder::classification, DataframeClassificationSummary._DESERIALIZER, "classification");
		op.add(Builder::outlierDetection, DataframeOutlierDetectionSummary._DESERIALIZER, "outlier_detection");
		op.add(Builder::regression, DataframeRegressionSummary._DESERIALIZER, "regression");

	}

}
