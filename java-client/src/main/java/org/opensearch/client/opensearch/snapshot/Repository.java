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

package org.opensearch.client.opensearch.snapshot;

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

// typedef: snapshot._types.Repository

@JsonpDeserializable
public class Repository implements PlainJsonSerializable {
    private final String type;

    @Nullable
    private final String uuid;

    private final RepositorySettings settings;

    // ---------------------------------------------------------------------------------------------

    private Repository(Builder builder) {

        this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
        this.uuid = builder.uuid;
        this.settings = ApiTypeHelper.requireNonNull(builder.settings, this, "settings");

    }

    public static Repository of(Function<Builder, ObjectBuilder<Repository>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code type}
     */
    public final String type() {
        return this.type;
    }

    /**
     * API name: {@code uuid}
     */
    @Nullable
    public final String uuid() {
        return this.uuid;
    }

    /**
     * Required - API name: {@code settings}
     */
    public final RepositorySettings settings() {
        return this.settings;
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
        generator.write(this.type);

        if (this.uuid != null) {
            generator.writeKey("uuid");
            generator.write(this.uuid);

        }
        generator.writeKey("settings");
        this.settings.serialize(generator, mapper);

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link Repository}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Repository> {
        private String type;

        @Nullable
        private String uuid;

        private RepositorySettings settings;

        /**
         * Required - API name: {@code type}
         */
        public final Builder type(String value) {
            this.type = value;
            return this;
        }

        /**
         * API name: {@code uuid}
         */
        public final Builder uuid(@Nullable String value) {
            this.uuid = value;
            return this;
        }

        /**
         * Required - API name: {@code settings}
         */
        public final Builder settings(RepositorySettings value) {
            this.settings = value;
            return this;
        }

        /**
         * Required - API name: {@code settings}
         */
        public final Builder settings(Function<RepositorySettings.Builder, ObjectBuilder<RepositorySettings>> fn) {
            return this.settings(fn.apply(new RepositorySettings.Builder()).build());
        }

        /**
         * Builds a {@link Repository}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public Repository build() {
            _checkSingleUse();

            return new Repository(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link Repository}
     */
    public static final JsonpDeserializer<Repository> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        Repository::setupRepositoryDeserializer
    );

    protected static void setupRepositoryDeserializer(ObjectDeserializer<Repository.Builder> op) {

        op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
        op.add(Builder::uuid, JsonpDeserializer.stringDeserializer(), "uuid");
        op.add(Builder::settings, RepositorySettings._DESERIALIZER, "settings");

    }

}
