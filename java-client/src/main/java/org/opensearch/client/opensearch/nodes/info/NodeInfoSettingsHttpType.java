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

package org.opensearch.client.opensearch.nodes.info;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.lang.String;
import java.util.function.Function;

// typedef: nodes.info.NodeInfoSettingsHttpType
@JsonpDeserializable
public class NodeInfoSettingsHttpType implements JsonpSerializable {
	private final String default_;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoSettingsHttpType(Builder builder) {

		this.default_ = ModelTypeHelper.requireNonNull(builder.default_, this, "default_");

	}

	public static NodeInfoSettingsHttpType of(Function<Builder, ObjectBuilder<NodeInfoSettingsHttpType>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code default}
	 */
	public final String default_() {
		return this.default_;
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

		generator.writeKey("default");
		generator.write(this.default_);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsHttpType}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoSettingsHttpType> {
		private String default_;

		/**
		 * Required - API name: {@code default}
		 */
		public final Builder default_(String value) {
			this.default_ = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSettingsHttpType}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsHttpType build() {
			_checkSingleUse();

			return new NodeInfoSettingsHttpType(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSettingsHttpType}
	 */
	public static final JsonpDeserializer<NodeInfoSettingsHttpType> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoSettingsHttpType::setupNodeInfoSettingsHttpTypeDeserializer, Builder::build);

	protected static void setupNodeInfoSettingsHttpTypeDeserializer(
			DelegatingDeserializer<NodeInfoSettingsHttpType.Builder> op) {

		op.add(Builder::default_, JsonpDeserializer.stringDeserializer(), "default");

	}

}
