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

import java.util.function.Function;

// typedef: _types.analysis.LetterTokenizer
@JsonpDeserializable
public class LetterTokenizer extends TokenizerBase implements TokenizerVariant {
	// ---------------------------------------------------------------------------------------------

	private LetterTokenizer(Builder builder) {
		super(builder);

	}

	public static LetterTokenizer of(Function<Builder, ObjectBuilder<LetterTokenizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Tokenizer} variant type
	 */
	@Override
	public String _variantType() {
		return "letter";
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "letter");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LetterTokenizer}.
	 */
	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<LetterTokenizer> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LetterTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LetterTokenizer build() {
			_checkSingleUse();

			return new LetterTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LetterTokenizer}
	 */
	public static final JsonpDeserializer<LetterTokenizer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			LetterTokenizer::setupLetterTokenizerDeserializer, Builder::build);

	protected static void setupLetterTokenizerDeserializer(DelegatingDeserializer<LetterTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);

		op.ignore("type");
	}

}
