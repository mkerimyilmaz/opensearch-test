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

package org.opensearch.client.opensearch.features;

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

// typedef: features._types.Feature

@JsonpDeserializable
public class Feature implements PlainJsonSerializable {
    private final String name;

    private final String description;

    // ---------------------------------------------------------------------------------------------

    private Feature(Builder builder) {

        this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
        this.description = ApiTypeHelper.requireNonNull(builder.description, this, "description");

    }

    public static Feature of(Function<Builder, ObjectBuilder<Feature>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code name}
     */
    public final String name() {
        return this.name;
    }

    /**
     * Required - API name: {@code description}
     */
    public final String description() {
        return this.description;
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

        generator.writeKey("description");
        generator.write(this.description);

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link Feature}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Feature> {
        private String name;

        private String description;

        /**
         * Required - API name: {@code name}
         */
        public final Builder name(String value) {
            this.name = value;
            return this;
        }

        /**
         * Required - API name: {@code description}
         */
        public final Builder description(String value) {
            this.description = value;
            return this;
        }

        /**
         * Builds a {@link Feature}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public Feature build() {
            _checkSingleUse();

            return new Feature(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link Feature}
     */
    public static final JsonpDeserializer<Feature> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        Feature::setupFeatureDeserializer
    );

    protected static void setupFeatureDeserializer(ObjectDeserializer<Feature.Builder> op) {

        op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
        op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");

    }

}
