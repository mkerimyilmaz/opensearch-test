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

package org.opensearch.clients.elasticsearch.api.shutdown;

import org.elasticsearch.client.RequestOptions;
import org.opensearch.clients.base.ApiClient;
import org.opensearch.clients.base.Transport;
import org.opensearch.clients.elasticsearch.shutdown.DeleteNodeRequest;
import org.opensearch.clients.elasticsearch.shutdown.DeleteNodeResponse;
import org.opensearch.clients.elasticsearch.shutdown.GetNodeRequest;
import org.opensearch.clients.elasticsearch.shutdown.GetNodeResponse;
import org.opensearch.clients.elasticsearch.shutdown.PutNodeRequest;
import org.opensearch.clients.elasticsearch.shutdown.PutNodeResponse;
import org.opensearch.clients.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.function.Function;

/**
 * Client for the shutdown namespace.
 */
public class ShutdownClient extends ApiClient<ShutdownClient> {

	public ShutdownClient(Transport transport) {
		super(transport, null);
	}

	public ShutdownClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: shutdown.delete_node

	/**
	 * Removes a node from the shutdown list
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current"
	 */

	public DeleteNodeResponse deleteNode(DeleteNodeRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteNodeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Removes a node from the shutdown list
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final DeleteNodeResponse deleteNode(Function<DeleteNodeRequest.Builder, ObjectBuilder<DeleteNodeRequest>> fn)
			throws IOException {
		return deleteNode(fn.apply(new DeleteNodeRequest.Builder()).build());
	}

	// ----- Endpoint: shutdown.get_node

	/**
	 * Retrieve status of a node or nodes that are currently marked as shutting down
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current"
	 */

	public GetNodeResponse getNode(GetNodeRequest request) throws IOException {
		return this.transport.performRequest(request, GetNodeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieve status of a node or nodes that are currently marked as shutting down
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetNodeResponse getNode(Function<GetNodeRequest.Builder, ObjectBuilder<GetNodeRequest>> fn)
			throws IOException {
		return getNode(fn.apply(new GetNodeRequest.Builder()).build());
	}

	// ----- Endpoint: shutdown.put_node

	/**
	 * Adds a node to be shut down
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current"
	 */

	public PutNodeResponse putNode(PutNodeRequest request) throws IOException {
		return this.transport.performRequest(request, PutNodeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Adds a node to be shut down
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PutNodeResponse putNode(Function<PutNodeRequest.Builder, ObjectBuilder<PutNodeRequest>> fn)
			throws IOException {
		return putNode(fn.apply(new PutNodeRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #ShutdownClient} with specific request options.
	 */
	@Override
	public ShutdownClient withRequestOptions(@Nullable RequestOptions options) {
		return new ShutdownClient(transport, options);
	}

	/**
	 * Creates a new {@link #ShutdownClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public ShutdownClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
