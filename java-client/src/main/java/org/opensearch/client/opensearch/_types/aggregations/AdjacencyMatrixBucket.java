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

import java.util.function.Function;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ObjectBuilder;

// typedef: _types.aggregations.AdjacencyMatrixBucket

@JsonpDeserializable
public class AdjacencyMatrixBucket extends MultiBucketBase {
    // ---------------------------------------------------------------------------------------------

    private AdjacencyMatrixBucket(Builder builder) {
        super(builder);

    }

    public static AdjacencyMatrixBucket of(Function<Builder, ObjectBuilder<AdjacencyMatrixBucket>> fn) {
        return fn.apply(new Builder()).build();
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link AdjacencyMatrixBucket}.
     */

    public static class Builder extends MultiBucketBase.AbstractBuilder<Builder> implements ObjectBuilder<AdjacencyMatrixBucket> {
        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds a {@link AdjacencyMatrixBucket}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public AdjacencyMatrixBucket build() {
            _checkSingleUse();

            return new AdjacencyMatrixBucket(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link AdjacencyMatrixBucket}
     */
    public static final JsonpDeserializer<AdjacencyMatrixBucket> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        AdjacencyMatrixBucket::setupAdjacencyMatrixBucketDeserializer
    );

    protected static void setupAdjacencyMatrixBucketDeserializer(ObjectDeserializer<AdjacencyMatrixBucket.Builder> op) {
        MultiBucketBase.setupMultiBucketBaseDeserializer(op);

    }

}
