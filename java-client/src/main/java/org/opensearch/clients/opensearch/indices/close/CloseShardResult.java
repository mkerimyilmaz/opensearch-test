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

package org.opensearch.clients.opensearch.indices.close;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.opensearch._types.ShardFailure;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices.close.CloseShardResult
public final class CloseShardResult implements ToJsonp {
	private final List<ShardFailure> failures;

	// ---------------------------------------------------------------------------------------------

	protected CloseShardResult(Builder builder) {

		this.failures = Objects.requireNonNull(builder.failures, "failures");

	}

	/**
	 * API name: {@code failures}
	 */
	public List<ShardFailure> failures() {
		return this.failures;
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

		generator.writeKey("failures");
		generator.writeStartArray();
		for (ShardFailure item0 : this.failures) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloseShardResult}.
	 */
	public static class Builder implements ObjectBuilder<CloseShardResult> {
		private List<ShardFailure> failures;

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(List<ShardFailure> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(ShardFailure... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(ShardFailure value) {
			if (this.failures == null) {
				this.failures = new ArrayList<>();
			}
			this.failures.add(value);
			return this;
		}

		/**
		 * Set {@link #failures(List)} to a singleton list.
		 */
		public Builder failures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn) {
			return this.failures(fn.apply(new ShardFailure.Builder()).build());
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn) {
			return this.addFailures(fn.apply(new ShardFailure.Builder()).build());
		}

		/**
		 * Builds a {@link CloseShardResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloseShardResult build() {

			return new CloseShardResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CloseShardResult
	 */
	public static final JsonpDeserializer<CloseShardResult> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CloseShardResult::setupCloseShardResultDeserializer);

	protected static void setupCloseShardResultDeserializer(DelegatingDeserializer<CloseShardResult.Builder> op) {

		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ShardFailure.DESERIALIZER), "failures");

	}

}
