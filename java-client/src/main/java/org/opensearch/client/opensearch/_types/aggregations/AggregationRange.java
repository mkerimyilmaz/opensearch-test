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

package org.opensearch.client.opensearch._types.aggregations;

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;

// typedef: _types.aggregations.AggregationRange
public final class AggregationRange implements ToJsonp {
	@Nullable
	private final JsonValue from;

	@Nullable
	private final String key;

	@Nullable
	private final JsonValue to;

	// ---------------------------------------------------------------------------------------------

	protected AggregationRange(Builder builder) {

		this.from = builder.from;
		this.key = builder.key;
		this.to = builder.to;

	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public JsonValue from() {
		return this.from;
	}

	/**
	 * API name: {@code key}
	 */
	@Nullable
	public String key() {
		return this.key;
	}

	/**
	 * API name: {@code to}
	 */
	@Nullable
	public JsonValue to() {
		return this.to;
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

		if (this.from != null) {

			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.key != null) {

			generator.writeKey("key");
			generator.write(this.key);

		}
		if (this.to != null) {

			generator.writeKey("to");
			generator.write(this.to);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AggregationRange}.
	 */
	public static class Builder implements ObjectBuilder<AggregationRange> {
		@Nullable
		private JsonValue from;

		@Nullable
		private String key;

		@Nullable
		private JsonValue to;

		/**
		 * API name: {@code from}
		 */
		public Builder from(@Nullable JsonValue value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code key}
		 */
		public Builder key(@Nullable String value) {
			this.key = value;
			return this;
		}

		/**
		 * API name: {@code to}
		 */
		public Builder to(@Nullable JsonValue value) {
			this.to = value;
			return this;
		}

		/**
		 * Builds a {@link AggregationRange}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AggregationRange build() {

			return new AggregationRange(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AggregationRange
	 */
	public static final JsonpDeserializer<AggregationRange> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AggregationRange::setupAggregationRangeDeserializer);

	protected static void setupAggregationRangeDeserializer(DelegatingDeserializer<AggregationRange.Builder> op) {

		op.add(Builder::from, JsonpDeserializer.jsonValueDeserializer(), "from");
		op.add(Builder::key, JsonpDeserializer.stringDeserializer(), "key");
		op.add(Builder::to, JsonpDeserializer.jsonValueDeserializer(), "to");

	}

}
