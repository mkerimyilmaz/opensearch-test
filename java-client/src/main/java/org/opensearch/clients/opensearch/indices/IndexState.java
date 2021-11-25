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

package org.opensearch.clients.opensearch.indices;

import org.opensearch.clients.opensearch._types.mapping.TypeMapping;
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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;

import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexState
@JsonpDeserializable
public class IndexState implements JsonpSerializable {
	private final Map<String, Alias> aliases;

	@Nullable
	private final TypeMapping mappings;

	@Nullable
	private final JsonValue /*
							 * Union(indices._types.IndexSettings |
							 * indices._types.IndexStatePrefixedSettings)
							 */ settings;

	@Nullable
	private final String dataStream;

	// ---------------------------------------------------------------------------------------------

	private IndexState(Builder builder) {

		this.aliases = ModelTypeHelper.unmodifiable(builder.aliases);
		this.mappings = builder.mappings;
		this.settings = builder.settings;
		this.dataStream = builder.dataStream;

	}

	public static IndexState of(Function<Builder, ObjectBuilder<IndexState>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code aliases}
	 */
	public final Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code mappings}
	 */
	@Nullable
	public final TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code settings}
	 */
	@Nullable
	public final JsonValue /*
							 * Union(indices._types.IndexSettings |
							 * indices._types.IndexStatePrefixedSettings)
							 */ settings() {
		return this.settings;
	}

	/**
	 * API name: {@code data_stream}
	 */
	@Nullable
	public final String dataStream() {
		return this.dataStream;
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

		if (ModelTypeHelper.isDefined(this.aliases)) {
			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, Alias> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.mappings != null) {
			generator.writeKey("mappings");
			this.mappings.serialize(generator, mapper);

		}
		if (this.settings != null) {
			generator.writeKey("settings");
			generator.write(this.settings);

		}
		if (this.dataStream != null) {
			generator.writeKey("data_stream");
			generator.write(this.dataStream);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexState}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexState> {
		@Nullable
		private Map<String, Alias> aliases;

		@Nullable
		private TypeMapping mappings;

		@Nullable
		private JsonValue /*
							 * Union(indices._types.IndexSettings |
							 * indices._types.IndexStatePrefixedSettings)
							 */ settings;

		@Nullable
		private String dataStream;

		/**
		 * API name: {@code aliases}
		 */
		public final Builder aliases(@Nullable Map<String, Alias> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * Set {@link #aliases(Map)} to a singleton map.
		 */
		public Builder aliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return this.aliases(Collections.singletonMap(key, fn.apply(new Alias.Builder()).build()));
		}

		public final Builder aliases(
				Function<MapBuilder<String, Alias, Alias.Builder>, ObjectBuilder<Map<String, Alias>>> fn) {
			return aliases(fn.apply(new MapBuilder<>(Alias.Builder::new)).build());
		}

		/**
		 * API name: {@code mappings}
		 */
		public final Builder mappings(@Nullable TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public final Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * API name: {@code settings}
		 */
		public final Builder settings(@Nullable JsonValue /*
															 * Union(indices._types.IndexSettings |
															 * indices._types.IndexStatePrefixedSettings)
															 */ value) {
			this.settings = value;
			return this;
		}

		/**
		 * API name: {@code data_stream}
		 */
		public final Builder dataStream(@Nullable String value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * Builds a {@link IndexState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexState build() {
			_checkSingleUse();

			return new IndexState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexState}
	 */
	public static final JsonpDeserializer<IndexState> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexState::setupIndexStateDeserializer, Builder::build);

	protected static void setupIndexStateDeserializer(DelegatingDeserializer<IndexState.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias._DESERIALIZER), "aliases");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::settings, JsonpDeserializer.jsonValueDeserializer(), "settings");
		op.add(Builder::dataStream, JsonpDeserializer.stringDeserializer(), "data_stream");

	}

}
