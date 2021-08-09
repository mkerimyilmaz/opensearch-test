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

package org.opensearch.clients.opensearch.integTest;

import org.opensearch.client.RestClient;
import org.opensearch.clients.base.RestClientTransport;
import org.opensearch.clients.base.Transport;
import org.opensearch.clients.json.jackson.JacksonJsonpMapper;
import org.opensearch.clients.opensearch.OpenSearchClient;
import org.opensearch.test.rest.OpenSearchRestTestCase;
import org.junit.AfterClass;
import org.junit.Before;

import java.io.IOException;

public abstract class OpenSearchRestHighLevelClientTestCase extends OpenSearchRestTestCase {

    private static RestClient restClient;
    private static OpenSearchClient restHighLevelClient;

    @Before
    public void initHighLevelClient() throws IOException {
        super.initClient();
        if (restHighLevelClient == null) {
            // Create the low-level client
            restClient = client();
            // Create the transport that provides JSON and http services to API clients
            Transport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());
            // Create API client
            restHighLevelClient = new HighLevelClient(transport);
        }
    }

    protected String getTestRestCluster() {
        String cluster = System.getProperty("tests.rest.cluster");
        if (cluster == null) {
            cluster = "localhost:9200";
        }
        return cluster;
    }

    @AfterClass
    public static void cleanupClient() throws IOException {
        try {
            restClient.close();
        } finally {
            restClient = null;
            restHighLevelClient = null;
        }
    }

    protected static OpenSearchClient highLevelClient() {
        return restHighLevelClient;
    }

    private static class HighLevelClient extends OpenSearchClient {
        private HighLevelClient(Transport transport) {
            super(transport);
        }
    }
}
