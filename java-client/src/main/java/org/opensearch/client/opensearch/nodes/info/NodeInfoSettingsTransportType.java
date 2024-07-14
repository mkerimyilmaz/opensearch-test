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

package org.opensearch.client.opensearch.nodes.info;

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

// typedef: nodes.info.NodeInfoSettingsTransportType

@JsonpDeserializable
public class NodeInfoSettingsTransportType implements PlainJsonSerializable {
    private final String default_;

    // ---------------------------------------------------------------------------------------------

    private NodeInfoSettingsTransportType(Builder builder) {

        this.default_ = ApiTypeHelper.requireNonNull(builder.default_, this, "default_");

    }

    public static NodeInfoSettingsTransportType of(Function<Builder, ObjectBuilder<NodeInfoSettingsTransportType>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code default}
     */
    public final String default_() {
        return this.default_;
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

        generator.writeKey("default");
        generator.write(this.default_);

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link NodeInfoSettingsTransportType}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoSettingsTransportType> {
        private String default_;

        /**
         * Required - API name: {@code default}
         */
        public final Builder default_(String value) {
            this.default_ = value;
            return this;
        }

        /**
         * Builds a {@link NodeInfoSettingsTransportType}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public NodeInfoSettingsTransportType build() {
            _checkSingleUse();

            return new NodeInfoSettingsTransportType(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link NodeInfoSettingsTransportType}
     */
    public static final JsonpDeserializer<NodeInfoSettingsTransportType> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        NodeInfoSettingsTransportType::setupNodeInfoSettingsTransportTypeDeserializer
    );

    protected static void setupNodeInfoSettingsTransportTypeDeserializer(ObjectDeserializer<NodeInfoSettingsTransportType.Builder> op) {

        op.add(Builder::default_, JsonpDeserializer.stringDeserializer(), "default");

        op.shortcutProperty("default");

    }

}
