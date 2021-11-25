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

import org.opensearch.clients.opensearch._types.ShardFailure;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: indices.close.CloseShardResult
@JsonpDeserializable
public class CloseShardResult implements JsonpSerializable {
	private final List<ShardFailure> failures;

	// ---------------------------------------------------------------------------------------------

	private CloseShardResult(Builder builder) {

		this.failures = ModelTypeHelper.unmodifiableRequired(builder.failures, this, "failures");

	}

	public static CloseShardResult of(Function<Builder, ObjectBuilder<CloseShardResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code failures}
	 */
	public final List<ShardFailure> failures() {
		return this.failures;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ModelTypeHelper.isDefined(this.failures)) {
			generator.writeKey("failures");
			generator.writeStartArray();
			for (ShardFailure item0 : this.failures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloseShardResult}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CloseShardResult> {
		private List<ShardFailure> failures;

		/**
		 * Required - API name: {@code failures}
		 */
		public final Builder failures(List<ShardFailure> value) {
			this.failures = value;
			return this;
		}

		/**
		 * Required - API name: {@code failures}
		 */
		public final Builder failures(ShardFailure... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code failures}
		 */
		@SafeVarargs
		public final Builder failures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>>... fns) {
			this.failures = new ArrayList<>(fns.length);
			for (Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn : fns) {
				this.failures.add(fn.apply(new ShardFailure.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link CloseShardResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloseShardResult build() {
			_checkSingleUse();

			return new CloseShardResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CloseShardResult}
	 */
	public static final JsonpDeserializer<CloseShardResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CloseShardResult::setupCloseShardResultDeserializer, Builder::build);

	protected static void setupCloseShardResultDeserializer(DelegatingDeserializer<CloseShardResult.Builder> op) {

		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ShardFailure._DESERIALIZER), "failures");

	}

}
