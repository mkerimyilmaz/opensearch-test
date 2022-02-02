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

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: _types.TopRightBottomLeftGeoBounds

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/Geo.ts#L147-L150">API
 *      specification</a>
 */
@JsonpDeserializable
public class TopRightBottomLeftGeoBounds implements JsonpSerializable {
	private final GeoLocation topRight;

	private final GeoLocation bottomLeft;

	// ---------------------------------------------------------------------------------------------

	private TopRightBottomLeftGeoBounds(Builder builder) {

		this.topRight = ApiTypeHelper.requireNonNull(builder.topRight, this, "topRight");
		this.bottomLeft = ApiTypeHelper.requireNonNull(builder.bottomLeft, this, "bottomLeft");

	}

	public static TopRightBottomLeftGeoBounds of(Function<Builder, ObjectBuilder<TopRightBottomLeftGeoBounds>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code top_right}
	 */
	public final GeoLocation topRight() {
		return this.topRight;
	}

	/**
	 * Required - API name: {@code bottom_left}
	 */
	public final GeoLocation bottomLeft() {
		return this.bottomLeft;
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

		generator.writeKey("top_right");
		this.topRight.serialize(generator, mapper);

		generator.writeKey("bottom_left");
		this.bottomLeft.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TopRightBottomLeftGeoBounds}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TopRightBottomLeftGeoBounds> {
		private GeoLocation topRight;

		private GeoLocation bottomLeft;

		/**
		 * Required - API name: {@code top_right}
		 */
		public final Builder topRight(GeoLocation value) {
			this.topRight = value;
			return this;
		}

		/**
		 * Required - API name: {@code top_right}
		 */
		public final Builder topRight(Function<GeoLocation.Builder, ObjectBuilder<GeoLocation>> fn) {
			return this.topRight(fn.apply(new GeoLocation.Builder()).build());
		}

		/**
		 * Required - API name: {@code bottom_left}
		 */
		public final Builder bottomLeft(GeoLocation value) {
			this.bottomLeft = value;
			return this;
		}

		/**
		 * Required - API name: {@code bottom_left}
		 */
		public final Builder bottomLeft(Function<GeoLocation.Builder, ObjectBuilder<GeoLocation>> fn) {
			return this.bottomLeft(fn.apply(new GeoLocation.Builder()).build());
		}

		/**
		 * Builds a {@link TopRightBottomLeftGeoBounds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TopRightBottomLeftGeoBounds build() {
			_checkSingleUse();

			return new TopRightBottomLeftGeoBounds(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TopRightBottomLeftGeoBounds}
	 */
	public static final JsonpDeserializer<TopRightBottomLeftGeoBounds> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TopRightBottomLeftGeoBounds::setupTopRightBottomLeftGeoBoundsDeserializer);

	protected static void setupTopRightBottomLeftGeoBoundsDeserializer(
			ObjectDeserializer<TopRightBottomLeftGeoBounds.Builder> op) {

		op.add(Builder::topRight, GeoLocation._DESERIALIZER, "top_right");
		op.add(Builder::bottomLeft, GeoLocation._DESERIALIZER, "bottom_left");

	}

}
