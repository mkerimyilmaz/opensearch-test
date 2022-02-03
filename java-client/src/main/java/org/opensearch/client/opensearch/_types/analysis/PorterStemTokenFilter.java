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

import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: _types.analysis.PorterStemTokenFilter

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/analysis/token_filters.ts#L289-L291">API
 *      specification</a>
 */
@JsonpDeserializable
public class PorterStemTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	// ---------------------------------------------------------------------------------------------

	private PorterStemTokenFilter(Builder builder) {
		super(builder);

	}

	public static PorterStemTokenFilter of(Function<Builder, ObjectBuilder<PorterStemTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.PorterStem;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "porter_stem");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PorterStemTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PorterStemTokenFilter> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PorterStemTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PorterStemTokenFilter build() {
			_checkSingleUse();

			return new PorterStemTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PorterStemTokenFilter}
	 */
	public static final JsonpDeserializer<PorterStemTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PorterStemTokenFilter::setupPorterStemTokenFilterDeserializer);

	protected static void setupPorterStemTokenFilterDeserializer(ObjectDeserializer<PorterStemTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);

		op.ignore("type");
	}

}
