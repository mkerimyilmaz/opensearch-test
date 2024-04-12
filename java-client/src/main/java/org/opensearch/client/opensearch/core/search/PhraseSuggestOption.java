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
import javax.annotation.Nullable;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: _global.search._types.PhraseSuggestOption

@JsonpDeserializable
public class PhraseSuggestOption implements JsonpSerializable {
    private final String text;

    @Nullable
    private final String highlighted;

    private final double score;

    @Nullable
    private final Boolean collateMatch;

    // ---------------------------------------------------------------------------------------------

    private PhraseSuggestOption(Builder builder) {

        this.text = ApiTypeHelper.requireNonNull(builder.text, this, "text");
        this.highlighted = builder.highlighted;
        this.score = ApiTypeHelper.requireNonNull(builder.score, this, "score");
        this.collateMatch = builder.collateMatch;

    }

    public static PhraseSuggestOption of(Function<Builder, ObjectBuilder<PhraseSuggestOption>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code text}
     */
    public final String text() {
        return this.text;
    }

    /**
     * API name: {@code highlighted}
     */
    @Nullable
    public final String highlighted() {
        return this.highlighted;
    }

    /**
     * Required - API name: {@code score}
     */
    public final double score() {
        return this.score;
    }

    /**
     * API name: {@code collate_match}
     */
    public final Boolean collateMatch() {
        return this.collateMatch;
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

        generator.writeKey("text");
        generator.write(this.text);

        if (this.highlighted != null) {
            generator.writeKey("highlighted");
            generator.write(this.highlighted);
        }

        generator.writeKey("score");
        generator.write(this.score);

        if (this.collateMatch != null) {
            generator.writeKey("collate_match");
            generator.write(this.collateMatch);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link PhraseSuggestOption}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PhraseSuggestOption> {
        private String text;

        @Nullable
        private String highlighted;

        private Double score;

        @Nullable
        private Boolean collateMatch;

        /**
         * Required - API name: {@code text}
         */
        public final Builder text(String value) {
            this.text = value;
            return this;
        }

        /**
         * Required - API name: {@code highlighted}
         */
        public final Builder highlighted(@Nullable String value) {
            this.highlighted = value;
            return this;
        }

        /**
         * Required - API name: {@code score}
         */
        public final Builder score(double value) {
            this.score = value;
            return this;
        }

        /**
         * API name: {@code collate_match}
         */
        public final Builder collateMatch(@Nullable Boolean value) {
            this.collateMatch = value;
            return this;
        }

        /**
         * Builds a {@link PhraseSuggestOption}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public PhraseSuggestOption build() {
            _checkSingleUse();

            return new PhraseSuggestOption(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link PhraseSuggestOption}
     */
    public static final JsonpDeserializer<PhraseSuggestOption> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        PhraseSuggestOption::setupPhraseSuggestOptionDeserializer
    );

    protected static void setupPhraseSuggestOptionDeserializer(ObjectDeserializer<PhraseSuggestOption.Builder> op) {

        op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");
        op.add(Builder::highlighted, JsonpDeserializer.stringDeserializer(), "highlighted");
        op.add(Builder::score, JsonpDeserializer.doubleDeserializer(), "score");
        op.add(Builder::collateMatch, JsonpDeserializer.booleanDeserializer(), "collate_match");

    }

}
