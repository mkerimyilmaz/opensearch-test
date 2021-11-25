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

package org.opensearch.clients.elasticsearch.cluster;

import org.opensearch.clients.elasticsearch._types.mapping.TypeMapping;
import org.opensearch.clients.elasticsearch.indices.AliasDefinition;
import org.opensearch.clients.elasticsearch.indices.IndexSettings;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonData;
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

import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ComponentTemplateSummary
@JsonpDeserializable
public class ComponentTemplateSummary implements JsonpSerializable {
	private final Map<String, JsonData> meta;

	@Nullable
	private final Long version;

	private final Map<String, IndexSettings> settings;

	@Nullable
	private final TypeMapping mappings;

	private final Map<String, AliasDefinition> aliases;

	// ---------------------------------------------------------------------------------------------

	private ComponentTemplateSummary(Builder builder) {

		this.meta = ModelTypeHelper.unmodifiable(builder.meta);
		this.version = builder.version;
		this.settings = ModelTypeHelper.unmodifiableRequired(builder.settings, this, "settings");
		this.mappings = builder.mappings;
		this.aliases = ModelTypeHelper.unmodifiable(builder.aliases);

	}

	public static ComponentTemplateSummary of(Function<Builder, ObjectBuilder<ComponentTemplateSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code settings}
	 */
	public final Map<String, IndexSettings> settings() {
		return this.settings;
	}

	/**
	 * API name: {@code mappings}
	 */
	@Nullable
	public final TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code aliases}
	 */
	public final Map<String, AliasDefinition> aliases() {
		return this.aliases;
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

		if (ModelTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (ModelTypeHelper.isDefined(this.settings)) {
			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, IndexSettings> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.mappings != null) {
			generator.writeKey("mappings");
			this.mappings.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.aliases)) {
			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, AliasDefinition> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ComponentTemplateSummary}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ComponentTemplateSummary> {
		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private Long version;

		private Map<String, IndexSettings> settings;

		@Nullable
		private TypeMapping mappings;

		@Nullable
		private Map<String, AliasDefinition> aliases;

		/**
		 * API name: {@code _meta}
		 */
		public final Builder meta(@Nullable Map<String, JsonData> value) {
			this.meta = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(Map<String, IndexSettings> value) {
			this.settings = value;
			return this;
		}

		/**
		 * Set {@link #settings(Map)} to a singleton map.
		 */
		public Builder settings(String key, Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settings(Collections.singletonMap(key, fn.apply(new IndexSettings.Builder()).build()));
		}

		public final Builder settings(
				Function<MapBuilder<String, IndexSettings, IndexSettings.Builder>, ObjectBuilder<Map<String, IndexSettings>>> fn) {
			return settings(fn.apply(new MapBuilder<>(IndexSettings.Builder::new)).build());
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
		 * API name: {@code aliases}
		 */
		public final Builder aliases(@Nullable Map<String, AliasDefinition> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * Set {@link #aliases(Map)} to a singleton map.
		 */
		public Builder aliases(String key, Function<AliasDefinition.Builder, ObjectBuilder<AliasDefinition>> fn) {
			return this.aliases(Collections.singletonMap(key, fn.apply(new AliasDefinition.Builder()).build()));
		}

		public final Builder aliases(
				Function<MapBuilder<String, AliasDefinition, AliasDefinition.Builder>, ObjectBuilder<Map<String, AliasDefinition>>> fn) {
			return aliases(fn.apply(new MapBuilder<>(AliasDefinition.Builder::new)).build());
		}

		/**
		 * Builds a {@link ComponentTemplateSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ComponentTemplateSummary build() {
			_checkSingleUse();

			return new ComponentTemplateSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ComponentTemplateSummary}
	 */
	public static final JsonpDeserializer<ComponentTemplateSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ComponentTemplateSummary::setupComponentTemplateSummaryDeserializer, Builder::build);

	protected static void setupComponentTemplateSummaryDeserializer(
			DelegatingDeserializer<ComponentTemplateSummary.Builder> op) {

		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(IndexSettings._DESERIALIZER), "settings");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(AliasDefinition._DESERIALIZER), "aliases");

	}

}
