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

package org.opensearch.client.opensearch._types.aggregations;

import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.opensearch._types.GeoBounds;
import org.opensearch.client.util.ObjectBuilder;

// typedef: _types.aggregations.GeoBoundsAggregate

@JsonpDeserializable
public class GeoBoundsAggregate extends AggregateBase implements AggregateVariant {
    @Nullable
    private final GeoBounds bounds;

    // ---------------------------------------------------------------------------------------------

    private GeoBoundsAggregate(Builder builder) {
        super(builder);

        this.bounds = builder.bounds;

    }

    public static GeoBoundsAggregate of(Function<Builder, ObjectBuilder<GeoBoundsAggregate>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Aggregate variant kind.
     */
    @Override
    public Aggregate.Kind _aggregateKind() {
        return Aggregate.Kind.GeoBounds;
    }

    /**
     * API name: {@code bounds}
     */
    @Nullable
    public final GeoBounds bounds() {
        return this.bounds;
    }

    protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
        super.serializeInternal(generator, mapper);

        if (this.bounds != null) {
            generator.writeKey("bounds");
            this.bounds.serialize(generator, mapper);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link GeoBoundsAggregate}.
     */

    public static class Builder extends AggregateBase.AbstractBuilder<Builder> implements ObjectBuilder<GeoBoundsAggregate> {
        @Nullable
        private GeoBounds bounds;

        /**
         * API name: {@code bounds}
         */
        public final Builder bounds(@Nullable GeoBounds value) {
            this.bounds = value;
            return this;
        }

        /**
         * API name: {@code bounds}
         */
        public final Builder bounds(Function<GeoBounds.Builder, ObjectBuilder<GeoBounds>> fn) {
            return this.bounds(fn.apply(new GeoBounds.Builder()).build());
        }

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds a {@link GeoBoundsAggregate}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public GeoBoundsAggregate build() {
            _checkSingleUse();

            return new GeoBoundsAggregate(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link GeoBoundsAggregate}
     */
    public static final JsonpDeserializer<GeoBoundsAggregate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        GeoBoundsAggregate::setupGeoBoundsAggregateDeserializer
    );

    protected static void setupGeoBoundsAggregateDeserializer(ObjectDeserializer<GeoBoundsAggregate.Builder> op) {
        setupAggregateBaseDeserializer(op);
        op.add(Builder::bounds, GeoBounds._DESERIALIZER, "bounds");
    }
}
