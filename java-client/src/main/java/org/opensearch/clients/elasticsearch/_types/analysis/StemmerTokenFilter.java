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
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.function.Function;

// typedef: _types.analysis.StemmerTokenFilter
@JsonpDeserializable
public class StemmerTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final String language;

	// ---------------------------------------------------------------------------------------------

	private StemmerTokenFilter(Builder builder) {
		super(builder);

		this.language = ModelTypeHelper.requireNonNull(builder.language, this, "language");

	}

	public static StemmerTokenFilter of(Function<Builder, ObjectBuilder<StemmerTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "stemmer";
	}

	/**
	 * Required - API name: {@code language}
	 */
	public final String language() {
		return this.language;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "stemmer");
		super.serializeInternal(generator, mapper);
		generator.writeKey("language");
		generator.write(this.language);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StemmerTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StemmerTokenFilter> {
		private String language;

		/**
		 * Required - API name: {@code language}
		 */
		public final Builder language(String value) {
			this.language = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StemmerTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StemmerTokenFilter build() {
			_checkSingleUse();

			return new StemmerTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StemmerTokenFilter}
	 */
	public static final JsonpDeserializer<StemmerTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StemmerTokenFilter::setupStemmerTokenFilterDeserializer, Builder::build);

	protected static void setupStemmerTokenFilterDeserializer(DelegatingDeserializer<StemmerTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);
		op.add(Builder::language, JsonpDeserializer.stringDeserializer(), "language");

		op.ignore("type");
	}

}
