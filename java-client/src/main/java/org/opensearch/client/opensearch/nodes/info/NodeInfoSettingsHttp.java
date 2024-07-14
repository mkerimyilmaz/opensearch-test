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
import javax.annotation.Nullable;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: nodes.info.NodeInfoSettingsHttp

@JsonpDeserializable
public class NodeInfoSettingsHttp implements PlainJsonSerializable {
    private final NodeInfoSettingsHttpType type;

    @Nullable
    private final String typeDefault;

    @Nullable
    private final Boolean compression;

    @Nullable
    private final String port;

    // ---------------------------------------------------------------------------------------------

    private NodeInfoSettingsHttp(Builder builder) {

        this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
        this.typeDefault = builder.typeDefault;
        this.compression = builder.compression;
        this.port = builder.port;

    }

    public static NodeInfoSettingsHttp of(Function<Builder, ObjectBuilder<NodeInfoSettingsHttp>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code type}
     */
    public final NodeInfoSettingsHttpType type() {
        return this.type;
    }

    /**
     * API name: {@code type.default}
     */
    @Nullable
    public final String typeDefault() {
        return this.typeDefault;
    }

    /**
     * API name: {@code compression}
     */
    @Nullable
    public final Boolean compression() {
        return this.compression;
    }

    /**
     * API name: {@code port}
     */
    @Nullable
    public final String port() {
        return this.port;
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

        generator.writeKey("type");
        this.type.serialize(generator, mapper);

        if (this.typeDefault != null) {
            generator.writeKey("type.default");
            generator.write(this.typeDefault);

        }
        if (this.compression != null) {
            generator.writeKey("compression");
            generator.write(this.compression);

        }
        if (this.port != null) {
            generator.writeKey("port");
            generator.write(this.port);

        }

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link NodeInfoSettingsHttp}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoSettingsHttp> {
        private NodeInfoSettingsHttpType type;

        @Nullable
        private String typeDefault;

        @Nullable
        private Boolean compression;

        @Nullable
        private String port;

        /**
         * Required - API name: {@code type}
         */
        public final Builder type(NodeInfoSettingsHttpType value) {
            this.type = value;
            return this;
        }

        /**
         * Required - API name: {@code type}
         */
        public final Builder type(Function<NodeInfoSettingsHttpType.Builder, ObjectBuilder<NodeInfoSettingsHttpType>> fn) {
            return this.type(fn.apply(new NodeInfoSettingsHttpType.Builder()).build());
        }

        /**
         * API name: {@code type.default}
         */
        public final Builder typeDefault(@Nullable String value) {
            this.typeDefault = value;
            return this;
        }

        /**
         * API name: {@code compression}
         */
        public final Builder compression(@Nullable Boolean value) {
            this.compression = value;
            return this;
        }

        /**
         * API name: {@code port}
         */
        public final Builder port(@Nullable String value) {
            this.port = value;
            return this;
        }

        /**
         * Builds a {@link NodeInfoSettingsHttp}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public NodeInfoSettingsHttp build() {
            _checkSingleUse();

            return new NodeInfoSettingsHttp(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link NodeInfoSettingsHttp}
     */
    public static final JsonpDeserializer<NodeInfoSettingsHttp> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        NodeInfoSettingsHttp::setupNodeInfoSettingsHttpDeserializer
    );

    protected static void setupNodeInfoSettingsHttpDeserializer(ObjectDeserializer<NodeInfoSettingsHttp.Builder> op) {

        op.add(Builder::type, NodeInfoSettingsHttpType._DESERIALIZER, "type");
        op.add(Builder::typeDefault, JsonpDeserializer.stringDeserializer(), "type.default");
        op.add(Builder::compression, JsonpDeserializer.booleanDeserializer(), "compression");
        op.add(Builder::port, JsonpDeserializer.stringDeserializer(), "port");

    }

}
