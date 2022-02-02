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

package org.opensearch.clients.opensearch._types.query_dsl;

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

// typedef: _types.query_dsl.Like

/**
 * Text that we want similar documents for or a lookup to a document's field for
 * the text.
 * 
 * @see <a href=
 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-mlt-query.html#_document_input_parameters">Documentation
 *      on elastic.co</a>
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/query_dsl/specialized.ts#L105-L110">API
 *      specification</a>
 */
@JsonpDeserializable
public class Like implements TaggedUnion<Like.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Document, Text

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

	private Like(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private Like(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Like of(Function<Builder, ObjectBuilder<Like>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code document}?
	 */
	public boolean isDocument() {
		return _kind == Kind.Document;
	}

	/**
	 * Get the {@code document} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code document} kind.
	 */
	public LikeDocument document() {
		return TaggedUnionUtils.get(this, Kind.Document);
	}

	/**
	 * Is this variant instance of kind {@code text}?
	 */
	public boolean isText() {
		return _kind == Kind.Text;
	}

	/**
	 * Get the {@code text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text} kind.
	 */
	public String text() {
		return TaggedUnionUtils.get(this, Kind.Text);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Text :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Like> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<Like> document(LikeDocument v) {
			this._kind = Kind.Document;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Like> document(Function<LikeDocument.Builder, ObjectBuilder<LikeDocument>> fn) {
			return this.document(fn.apply(new LikeDocument.Builder()).build());
		}

		public ObjectBuilder<Like> text(String v) {
			this._kind = Kind.Text;
			this._value = v;
			return this;
		}

		public Like build() {
			_checkSingleUse();
			return new Like(this);
		}

	}

	private static JsonpDeserializer<Like> buildLikeDeserializer() {
		return new UnionDeserializer.Builder<Like, Kind, Object>(Like::new, false)
				.addMember(Kind.Document, LikeDocument._DESERIALIZER)
				.addMember(Kind.Text, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<Like> _DESERIALIZER = JsonpDeserializer.lazy(Like::buildLikeDeserializer);
}
