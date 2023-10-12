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

package org.opensearch.client.opensearch.core;

import java.util.function.Function;
import java.util.function.Supplier;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.NamedDeserializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.opensearch.core.search.SearchResult;
import org.opensearch.client.util.ObjectBuilder;

// typedef: _global.search_template.Response

@JsonpDeserializable
public class SearchTemplateResponse<TDocument> extends SearchResult<TDocument> {
    // ---------------------------------------------------------------------------------------------

    private SearchTemplateResponse(Builder<TDocument> builder) {
        super(builder);

    }

    public static <TDocument> SearchTemplateResponse<TDocument> of(
        Function<Builder<TDocument>, ObjectBuilder<SearchTemplateResponse<TDocument>>> fn
    ) {
        return fn.apply(new Builder<>()).build();
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link SearchTemplateResponse}.
     */
    public static class Builder<TDocument> extends SearchResult.AbstractBuilder<TDocument, Builder<TDocument>>
        implements
            ObjectBuilder<SearchTemplateResponse<TDocument>> {
        @Override
        protected Builder<TDocument> self() {
            return this;
        }

        /**
         * Builds a {@link SearchTemplateResponse}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public SearchTemplateResponse<TDocument> build() {
            _checkSingleUse();

            return new SearchTemplateResponse<TDocument>(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Create a JSON deserializer for SearchTemplateResponse
     */
    public static <TDocument> JsonpDeserializer<SearchTemplateResponse<TDocument>> createSearchTemplateResponseDeserializer(
        JsonpDeserializer<TDocument> tDocumentDeserializer
    ) {
        return ObjectBuilderDeserializer.createForObject(
            (Supplier<Builder<TDocument>>) Builder::new,
            op -> SearchTemplateResponse.setupSearchTemplateResponseDeserializer(op, tDocumentDeserializer)
        );
    };

    /**
     * Json deserializer for {@link SearchTemplateResponse} based on named
     * deserializers provided by the calling {@code JsonMapper}.
     */
    public static final JsonpDeserializer<SearchTemplateResponse<Object>> _DESERIALIZER = createSearchTemplateResponseDeserializer(
        new NamedDeserializer<>("org.opensearch.client:Deserializer:_global.search_template.TDocument")
    );

    protected static <TDocument> void setupSearchTemplateResponseDeserializer(
        ObjectDeserializer<SearchTemplateResponse.Builder<TDocument>> op,
        JsonpDeserializer<TDocument> tDocumentDeserializer
    ) {
        SearchResult.setupSearchResultDeserializer(op, tDocumentDeserializer);

    }

}
