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

package org.opensearch.clients.elasticsearch._types;

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
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.function.Function;

// typedef: _types.Time

/**
 * Whenever durations need to be specified, e.g. for a timeout parameter, the
 * duration must specify the unit, like 2d for 2 days.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch/blob/master/libs/core/src/main/java/org/elasticsearch/core/TimeValue.java">Documentation
 *      on elastic.co</a>
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/Time.ts#L62-L68">API
 *      specification</a>
 */
@JsonpDeserializable
public class Time implements TaggedUnion<Time.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Offset, Time

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

	private Time(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_kind) {
			case Offset :
				return String.valueOf(this.offset());
			case Time :
				return this.time();

			default :
				throw new IllegalStateException("Unknown kind " + _kind);
		}
	}

	private Time(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Time of(Function<Builder, ObjectBuilder<Time>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code offset}?
	 */
	public boolean isOffset() {
		return _kind == Kind.Offset;
	}

	/**
	 * Get the {@code offset} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code offset} kind.
	 */
	public Integer offset() {
		return TaggedUnionUtils.get(this, Kind.Offset);
	}

	/**
	 * Is this variant instance of kind {@code time}?
	 */
	public boolean isTime() {
		return _kind == Kind.Time;
	}

	/**
	 * Get the {@code time} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code time} kind.
	 */
	public String time() {
		return TaggedUnionUtils.get(this, Kind.Time);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Offset :
					generator.write(((Integer) this._value));

					break;
				case Time :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Time> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<Time> offset(Integer v) {
			this._kind = Kind.Offset;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Time> time(String v) {
			this._kind = Kind.Time;
			this._value = v;
			return this;
		}

		public Time build() {
			_checkSingleUse();
			return new Time(this);
		}

	}

	private static JsonpDeserializer<Time> buildTimeDeserializer() {
		return new UnionDeserializer.Builder<Time, Kind, Object>(Time::new, false)
				.addMember(Kind.Offset, JsonpDeserializer.integerDeserializer())
				.addMember(Kind.Time, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<Time> _DESERIALIZER = JsonpDeserializer.lazy(Time::buildTimeDeserializer);
}
