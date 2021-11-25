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

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: _types.GeoLine
@JsonpDeserializable
public class GeoLine implements JsonpSerializable {
	private final String type;

	private final List<List<Double>> coordinates;

	// ---------------------------------------------------------------------------------------------

	private GeoLine(Builder builder) {

		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");
		this.coordinates = ModelTypeHelper.unmodifiableRequired(builder.coordinates, this, "coordinates");

	}

	public static GeoLine of(Function<Builder, ObjectBuilder<GeoLine>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Always <code>&quot;LineString&quot;</code>
	 * <p>
	 * API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - Array of <code>[lon, lat]</code> coordinates
	 * <p>
	 * API name: {@code coordinates}
	 */
	public final List<List<Double>> coordinates() {
		return this.coordinates;
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

		generator.writeKey("type");
		generator.write(this.type);

		if (ModelTypeHelper.isDefined(this.coordinates)) {
			generator.writeKey("coordinates");
			generator.writeStartArray();
			for (List<Double> item0 : this.coordinates) {
				generator.writeStartArray();
				if (item0 != null) {
					for (Double item1 : item0) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoLine}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GeoLine> {
		private String type;

		private List<List<Double>> coordinates;

		/**
		 * Required - Always <code>&quot;LineString&quot;</code>
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - Array of <code>[lon, lat]</code> coordinates
		 * <p>
		 * API name: {@code coordinates}
		 */
		public final Builder coordinates(List<List<Double>> value) {
			this.coordinates = value;
			return this;
		}

		/**
		 * Required - Array of <code>[lon, lat]</code> coordinates
		 * <p>
		 * API name: {@code coordinates}
		 */
		public final Builder coordinates(List<Double>... value) {
			this.coordinates = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link GeoLine}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoLine build() {
			_checkSingleUse();

			return new GeoLine(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoLine}
	 */
	public static final JsonpDeserializer<GeoLine> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoLine::setupGeoLineDeserializer, Builder::build);

	protected static void setupGeoLineDeserializer(DelegatingDeserializer<GeoLine.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::coordinates, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer())), "coordinates");

	}

}
