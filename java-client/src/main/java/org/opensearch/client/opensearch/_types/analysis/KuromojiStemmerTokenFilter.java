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

package org.opensearch.client.opensearch._types.analysis;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.function.Function;

// typedef: _types.analysis.KuromojiStemmerTokenFilter
@JsonpDeserializable
public class KuromojiStemmerTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final int minimumLength;

	// ---------------------------------------------------------------------------------------------

	private KuromojiStemmerTokenFilter(Builder builder) {
		super(builder);

		this.minimumLength = ModelTypeHelper.requireNonNull(builder.minimumLength, this, "minimumLength");

	}

	public static KuromojiStemmerTokenFilter of(Function<Builder, ObjectBuilder<KuromojiStemmerTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "kuromoji_stemmer";
	}

	/**
	 * Required - API name: {@code minimum_length}
	 */
	public final int minimumLength() {
		return this.minimumLength;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "kuromoji_stemmer");
		super.serializeInternal(generator, mapper);
		generator.writeKey("minimum_length");
		generator.write(this.minimumLength);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KuromojiStemmerTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KuromojiStemmerTokenFilter> {
		private Integer minimumLength;

		/**
		 * Required - API name: {@code minimum_length}
		 */
		public final Builder minimumLength(int value) {
			this.minimumLength = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KuromojiStemmerTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KuromojiStemmerTokenFilter build() {
			_checkSingleUse();

			return new KuromojiStemmerTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KuromojiStemmerTokenFilter}
	 */
	public static final JsonpDeserializer<KuromojiStemmerTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, KuromojiStemmerTokenFilter::setupKuromojiStemmerTokenFilterDeserializer, Builder::build);

	protected static void setupKuromojiStemmerTokenFilterDeserializer(
			DelegatingDeserializer<KuromojiStemmerTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);
		op.add(Builder::minimumLength, JsonpDeserializer.integerDeserializer(), "minimum_length");

		op.ignore("type");
	}

}
