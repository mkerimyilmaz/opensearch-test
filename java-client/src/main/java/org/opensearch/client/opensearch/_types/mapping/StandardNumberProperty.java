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

package org.opensearch.client.opensearch._types.mapping;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import javax.annotation.Nullable;

// typedef: _types.mapping.StandardNumberProperty

public abstract class StandardNumberProperty extends NumberPropertyBase {
	@Nullable
	private final Boolean coerce;

	@Nullable
	private final JsonValue /* _types.Script */ script;

	@Nullable
	private final OnScriptError onScriptError;

	// ---------------------------------------------------------------------------------------------

	protected StandardNumberProperty(AbstractBuilder<?> builder) {
		super(builder);

		this.coerce = builder.coerce;
		this.script = builder.script;
		this.onScriptError = builder.onScriptError;

	}

	/**
	 * API name: {@code coerce}
	 */
	@Nullable
	public final Boolean coerce() {
		return this.coerce;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final JsonValue /* _types.Script */ script() {
		return this.script;
	}

	/**
	 * API name: {@code on_script_error}
	 */
	@Nullable
	public final OnScriptError onScriptError() {
		return this.onScriptError;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.coerce != null) {
			generator.writeKey("coerce");
			generator.write(this.coerce);

		}
		if (this.script != null) {
			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.onScriptError != null) {
			generator.writeKey("on_script_error");
			this.onScriptError.serialize(generator, mapper);
		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				NumberPropertyBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Boolean coerce;

		@Nullable
		private JsonValue /* _types.Script */ script;

		@Nullable
		private OnScriptError onScriptError;

		/**
		 * API name: {@code coerce}
		 */
		public final BuilderT coerce(@Nullable Boolean value) {
			this.coerce = value;
			return self();
		}

		/**
		 * API name: {@code script}
		 */
		public final BuilderT script(@Nullable JsonValue /* _types.Script */ value) {
			this.script = value;
			return self();
		}

		/**
		 * API name: {@code on_script_error}
		 */
		public final BuilderT onScriptError(@Nullable OnScriptError value) {
			this.onScriptError = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupStandardNumberPropertyDeserializer(
			DelegatingDeserializer<BuilderT> op) {
		setupNumberPropertyBaseDeserializer(op);
		op.add(AbstractBuilder::coerce, JsonpDeserializer.booleanDeserializer(), "coerce");
		op.add(AbstractBuilder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(AbstractBuilder::onScriptError, OnScriptError._DESERIALIZER, "on_script_error");

	}

}
