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

package org.opensearch.clients.opensearch._types.analysis;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: _types.analysis.SnowballTokenFilter
@JsonpDeserializable
public class SnowballTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final SnowballLanguage language;

	// ---------------------------------------------------------------------------------------------

	private SnowballTokenFilter(Builder builder) {
		super(builder);

		this.language = ModelTypeHelper.requireNonNull(builder.language, this, "language");

	}

	public static SnowballTokenFilter of(Function<Builder, ObjectBuilder<SnowballTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "snowball";
	}

	/**
	 * Required - API name: {@code language}
	 */
	public final SnowballLanguage language() {
		return this.language;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "snowball");
		super.serializeInternal(generator, mapper);
		generator.writeKey("language");
		this.language.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnowballTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SnowballTokenFilter> {
		private SnowballLanguage language;

		/**
		 * Required - API name: {@code language}
		 */
		public final Builder language(SnowballLanguage value) {
			this.language = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SnowballTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnowballTokenFilter build() {
			_checkSingleUse();

			return new SnowballTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnowballTokenFilter}
	 */
	public static final JsonpDeserializer<SnowballTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnowballTokenFilter::setupSnowballTokenFilterDeserializer, Builder::build);

	protected static void setupSnowballTokenFilterDeserializer(DelegatingDeserializer<SnowballTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);
		op.add(Builder::language, SnowballLanguage._DESERIALIZER, "language");

		op.ignore("type");
	}

}
