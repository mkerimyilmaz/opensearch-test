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

package org.opensearch.clients.opensearch.nodes;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.MapBuilder;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

// typedef: nodes.stats.Response
@JsonpDeserializable
public class NodesStatsResponse extends NodesResponseBase {
	private final String clusterName;

	private final Map<String, Stats> nodes;

	// ---------------------------------------------------------------------------------------------

	private NodesStatsResponse(Builder builder) {
		super(builder);

		this.clusterName = ModelTypeHelper.requireNonNull(builder.clusterName, this, "clusterName");
		this.nodes = ModelTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");

	}

	public static NodesStatsResponse of(Function<Builder, ObjectBuilder<NodesStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code cluster_name}
	 */
	public final String clusterName() {
		return this.clusterName;
	}

	/**
	 * Required - API name: {@code nodes}
	 */
	public final Map<String, Stats> nodes() {
		return this.nodes;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		if (ModelTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, Stats> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodesStatsResponse}.
	 */
	public static class Builder extends NodesResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<NodesStatsResponse> {
		private String clusterName;

		private Map<String, Stats> nodes;

		/**
		 * Required - API name: {@code cluster_name}
		 */
		public final Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * Required - API name: {@code nodes}
		 */
		public final Builder nodes(Map<String, Stats> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key, Function<Stats.Builder, ObjectBuilder<Stats>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new Stats.Builder()).build()));
		}

		public final Builder nodes(
				Function<MapBuilder<String, Stats, Stats.Builder>, ObjectBuilder<Map<String, Stats>>> fn) {
			return nodes(fn.apply(new MapBuilder<>(Stats.Builder::new)).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodesStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodesStatsResponse build() {
			_checkSingleUse();

			return new NodesStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodesStatsResponse}
	 */
	public static final JsonpDeserializer<NodesStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodesStatsResponse::setupNodesStatsResponseDeserializer, Builder::build);

	protected static void setupNodesStatsResponseDeserializer(DelegatingDeserializer<Builder> op) {
		NodesResponseBase.setupNodesResponseBaseDeserializer(op);
		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(Stats._DESERIALIZER), "nodes");

	}

}
