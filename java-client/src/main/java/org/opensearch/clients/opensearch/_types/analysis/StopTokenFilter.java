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
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.StopTokenFilter
@JsonpDeserializable
public class StopTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	@Nullable
	private final Boolean ignoreCase;

	@Nullable
	private final Boolean removeTrailing;

	private final List<String> stopwords;

	@Nullable
	private final String stopwordsPath;

	// ---------------------------------------------------------------------------------------------

	private StopTokenFilter(Builder builder) {
		super(builder);

		this.ignoreCase = builder.ignoreCase;
		this.removeTrailing = builder.removeTrailing;
		this.stopwords = ModelTypeHelper.unmodifiableRequired(builder.stopwords, this, "stopwords");
		this.stopwordsPath = builder.stopwordsPath;

	}

	public static StopTokenFilter of(Function<Builder, ObjectBuilder<StopTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "stop";
	}

	/**
	 * API name: {@code ignore_case}
	 */
	@Nullable
	public final Boolean ignoreCase() {
		return this.ignoreCase;
	}

	/**
	 * API name: {@code remove_trailing}
	 */
	@Nullable
	public final Boolean removeTrailing() {
		return this.removeTrailing;
	}

	/**
	 * Required - API name: {@code stopwords}
	 */
	public final List<String> stopwords() {
		return this.stopwords;
	}

	/**
	 * API name: {@code stopwords_path}
	 */
	@Nullable
	public final String stopwordsPath() {
		return this.stopwordsPath;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "stop");
		super.serializeInternal(generator, mapper);
		if (this.ignoreCase != null) {
			generator.writeKey("ignore_case");
			generator.write(this.ignoreCase);

		}
		if (this.removeTrailing != null) {
			generator.writeKey("remove_trailing");
			generator.write(this.removeTrailing);

		}
		if (ModelTypeHelper.isDefined(this.stopwords)) {
			generator.writeKey("stopwords");
			generator.writeStartArray();
			for (String item0 : this.stopwords) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.stopwordsPath != null) {
			generator.writeKey("stopwords_path");
			generator.write(this.stopwordsPath);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StopTokenFilter> {
		@Nullable
		private Boolean ignoreCase;

		@Nullable
		private Boolean removeTrailing;

		private List<String> stopwords;

		@Nullable
		private String stopwordsPath;

		/**
		 * API name: {@code ignore_case}
		 */
		public final Builder ignoreCase(@Nullable Boolean value) {
			this.ignoreCase = value;
			return this;
		}

		/**
		 * API name: {@code remove_trailing}
		 */
		public final Builder removeTrailing(@Nullable Boolean value) {
			this.removeTrailing = value;
			return this;
		}

		/**
		 * Required - API name: {@code stopwords}
		 */
		public final Builder stopwords(List<String> value) {
			this.stopwords = value;
			return this;
		}

		/**
		 * Required - API name: {@code stopwords}
		 */
		public final Builder stopwords(String... value) {
			this.stopwords = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code stopwords_path}
		 */
		public final Builder stopwordsPath(@Nullable String value) {
			this.stopwordsPath = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StopTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopTokenFilter build() {
			_checkSingleUse();

			return new StopTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StopTokenFilter}
	 */
	public static final JsonpDeserializer<StopTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StopTokenFilter::setupStopTokenFilterDeserializer, Builder::build);

	protected static void setupStopTokenFilterDeserializer(DelegatingDeserializer<StopTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);
		op.add(Builder::ignoreCase, JsonpDeserializer.booleanDeserializer(), "ignore_case");
		op.add(Builder::removeTrailing, JsonpDeserializer.booleanDeserializer(), "remove_trailing");
		op.add(Builder::stopwords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stopwords");
		op.add(Builder::stopwordsPath, JsonpDeserializer.stringDeserializer(), "stopwords_path");

		op.ignore("type");
	}

}
