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

// typedef: _types.analysis.DelimitedPayloadTokenFilter

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/analysis/token_filters.ts#L67-L71">API
 *      specification</a>
 */
@JsonpDeserializable
public class DelimitedPayloadTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final String delimiter;

	private final DelimitedPayloadEncoding encoding;

	// ---------------------------------------------------------------------------------------------

	private DelimitedPayloadTokenFilter(Builder builder) {
		super(builder);

		this.delimiter = ApiTypeHelper.requireNonNull(builder.delimiter, this, "delimiter");
		this.encoding = ApiTypeHelper.requireNonNull(builder.encoding, this, "encoding");

	}

	public static DelimitedPayloadTokenFilter of(Function<Builder, ObjectBuilder<DelimitedPayloadTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.DelimitedPayload;
	}

	/**
	 * Required - API name: {@code delimiter}
	 */
	public final String delimiter() {
		return this.delimiter;
	}

	/**
	 * Required - API name: {@code encoding}
	 */
	public final DelimitedPayloadEncoding encoding() {
		return this.encoding;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "delimited_payload");
		super.serializeInternal(generator, mapper);
		generator.writeKey("delimiter");
		generator.write(this.delimiter);

		generator.writeKey("encoding");
		this.encoding.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DelimitedPayloadTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DelimitedPayloadTokenFilter> {
		private String delimiter;

		private DelimitedPayloadEncoding encoding;

		/**
		 * Required - API name: {@code delimiter}
		 */
		public final Builder delimiter(String value) {
			this.delimiter = value;
			return this;
		}

		/**
		 * Required - API name: {@code encoding}
		 */
		public final Builder encoding(DelimitedPayloadEncoding value) {
			this.encoding = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DelimitedPayloadTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DelimitedPayloadTokenFilter build() {
			_checkSingleUse();

			return new DelimitedPayloadTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DelimitedPayloadTokenFilter}
	 */
	public static final JsonpDeserializer<DelimitedPayloadTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DelimitedPayloadTokenFilter::setupDelimitedPayloadTokenFilterDeserializer);

	protected static void setupDelimitedPayloadTokenFilterDeserializer(
			ObjectDeserializer<DelimitedPayloadTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);
		op.add(Builder::delimiter, JsonpDeserializer.stringDeserializer(), "delimiter");
		op.add(Builder::encoding, DelimitedPayloadEncoding._DESERIALIZER, "encoding");

		op.ignore("type");
	}

}
