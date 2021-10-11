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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.api.ingest;

import org.opensearch.client.RequestOptions;
import org.opensearch.client.base.ApiClient;
import org.opensearch.client.base.Transport;
import org.opensearch.client.opensearch.ingest.DeletePipelineRequest;
import org.opensearch.client.opensearch.ingest.DeletePipelineResponse;
import org.opensearch.client.opensearch.ingest.GeoIpStatsRequest;
import org.opensearch.client.opensearch.ingest.GeoIpStatsResponse;
import org.opensearch.client.opensearch.ingest.GetPipelineRequest;
import org.opensearch.client.opensearch.ingest.GetPipelineResponse;
import org.opensearch.client.opensearch.ingest.ProcessorGrokRequest;
import org.opensearch.client.opensearch.ingest.ProcessorGrokResponse;
import org.opensearch.client.opensearch.ingest.PutPipelineRequest;
import org.opensearch.client.opensearch.ingest.PutPipelineResponse;
import org.opensearch.client.opensearch.ingest.SimulatePipelineRequest;
import org.opensearch.client.opensearch.ingest.SimulatePipelineResponse;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/**
 * Client for the ingest namespace.
 */
public class IngestAsyncClient extends ApiClient<IngestAsyncClient> {

	public IngestAsyncClient(Transport transport) {
		super(transport, null);
	}

	public IngestAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: ingest.delete_pipeline

	/**
	 * Deletes a pipeline.
	 *
	 */

	public CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeletePipelineRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes a pipeline.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeletePipelineResponse> deletePipeline(
			Function<DeletePipelineRequest.Builder, ObjectBuilder<DeletePipelineRequest>> fn) throws IOException {
		return deletePipeline(fn.apply(new DeletePipelineRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.geo_ip_stats

	/**
	 * Returns statistical information about geoip databases
	 *
	 */
	public CompletableFuture<GeoIpStatsResponse> geoIpStats() throws IOException {
		return this.transport.performRequestAsync(GeoIpStatsRequest.INSTANCE, GeoIpStatsRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Endpoint: ingest.get_pipeline

	/**
	 * Returns a pipeline.
	 *
	 */

	public CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetPipelineRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns a pipeline.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetPipelineResponse> getPipeline(
			Function<GetPipelineRequest.Builder, ObjectBuilder<GetPipelineRequest>> fn) throws IOException {
		return getPipeline(fn.apply(new GetPipelineRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.processor_grok

	/**
	 * Returns a list of the built-in patterns.
	 *
	 */
	public CompletableFuture<ProcessorGrokResponse> processorGrok() throws IOException {
		return this.transport.performRequestAsync(ProcessorGrokRequest.INSTANCE, ProcessorGrokRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Endpoint: ingest.put_pipeline

	/**
	 * Creates or updates a pipeline.
	 *
	 */

	public CompletableFuture<PutPipelineResponse> putPipeline(PutPipelineRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutPipelineRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates or updates a pipeline.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutPipelineResponse> putPipeline(
			Function<PutPipelineRequest.Builder, ObjectBuilder<PutPipelineRequest>> fn) throws IOException {
		return putPipeline(fn.apply(new PutPipelineRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.simulate

	/**
	 * Allows to simulate a pipeline with example documents.
	 *
	 */

	public CompletableFuture<SimulatePipelineResponse> simulate(SimulatePipelineRequest request) throws IOException {
		return this.transport.performRequestAsync(request, SimulatePipelineRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Allows to simulate a pipeline with example documents.
	 *
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<SimulatePipelineResponse> simulate(
			Function<SimulatePipelineRequest.Builder, ObjectBuilder<SimulatePipelineRequest>> fn) throws IOException {
		return simulate(fn.apply(new SimulatePipelineRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #IngestAsyncClient} with specific request options.
	 */
	@Override
	public IngestAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new IngestAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #IngestAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public IngestAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
