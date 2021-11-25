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
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.KeepWordsTokenFilter
@JsonpDeserializable
public class KeepWordsTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final List<String> keepWords;

	@Nullable
	private final Boolean keepWordsCase;

	@Nullable
	private final String keepWordsPath;

	// ---------------------------------------------------------------------------------------------

	private KeepWordsTokenFilter(Builder builder) {
		super(builder);

		this.keepWords = ModelTypeHelper.unmodifiable(builder.keepWords);
		this.keepWordsCase = builder.keepWordsCase;
		this.keepWordsPath = builder.keepWordsPath;

	}

	public static KeepWordsTokenFilter of(Function<Builder, ObjectBuilder<KeepWordsTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "keep";
	}

	/**
	 * API name: {@code keep_words}
	 */
	public final List<String> keepWords() {
		return this.keepWords;
	}

	/**
	 * API name: {@code keep_words_case}
	 */
	@Nullable
	public final Boolean keepWordsCase() {
		return this.keepWordsCase;
	}

	/**
	 * API name: {@code keep_words_path}
	 */
	@Nullable
	public final String keepWordsPath() {
		return this.keepWordsPath;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "keep");
		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.keepWords)) {
			generator.writeKey("keep_words");
			generator.writeStartArray();
			for (String item0 : this.keepWords) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.keepWordsCase != null) {
			generator.writeKey("keep_words_case");
			generator.write(this.keepWordsCase);

		}
		if (this.keepWordsPath != null) {
			generator.writeKey("keep_words_path");
			generator.write(this.keepWordsPath);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KeepWordsTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KeepWordsTokenFilter> {
		@Nullable
		private List<String> keepWords;

		@Nullable
		private Boolean keepWordsCase;

		@Nullable
		private String keepWordsPath;

		/**
		 * API name: {@code keep_words}
		 */
		public final Builder keepWords(@Nullable List<String> value) {
			this.keepWords = value;
			return this;
		}

		/**
		 * API name: {@code keep_words}
		 */
		public final Builder keepWords(String... value) {
			this.keepWords = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code keep_words_case}
		 */
		public final Builder keepWordsCase(@Nullable Boolean value) {
			this.keepWordsCase = value;
			return this;
		}

		/**
		 * API name: {@code keep_words_path}
		 */
		public final Builder keepWordsPath(@Nullable String value) {
			this.keepWordsPath = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KeepWordsTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KeepWordsTokenFilter build() {
			_checkSingleUse();

			return new KeepWordsTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KeepWordsTokenFilter}
	 */
	public static final JsonpDeserializer<KeepWordsTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KeepWordsTokenFilter::setupKeepWordsTokenFilterDeserializer, Builder::build);

	protected static void setupKeepWordsTokenFilterDeserializer(
			DelegatingDeserializer<KeepWordsTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);
		op.add(Builder::keepWords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"keep_words");
		op.add(Builder::keepWordsCase, JsonpDeserializer.booleanDeserializer(), "keep_words_case");
		op.add(Builder::keepWordsPath, JsonpDeserializer.stringDeserializer(), "keep_words_path");

		op.ignore("type");
	}

}
