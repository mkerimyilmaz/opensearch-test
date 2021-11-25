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
import java.lang.Boolean;
import java.util.function.Function;

// typedef: _types.analysis.KuromojiReadingFormTokenFilter
@JsonpDeserializable
public class KuromojiReadingFormTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final boolean useRomaji;

	// ---------------------------------------------------------------------------------------------

	private KuromojiReadingFormTokenFilter(Builder builder) {
		super(builder);

		this.useRomaji = ModelTypeHelper.requireNonNull(builder.useRomaji, this, "useRomaji");

	}

	public static KuromojiReadingFormTokenFilter of(
			Function<Builder, ObjectBuilder<KuromojiReadingFormTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "kuromoji_readingform";
	}

	/**
	 * Required - API name: {@code use_romaji}
	 */
	public final boolean useRomaji() {
		return this.useRomaji;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "kuromoji_readingform");
		super.serializeInternal(generator, mapper);
		generator.writeKey("use_romaji");
		generator.write(this.useRomaji);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KuromojiReadingFormTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KuromojiReadingFormTokenFilter> {
		private Boolean useRomaji;

		/**
		 * Required - API name: {@code use_romaji}
		 */
		public final Builder useRomaji(boolean value) {
			this.useRomaji = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KuromojiReadingFormTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KuromojiReadingFormTokenFilter build() {
			_checkSingleUse();

			return new KuromojiReadingFormTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KuromojiReadingFormTokenFilter}
	 */
	public static final JsonpDeserializer<KuromojiReadingFormTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KuromojiReadingFormTokenFilter::setupKuromojiReadingFormTokenFilterDeserializer,
					Builder::build);

	protected static void setupKuromojiReadingFormTokenFilterDeserializer(
			DelegatingDeserializer<KuromojiReadingFormTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);
		op.add(Builder::useRomaji, JsonpDeserializer.booleanDeserializer(), "use_romaji");

		op.ignore("type");
	}

}
