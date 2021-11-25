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

package org.opensearch.clients.opensearch.indices.recovery;

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: indices.recovery.RecoveryStatus
@JsonpDeserializable
public class RecoveryStatus implements JsonpSerializable {
	private final List<ShardRecovery> shards;

	// ---------------------------------------------------------------------------------------------

	private RecoveryStatus(Builder builder) {

		this.shards = ModelTypeHelper.unmodifiableRequired(builder.shards, this, "shards");

	}

	public static RecoveryStatus of(Function<Builder, ObjectBuilder<RecoveryStatus>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code shards}
	 */
	public final List<ShardRecovery> shards() {
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

		if (ModelTypeHelper.isDefined(this.shards)) {
			generator.writeKey("shards");
			generator.writeStartArray();
			for (ShardRecovery item0 : this.shards) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryStatus}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RecoveryStatus> {
		private List<ShardRecovery> shards;

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(List<ShardRecovery> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(ShardRecovery... value) {
			this.shards = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		@SafeVarargs
		public final Builder shards(Function<ShardRecovery.Builder, ObjectBuilder<ShardRecovery>>... fns) {
			this.shards = new ArrayList<>(fns.length);
			for (Function<ShardRecovery.Builder, ObjectBuilder<ShardRecovery>> fn : fns) {
				this.shards.add(fn.apply(new ShardRecovery.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link RecoveryStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryStatus build() {
			_checkSingleUse();

			return new RecoveryStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RecoveryStatus}
	 */
	public static final JsonpDeserializer<RecoveryStatus> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RecoveryStatus::setupRecoveryStatusDeserializer, Builder::build);

	protected static void setupRecoveryStatusDeserializer(DelegatingDeserializer<RecoveryStatus.Builder> op) {

		op.add(Builder::shards, JsonpDeserializer.arrayDeserializer(ShardRecovery._DESERIALIZER), "shards");

	}

}
