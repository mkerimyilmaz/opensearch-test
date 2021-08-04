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

package org.opensearch.clients.opensearch.snapshot;

import org.opensearch.clients.opensearch._types.ErrorResponse;
import org.opensearch.clients.opensearch._types.RequestBase;
import org.opensearch.clients.opensearch._types.Time;
import org.opensearch.clients.transport.Endpoint;
import org.opensearch.clients.transport.endpoints.SimpleEndpoint;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot.delete.Request

/**
 * Deletes a snapshot.
 * 
 */

public class DeleteSnapshotRequest extends RequestBase {
	@Nullable
	private final Time masterTimeout;

	private final String repository;

	private final String snapshot;

	// ---------------------------------------------------------------------------------------------

	private DeleteSnapshotRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.repository = ApiTypeHelper.requireNonNull(builder.repository, this, "repository");
		this.snapshot = ApiTypeHelper.requireNonNull(builder.snapshot, this, "snapshot");

	}

	public static DeleteSnapshotRequest of(Function<Builder, ObjectBuilder<DeleteSnapshotRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Explicit operation timeout for connection to master node
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - A repository name
	 * <p>
	 * API name: {@code repository}
	 */
	public final String repository() {
		return this.repository;
	}

	/**
	 * Required - A snapshot name
	 * <p>
	 * API name: {@code snapshot}
	 */
	public final String snapshot() {
		return this.snapshot;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteSnapshotRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DeleteSnapshotRequest> {
		@Nullable
		private Time masterTimeout;

		private String repository;

		private String snapshot;

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - A repository name
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * Required - A snapshot name
		 * <p>
		 * API name: {@code snapshot}
		 */
		public final Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteSnapshotRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteSnapshotRequest build() {
			_checkSingleUse();

			return new DeleteSnapshotRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.delete}".
	 */
	public static final Endpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/snapshot.delete",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;
				final int _snapshot = 1 << 1;

				int propsSet = 0;

				propsSet |= _repository;
				propsSet |= _snapshot;

				if (propsSet == (_repository | _snapshot)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.repository, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.snapshot, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteSnapshotResponse._DESERIALIZER);
}
