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

package org.opensearch.client.opensearch._types.analysis;

import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.UnionDeserializer;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import org.opensearch.client.util.TaggedUnion;
import org.opensearch.client.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;

// typedef: _types.analysis.CharFilter


@JsonpDeserializable
public class CharFilter implements TaggedUnion<CharFilter.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Definition, Name

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

	private CharFilter(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private CharFilter(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static CharFilter of(Function<Builder, ObjectBuilder<CharFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code definition}?
	 */
	public boolean isDefinition() {
		return _kind == Kind.Definition;
	}

	/**
	 * Get the {@code definition} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code definition} kind.
	 */
	public CharFilterDefinition definition() {
		return TaggedUnionUtils.get(this, Kind.Definition);
	}

	/**
	 * Is this variant instance of kind {@code name}?
	 */
	public boolean isName() {
		return _kind == Kind.Name;
	}

	/**
	 * Get the {@code name} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code name} kind.
	 */
	public String name() {
		return TaggedUnionUtils.get(this, Kind.Name);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Name :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CharFilter> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<CharFilter> definition(CharFilterDefinition v) {
			this._kind = Kind.Definition;
			this._value = v;
			return this;
		}

		public ObjectBuilder<CharFilter> definition(
				Function<CharFilterDefinition.Builder, ObjectBuilder<CharFilterDefinition>> fn) {
			return this.definition(fn.apply(new CharFilterDefinition.Builder()).build());
		}

		public ObjectBuilder<CharFilter> name(String v) {
			this._kind = Kind.Name;
			this._value = v;
			return this;
		}

		public CharFilter build() {
			_checkSingleUse();
			return new CharFilter(this);
		}

	}

	private static JsonpDeserializer<CharFilter> buildCharFilterDeserializer() {
		return new UnionDeserializer.Builder<CharFilter, Kind, Object>(CharFilter::new, false)
				.addMember(Kind.Definition, CharFilterDefinition._DESERIALIZER)
				.addMember(Kind.Name, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<CharFilter> _DESERIALIZER = JsonpDeserializer
			.lazy(CharFilter::buildCharFilterDeserializer);
}
