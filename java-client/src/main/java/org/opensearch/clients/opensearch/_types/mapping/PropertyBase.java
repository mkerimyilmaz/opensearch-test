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

package org.opensearch.clients.opensearch._types.mapping;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonData;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.util.MapBuilder;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.PropertyBase

public abstract class PropertyBase implements JsonpSerializable {
	private final Map<String, JsonData> localMetadata;

	private final Map<String, String> meta;

	@Nullable
	private final String name;

	private final Map<String, Property> properties;

	@Nullable
	private final Integer ignoreAbove;

	@Nullable
	private final JsonValue /* Union(_types.mapping.DynamicMapping | internal.boolean) */ dynamic;

	private final Map<String, Property> fields;

	// ---------------------------------------------------------------------------------------------

	protected PropertyBase(AbstractBuilder<?> builder) {

		this.localMetadata = ModelTypeHelper.unmodifiable(builder.localMetadata);
		this.meta = ModelTypeHelper.unmodifiable(builder.meta);
		this.name = builder.name;
		this.properties = ModelTypeHelper.unmodifiable(builder.properties);
		this.ignoreAbove = builder.ignoreAbove;
		this.dynamic = builder.dynamic;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);

	}

	/**
	 * API name: {@code local_metadata}
	 */
	public final Map<String, JsonData> localMetadata() {
		return this.localMetadata;
	}

	/**
	 * API name: {@code meta}
	 */
	public final Map<String, String> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code properties}
	 */
	public final Map<String, Property> properties() {
		return this.properties;
	}

	/**
	 * API name: {@code ignore_above}
	 */
	@Nullable
	public final Integer ignoreAbove() {
		return this.ignoreAbove;
	}

	/**
	 * API name: {@code dynamic}
	 */
	@Nullable
	public final JsonValue /* Union(_types.mapping.DynamicMapping | internal.boolean) */ dynamic() {
		return this.dynamic;
	}

	/**
	 * API name: {@code fields}
	 */
	public final Map<String, Property> fields() {
		return this.fields;
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

		if (ModelTypeHelper.isDefined(this.localMetadata)) {
			generator.writeKey("local_metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.localMetadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.meta)) {
			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (ModelTypeHelper.isDefined(this.properties)) {
			generator.writeKey("properties");
			generator.writeStartObject();
			for (Map.Entry<String, Property> item0 : this.properties.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.ignoreAbove != null) {
			generator.writeKey("ignore_above");
			generator.write(this.ignoreAbove);

		}
		if (this.dynamic != null) {
			generator.writeKey("dynamic");
			generator.write(this.dynamic);

		}
		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, Property> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ObjectBuilderBase {
		@Nullable
		private Map<String, JsonData> localMetadata;

		@Nullable
		private Map<String, String> meta;

		@Nullable
		private String name;

		@Nullable
		private Map<String, Property> properties;

		@Nullable
		private Integer ignoreAbove;

		@Nullable
		private JsonValue /* Union(_types.mapping.DynamicMapping | internal.boolean) */ dynamic;

		@Nullable
		private Map<String, Property> fields;

		/**
		 * API name: {@code local_metadata}
		 */
		public final BuilderT localMetadata(@Nullable Map<String, JsonData> value) {
			this.localMetadata = value;
			return self();
		}

		/**
		 * API name: {@code meta}
		 */
		public final BuilderT meta(@Nullable Map<String, String> value) {
			this.meta = value;
			return self();
		}

		/**
		 * API name: {@code name}
		 */
		public final BuilderT name(@Nullable String value) {
			this.name = value;
			return self();
		}

		/**
		 * API name: {@code properties}
		 */
		public final BuilderT properties(@Nullable Map<String, Property> value) {
			this.properties = value;
			return self();
		}

		/**
		 * Set {@link #properties(Map)} to a singleton map.
		 */
		public BuilderT properties(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return this.properties(Collections.singletonMap(key, fn.apply(new Property.Builder()).build()));
		}

		public final BuilderT properties(
				Function<MapBuilder<String, Property, Property.Builder>, ObjectBuilder<Map<String, Property>>> fn) {
			return properties(fn.apply(new MapBuilder<>(Property.Builder::new)).build());
		}

		/**
		 * API name: {@code ignore_above}
		 */
		public final BuilderT ignoreAbove(@Nullable Integer value) {
			this.ignoreAbove = value;
			return self();
		}

		/**
		 * API name: {@code dynamic}
		 */
		public final BuilderT dynamic(
				@Nullable JsonValue /* Union(_types.mapping.DynamicMapping | internal.boolean) */ value) {
			this.dynamic = value;
			return self();
		}

		/**
		 * API name: {@code fields}
		 */
		public final BuilderT fields(@Nullable Map<String, Property> value) {
			this.fields = value;
			return self();
		}

		/**
		 * Set {@link #fields(Map)} to a singleton map.
		 */
		public BuilderT fields(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return this.fields(Collections.singletonMap(key, fn.apply(new Property.Builder()).build()));
		}

		public final BuilderT fields(
				Function<MapBuilder<String, Property, Property.Builder>, ObjectBuilder<Map<String, Property>>> fn) {
			return fields(fn.apply(new MapBuilder<>(Property.Builder::new)).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupPropertyBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::localMetadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"local_metadata");
		op.add(AbstractBuilder::meta, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"meta");
		op.add(AbstractBuilder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(AbstractBuilder::properties, JsonpDeserializer.stringMapDeserializer(Property._DESERIALIZER),
				"properties");
		op.add(AbstractBuilder::ignoreAbove, JsonpDeserializer.integerDeserializer(), "ignore_above");
		op.add(AbstractBuilder::dynamic, JsonpDeserializer.jsonValueDeserializer(), "dynamic");
		op.add(AbstractBuilder::fields, JsonpDeserializer.stringMapDeserializer(Property._DESERIALIZER), "fields");

	}

}
