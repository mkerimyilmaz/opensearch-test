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

import org.opensearch.client.json.JsonData;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.function.Function;

// typedef: _types.ScriptTransform

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/Transform.ts#L40-L43">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScriptTransform implements TransformVariant, JsonpSerializable {
	private final String lang;

	private final Map<String, JsonData> params;

	// ---------------------------------------------------------------------------------------------

	private ScriptTransform(Builder builder) {

		this.lang = ApiTypeHelper.requireNonNull(builder.lang, this, "lang");
		this.params = ApiTypeHelper.unmodifiableRequired(builder.params, this, "params");

	}

	public static ScriptTransform of(Function<Builder, ObjectBuilder<ScriptTransform>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Transform variant kind.
	 */
	@Override
	public Transform.Kind _transformKind() {
		return Transform.Kind.Script;
	}

	/**
	 * Required - API name: {@code lang}
	 */
	public final String lang() {
		return this.lang;
	}

	/**
	 * Required - API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
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

		generator.writeKey("lang");
		generator.write(this.lang);

		if (ApiTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptTransform}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ScriptTransform> {
		private String lang;

		private Map<String, JsonData> params;

		/**
		 * Required - API name: {@code lang}
		 */
		public final Builder lang(String value) {
			this.lang = value;
			return this;
		}

		/**
		 * Required - API name: {@code params}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>params</code>.
		 */
		public final Builder params(Map<String, JsonData> map) {
			this.params = _mapPutAll(this.params, map);
			return this;
		}

		/**
		 * Required - API name: {@code params}
		 * <p>
		 * Adds an entry to <code>params</code>.
		 */
		public final Builder params(String key, JsonData value) {
			this.params = _mapPut(this.params, key, value);
			return this;
		}

		/**
		 * Builds a {@link ScriptTransform}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptTransform build() {
			_checkSingleUse();

			return new ScriptTransform(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScriptTransform}
	 */
	public static final JsonpDeserializer<ScriptTransform> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ScriptTransform::setupScriptTransformDeserializer);

	protected static void setupScriptTransformDeserializer(ObjectDeserializer<ScriptTransform.Builder> op) {

		op.add(Builder::lang, JsonpDeserializer.stringDeserializer(), "lang");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");

	}

}
