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

package org.opensearch.clients.opensearch._types.query_dsl;

import org.opensearch.clients.opensearch._types.Script;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: _types.query_dsl.ScriptScoreFunction

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/query_dsl/compound.ts#L68-L70">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScriptScoreFunction extends ScoreFunctionBase implements FunctionScoreVariant {
	private final Script script;

	// ---------------------------------------------------------------------------------------------

	private ScriptScoreFunction(Builder builder) {
		super(builder);

		this.script = ApiTypeHelper.requireNonNull(builder.script, this, "script");

	}

	public static ScriptScoreFunction of(Function<Builder, ObjectBuilder<ScriptScoreFunction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * FunctionScore variant kind.
	 */
	@Override
	public FunctionScore.Kind _functionScoreKind() {
		return FunctionScore.Kind.ScriptScore;
	}

	/**
	 * Required - API name: {@code script}
	 */
	public final Script script() {
		return this.script;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("script");
		this.script.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptScoreFunction}.
	 */

	public static class Builder extends ScoreFunctionBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ScriptScoreFunction> {
		private Script script;

		/**
		 * Required - API name: {@code script}
		 */
		public final Builder script(Script value) {
			this.script = value;
			return this;
		}

		/**
		 * Required - API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ScriptScoreFunction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptScoreFunction build() {
			_checkSingleUse();

			return new ScriptScoreFunction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScriptScoreFunction}
	 */
	public static final JsonpDeserializer<ScriptScoreFunction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ScriptScoreFunction::setupScriptScoreFunctionDeserializer);

	protected static void setupScriptScoreFunctionDeserializer(ObjectDeserializer<ScriptScoreFunction.Builder> op) {
		setupScoreFunctionBaseDeserializer(op);
		op.add(Builder::script, Script._DESERIALIZER, "script");

	}

}
