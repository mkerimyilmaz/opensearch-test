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

package org.opensearch.clients.opensearch._types;

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ToJsonp;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

// typedef: _types.ScriptBase
public abstract class ScriptBase implements ToJsonp {
	@Nullable
	private final JsonValue lang;

	@Nullable
	private final Map<String, JsonValue> params;

	// ---------------------------------------------------------------------------------------------

	protected ScriptBase(AbstractBuilder<?> builder) {

		this.lang = builder.lang;
		this.params = builder.params;

	}

	/**
	 * API name: {@code lang}
	 */
	@Nullable
	public JsonValue lang() {
		return this.lang;
	}

	/**
	 * API name: {@code params}
	 */
	@Nullable
	public Map<String, JsonValue> params() {
		return this.params;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.lang != null) {

			generator.writeKey("lang");
			generator.write(this.lang);

		}
		if (this.params != null) {

			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private JsonValue lang;

		@Nullable
		private Map<String, JsonValue> params;

		/**
		 * API name: {@code lang}
		 */
		public BuilderT lang(@Nullable JsonValue value) {
			this.lang = value;
			return self();
		}

		/**
		 * API name: {@code params}
		 */
		public BuilderT params(@Nullable Map<String, JsonValue> value) {
			this.params = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #params(Map)}, creating the map if needed.
		 */
		public BuilderT putParams(String key, JsonValue value) {
			if (this.params == null) {
				this.params = new HashMap<>();
			}
			this.params.put(key, value);
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupScriptBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::lang, JsonpDeserializer.jsonValueDeserializer(), "lang");
		op.add(AbstractBuilder::params,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "params");

	}

}
