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
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MovingAverageAggregation
@JsonpDeserializable
public class MovingAverageAggregation extends PipelineAggregationBase implements AggregationVariant {
	@Nullable
	private final Boolean minimize;

	@Nullable
	private final MovingAverageModel model;

	private final JsonValue /* _types.aggregations.MovingAverageSettings */ settings;

	@Nullable
	private final Integer predict;

	@Nullable
	private final Integer window;

	// ---------------------------------------------------------------------------------------------

	private MovingAverageAggregation(Builder builder) {
		super(builder);

		this.minimize = builder.minimize;
		this.model = builder.model;
		this.settings = ModelTypeHelper.requireNonNull(builder.settings, this, "settings");
		this.predict = builder.predict;
		this.window = builder.window;

	}

	public static MovingAverageAggregation of(Function<Builder, ObjectBuilder<MovingAverageAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "moving_avg";
	}

	/**
	 * API name: {@code minimize}
	 */
	@Nullable
	public final Boolean minimize() {
		return this.minimize;
	}

	/**
	 * API name: {@code model}
	 */
	@Nullable
	public final MovingAverageModel model() {
		return this.model;
	}

	/**
	 * Required - API name: {@code settings}
	 */
	public final JsonValue /* _types.aggregations.MovingAverageSettings */ settings() {
		return this.settings;
	}

	/**
	 * API name: {@code predict}
	 */
	@Nullable
	public final Integer predict() {
		return this.predict;
	}

	/**
	 * API name: {@code window}
	 */
	@Nullable
	public final Integer window() {
		return this.window;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.minimize != null) {
			generator.writeKey("minimize");
			generator.write(this.minimize);

		}
		if (this.model != null) {
			generator.writeKey("model");
			this.model.serialize(generator, mapper);
		}
		generator.writeKey("settings");
		generator.write(this.settings);

		if (this.predict != null) {
			generator.writeKey("predict");
			generator.write(this.predict);

		}
		if (this.window != null) {
			generator.writeKey("window");
			generator.write(this.window);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MovingAverageAggregation}.
	 */
	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MovingAverageAggregation> {
		@Nullable
		private Boolean minimize;

		@Nullable
		private MovingAverageModel model;

		private JsonValue /* _types.aggregations.MovingAverageSettings */ settings;

		@Nullable
		private Integer predict;

		@Nullable
		private Integer window;

		/**
		 * API name: {@code minimize}
		 */
		public final Builder minimize(@Nullable Boolean value) {
			this.minimize = value;
			return this;
		}

		/**
		 * API name: {@code model}
		 */
		public final Builder model(@Nullable MovingAverageModel value) {
			this.model = value;
			return this;
		}

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(JsonValue /* _types.aggregations.MovingAverageSettings */ value) {
			this.settings = value;
			return this;
		}

		/**
		 * API name: {@code predict}
		 */
		public final Builder predict(@Nullable Integer value) {
			this.predict = value;
			return this;
		}

		/**
		 * API name: {@code window}
		 */
		public final Builder window(@Nullable Integer value) {
			this.window = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MovingAverageAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MovingAverageAggregation build() {
			_checkSingleUse();

			return new MovingAverageAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MovingAverageAggregation}
	 */
	public static final JsonpDeserializer<MovingAverageAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MovingAverageAggregation::setupMovingAverageAggregationDeserializer, Builder::build);

	protected static void setupMovingAverageAggregationDeserializer(
			DelegatingDeserializer<MovingAverageAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::minimize, JsonpDeserializer.booleanDeserializer(), "minimize");
		op.add(Builder::model, MovingAverageModel._DESERIALIZER, "model");
		op.add(Builder::settings, JsonpDeserializer.jsonValueDeserializer(), "settings");
		op.add(Builder::predict, JsonpDeserializer.integerDeserializer(), "predict");
		op.add(Builder::window, JsonpDeserializer.integerDeserializer(), "window");

	}

}
