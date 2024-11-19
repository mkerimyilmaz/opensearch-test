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

package org.opensearch.client.opensearch.model;

import org.junit.Test;
import org.opensearch.client.json.jackson.JacksonJsonpMapper;
import org.opensearch.client.json.jsonb.JsonbJsonpMapper;
import org.opensearch.client.opensearch.core.SearchRequest;

public class RequestEncodingTest extends ModelTestCase {

    @Test
    public void testParametersNotInJson() {

        // This checks that path parameters ("q") are not serialized as json
        // and variant containers ser/deser

        SearchRequest request = new SearchRequest.Builder().q("blah")
            .query(b1 -> b1.type(b2 -> b2.value("foo")))
            .aggregations("myagg", b2 -> b2.avg(b3 -> b3.field("foo")))
            .build();

        JsonbJsonpMapper mapper = new JsonbJsonpMapper();
        String str = toJson(request, mapper);

        assertEquals("{\"aggregations\":{\"myagg\":{\"avg\":{\"field\":\"foo\"}}},\"query\":{\"type\":{\"value\":\"foo\"}}}", str);

        request = fromJson(str, SearchRequest.class, mapper);

        assertTrue(request.query().isType());
        assertEquals("foo", request.query().type().value());
        assertNull(request.q());

    }

    @Test
    public void testKnnVectorPrecision() {

        float[] vector = { 0.4f, 0.3f };
        SearchRequest request = new SearchRequest.Builder().q("knn").query(q -> q.knn(k -> k.field("values").vector(vector).k(1))).build();

        JacksonJsonpMapper mapper = new JacksonJsonpMapper();
        String str = toJson(request, mapper);
        assertEquals("{\"query\":{\"knn\":{\"values\":{\"vector\":[0.4,0.3],\"k\":1}}}}", str);

        request = fromJson(str, SearchRequest.class, mapper);

        assertTrue(request.query().isKnn());
        assertNull(request.q());
    }
}
