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
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.PatternAnalyzer
@JsonpDeserializable
public class PatternAnalyzer implements AnalyzerVariant, JsonpSerializable {
	@Nullable
	private final String version;

	@Nullable
	private final String flags;

	@Nullable
	private final Boolean lowercase;

	private final String pattern;

	private final List<String> stopwords;

	// ---------------------------------------------------------------------------------------------

	private PatternAnalyzer(Builder builder) {

		this.version = builder.version;
		this.flags = builder.flags;
		this.lowercase = builder.lowercase;
		this.pattern = ModelTypeHelper.requireNonNull(builder.pattern, this, "pattern");
		this.stopwords = ModelTypeHelper.unmodifiable(builder.stopwords);

	}

	public static PatternAnalyzer of(Function<Builder, ObjectBuilder<PatternAnalyzer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Analyzer} variant type
	 */
	@Override
	public String _variantType() {
		return "pattern";
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * API name: {@code flags}
	 */
	@Nullable
	public final String flags() {
		return this.flags;
	}

	/**
	 * API name: {@code lowercase}
	 */
	@Nullable
	public final Boolean lowercase() {
		return this.lowercase;
	}

	/**
	 * Required - API name: {@code pattern}
	 */
	public final String pattern() {
		return this.pattern;
	}

	/**
	 * API name: {@code stopwords}
	 */
	public final List<String> stopwords() {
		return this.stopwords;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "pattern");

		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.flags != null) {
			generator.writeKey("flags");
			generator.write(this.flags);

		}
		if (this.lowercase != null) {
			generator.writeKey("lowercase");
			generator.write(this.lowercase);

		}
		generator.writeKey("pattern");
		generator.write(this.pattern);

		if (ModelTypeHelper.isDefined(this.stopwords)) {
			generator.writeKey("stopwords");
			generator.writeStartArray();
			for (String item0 : this.stopwords) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PatternAnalyzer}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PatternAnalyzer> {
		@Nullable
		private String version;

		@Nullable
		private String flags;

		@Nullable
		private Boolean lowercase;

		private String pattern;

		@Nullable
		private List<String> stopwords;

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code flags}
		 */
		public final Builder flags(@Nullable String value) {
			this.flags = value;
			return this;
		}

		/**
		 * API name: {@code lowercase}
		 */
		public final Builder lowercase(@Nullable Boolean value) {
			this.lowercase = value;
			return this;
		}

		/**
		 * Required - API name: {@code pattern}
		 */
		public final Builder pattern(String value) {
			this.pattern = value;
			return this;
		}

		/**
		 * API name: {@code stopwords}
		 */
		public final Builder stopwords(@Nullable List<String> value) {
			this.stopwords = value;
			return this;
		}

		/**
		 * API name: {@code stopwords}
		 */
		public final Builder stopwords(String... value) {
			this.stopwords = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link PatternAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PatternAnalyzer build() {
			_checkSingleUse();

			return new PatternAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PatternAnalyzer}
	 */
	public static final JsonpDeserializer<PatternAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PatternAnalyzer::setupPatternAnalyzerDeserializer, Builder::build);

	protected static void setupPatternAnalyzerDeserializer(DelegatingDeserializer<PatternAnalyzer.Builder> op) {

		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::flags, JsonpDeserializer.stringDeserializer(), "flags");
		op.add(Builder::lowercase, JsonpDeserializer.booleanDeserializer(), "lowercase");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");
		op.add(Builder::stopwords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stopwords");

		op.ignore("type");
	}

}
