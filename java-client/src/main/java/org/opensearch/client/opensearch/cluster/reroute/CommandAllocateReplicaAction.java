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

package org.opensearch.client.opensearch.cluster.reroute;

import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: cluster.reroute.CommandAllocateReplicaAction

@JsonpDeserializable
public class CommandAllocateReplicaAction implements PlainJsonSerializable {
    private final String index;

    private final int shard;

    private final String node;

    // ---------------------------------------------------------------------------------------------

    private CommandAllocateReplicaAction(Builder builder) {

        this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
        this.shard = ApiTypeHelper.requireNonNull(builder.shard, this, "shard");
        this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");

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
        Builder::new,
        CommandAllocateReplicaAction::setupCommandAllocateReplicaActionDeserializer
    );

    protected static void setupCommandAllocateReplicaActionDeserializer(ObjectDeserializer<CommandAllocateReplicaAction.Builder> op) {

        op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
        op.add(Builder::shard, JsonpDeserializer.integerDeserializer(), "shard");
        op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");

    }

}
