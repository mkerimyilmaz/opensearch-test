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

package org.opensearch.clients.opensearch.cluster.health;

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.Objects;

// typedef: cluster.health.ShardHealthStats
public final class ShardHealthStats implements ToJsonp {
	private final Number activeShards;

	private final Number initializingShards;

	private final Boolean primaryActive;

	private final Number relocatingShards;

	private final JsonValue status;

	private final Number unassignedShards;

	// ---------------------------------------------------------------------------------------------

	protected ShardHealthStats(Builder builder) {

		this.activeShards = Objects.requireNonNull(builder.activeShards, "active_shards");
		this.initializingShards = Objects.requireNonNull(builder.initializingShards, "initializing_shards");
		this.primaryActive = Objects.requireNonNull(builder.primaryActive, "primary_active");
		this.relocatingShards = Objects.requireNonNull(builder.relocatingShards, "relocating_shards");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.unassignedShards = Objects.requireNonNull(builder.unassignedShards, "unassigned_shards");

	}

	/**
	 * API name: {@code active_shards}
	 */
	public Number activeShards() {
		return this.activeShards;
	}

	/**
	 * API name: {@code initializing_shards}
	 */
	public Number initializingShards() {
		return this.initializingShards;
	}

	/**
	 * API name: {@code primary_active}
	 */
	public Boolean primaryActive() {
		return this.primaryActive;
	}

	/**
	 * API name: {@code relocating_shards}
	 */
	public Number relocatingShards() {
		return this.relocatingShards;
	}

	/**
	 * API name: {@code status}
	 */
	public JsonValue status() {
		return this.status;
	}

	/**
	 * API name: {@code unassigned_shards}
	 */
	public Number unassignedShards() {
		return this.unassignedShards;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("active_shards");
		generator.write(this.activeShards.doubleValue());

		generator.writeKey("initializing_shards");
		generator.write(this.initializingShards.doubleValue());

		generator.writeKey("primary_active");
		generator.write(this.primaryActive);

		generator.writeKey("relocating_shards");
		generator.write(this.relocatingShards.doubleValue());

		generator.writeKey("status");
		generator.write(this.status);

		generator.writeKey("unassigned_shards");
		generator.write(this.unassignedShards.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardHealthStats}.
	 */
	public static class Builder implements ObjectBuilder<ShardHealthStats> {
		private Number activeShards;

		private Number initializingShards;

		private Boolean primaryActive;

		private Number relocatingShards;

		private JsonValue status;

		private Number unassignedShards;

		/**
		 * API name: {@code active_shards}
		 */
		public Builder activeShards(Number value) {
			this.activeShards = value;
			return this;
		}

		/**
		 * API name: {@code initializing_shards}
		 */
		public Builder initializingShards(Number value) {
			this.initializingShards = value;
			return this;
		}

		/**
		 * API name: {@code primary_active}
		 */
		public Builder primaryActive(Boolean value) {
			this.primaryActive = value;
			return this;
		}

		/**
		 * API name: {@code relocating_shards}
		 */
		public Builder relocatingShards(Number value) {
			this.relocatingShards = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(JsonValue value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code unassigned_shards}
		 */
		public Builder unassignedShards(Number value) {
			this.unassignedShards = value;
			return this;
		}

		/**
		 * Builds a {@link ShardHealthStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardHealthStats build() {

			return new ShardHealthStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ShardHealthStats
	 */
	public static final JsonpDeserializer<ShardHealthStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardHealthStats::setupShardHealthStatsDeserializer);

	protected static void setupShardHealthStatsDeserializer(DelegatingDeserializer<ShardHealthStats.Builder> op) {

		op.add(Builder::activeShards, JsonpDeserializer.numberDeserializer(), "active_shards");
		op.add(Builder::initializingShards, JsonpDeserializer.numberDeserializer(), "initializing_shards");
		op.add(Builder::primaryActive, JsonpDeserializer.booleanDeserializer(), "primary_active");
		op.add(Builder::relocatingShards, JsonpDeserializer.numberDeserializer(), "relocating_shards");
		op.add(Builder::status, JsonpDeserializer.jsonValueDeserializer(), "status");
		op.add(Builder::unassignedShards, JsonpDeserializer.numberDeserializer(), "unassigned_shards");

	}

}
