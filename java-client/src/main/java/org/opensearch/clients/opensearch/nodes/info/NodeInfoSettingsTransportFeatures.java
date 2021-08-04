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

package org.opensearch.clients.opensearch.nodes.info;

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
import java.lang.String;
import java.util.function.Function;

// typedef: nodes.info.NodeInfoSettingsTransportFeatures

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/nodes/info/types.ts#L201-L203">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoSettingsTransportFeatures implements JsonpSerializable {
	private final String xPack;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoSettingsTransportFeatures(Builder builder) {

		this.xPack = ApiTypeHelper.requireNonNull(builder.xPack, this, "xPack");

	}

	public static NodeInfoSettingsTransportFeatures of(
			Function<Builder, ObjectBuilder<NodeInfoSettingsTransportFeatures>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code x-pack}
	 */
	public final String xPack() {
		return this.xPack;
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

		generator.writeKey("x-pack");
		generator.write(this.xPack);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsTransportFeatures}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoSettingsTransportFeatures> {
		private String xPack;

		/**
		 * Required - API name: {@code x-pack}
		 */
		public final Builder xPack(String value) {
			this.xPack = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSettingsTransportFeatures}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsTransportFeatures build() {
			_checkSingleUse();

			return new NodeInfoSettingsTransportFeatures(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSettingsTransportFeatures}
	 */
	public static final JsonpDeserializer<NodeInfoSettingsTransportFeatures> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoSettingsTransportFeatures::setupNodeInfoSettingsTransportFeaturesDeserializer);

	protected static void setupNodeInfoSettingsTransportFeaturesDeserializer(
			ObjectDeserializer<NodeInfoSettingsTransportFeatures.Builder> op) {

		op.add(Builder::xPack, JsonpDeserializer.stringDeserializer(), "x-pack");

	}

}
