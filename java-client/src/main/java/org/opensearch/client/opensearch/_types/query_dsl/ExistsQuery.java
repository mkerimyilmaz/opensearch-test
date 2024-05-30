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

// typedef: _types.query_dsl.ExistsQuery

@JsonpDeserializable
public class ExistsQuery extends QueryBase implements QueryVariant {
    private final String field;

    // ---------------------------------------------------------------------------------------------

    private ExistsQuery(Builder builder) {
        super(builder);

        this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

    }

    public static ExistsQuery of(Function<Builder, ObjectBuilder<ExistsQuery>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Query variant kind.
     */
    @Override
    public Query.Kind _queryKind() {
        return Query.Kind.Exists;
    }

    /**
     * Required - API name: {@code field}
     */
    public final String field() {
        return this.field;
    }

    protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

        super.serializeInternal(generator, mapper);
        generator.writeKey("field");
        generator.write(this.field);

    }

    public Builder toBuilder() {
        return new Builder().field(field);
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link ExistsQuery}.
     */

    public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<ExistsQuery> {
        private String field;

        /**
         * Required - API name: {@code field}
         */
        public final Builder field(String value) {
            this.field = value;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds a {@link ExistsQuery}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public ExistsQuery build() {
            _checkSingleUse();

            return new ExistsQuery(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link ExistsQuery}
     */
    public static final JsonpDeserializer<ExistsQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        ExistsQuery::setupExistsQueryDeserializer
    );

    protected static void setupExistsQueryDeserializer(ObjectDeserializer<ExistsQuery.Builder> op) {
        QueryBase.setupQueryBaseDeserializer(op);
        op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");

    }

}
