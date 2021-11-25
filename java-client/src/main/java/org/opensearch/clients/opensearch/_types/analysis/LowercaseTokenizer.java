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

// typedef: _types.analysis.LowercaseTokenizer
@JsonpDeserializable
public class LowercaseTokenizer extends TokenizerBase implements TokenizerVariant {
	// ---------------------------------------------------------------------------------------------

	private LowercaseTokenizer(Builder builder) {
		super(builder);

	}

	public static LowercaseTokenizer of(Function<Builder, ObjectBuilder<LowercaseTokenizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Tokenizer} variant type
	 */
	@Override
	public String _variantType() {
		return "lowercase";
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "lowercase");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LowercaseTokenizer}.
	 */
	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<LowercaseTokenizer> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LowercaseTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LowercaseTokenizer build() {
			_checkSingleUse();

			return new LowercaseTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LowercaseTokenizer}
	 */
	public static final JsonpDeserializer<LowercaseTokenizer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LowercaseTokenizer::setupLowercaseTokenizerDeserializer, Builder::build);

	protected static void setupLowercaseTokenizerDeserializer(DelegatingDeserializer<LowercaseTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);

		op.ignore("type");
	}

}
