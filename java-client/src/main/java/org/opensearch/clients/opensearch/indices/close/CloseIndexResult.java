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

package org.opensearch.clients.opensearch.indices.close;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices.close.CloseIndexResult
public final class CloseIndexResult implements ToJsonp {
	private final Boolean closed;

	@Nullable
	private final Map<String, CloseShardResult> shards;

	// ---------------------------------------------------------------------------------------------

	protected CloseIndexResult(Builder builder) {

		this.closed = Objects.requireNonNull(builder.closed, "closed");
		this.shards = builder.shards;

	}

	/**
	 * API name: {@code closed}
	 */
	public Boolean closed() {
		return this.closed;
	}

	/**
	 * API name: {@code shards}
	 */
	@Nullable
	public Map<String, CloseShardResult> shards() {
		return this.shards;
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

		generator.writeKey("closed");
		generator.write(this.closed);

		if (this.shards != null) {

			generator.writeKey("shards");
			generator.writeStartObject();
			for (Map.Entry<String, CloseShardResult> item0 : this.shards.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloseIndexResult}.
	 */
	public static class Builder implements ObjectBuilder<CloseIndexResult> {
		private Boolean closed;

		@Nullable
		private Map<String, CloseShardResult> shards;

		/**
		 * API name: {@code closed}
		 */
		public Builder closed(Boolean value) {
			this.closed = value;
			return this;
		}

		/**
		 * API name: {@code shards}
		 */
		public Builder shards(@Nullable Map<String, CloseShardResult> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #shards(Map)}, creating the map if needed.
		 */
		public Builder putShards(String key, CloseShardResult value) {
			if (this.shards == null) {
				this.shards = new HashMap<>();
			}
			this.shards.put(key, value);
			return this;
		}

		/**
		 * Set {@link #shards(Map)} to a singleton map.
		 */
		public Builder shards(String key, Function<CloseShardResult.Builder, ObjectBuilder<CloseShardResult>> fn) {
			return this.shards(Collections.singletonMap(key, fn.apply(new CloseShardResult.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #shards(Map)}, creating the map if needed.
		 */
		public Builder putShards(String key, Function<CloseShardResult.Builder, ObjectBuilder<CloseShardResult>> fn) {
			return this.putShards(key, fn.apply(new CloseShardResult.Builder()).build());
		}

		/**
		 * Builds a {@link CloseIndexResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloseIndexResult build() {

			return new CloseIndexResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CloseIndexResult
	 */
	public static final JsonpDeserializer<CloseIndexResult> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CloseIndexResult::setupCloseIndexResultDeserializer);

	protected static void setupCloseIndexResultDeserializer(DelegatingDeserializer<CloseIndexResult.Builder> op) {

		op.add(Builder::closed, JsonpDeserializer.booleanDeserializer(), "closed");
		op.add(Builder::shards, JsonpDeserializer.stringMapDeserializer(CloseShardResult.DESERIALIZER), "shards");

	}

}
