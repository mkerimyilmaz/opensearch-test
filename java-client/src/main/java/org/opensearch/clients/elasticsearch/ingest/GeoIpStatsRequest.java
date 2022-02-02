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

package org.opensearch.clients.elasticsearch.ingest;

import org.opensearch.clients.elasticsearch._types.ErrorResponse;
import org.opensearch.clients.elasticsearch._types.RequestBase;
import org.opensearch.clients.transport.Endpoint;
import org.opensearch.clients.transport.endpoints.SimpleEndpoint;

import java.util.Collections;

// typedef: ingest.geo_ip_stats.Request

/**
 * Returns statistical information about geoip databases
 * 
 */

public class GeoIpStatsRequest extends RequestBase {
	public GeoIpStatsRequest() {
	}

	/**
	 * Singleton instance for {@link GeoIpStatsRequest}.
	 */
	public static final GeoIpStatsRequest _INSTANCE = new GeoIpStatsRequest();

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ingest.geo_ip_stats}".
	 */
	public static final Endpoint<GeoIpStatsRequest, GeoIpStatsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ingest.geo_ip_stats",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_ingest/geoip/stats";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GeoIpStatsResponse._DESERIALIZER);
}
