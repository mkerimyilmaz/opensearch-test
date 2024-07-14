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

package org.opensearch.client.opensearch._types;

import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: _types.FieldSizeUsage

@JsonpDeserializable
public class FieldSizeUsage implements PlainJsonSerializable {
    @Nullable
    private final String size;

    private final long sizeInBytes;

    // ---------------------------------------------------------------------------------------------

    private FieldSizeUsage(Builder builder) {

        this.size = builder.size;
        this.sizeInBytes = ApiTypeHelper.requireNonNull(builder.sizeInBytes, this, "sizeInBytes");

    }

    public static FieldSizeUsage of(Function<Builder, ObjectBuilder<FieldSizeUsage>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * API name: {@code size}
     */
    @Nullable
    public final String size() {
        return this.size;
    }

    /**
     * Required - API name: {@code size_in_bytes}
     */
    public final long sizeInBytes() {
        return this.sizeInBytes;
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

        if (this.size != null) {
            generator.writeKey("size");
            generator.write(this.size);

        }
        generator.writeKey("size_in_bytes");
        generator.write(this.sizeInBytes);

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link FieldSizeUsage}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FieldSizeUsage> {
        @Nullable
        private String size;

        private Long sizeInBytes;

        /**
         * API name: {@code size}
         */
        public final Builder size(@Nullable String value) {
            this.size = value;
            return this;
        }

        /**
         * Required - API name: {@code size_in_bytes}
         */
        public final Builder sizeInBytes(long value) {
            this.sizeInBytes = value;
            return this;
        }

        /**
         * Builds a {@link FieldSizeUsage}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public FieldSizeUsage build() {
            _checkSingleUse();

            return new FieldSizeUsage(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link FieldSizeUsage}
     */
    public static final JsonpDeserializer<FieldSizeUsage> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        FieldSizeUsage::setupFieldSizeUsageDeserializer
    );

    protected static void setupFieldSizeUsageDeserializer(ObjectDeserializer<FieldSizeUsage.Builder> op) {

        op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size");
        op.add(Builder::sizeInBytes, JsonpDeserializer.longDeserializer(), "size_in_bytes");

    }

}
