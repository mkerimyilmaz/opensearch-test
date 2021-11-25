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

package org.opensearch.client.opensearch.core.get_script_languages;

import org.opensearch.client.opensearch._types.ScriptLanguage;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: _global.get_script_languages.LanguageContext
@JsonpDeserializable
public class LanguageContext implements JsonpSerializable {
	private final List<String> contexts;

	private final ScriptLanguage language;

	// ---------------------------------------------------------------------------------------------

	private LanguageContext(Builder builder) {

		this.contexts = ModelTypeHelper.unmodifiableRequired(builder.contexts, this, "contexts");
		this.language = ModelTypeHelper.requireNonNull(builder.language, this, "language");

	}

	public static LanguageContext of(Function<Builder, ObjectBuilder<LanguageContext>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code contexts}
	 */
	public final List<String> contexts() {
		return this.contexts;
	}

	/**
	 * Required - API name: {@code language}
	 */
	public final ScriptLanguage language() {
		return this.language;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ModelTypeHelper.isDefined(this.contexts)) {
			generator.writeKey("contexts");
			generator.writeStartArray();
			for (String item0 : this.contexts) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("language");
		this.language.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LanguageContext}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<LanguageContext> {
		private List<String> contexts;

		private ScriptLanguage language;

		/**
		 * Required - API name: {@code contexts}
		 */
		public final Builder contexts(List<String> value) {
			this.contexts = value;
			return this;
		}

		/**
		 * Required - API name: {@code contexts}
		 */
		public final Builder contexts(String... value) {
			this.contexts = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code language}
		 */
		public final Builder language(ScriptLanguage value) {
			this.language = value;
			return this;
		}

		/**
		 * Builds a {@link LanguageContext}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LanguageContext build() {
			_checkSingleUse();

			return new LanguageContext(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LanguageContext}
	 */
	public static final JsonpDeserializer<LanguageContext> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			LanguageContext::setupLanguageContextDeserializer, Builder::build);

	protected static void setupLanguageContextDeserializer(DelegatingDeserializer<LanguageContext.Builder> op) {

		op.add(Builder::contexts, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"contexts");
		op.add(Builder::language, ScriptLanguage._DESERIALIZER, "language");

	}

}
