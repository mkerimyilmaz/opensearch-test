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
import java.lang.String;
import java.util.function.Function;

// typedef: _types.analysis.PatternTokenizer
@JsonpDeserializable
public class PatternTokenizer extends TokenizerBase implements TokenizerVariant {
	private final String flags;

	private final int group;

	private final String pattern;

	// ---------------------------------------------------------------------------------------------

	private PatternTokenizer(Builder builder) {
		super(builder);

		this.flags = ModelTypeHelper.requireNonNull(builder.flags, this, "flags");
		this.group = ModelTypeHelper.requireNonNull(builder.group, this, "group");
		this.pattern = ModelTypeHelper.requireNonNull(builder.pattern, this, "pattern");

	}

	public static PatternTokenizer of(Function<Builder, ObjectBuilder<PatternTokenizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Tokenizer} variant type
	 */
	@Override
	public String _variantType() {
		return "pattern";
	}

	/**
	 * Required - API name: {@code flags}
	 */
	public final String flags() {
		return this.flags;
	}

	/**
	 * Required - API name: {@code group}
	 */
	public final int group() {
		return this.group;
	}

	/**
	 * Required - API name: {@code pattern}
	 */
	public final String pattern() {
		return this.pattern;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "pattern");
		super.serializeInternal(generator, mapper);
		generator.writeKey("flags");
		generator.write(this.flags);

		generator.writeKey("group");
		generator.write(this.group);

		generator.writeKey("pattern");
		generator.write(this.pattern);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PatternTokenizer}.
	 */
	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PatternTokenizer> {
		private String flags;

		private Integer group;

		private String pattern;

		/**
		 * Required - API name: {@code flags}
		 */
		public final Builder flags(String value) {
			this.flags = value;
			return this;
		}

		/**
		 * Required - API name: {@code group}
		 */
		public final Builder group(int value) {
			this.group = value;
			return this;
		}

		/**
		 * Required - API name: {@code pattern}
		 */
		public final Builder pattern(String value) {
			this.pattern = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PatternTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PatternTokenizer build() {
			_checkSingleUse();

			return new PatternTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PatternTokenizer}
	 */
	public static final JsonpDeserializer<PatternTokenizer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PatternTokenizer::setupPatternTokenizerDeserializer, Builder::build);

	protected static void setupPatternTokenizerDeserializer(DelegatingDeserializer<PatternTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::flags, JsonpDeserializer.stringDeserializer(), "flags");
		op.add(Builder::group, JsonpDeserializer.integerDeserializer(), "group");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");

		op.ignore("type");
	}

}
