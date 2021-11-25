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

package org.opensearch.clients.elasticsearch.cluster.reroute;

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
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

// typedef: cluster.reroute.CommandAllocateReplicaAction
@JsonpDeserializable
public class CommandAllocateReplicaAction implements JsonpSerializable {
	private final String index;

	private final int shard;

	private final String node;

	// ---------------------------------------------------------------------------------------------

	private CommandAllocateReplicaAction(Builder builder) {

		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.shard = ModelTypeHelper.requireNonNull(builder.shard, this, "shard");
		this.node = ModelTypeHelper.requireNonNull(builder.node, this, "node");

	}

	public static CommandAllocateReplicaAction of(Function<Builder, ObjectBuilder<CommandAllocateReplicaAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code shard}
	 */
	public final int shard() {
		return this.shard;
	}

	/**
	 * Required - API name: {@code node}
	 */
	public final String node() {
		return this.node;
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

		generator.writeKey("shard");
		generator.write(this.shard);

		generator.writeKey("node");
		generator.write(this.node);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CommandAllocateReplicaAction}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CommandAllocateReplicaAction> {
		private String index;

		private Integer shard;

		private String node;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code shard}
		 */
		public final Builder shard(int value) {
			this.shard = value;
			return this;
		}

		/**
		 * Required - API name: {@code node}
		 */
		public final Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * Builds a {@link CommandAllocateReplicaAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CommandAllocateReplicaAction build() {
			_checkSingleUse();

			return new CommandAllocateReplicaAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CommandAllocateReplicaAction}
	 */
	public static final JsonpDeserializer<CommandAllocateReplicaAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, CommandAllocateReplicaAction::setupCommandAllocateReplicaActionDeserializer, Builder::build);

	protected static void setupCommandAllocateReplicaActionDeserializer(
			DelegatingDeserializer<CommandAllocateReplicaAction.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::shard, JsonpDeserializer.integerDeserializer(), "shard");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");

	}

}
