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

package org.opensearch.clients.elasticsearch.cluster.stats;

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

// typedef: cluster.stats.ClusterIndicesShardsIndex
@JsonpDeserializable
public class ClusterIndicesShardsIndex implements JsonpSerializable {
	private final ClusterShardMetrics primaries;

	private final ClusterShardMetrics replication;

	private final ClusterShardMetrics shards;

	// ---------------------------------------------------------------------------------------------

	private ClusterIndicesShardsIndex(Builder builder) {

		this.primaries = ModelTypeHelper.requireNonNull(builder.primaries, this, "primaries");
		this.replication = ModelTypeHelper.requireNonNull(builder.replication, this, "replication");
		this.shards = ModelTypeHelper.requireNonNull(builder.shards, this, "shards");

	}

	public static ClusterIndicesShardsIndex of(Function<Builder, ObjectBuilder<ClusterIndicesShardsIndex>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Contains statistics about the number of primary shards assigned to
	 * selected nodes.
	 * <p>
	 * API name: {@code primaries}
	 */
	public final ClusterShardMetrics primaries() {
		return this.primaries;
	}

	/**
	 * Required - Contains statistics about the number of replication shards
	 * assigned to selected nodes.
	 * <p>
	 * API name: {@code replication}
	 */
	public final ClusterShardMetrics replication() {
		return this.replication;
	}

	/**
	 * Required - Contains statistics about the number of shards assigned to
	 * selected nodes.
	 * <p>
	 * API name: {@code shards}
	 */
	public final ClusterShardMetrics shards() {
		return this.shards;
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

		generator.writeKey("primaries");
		this.primaries.serialize(generator, mapper);

		generator.writeKey("replication");
		this.replication.serialize(generator, mapper);

		generator.writeKey("shards");
		this.shards.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterIndicesShardsIndex}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClusterIndicesShardsIndex> {
		private ClusterShardMetrics primaries;

		private ClusterShardMetrics replication;

		private ClusterShardMetrics shards;

		/**
		 * Required - Contains statistics about the number of primary shards assigned to
		 * selected nodes.
		 * <p>
		 * API name: {@code primaries}
		 */
		public final Builder primaries(ClusterShardMetrics value) {
			this.primaries = value;
			return this;
		}

		/**
		 * Required - Contains statistics about the number of primary shards assigned to
		 * selected nodes.
		 * <p>
		 * API name: {@code primaries}
		 */
		public final Builder primaries(Function<ClusterShardMetrics.Builder, ObjectBuilder<ClusterShardMetrics>> fn) {
			return this.primaries(fn.apply(new ClusterShardMetrics.Builder()).build());
		}

		/**
		 * Required - Contains statistics about the number of replication shards
		 * assigned to selected nodes.
		 * <p>
		 * API name: {@code replication}
		 */
		public final Builder replication(ClusterShardMetrics value) {
			this.replication = value;
			return this;
		}

		/**
		 * Required - Contains statistics about the number of replication shards
		 * assigned to selected nodes.
		 * <p>
		 * API name: {@code replication}
		 */
		public final Builder replication(Function<ClusterShardMetrics.Builder, ObjectBuilder<ClusterShardMetrics>> fn) {
			return this.replication(fn.apply(new ClusterShardMetrics.Builder()).build());
		}

		/**
		 * Required - Contains statistics about the number of shards assigned to
		 * selected nodes.
		 * <p>
		 * API name: {@code shards}
		 */
		public final Builder shards(ClusterShardMetrics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - Contains statistics about the number of shards assigned to
		 * selected nodes.
		 * <p>
		 * API name: {@code shards}
		 */
		public final Builder shards(Function<ClusterShardMetrics.Builder, ObjectBuilder<ClusterShardMetrics>> fn) {
			return this.shards(fn.apply(new ClusterShardMetrics.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterIndicesShardsIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterIndicesShardsIndex build() {
			_checkSingleUse();

			return new ClusterIndicesShardsIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterIndicesShardsIndex}
	 */
	public static final JsonpDeserializer<ClusterIndicesShardsIndex> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterIndicesShardsIndex::setupClusterIndicesShardsIndexDeserializer, Builder::build);

	protected static void setupClusterIndicesShardsIndexDeserializer(
			DelegatingDeserializer<ClusterIndicesShardsIndex.Builder> op) {

		op.add(Builder::primaries, ClusterShardMetrics._DESERIALIZER, "primaries");
		op.add(Builder::replication, ClusterShardMetrics._DESERIALIZER, "replication");
		op.add(Builder::shards, ClusterShardMetrics._DESERIALIZER, "shards");

	}

}
