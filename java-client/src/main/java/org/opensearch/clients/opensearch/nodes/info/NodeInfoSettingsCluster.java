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

import org.opensearch.clients.opensearch.indices.IndexRouting;
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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoSettingsCluster

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/nodes/info/types.ts#L130-L135">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoSettingsCluster implements JsonpSerializable {
	private final String name;

	@Nullable
	private final IndexRouting routing;

	private final NodeInfoSettingsClusterElection election;

	@Nullable
	private final String initialMasterNodes;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoSettingsCluster(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.routing = builder.routing;
		this.election = ApiTypeHelper.requireNonNull(builder.election, this, "election");
		this.initialMasterNodes = builder.initialMasterNodes;

	}

	public static NodeInfoSettingsCluster of(Function<Builder, ObjectBuilder<NodeInfoSettingsCluster>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public final IndexRouting routing() {
		return this.routing;
	}

	/**
	 * Required - API name: {@code election}
	 */
	public final NodeInfoSettingsClusterElection election() {
		return this.election;
	}

	/**
	 * API name: {@code initial_master_nodes}
	 */
	@Nullable
	public final String initialMasterNodes() {
		return this.initialMasterNodes;
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

		generator.writeKey("name");
		generator.write(this.name);

		if (this.routing != null) {
			generator.writeKey("routing");
			this.routing.serialize(generator, mapper);

		}
		generator.writeKey("election");
		this.election.serialize(generator, mapper);

		if (this.initialMasterNodes != null) {
			generator.writeKey("initial_master_nodes");
			generator.write(this.initialMasterNodes);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsCluster}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoSettingsCluster> {
		private String name;

		@Nullable
		private IndexRouting routing;

		private NodeInfoSettingsClusterElection election;

		@Nullable
		private String initialMasterNodes;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable IndexRouting value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public final Builder routing(Function<IndexRouting.Builder, ObjectBuilder<IndexRouting>> fn) {
			return this.routing(fn.apply(new IndexRouting.Builder()).build());
		}

		/**
		 * Required - API name: {@code election}
		 */
		public final Builder election(NodeInfoSettingsClusterElection value) {
			this.election = value;
			return this;
		}

		/**
		 * Required - API name: {@code election}
		 */
		public final Builder election(
				Function<NodeInfoSettingsClusterElection.Builder, ObjectBuilder<NodeInfoSettingsClusterElection>> fn) {
			return this.election(fn.apply(new NodeInfoSettingsClusterElection.Builder()).build());
		}

		/**
		 * API name: {@code initial_master_nodes}
		 */
		public final Builder initialMasterNodes(@Nullable String value) {
			this.initialMasterNodes = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSettingsCluster}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsCluster build() {
			_checkSingleUse();

			return new NodeInfoSettingsCluster(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSettingsCluster}
	 */
	public static final JsonpDeserializer<NodeInfoSettingsCluster> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoSettingsCluster::setupNodeInfoSettingsClusterDeserializer);

	protected static void setupNodeInfoSettingsClusterDeserializer(
			ObjectDeserializer<NodeInfoSettingsCluster.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::routing, IndexRouting._DESERIALIZER, "routing");
		op.add(Builder::election, NodeInfoSettingsClusterElection._DESERIALIZER, "election");
		op.add(Builder::initialMasterNodes, JsonpDeserializer.stringDeserializer(), "initial_master_nodes");

	}

}
