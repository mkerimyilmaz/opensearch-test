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
import org.opensearch.clients.json.JsonData;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.ScriptedMetricAggregation
@JsonpDeserializable
public class ScriptedMetricAggregation extends MetricAggregationBase implements AggregationVariant {
	@Nullable
	private final JsonValue /* _types.Script */ combineScript;

	@Nullable
	private final JsonValue /* _types.Script */ initScript;

	@Nullable
	private final JsonValue /* _types.Script */ mapScript;

	private final Map<String, JsonData> params;

	@Nullable
	private final JsonValue /* _types.Script */ reduceScript;

	// ---------------------------------------------------------------------------------------------

	private ScriptedMetricAggregation(Builder builder) {
		super(builder);

		this.combineScript = builder.combineScript;
		this.initScript = builder.initScript;
		this.mapScript = builder.mapScript;
		this.params = ModelTypeHelper.unmodifiable(builder.params);
		this.reduceScript = builder.reduceScript;

	}

	public static ScriptedMetricAggregation of(Function<Builder, ObjectBuilder<ScriptedMetricAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "scripted_metric";
	}

	/**
	 * API name: {@code combine_script}
	 */
	@Nullable
	public final JsonValue /* _types.Script */ combineScript() {
		return this.combineScript;
	}

	/**
	 * API name: {@code init_script}
	 */
	@Nullable
	public final JsonValue /* _types.Script */ initScript() {
		return this.initScript;
	}

	/**
	 * API name: {@code map_script}
	 */
	@Nullable
	public final JsonValue /* _types.Script */ mapScript() {
		return this.mapScript;
	}

	/**
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
	}

	/**
	 * API name: {@code reduce_script}
	 */
	@Nullable
	public final JsonValue /* _types.Script */ reduceScript() {
		return this.reduceScript;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.combineScript != null) {
			generator.writeKey("combine_script");
			generator.write(this.combineScript);

		}
		if (this.initScript != null) {
			generator.writeKey("init_script");
			generator.write(this.initScript);

		}
		if (this.mapScript != null) {
			generator.writeKey("map_script");
			generator.write(this.mapScript);

		}
		if (ModelTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.reduceScript != null) {
			generator.writeKey("reduce_script");
			generator.write(this.reduceScript);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptedMetricAggregation}.
	 */
	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ScriptedMetricAggregation> {
		@Nullable
		private JsonValue /* _types.Script */ combineScript;

		@Nullable
		private JsonValue /* _types.Script */ initScript;

		@Nullable
		private JsonValue /* _types.Script */ mapScript;

		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private JsonValue /* _types.Script */ reduceScript;

		/**
		 * API name: {@code combine_script}
		 */
		public final Builder combineScript(@Nullable JsonValue /* _types.Script */ value) {
			this.combineScript = value;
			return this;
		}

		/**
		 * API name: {@code init_script}
		 */
		public final Builder initScript(@Nullable JsonValue /* _types.Script */ value) {
			this.initScript = value;
			return this;
		}

		/**
		 * API name: {@code map_script}
		 */
		public final Builder mapScript(@Nullable JsonValue /* _types.Script */ value) {
			this.mapScript = value;
			return this;
		}

		/**
		 * API name: {@code params}
		 */
		public final Builder params(@Nullable Map<String, JsonData> value) {
			this.params = value;
			return this;
		}

		/**
		 * API name: {@code reduce_script}
		 */
		public final Builder reduceScript(@Nullable JsonValue /* _types.Script */ value) {
			this.reduceScript = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ScriptedMetricAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptedMetricAggregation build() {
			_checkSingleUse();

			return new ScriptedMetricAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScriptedMetricAggregation}
	 */
	public static final JsonpDeserializer<ScriptedMetricAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ScriptedMetricAggregation::setupScriptedMetricAggregationDeserializer, Builder::build);

	protected static void setupScriptedMetricAggregationDeserializer(
			DelegatingDeserializer<ScriptedMetricAggregation.Builder> op) {
		setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::combineScript, JsonpDeserializer.jsonValueDeserializer(), "combine_script");
		op.add(Builder::initScript, JsonpDeserializer.jsonValueDeserializer(), "init_script");
		op.add(Builder::mapScript, JsonpDeserializer.jsonValueDeserializer(), "map_script");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::reduceScript, JsonpDeserializer.jsonValueDeserializer(), "reduce_script");

	}

}
