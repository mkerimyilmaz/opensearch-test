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

package org.opensearch.client.opensearch.cluster.remote_info;

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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: cluster.remote_info.ClusterRemoteSniffInfo
@JsonpDeserializable
public class ClusterRemoteSniffInfo implements ClusterRemoteInfoVariant, JsonpSerializable {
	private final boolean connected;

	private final int maxConnectionsPerCluster;

	private final long numNodesConnected;

	private final String initialConnectTimeout;

	private final boolean skipUnavailable;

	private final List<String> seeds;

	// ---------------------------------------------------------------------------------------------

	private ClusterRemoteSniffInfo(Builder builder) {

		this.connected = ModelTypeHelper.requireNonNull(builder.connected, this, "connected");
		this.maxConnectionsPerCluster = ModelTypeHelper.requireNonNull(builder.maxConnectionsPerCluster, this,
				"maxConnectionsPerCluster");
		this.numNodesConnected = ModelTypeHelper.requireNonNull(builder.numNodesConnected, this, "numNodesConnected");
		this.initialConnectTimeout = ModelTypeHelper.requireNonNull(builder.initialConnectTimeout, this,
				"initialConnectTimeout");
		this.skipUnavailable = ModelTypeHelper.requireNonNull(builder.skipUnavailable, this, "skipUnavailable");
		this.seeds = ModelTypeHelper.unmodifiableRequired(builder.seeds, this, "seeds");

	}

	public static ClusterRemoteSniffInfo of(Function<Builder, ObjectBuilder<ClusterRemoteSniffInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link ClusterRemoteInfo} variant type
	 */
	@Override
	public String _variantType() {
		return "sniff";
	}

	/**
	 * Required - API name: {@code connected}
	 */
	public final boolean connected() {
		return this.connected;
	}

	/**
	 * Required - API name: {@code max_connections_per_cluster}
	 */
	public final int maxConnectionsPerCluster() {
		return this.maxConnectionsPerCluster;
	}

	/**
	 * Required - API name: {@code num_nodes_connected}
	 */
	public final long numNodesConnected() {
		return this.numNodesConnected;
	}

	/**
	 * Required - API name: {@code initial_connect_timeout}
	 */
	public final String initialConnectTimeout() {
		return this.initialConnectTimeout;
	}

	/**
	 * Required - API name: {@code skip_unavailable}
	 */
	public final boolean skipUnavailable() {
		return this.skipUnavailable;
	}

	/**
	 * Required - API name: {@code seeds}
	 */
	public final List<String> seeds() {
		return this.seeds;
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

		generator.write("mode", "sniff");

		generator.writeKey("connected");
		generator.write(this.connected);

		generator.writeKey("max_connections_per_cluster");
		generator.write(this.maxConnectionsPerCluster);

		generator.writeKey("num_nodes_connected");
		generator.write(this.numNodesConnected);

		generator.writeKey("initial_connect_timeout");
		generator.write(this.initialConnectTimeout);

		generator.writeKey("skip_unavailable");
		generator.write(this.skipUnavailable);

		if (ModelTypeHelper.isDefined(this.seeds)) {
			generator.writeKey("seeds");
			generator.writeStartArray();
			for (String item0 : this.seeds) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterRemoteSniffInfo}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClusterRemoteSniffInfo> {
		private Boolean connected;

		private Integer maxConnectionsPerCluster;

		private Long numNodesConnected;

		private String initialConnectTimeout;

		private Boolean skipUnavailable;

		private List<String> seeds;

		/**
		 * Required - API name: {@code connected}
		 */
		public final Builder connected(boolean value) {
			this.connected = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_connections_per_cluster}
		 */
		public final Builder maxConnectionsPerCluster(int value) {
			this.maxConnectionsPerCluster = value;
			return this;
		}

		/**
		 * Required - API name: {@code num_nodes_connected}
		 */
		public final Builder numNodesConnected(long value) {
			this.numNodesConnected = value;
			return this;
		}

		/**
		 * Required - API name: {@code initial_connect_timeout}
		 */
		public final Builder initialConnectTimeout(String value) {
			this.initialConnectTimeout = value;
			return this;
		}

		/**
		 * Required - API name: {@code skip_unavailable}
		 */
		public final Builder skipUnavailable(boolean value) {
			this.skipUnavailable = value;
			return this;
		}

		/**
		 * Required - API name: {@code seeds}
		 */
		public final Builder seeds(List<String> value) {
			this.seeds = value;
			return this;
		}

		/**
		 * Required - API name: {@code seeds}
		 */
		public final Builder seeds(String... value) {
			this.seeds = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link ClusterRemoteSniffInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterRemoteSniffInfo build() {
			_checkSingleUse();

			return new ClusterRemoteSniffInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterRemoteSniffInfo}
	 */
	public static final JsonpDeserializer<ClusterRemoteSniffInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterRemoteSniffInfo::setupClusterRemoteSniffInfoDeserializer, Builder::build);

	protected static void setupClusterRemoteSniffInfoDeserializer(
			DelegatingDeserializer<ClusterRemoteSniffInfo.Builder> op) {

		op.add(Builder::connected, JsonpDeserializer.booleanDeserializer(), "connected");
		op.add(Builder::maxConnectionsPerCluster, JsonpDeserializer.integerDeserializer(),
				"max_connections_per_cluster");
		op.add(Builder::numNodesConnected, JsonpDeserializer.longDeserializer(), "num_nodes_connected");
		op.add(Builder::initialConnectTimeout, JsonpDeserializer.stringDeserializer(), "initial_connect_timeout");
		op.add(Builder::skipUnavailable, JsonpDeserializer.booleanDeserializer(), "skip_unavailable");
		op.add(Builder::seeds, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "seeds");

		op.ignore("mode");
	}

}
