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
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: _types.aggregations.TDigest

@JsonpDeserializable
public class TDigest implements PlainJsonSerializable {
    @Nullable
    private final Integer compression;

    // ---------------------------------------------------------------------------------------------

    private TDigest(Builder builder) {

        this.compression = builder.compression;

    }

    public static TDigest of(Function<Builder, ObjectBuilder<TDigest>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * API name: {@code compression}
     */
    @Nullable
    public final Integer compression() {
        return this.compression;
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

        if (this.compression != null) {
            generator.writeKey("compression");
            generator.write(this.compression);

        }

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link TDigest}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TDigest> {
        @Nullable
        private Integer compression;

        /**
         * API name: {@code compression}
         */
        public final Builder compression(@Nullable Integer value) {
            this.compression = value;
            return this;
        }

        /**
         * Builds a {@link TDigest}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public TDigest build() {
            _checkSingleUse();

            return new TDigest(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link TDigest}
     */
    public static final JsonpDeserializer<TDigest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        TDigest::setupTDigestDeserializer
    );

    protected static void setupTDigestDeserializer(ObjectDeserializer<TDigest.Builder> op) {

        op.add(Builder::compression, JsonpDeserializer.integerDeserializer(), "compression");

    }

}
