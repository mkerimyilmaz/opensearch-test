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

package org.opensearch.client.opensearch._types;

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

// typedef: _types.InlineScript
@JsonpDeserializable
public class InlineScript extends ScriptBase {
	private final String source;

	// ---------------------------------------------------------------------------------------------

	private InlineScript(Builder builder) {
		super(builder);

		this.source = ModelTypeHelper.requireNonNull(builder.source, this, "source");

	}

	public static InlineScript of(Function<Builder, ObjectBuilder<InlineScript>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code source}
	 */
	public final String source() {
		return this.source;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("source");
		generator.write(this.source);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InlineScript}.
	 */
	public static class Builder extends ScriptBase.AbstractBuilder<Builder> implements ObjectBuilder<InlineScript> {
		private String source;

		/**
		 * Required - API name: {@code source}
		 */
		public final Builder source(String value) {
			this.source = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InlineScript}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InlineScript build() {
			_checkSingleUse();

			return new InlineScript(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InlineScript}
	 */
	public static final JsonpDeserializer<InlineScript> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InlineScript::setupInlineScriptDeserializer, Builder::build);

	protected static void setupInlineScriptDeserializer(DelegatingDeserializer<InlineScript.Builder> op) {
		ScriptBase.setupScriptBaseDeserializer(op);
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");

	}

}
