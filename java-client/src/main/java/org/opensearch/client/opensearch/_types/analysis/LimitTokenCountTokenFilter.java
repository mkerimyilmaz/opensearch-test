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

package org.opensearch.client.opensearch._types.analysis;

import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;

// typedef: _types.analysis.LimitTokenCountTokenFilter

@JsonpDeserializable
public class LimitTokenCountTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
    private final boolean consumeAllTokens;

    private final int maxTokenCount;

    // ---------------------------------------------------------------------------------------------

    private LimitTokenCountTokenFilter(Builder builder) {
        super(builder);

        this.consumeAllTokens = ApiTypeHelper.requireNonNull(builder.consumeAllTokens, this, "consumeAllTokens");
        this.maxTokenCount = ApiTypeHelper.requireNonNull(builder.maxTokenCount, this, "maxTokenCount");

    }

    public static LimitTokenCountTokenFilter of(Function<Builder, ObjectBuilder<LimitTokenCountTokenFilter>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * TokenFilterDefinition variant kind.
     */
    @Override
    public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
        return TokenFilterDefinition.Kind.Limit;
    }

    /**
     * Required - API name: {@code consume_all_tokens}
     */
    public final boolean consumeAllTokens() {
        return this.consumeAllTokens;
    }

    /**
     * Required - API name: {@code max_token_count}
     */
    public final int maxTokenCount() {
        return this.maxTokenCount;
    }

    protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

        generator.write("type", "limit");
        super.serializeInternal(generator, mapper);
        generator.writeKey("consume_all_tokens");
        generator.write(this.consumeAllTokens);

        generator.writeKey("max_token_count");
        generator.write(this.maxTokenCount);

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link LimitTokenCountTokenFilter}.
     */

    public static class Builder extends TokenFilterBase.AbstractBuilder<Builder> implements ObjectBuilder<LimitTokenCountTokenFilter> {
        private Boolean consumeAllTokens;

        private Integer maxTokenCount;

        /**
         * Required - API name: {@code consume_all_tokens}
         */
        public final Builder consumeAllTokens(boolean value) {
            this.consumeAllTokens = value;
            return this;
        }

        /**
         * Required - API name: {@code max_token_count}
         */
        public final Builder maxTokenCount(int value) {
            this.maxTokenCount = value;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds a {@link LimitTokenCountTokenFilter}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public LimitTokenCountTokenFilter build() {
            _checkSingleUse();

            return new LimitTokenCountTokenFilter(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link LimitTokenCountTokenFilter}
     */
    public static final JsonpDeserializer<LimitTokenCountTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        LimitTokenCountTokenFilter::setupLimitTokenCountTokenFilterDeserializer
    );

    protected static void setupLimitTokenCountTokenFilterDeserializer(ObjectDeserializer<LimitTokenCountTokenFilter.Builder> op) {
        setupTokenFilterBaseDeserializer(op);
        op.add(Builder::consumeAllTokens, JsonpDeserializer.booleanDeserializer(), "consume_all_tokens");
        op.add(Builder::maxTokenCount, JsonpDeserializer.integerDeserializer(), "max_token_count");

        op.ignore("type");
    }

}
