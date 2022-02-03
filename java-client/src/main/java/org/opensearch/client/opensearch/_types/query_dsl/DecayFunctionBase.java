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

package org.opensearch.client.opensearch._types.query_dsl;

import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectDeserializer;
import jakarta.json.stream.JsonGenerator;

import javax.annotation.Nullable;

// typedef: _types.query_dsl.DecayFunctionBase

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/query_dsl/compound.ts#L91-L93">API
 *      specification</a>
 */

public abstract class DecayFunctionBase extends ScoreFunctionBase {
	@Nullable
	private final MultiValueMode multiValueMode;

	// ---------------------------------------------------------------------------------------------

	protected DecayFunctionBase(AbstractBuilder<?> builder) {
		super(builder);

		this.multiValueMode = builder.multiValueMode;

	}

	/**
	 * API name: {@code multi_value_mode}
	 */
	@Nullable
	public final MultiValueMode multiValueMode() {
		return this.multiValueMode;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.multiValueMode != null) {
			generator.writeKey("multi_value_mode");
			this.multiValueMode.serialize(generator, mapper);
		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ScoreFunctionBase.AbstractBuilder<BuilderT> {
		@Nullable
		private MultiValueMode multiValueMode;

		/**
		 * API name: {@code multi_value_mode}
		 */
		public final BuilderT multiValueMode(@Nullable MultiValueMode value) {
			this.multiValueMode = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupDecayFunctionBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		ScoreFunctionBase.setupScoreFunctionBaseDeserializer(op);
		op.add(AbstractBuilder::multiValueMode, MultiValueMode._DESERIALIZER, "multi_value_mode");

	}

}
