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

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;

// typedef: _types.analysis.LimitTokenCountTokenFilter

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/analysis/token_filters.ts#L247-L251">API
 *      specification</a>
 */
@JsonpDeserializable
public class LimitTokenCountTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final boolean consumeAllTokens;

	private final int maxTokenCount;

	// ---------------------------------------------------------------------------------------------

	private LimitTokenCountTokenFilter(Builder builder) {
		super(builder);

		this.consumeAllTokens = ApiTypeHelper.requireNonNull(builder.consumeAllTokens, this, "consumeAllTokens");
		this.maxTokenCount = ApiTypeHelper.requireNonNull(builder.maxTokenCount, this, "maxTokenCount");

	}

	public static LimitTokenCountTokenFilter of(Function<Builder, ObjectBuilder<LimitTokenCountTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.Limit;
	}

	/**
	 * Required - API name: {@code consume_all_tokens}
	 */
	public final boolean consumeAllTokens() {
		return this.consumeAllTokens;
	}

	/**
	 * Required - API name: {@code max_token_count}
	 */
	public final int maxTokenCount() {
		return this.maxTokenCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "limit");
		super.serializeInternal(generator, mapper);
		generator.writeKey("consume_all_tokens");
		generator.write(this.consumeAllTokens);

		generator.writeKey("max_token_count");
		generator.write(this.maxTokenCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LimitTokenCountTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<LimitTokenCountTokenFilter> {
		private Boolean consumeAllTokens;

		private Integer maxTokenCount;

		/**
		 * Required - API name: {@code consume_all_tokens}
		 */
		public final Builder consumeAllTokens(boolean value) {
			this.consumeAllTokens = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_token_count}
		 */
		public final Builder maxTokenCount(int value) {
			this.maxTokenCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LimitTokenCountTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LimitTokenCountTokenFilter build() {
			_checkSingleUse();

			return new LimitTokenCountTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LimitTokenCountTokenFilter}
	 */
	public static final JsonpDeserializer<LimitTokenCountTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LimitTokenCountTokenFilter::setupLimitTokenCountTokenFilterDeserializer);

	protected static void setupLimitTokenCountTokenFilterDeserializer(
			ObjectDeserializer<LimitTokenCountTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);
		op.add(Builder::consumeAllTokens, JsonpDeserializer.booleanDeserializer(), "consume_all_tokens");
		op.add(Builder::maxTokenCount, JsonpDeserializer.integerDeserializer(), "max_token_count");

		op.ignore("type");
	}

}
