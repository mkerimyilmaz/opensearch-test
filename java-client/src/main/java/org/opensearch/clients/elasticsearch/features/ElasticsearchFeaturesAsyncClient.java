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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.elasticsearch.features;

import org.opensearch.clients.ApiClient;
import org.opensearch.clients.elasticsearch._types.ElasticsearchException;
import org.opensearch.clients.transport.ElasticsearchTransport;
import org.opensearch.clients.transport.TransportOptions;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

/**
 * Client for the features namespace.
 */
public class ElasticsearchFeaturesAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchFeaturesAsyncClient> {

	public ElasticsearchFeaturesAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchFeaturesAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchFeaturesAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchFeaturesAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: features.get_features

	/**
	 * Gets a list of features which can be included in snapshots using the
	 * feature_states field when creating a snapshot
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-features-api.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetFeaturesResponse> getFeatures() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(GetFeaturesRequest._INSTANCE, GetFeaturesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: features.reset_features

	/**
	 * Resets the internal state of features, usually by deleting system indices
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<ResetFeaturesResponse> resetFeatures() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(ResetFeaturesRequest._INSTANCE, ResetFeaturesRequest._ENDPOINT,
				this.transportOptions);
	}

}
