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

package org.opensearch.client.opensearch._types.mapping;

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

// typedef: _types.mapping.SuggestContext

@JsonpDeserializable
public class SuggestContext implements PlainJsonSerializable {
    private final String name;

    @Nullable
    private final String path;

    private final String type;

    @Nullable
    private final String precision;

    // ---------------------------------------------------------------------------------------------

    private SuggestContext(Builder builder) {

        this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
        this.path = builder.path;
        this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
        this.precision = builder.precision;

    }

    public static SuggestContext of(Function<Builder, ObjectBuilder<SuggestContext>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code name}
     */
    public final String name() {
        return this.name;
    }

    /**
     * API name: {@code path}
     */
    @Nullable
    public final String path() {
        return this.path;
    }

    /**
     * Required - API name: {@code type}
     */
    public final String type() {
        return this.type;
    }

    /**
     * API name: {@code precision}
     */
    @Nullable
    public final String precision() {
        return this.precision;
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

        generator.writeKey("name");
        generator.write(this.name);

        if (this.path != null) {
            generator.writeKey("path");
            generator.write(this.path);

        }
        generator.writeKey("type");
        generator.write(this.type);

        if (this.precision != null) {
            generator.writeKey("precision");
            generator.write(this.precision);

        }

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link SuggestContext}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SuggestContext> {
        private String name;

        @Nullable
        private String path;

        private String type;

        @Nullable
        private String precision;

        /**
         * Required - API name: {@code name}
         */
        public final Builder name(String value) {
            this.name = value;
            return this;
        }

        /**
         * API name: {@code path}
         */
        public final Builder path(@Nullable String value) {
            this.path = value;
            return this;
        }

        /**
         * Required - API name: {@code type}
         */
        public final Builder type(String value) {
            this.type = value;
            return this;
        }

        /**
         * API name: {@code precision}
         */
        public final Builder precision(@Nullable String value) {
            this.precision = value;
            return this;
        }

        /**
         * Builds a {@link SuggestContext}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public SuggestContext build() {
            _checkSingleUse();

            return new SuggestContext(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link SuggestContext}
     */
    public static final JsonpDeserializer<SuggestContext> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        SuggestContext::setupSuggestContextDeserializer
    );

    protected static void setupSuggestContextDeserializer(ObjectDeserializer<SuggestContext.Builder> op) {

        op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
        op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
        op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
        op.add(Builder::precision, JsonpDeserializer.stringDeserializer(), "precision");

    }

}
