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
import org.opensearch.client.util.ObjectBuilder;

// typedef: _types.aggregations.SamplerAggregation

@JsonpDeserializable
public class SamplerAggregation extends BucketAggregationBase implements AggregationVariant {
    @Nullable
    private final Integer shardSize;

    // ---------------------------------------------------------------------------------------------

    private SamplerAggregation(Builder builder) {
        super(builder);

        this.shardSize = builder.shardSize;

    }

    public static SamplerAggregation of(Function<Builder, ObjectBuilder<SamplerAggregation>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Aggregation variant kind.
     */
    @Override
    public Aggregation.Kind _aggregationKind() {
        return Aggregation.Kind.Sampler;
    }

    /**
     * API name: {@code shard_size}
     */
    @Nullable
    public final Integer shardSize() {
        return this.shardSize;
    }

    protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

        super.serializeInternal(generator, mapper);
        if (this.shardSize != null) {
            generator.writeKey("shard_size");
            generator.write(this.shardSize);

        }

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link SamplerAggregation}.
     */

    public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder> implements ObjectBuilder<SamplerAggregation> {
        @Nullable
        private Integer shardSize;

        /**
         * API name: {@code shard_size}
         */
        public final Builder shardSize(@Nullable Integer value) {
            this.shardSize = value;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds a {@link SamplerAggregation}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public SamplerAggregation build() {
            _checkSingleUse();

            return new SamplerAggregation(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link SamplerAggregation}
     */
    public static final JsonpDeserializer<SamplerAggregation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        SamplerAggregation::setupSamplerAggregationDeserializer
    );

    protected static void setupSamplerAggregationDeserializer(ObjectDeserializer<SamplerAggregation.Builder> op) {
        BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
        op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");

    }

}
