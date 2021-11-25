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
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: _types.PluginStats
@JsonpDeserializable
public class PluginStats implements JsonpSerializable {
	private final String classname;

	private final String description;

	private final String elasticsearchVersion;

	private final List<String> extendedPlugins;

	private final boolean hasNativeController;

	private final String javaVersion;

	private final String name;

	private final String version;

	private final boolean licensed;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	private PluginStats(Builder builder) {

		this.classname = ModelTypeHelper.requireNonNull(builder.classname, this, "classname");
		this.description = ModelTypeHelper.requireNonNull(builder.description, this, "description");
		this.elasticsearchVersion = ModelTypeHelper.requireNonNull(builder.elasticsearchVersion, this,
				"elasticsearchVersion");
		this.extendedPlugins = ModelTypeHelper.unmodifiableRequired(builder.extendedPlugins, this, "extendedPlugins");
		this.hasNativeController = ModelTypeHelper.requireNonNull(builder.hasNativeController, this,
				"hasNativeController");
		this.javaVersion = ModelTypeHelper.requireNonNull(builder.javaVersion, this, "javaVersion");
		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.version = ModelTypeHelper.requireNonNull(builder.version, this, "version");
		this.licensed = ModelTypeHelper.requireNonNull(builder.licensed, this, "licensed");
		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static PluginStats of(Function<Builder, ObjectBuilder<PluginStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code classname}
	 */
	public final String classname() {
		return this.classname;
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code elasticsearch_version}
	 */
	public final String elasticsearchVersion() {
		return this.elasticsearchVersion;
	}

	/**
	 * Required - API name: {@code extended_plugins}
	 */
	public final List<String> extendedPlugins() {
		return this.extendedPlugins;
	}

	/**
	 * Required - API name: {@code has_native_controller}
	 */
	public final boolean hasNativeController() {
		return this.hasNativeController;
	}

	/**
	 * Required - API name: {@code java_version}
	 */
	public final String javaVersion() {
		return this.javaVersion;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final String version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code licensed}
	 */
	public final boolean licensed() {
		return this.licensed;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
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

		generator.writeKey("classname");
		generator.write(this.classname);

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("elasticsearch_version");
		generator.write(this.elasticsearchVersion);

		if (ModelTypeHelper.isDefined(this.extendedPlugins)) {
			generator.writeKey("extended_plugins");
			generator.writeStartArray();
			for (String item0 : this.extendedPlugins) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("has_native_controller");
		generator.write(this.hasNativeController);

		generator.writeKey("java_version");
		generator.write(this.javaVersion);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("licensed");
		generator.write(this.licensed);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PluginStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PluginStats> {
		private String classname;

		private String description;

		private String elasticsearchVersion;

		private List<String> extendedPlugins;

		private Boolean hasNativeController;

		private String javaVersion;

		private String name;

		private String version;

		private Boolean licensed;

		private String type;

		/**
		 * Required - API name: {@code classname}
		 */
		public final Builder classname(String value) {
			this.classname = value;
			return this;
		}

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code elasticsearch_version}
		 */
		public final Builder elasticsearchVersion(String value) {
			this.elasticsearchVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code extended_plugins}
		 */
		public final Builder extendedPlugins(List<String> value) {
			this.extendedPlugins = value;
			return this;
		}

		/**
		 * Required - API name: {@code extended_plugins}
		 */
		public final Builder extendedPlugins(String... value) {
			this.extendedPlugins = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code has_native_controller}
		 */
		public final Builder hasNativeController(boolean value) {
			this.hasNativeController = value;
			return this;
		}

		/**
		 * Required - API name: {@code java_version}
		 */
		public final Builder javaVersion(String value) {
			this.javaVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - API name: {@code licensed}
		 */
		public final Builder licensed(boolean value) {
			this.licensed = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link PluginStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PluginStats build() {
			_checkSingleUse();

			return new PluginStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PluginStats}
	 */
	public static final JsonpDeserializer<PluginStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PluginStats::setupPluginStatsDeserializer, Builder::build);

	protected static void setupPluginStatsDeserializer(DelegatingDeserializer<PluginStats.Builder> op) {

		op.add(Builder::classname, JsonpDeserializer.stringDeserializer(), "classname");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::elasticsearchVersion, JsonpDeserializer.stringDeserializer(), "elasticsearch_version");
		op.add(Builder::extendedPlugins, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"extended_plugins");
		op.add(Builder::hasNativeController, JsonpDeserializer.booleanDeserializer(), "has_native_controller");
		op.add(Builder::javaVersion, JsonpDeserializer.stringDeserializer(), "java_version");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::licensed, JsonpDeserializer.booleanDeserializer(), "licensed");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
