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

package org.opensearch.clients.opensearch.snapshot;

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

import java.lang.String;
import java.util.function.Function;

// typedef: snapshot._types.SnapshotShardFailure
@JsonpDeserializable
public class SnapshotShardFailure implements JsonpSerializable {
	private final String index;

	private final String nodeId;

	private final String reason;

	private final String shardId;

	private final String status;

	// ---------------------------------------------------------------------------------------------

	private SnapshotShardFailure(Builder builder) {

		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.nodeId = ModelTypeHelper.requireNonNull(builder.nodeId, this, "nodeId");
		this.reason = ModelTypeHelper.requireNonNull(builder.reason, this, "reason");
		this.shardId = ModelTypeHelper.requireNonNull(builder.shardId, this, "shardId");
		this.status = ModelTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static SnapshotShardFailure of(Function<Builder, ObjectBuilder<SnapshotShardFailure>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code node_id}
	 */
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * Required - API name: {@code reason}
	 */
	public final String reason() {
		return this.reason;
	}

	/**
	 * Required - API name: {@code shard_id}
	 */
	public final String shardId() {
		return this.shardId;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final String status() {
		return this.status;
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

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("reason");
		generator.write(this.reason);

		generator.writeKey("shard_id");
		generator.write(this.shardId);

		generator.writeKey("status");
		generator.write(this.status);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotShardFailure}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SnapshotShardFailure> {
		private String index;

		private String nodeId;

		private String reason;

		private String shardId;

		private String status;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_id}
		 */
		public final Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Required - API name: {@code reason}
		 */
		public final Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Required - API name: {@code shard_id}
		 */
		public final Builder shardId(String value) {
			this.shardId = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(String value) {
			this.status = value;
			return this;
		}

		/**
		 * Builds a {@link SnapshotShardFailure}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotShardFailure build() {
			_checkSingleUse();

			return new SnapshotShardFailure(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnapshotShardFailure}
	 */
	public static final JsonpDeserializer<SnapshotShardFailure> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnapshotShardFailure::setupSnapshotShardFailureDeserializer, Builder::build);

	protected static void setupSnapshotShardFailureDeserializer(
			DelegatingDeserializer<SnapshotShardFailure.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::shardId, JsonpDeserializer.stringDeserializer(), "shard_id");
		op.add(Builder::status, JsonpDeserializer.stringDeserializer(), "status");

	}

}
