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
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

// typedef: nodes.info.NodeInfoTransport
@JsonpDeserializable
public class NodeInfoTransport implements JsonpSerializable {
	private final List<String> boundAddress;

	private final String publishAddress;

	private final Map<String, String> profiles;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoTransport(Builder builder) {

		this.boundAddress = ModelTypeHelper.unmodifiableRequired(builder.boundAddress, this, "boundAddress");
		this.publishAddress = ModelTypeHelper.requireNonNull(builder.publishAddress, this, "publishAddress");
		this.profiles = ModelTypeHelper.unmodifiableRequired(builder.profiles, this, "profiles");

	}

	public static NodeInfoTransport of(Function<Builder, ObjectBuilder<NodeInfoTransport>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code bound_address}
	 */
	public final List<String> boundAddress() {
		return this.boundAddress;
	}

	/**
	 * Required - API name: {@code publish_address}
	 */
	public final String publishAddress() {
		return this.publishAddress;
	}

	/**
	 * Required - API name: {@code profiles}
	 */
	public final Map<String, String> profiles() {
		return this.profiles;
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

		if (ModelTypeHelper.isDefined(this.boundAddress)) {
			generator.writeKey("bound_address");
			generator.writeStartArray();
			for (String item0 : this.boundAddress) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("publish_address");
		generator.write(this.publishAddress);

		if (ModelTypeHelper.isDefined(this.profiles)) {
			generator.writeKey("profiles");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.profiles.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoTransport}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoTransport> {
		private List<String> boundAddress;

		private String publishAddress;

		private Map<String, String> profiles;

		/**
		 * Required - API name: {@code bound_address}
		 */
		public final Builder boundAddress(List<String> value) {
			this.boundAddress = value;
			return this;
		}

		/**
		 * Required - API name: {@code bound_address}
		 */
		public final Builder boundAddress(String... value) {
			this.boundAddress = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code publish_address}
		 */
		public final Builder publishAddress(String value) {
			this.publishAddress = value;
			return this;
		}

		/**
		 * Required - API name: {@code profiles}
		 */
		public final Builder profiles(Map<String, String> value) {
			this.profiles = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoTransport}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoTransport build() {
			_checkSingleUse();

			return new NodeInfoTransport(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoTransport}
	 */
	public static final JsonpDeserializer<NodeInfoTransport> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoTransport::setupNodeInfoTransportDeserializer, Builder::build);

	protected static void setupNodeInfoTransportDeserializer(DelegatingDeserializer<NodeInfoTransport.Builder> op) {

		op.add(Builder::boundAddress, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"bound_address");
		op.add(Builder::publishAddress, JsonpDeserializer.stringDeserializer(), "publish_address");
		op.add(Builder::profiles, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"profiles");

	}

}
