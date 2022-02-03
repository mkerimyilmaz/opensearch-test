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

package org.opensearch.client.documentation;

import org.opensearch.client.opensearch.OpenSearchClient;
import org.opensearch.client.json.jackson.JacksonJsonpMapper;
import org.opensearch.client.transport.ElasticsearchTransport;
import org.opensearch.client.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.opensearch.client.RestClient;
import org.opensearch.client.RestClientBuilder;
import org.junit.Test;

public class MigrateHlrcTest {

    // Fake HLRC -- we don't want to import it for just one example
    public static class RestHighLevelClient {
        public RestHighLevelClient(RestClientBuilder builder) {
        }

        public RestClient getLowLevelClient() {
            return null;
        }
    }

    @Test
    public void migrate() {
        //tag::migrate
        // Create the low-level client
        RestClientBuilder httpClientBuilder = RestClient.builder(
            new HttpHost("localhost", 9200)
        );

        // Create the HLRC
        RestHighLevelClient hlrc = new RestHighLevelClient(httpClientBuilder);

        // Create the new Java Client with the same low level client
        ElasticsearchTransport transport = new RestClientTransport(
            hlrc.getLowLevelClient(),
            new JacksonJsonpMapper()
        );

        OpenSearchClient esClient = new OpenSearchClient(transport);

        // hlrc and esClient share the same httpClient
        //end::migrate
    }
}
