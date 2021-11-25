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
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.WhitespaceTokenizer
@JsonpDeserializable
public class WhitespaceTokenizer extends TokenizerBase implements TokenizerVariant {
	@Nullable
	private final Integer maxTokenLength;

	// ---------------------------------------------------------------------------------------------

	private WhitespaceTokenizer(Builder builder) {
		super(builder);

		this.maxTokenLength = builder.maxTokenLength;

	}

	public static WhitespaceTokenizer of(Function<Builder, ObjectBuilder<WhitespaceTokenizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Tokenizer} variant type
	 */
	@Override
	public String _variantType() {
		return "whitespace";
	}

	/**
	 * API name: {@code max_token_length}
	 */
	@Nullable
	public final Integer maxTokenLength() {
		return this.maxTokenLength;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "whitespace");
		super.serializeInternal(generator, mapper);
		if (this.maxTokenLength != null) {
			generator.writeKey("max_token_length");
			generator.write(this.maxTokenLength);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WhitespaceTokenizer}.
	 */
	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<WhitespaceTokenizer> {
		@Nullable
		private Integer maxTokenLength;

		/**
		 * API name: {@code max_token_length}
		 */
		public final Builder maxTokenLength(@Nullable Integer value) {
			this.maxTokenLength = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WhitespaceTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WhitespaceTokenizer build() {
			_checkSingleUse();

			return new WhitespaceTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WhitespaceTokenizer}
	 */
	public static final JsonpDeserializer<WhitespaceTokenizer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WhitespaceTokenizer::setupWhitespaceTokenizerDeserializer, Builder::build);

	protected static void setupWhitespaceTokenizerDeserializer(DelegatingDeserializer<WhitespaceTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::maxTokenLength, JsonpDeserializer.integerDeserializer(), "max_token_length");

		op.ignore("type");
	}

}
