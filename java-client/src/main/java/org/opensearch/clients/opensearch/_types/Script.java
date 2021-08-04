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

package org.opensearch.clients.opensearch._types;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.UnionDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import org.opensearch.clients.util.TaggedUnion;
import org.opensearch.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;

// typedef: _types.Script

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/Scripting.ts#L58-L59">API
 *      specification</a>
 */
@JsonpDeserializable
public class Script implements TaggedUnion<Script.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Inline, Stored

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	private Script(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private Script(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Script of(Function<Builder, ObjectBuilder<Script>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code inline}?
	 */
	public boolean isInline() {
		return _kind == Kind.Inline;
	}

	/**
	 * Get the {@code inline} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code inline} kind.
	 */
	public InlineScript inline() {
		return TaggedUnionUtils.get(this, Kind.Inline);
	}

	/**
	 * Is this variant instance of kind {@code stored}?
	 */
	public boolean isStored() {
		return _kind == Kind.Stored;
	}

	/**
	 * Get the {@code stored} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stored} kind.
	 */
	public StoredScriptId stored() {
		return TaggedUnionUtils.get(this, Kind.Stored);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Script> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<Script> inline(InlineScript v) {
			this._kind = Kind.Inline;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Script> inline(Function<InlineScript.Builder, ObjectBuilder<InlineScript>> fn) {
			return this.inline(fn.apply(new InlineScript.Builder()).build());
		}

		public ObjectBuilder<Script> stored(StoredScriptId v) {
			this._kind = Kind.Stored;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Script> stored(Function<StoredScriptId.Builder, ObjectBuilder<StoredScriptId>> fn) {
			return this.stored(fn.apply(new StoredScriptId.Builder()).build());
		}

		public Script build() {
			_checkSingleUse();
			return new Script(this);
		}

	}

	private static JsonpDeserializer<Script> buildScriptDeserializer() {
		return new UnionDeserializer.Builder<Script, Kind, Object>(Script::new, false)
				.addMember(Kind.Inline, InlineScript._DESERIALIZER).addMember(Kind.Stored, StoredScriptId._DESERIALIZER)
				.build();
	}

	public static final JsonpDeserializer<Script> _DESERIALIZER = JsonpDeserializer
			.lazy(Script::buildScriptDeserializer);
}
