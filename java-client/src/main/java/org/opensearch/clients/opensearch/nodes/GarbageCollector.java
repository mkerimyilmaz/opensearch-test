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

package org.opensearch.clients.opensearch.nodes;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.MapBuilder;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

// typedef: nodes._types.GarbageCollector
@JsonpDeserializable
public class GarbageCollector implements JsonpSerializable {
	private final Map<String, GarbageCollectorTotal> collectors;

	// ---------------------------------------------------------------------------------------------

	private GarbageCollector(Builder builder) {

		this.collectors = ModelTypeHelper.unmodifiableRequired(builder.collectors, this, "collectors");

	}

	public static GarbageCollector of(Function<Builder, ObjectBuilder<GarbageCollector>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code collectors}
	 */
	public final Map<String, GarbageCollectorTotal> collectors() {
		return this.collectors;
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

		if (ModelTypeHelper.isDefined(this.collectors)) {
			generator.writeKey("collectors");
			generator.writeStartObject();
			for (Map.Entry<String, GarbageCollectorTotal> item0 : this.collectors.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GarbageCollector}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GarbageCollector> {
		private Map<String, GarbageCollectorTotal> collectors;

		/**
		 * Required - API name: {@code collectors}
		 */
		public final Builder collectors(Map<String, GarbageCollectorTotal> value) {
			this.collectors = value;
			return this;
		}

		/**
		 * Set {@link #collectors(Map)} to a singleton map.
		 */
		public Builder collectors(String key,
				Function<GarbageCollectorTotal.Builder, ObjectBuilder<GarbageCollectorTotal>> fn) {
			return this
					.collectors(Collections.singletonMap(key, fn.apply(new GarbageCollectorTotal.Builder()).build()));
		}

		public final Builder collectors(
				Function<MapBuilder<String, GarbageCollectorTotal, GarbageCollectorTotal.Builder>, ObjectBuilder<Map<String, GarbageCollectorTotal>>> fn) {
			return collectors(fn.apply(new MapBuilder<>(GarbageCollectorTotal.Builder::new)).build());
		}

		/**
		 * Builds a {@link GarbageCollector}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GarbageCollector build() {
			_checkSingleUse();

			return new GarbageCollector(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GarbageCollector}
	 */
	public static final JsonpDeserializer<GarbageCollector> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GarbageCollector::setupGarbageCollectorDeserializer, Builder::build);

	protected static void setupGarbageCollectorDeserializer(DelegatingDeserializer<GarbageCollector.Builder> op) {

		op.add(Builder::collectors, JsonpDeserializer.stringMapDeserializer(GarbageCollectorTotal._DESERIALIZER),
				"collectors");

	}

}
