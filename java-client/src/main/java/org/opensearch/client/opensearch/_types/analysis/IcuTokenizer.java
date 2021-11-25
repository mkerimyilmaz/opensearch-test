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
import java.lang.String;
import java.util.function.Function;

// typedef: _types.analysis.IcuTokenizer
@JsonpDeserializable
public class IcuTokenizer extends TokenizerBase implements TokenizerVariant, TokenFilterVariant {
	private final String ruleFiles;

	// ---------------------------------------------------------------------------------------------

	private IcuTokenizer(Builder builder) {
		super(builder);

		this.ruleFiles = ModelTypeHelper.requireNonNull(builder.ruleFiles, this, "ruleFiles");

	}

	public static IcuTokenizer of(Function<Builder, ObjectBuilder<IcuTokenizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Tokenizer}, {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "icu_tokenizer";
	}

	/**
	 * Required - API name: {@code rule_files}
	 */
	public final String ruleFiles() {
		return this.ruleFiles;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "icu_tokenizer");
		super.serializeInternal(generator, mapper);
		generator.writeKey("rule_files");
		generator.write(this.ruleFiles);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IcuTokenizer}.
	 */
	public static class Builder extends TokenizerBase.AbstractBuilder<Builder> implements ObjectBuilder<IcuTokenizer> {
		private String ruleFiles;

		/**
		 * Required - API name: {@code rule_files}
		 */
		public final Builder ruleFiles(String value) {
			this.ruleFiles = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IcuTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IcuTokenizer build() {
			_checkSingleUse();

			return new IcuTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IcuTokenizer}
	 */
	public static final JsonpDeserializer<IcuTokenizer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IcuTokenizer::setupIcuTokenizerDeserializer, Builder::build);

	protected static void setupIcuTokenizerDeserializer(DelegatingDeserializer<IcuTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::ruleFiles, JsonpDeserializer.stringDeserializer(), "rule_files");

		op.ignore("type");
	}

}
