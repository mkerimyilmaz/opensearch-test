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

package org.opensearch.clients.opensearch.nodes.info;

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

import java.util.function.Function;

// typedef: nodes.info.NodeInfoSearch
@JsonpDeserializable
public class NodeInfoSearch implements JsonpSerializable {
	private final NodeInfoSearchRemote remote;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoSearch(Builder builder) {

		this.remote = ModelTypeHelper.requireNonNull(builder.remote, this, "remote");

	}

	public static NodeInfoSearch of(Function<Builder, ObjectBuilder<NodeInfoSearch>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code remote}
	 */
	public final NodeInfoSearchRemote remote() {
		return this.remote;
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

		generator.writeKey("remote");
		this.remote.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSearch}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoSearch> {
		private NodeInfoSearchRemote remote;

		/**
		 * Required - API name: {@code remote}
		 */
		public final Builder remote(NodeInfoSearchRemote value) {
			this.remote = value;
			return this;
		}

		/**
		 * Required - API name: {@code remote}
		 */
		public final Builder remote(Function<NodeInfoSearchRemote.Builder, ObjectBuilder<NodeInfoSearchRemote>> fn) {
			return this.remote(fn.apply(new NodeInfoSearchRemote.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoSearch}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSearch build() {
			_checkSingleUse();

			return new NodeInfoSearch(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSearch}
	 */
	public static final JsonpDeserializer<NodeInfoSearch> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoSearch::setupNodeInfoSearchDeserializer, Builder::build);

	protected static void setupNodeInfoSearchDeserializer(DelegatingDeserializer<NodeInfoSearch.Builder> op) {

		op.add(Builder::remote, NodeInfoSearchRemote._DESERIALIZER, "remote");

	}

}
