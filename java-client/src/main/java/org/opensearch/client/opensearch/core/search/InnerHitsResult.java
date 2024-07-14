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

package org.opensearch.client.opensearch.core.search;

import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import org.opensearch.client.json.JsonData;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: _global.search._types.InnerHitsResult

@JsonpDeserializable
public class InnerHitsResult implements PlainJsonSerializable {
    private final HitsMetadata<JsonData> hits;

    // ---------------------------------------------------------------------------------------------

    private InnerHitsResult(Builder builder) {

        this.hits = ApiTypeHelper.requireNonNull(builder.hits, this, "hits");

    }

    public static InnerHitsResult of(Function<Builder, ObjectBuilder<InnerHitsResult>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code hits}
     */
    public final HitsMetadata<JsonData> hits() {
        return this.hits;
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

        generator.writeKey("hits");
        this.hits.serialize(generator, mapper);

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link InnerHitsResult}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<InnerHitsResult> {
        private HitsMetadata<JsonData> hits;

        /**
         * Required - API name: {@code hits}
         */
        public final Builder hits(HitsMetadata<JsonData> value) {
            this.hits = value;
            return this;
        }

        /**
         * Required - API name: {@code hits}
         */
        public final Builder hits(Function<HitsMetadata.Builder<JsonData>, ObjectBuilder<HitsMetadata<JsonData>>> fn) {
            return this.hits(fn.apply(new HitsMetadata.Builder<JsonData>()).build());
        }

        /**
         * Builds a {@link InnerHitsResult}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public InnerHitsResult build() {
            _checkSingleUse();

            return new InnerHitsResult(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link InnerHitsResult}
     */
    public static final JsonpDeserializer<InnerHitsResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        InnerHitsResult::setupInnerHitsResultDeserializer
    );

    protected static void setupInnerHitsResultDeserializer(ObjectDeserializer<InnerHitsResult.Builder> op) {

        op.add(Builder::hits, HitsMetadata.createHitsMetadataDeserializer(JsonData._DESERIALIZER), "hits");

    }

}
