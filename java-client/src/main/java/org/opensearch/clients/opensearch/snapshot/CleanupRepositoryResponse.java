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

package org.opensearch.clients.opensearch.snapshot;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.opensearch.snapshot.cleanup_repository.CleanupRepositoryResults;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.Objects;
import java.util.function.Function;

// typedef: snapshot.cleanup_repository.Response
public final class CleanupRepositoryResponse implements ToJsonp {
	private final CleanupRepositoryResults results;

	// ---------------------------------------------------------------------------------------------

	protected CleanupRepositoryResponse(Builder builder) {

		this.results = Objects.requireNonNull(builder.results, "results");

	}

	/**
	 * API name: {@code results}
	 */
	public CleanupRepositoryResults results() {
		return this.results;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("results");
		this.results.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CleanupRepositoryResponse}.
	 */
	public static class Builder implements ObjectBuilder<CleanupRepositoryResponse> {
		private CleanupRepositoryResults results;

		/**
		 * API name: {@code results}
		 */
		public Builder results(CleanupRepositoryResults value) {
			this.results = value;
			return this;
		}

		/**
		 * API name: {@code results}
		 */
		public Builder results(Function<CleanupRepositoryResults.Builder, ObjectBuilder<CleanupRepositoryResults>> fn) {
			return this.results(fn.apply(new CleanupRepositoryResults.Builder()).build());
		}

		/**
		 * Builds a {@link CleanupRepositoryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CleanupRepositoryResponse build() {

			return new CleanupRepositoryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CleanupRepositoryResponse
	 */
	public static final JsonpDeserializer<CleanupRepositoryResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CleanupRepositoryResponse::setupCleanupRepositoryResponseDeserializer);

	protected static void setupCleanupRepositoryResponseDeserializer(
			DelegatingDeserializer<CleanupRepositoryResponse.Builder> op) {

		op.add(Builder::results, CleanupRepositoryResults.DESERIALIZER, "results");

	}

}
