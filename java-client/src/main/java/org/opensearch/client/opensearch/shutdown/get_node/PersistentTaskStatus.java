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

package org.opensearch.client.opensearch.shutdown.get_node;

import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: shutdown.get_node.PersistentTaskStatus

@JsonpDeserializable
public class PersistentTaskStatus implements JsonpSerializable {
    private final ShutdownStatus status;

    // ---------------------------------------------------------------------------------------------

    private PersistentTaskStatus(Builder builder) {

        this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");

    }

    public static PersistentTaskStatus of(Function<Builder, ObjectBuilder<PersistentTaskStatus>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code status}
     */
    public final ShutdownStatus status() {
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

        generator.writeKey("status");
        this.status.serialize(generator, mapper);

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link PersistentTaskStatus}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PersistentTaskStatus> {
        private ShutdownStatus status;

        /**
         * Required - API name: {@code status}
         */
        public final Builder status(ShutdownStatus value) {
            this.status = value;
            return this;
        }

        /**
         * Builds a {@link PersistentTaskStatus}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public PersistentTaskStatus build() {
            _checkSingleUse();

            return new PersistentTaskStatus(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link PersistentTaskStatus}
     */
    public static final JsonpDeserializer<PersistentTaskStatus> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        PersistentTaskStatus::setupPersistentTaskStatusDeserializer
    );

    protected static void setupPersistentTaskStatusDeserializer(ObjectDeserializer<PersistentTaskStatus.Builder> op) {

        op.add(Builder::status, ShutdownStatus._DESERIALIZER, "status");

    }

}
