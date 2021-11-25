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

package org.opensearch.client.opensearch.tasks;

import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch._types.OpensearchException;
import org.opensearch.client.transport.Transport;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.util.ObjectBuilder;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the tasks namespace.
 */
public class OpensearchTasksAsyncClient extends ApiClient<OpensearchTasksAsyncClient> {

	public OpensearchTasksAsyncClient(Transport transport) {
		super(transport, null);
	}

	public OpensearchTasksAsyncClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public OpensearchTasksAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new OpensearchTasksAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: tasks.cancel

	/**
	 * Cancels a task, if it can be cancelled through an API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CancelResponse> cancel(CancelRequest request) throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, CancelRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Cancels a task, if it can be cancelled through an API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CancelRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CancelResponse> cancel(
			Function<CancelRequest.Builder, ObjectBuilder<CancelRequest>> fn)
			throws IOException, OpensearchException {
		return cancel(fn.apply(new CancelRequest.Builder()).build());
	}

	/**
	 * Cancels a task, if it can be cancelled through an API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CancelResponse> cancel() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new CancelRequest.Builder().build(), CancelRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: tasks.get

	/**
	 * Returns information about a task.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTasksResponse> get(GetTasksRequest request) throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, GetTasksRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about a task.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTasksRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetTasksResponse> get(
			Function<GetTasksRequest.Builder, ObjectBuilder<GetTasksRequest>> fn)
			throws IOException, OpensearchException {
		return get(fn.apply(new GetTasksRequest.Builder()).build());
	}

	// ----- Endpoint: tasks.list

	/**
	 * Returns a list of tasks.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ListResponse> list(ListRequest request) throws IOException, OpensearchException {
		return this.transport.performRequestAsync(request, ListRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns a list of tasks.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ListRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ListResponse> list(Function<ListRequest.Builder, ObjectBuilder<ListRequest>> fn)
			throws IOException, OpensearchException {
		return list(fn.apply(new ListRequest.Builder()).build());
	}

	/**
	 * Returns a list of tasks.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ListResponse> list() throws IOException, OpensearchException {
		return this.transport.performRequestAsync(new ListRequest.Builder().build(), ListRequest.ENDPOINT,
				this.transportOptions);
	}

}
