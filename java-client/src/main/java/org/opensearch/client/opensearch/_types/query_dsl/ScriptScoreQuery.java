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

package org.opensearch.client.opensearch._types.query_dsl;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.ScriptScoreQuery
@JsonpDeserializable
public class ScriptScoreQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final Float minScore;

	private final Query query;

	private final JsonValue /* _types.Script */ script;

	// ---------------------------------------------------------------------------------------------

	private ScriptScoreQuery(Builder builder) {
		super(builder);

		this.minScore = builder.minScore;
		this.query = ModelTypeHelper.requireNonNull(builder.query, this, "query");
		this.script = ModelTypeHelper.requireNonNull(builder.script, this, "script");

	}

	public static ScriptScoreQuery of(Function<Builder, ObjectBuilder<ScriptScoreQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "script_score";
	}

	/**
	 * API name: {@code min_score}
	 */
	@Nullable
	public final Float minScore() {
		return this.minScore;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final Query query() {
		return this.query;
	}

	/**
	 * Required - API name: {@code script}
	 */
	public final JsonValue /* _types.Script */ script() {
		return this.script;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.minScore != null) {
			generator.writeKey("min_score");
			generator.write(this.minScore);

		}
		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		generator.writeKey("script");
		generator.write(this.script);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptScoreQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<ScriptScoreQuery> {
		@Nullable
		private Float minScore;

		private Query query;

		private JsonValue /* _types.Script */ script;

		/**
		 * API name: {@code min_score}
		 */
		public final Builder minScore(@Nullable Float value) {
			this.minScore = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Required - API name: {@code script}
		 */
		public final Builder script(JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ScriptScoreQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptScoreQuery build() {
			_checkSingleUse();

			return new ScriptScoreQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScriptScoreQuery}
	 */
	public static final JsonpDeserializer<ScriptScoreQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ScriptScoreQuery::setupScriptScoreQueryDeserializer, Builder::build);

	protected static void setupScriptScoreQueryDeserializer(DelegatingDeserializer<ScriptScoreQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::minScore, JsonpDeserializer.floatDeserializer(), "min_score");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");

	}

}
