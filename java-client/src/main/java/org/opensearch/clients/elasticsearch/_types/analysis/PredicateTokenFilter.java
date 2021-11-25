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

package org.opensearch.clients.elasticsearch._types.analysis;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: _types.analysis.PredicateTokenFilter
@JsonpDeserializable
public class PredicateTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final JsonValue /* _types.Script */ script;

	// ---------------------------------------------------------------------------------------------

	private PredicateTokenFilter(Builder builder) {
		super(builder);

		this.script = ModelTypeHelper.requireNonNull(builder.script, this, "script");

	}

	public static PredicateTokenFilter of(Function<Builder, ObjectBuilder<PredicateTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "predicate_token_filter";
	}

	/**
	 * Required - API name: {@code script}
	 */
	public final JsonValue /* _types.Script */ script() {
		return this.script;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "predicate_token_filter");
		super.serializeInternal(generator, mapper);
		generator.writeKey("script");
		generator.write(this.script);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PredicateTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PredicateTokenFilter> {
		private JsonValue /* _types.Script */ script;

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
		 * Builds a {@link PredicateTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PredicateTokenFilter build() {
			_checkSingleUse();

			return new PredicateTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PredicateTokenFilter}
	 */
	public static final JsonpDeserializer<PredicateTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PredicateTokenFilter::setupPredicateTokenFilterDeserializer, Builder::build);

	protected static void setupPredicateTokenFilterDeserializer(
			DelegatingDeserializer<PredicateTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");

		op.ignore("type");
	}

}
