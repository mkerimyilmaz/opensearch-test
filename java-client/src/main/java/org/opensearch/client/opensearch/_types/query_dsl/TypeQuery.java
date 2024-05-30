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

package org.opensearch.client.opensearch._types.query_dsl;

import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;

// typedef: _types.query_dsl.TypeQuery

@JsonpDeserializable
public class TypeQuery extends QueryBase implements QueryVariant {
    private final String value;

    // ---------------------------------------------------------------------------------------------

    private TypeQuery(Builder builder) {
        super(builder);

        this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

    }

    public static TypeQuery of(Function<Builder, ObjectBuilder<TypeQuery>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Query variant kind.
     */
    @Override
    public Query.Kind _queryKind() {
        return Query.Kind.Type;
    }

    /**
     * Required - API name: {@code value}
     */
    public final String value() {
        return this.value;
    }

    protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

        super.serializeInternal(generator, mapper);
        generator.writeKey("value");
        generator.write(this.value);

    }

    public Builder toBuilder() {
        return new Builder().value(value);
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link TypeQuery}.
     */

    public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<TypeQuery> {
        private String value;

        /**
         * Required - API name: {@code value}
         */
        public final Builder value(String value) {
            this.value = value;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds a {@link TypeQuery}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public TypeQuery build() {
            _checkSingleUse();

            return new TypeQuery(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link TypeQuery}
     */
    public static final JsonpDeserializer<TypeQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        TypeQuery::setupTypeQueryDeserializer
    );

    protected static void setupTypeQueryDeserializer(ObjectDeserializer<TypeQuery.Builder> op) {
        QueryBase.setupQueryBaseDeserializer(op);
        op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

    }

}
