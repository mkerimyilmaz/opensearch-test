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

package org.opensearch.client.opensearch.indices;

import java.util.function.Function;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.opensearch.indices.get_alias.IndexAliases;
import org.opensearch.client.transport.endpoints.DictionaryResponse;
import org.opensearch.client.util.ObjectBuilder;

// typedef: indices.get_alias.Response

@JsonpDeserializable
public class GetAliasResponse extends DictionaryResponse<String, IndexAliases> {
    // ---------------------------------------------------------------------------------------------

    private GetAliasResponse(Builder builder) {
        super(builder);

    }

    public static GetAliasResponse of(Function<Builder, ObjectBuilder<GetAliasResponse>> fn) {
        return fn.apply(new Builder()).build();
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link GetAliasResponse}.
     */

    public static class Builder extends DictionaryResponse.AbstractBuilder<String, IndexAliases, Builder>
        implements
            ObjectBuilder<GetAliasResponse> {
        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds a {@link GetAliasResponse}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public GetAliasResponse build() {
            _checkSingleUse();
            super.tKeySerializer(null);
            super.tValueSerializer(null);

            return new GetAliasResponse(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link GetAliasResponse}
     */
    public static final JsonpDeserializer<GetAliasResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        GetAliasResponse::setupGetAliasResponseDeserializer
    );

    protected static void setupGetAliasResponseDeserializer(ObjectDeserializer<GetAliasResponse.Builder> op) {
        DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(), IndexAliases._DESERIALIZER);

    }

}
