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
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: _types.mapping.FieldNamesField

@JsonpDeserializable
public class FieldNamesField implements PlainJsonSerializable {
    private final boolean enabled;

    // ---------------------------------------------------------------------------------------------

    private FieldNamesField(Builder builder) {

        this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled");

    }

    public static FieldNamesField of(Function<Builder, ObjectBuilder<FieldNamesField>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code enabled}
     */
    public final boolean enabled() {
        return this.enabled;
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

        generator.writeKey("enabled");
        generator.write(this.enabled);

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link FieldNamesField}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FieldNamesField> {
        private Boolean enabled;

        /**
         * Required - API name: {@code enabled}
         */
        public final Builder enabled(boolean value) {
            this.enabled = value;
            return this;
        }

        /**
         * Builds a {@link FieldNamesField}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public FieldNamesField build() {
            _checkSingleUse();

            return new FieldNamesField(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link FieldNamesField}
     */
    public static final JsonpDeserializer<FieldNamesField> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        FieldNamesField::setupFieldNamesFieldDeserializer
    );

    protected static void setupFieldNamesFieldDeserializer(ObjectDeserializer<FieldNamesField.Builder> op) {

        op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");

    }

}
