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
import org.opensearch.client.util.ObjectBuilder;

// typedef: _types.mapping.FlatObjectProperty

@JsonpDeserializable
public class FlatObjectProperty extends PropertyBase implements PropertyVariant {

    // ---------------------------------------------------------------------------------------------

    private FlatObjectProperty(Builder builder) {
        super(builder);

    }

    public static FlatObjectProperty of(Function<Builder, ObjectBuilder<FlatObjectProperty>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Property variant kind.
     */
    @Override
    public Property.Kind _propertyKind() {
        return Property.Kind.FlatObject;
    }

    protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

        generator.write("type", "flat_object");
        super.serializeInternal(generator, mapper);
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link FlatObjectProperty}.
     */

    public static class Builder extends PropertyBase.AbstractBuilder<Builder> implements ObjectBuilder<FlatObjectProperty> {

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds a {@link FlatObjectProperty}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public FlatObjectProperty build() {
            _checkSingleUse();

            return new FlatObjectProperty(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link FlatObjectProperty}
     */
    public static final JsonpDeserializer<FlatObjectProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        FlatObjectProperty::setupFlatObjectPropertyDeserializer
    );

    protected static void setupFlatObjectPropertyDeserializer(ObjectDeserializer<FlatObjectProperty.Builder> op) {
        PropertyBase.setupPropertyBaseDeserializer(op);

        op.ignore("type");
    }

}
