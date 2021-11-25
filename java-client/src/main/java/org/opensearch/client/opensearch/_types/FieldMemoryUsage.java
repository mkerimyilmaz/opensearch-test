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

package org.opensearch.client.opensearch._types;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.FieldMemoryUsage
@JsonpDeserializable
public class FieldMemoryUsage implements JsonpSerializable {
	@Nullable
	private final String memorySize;

	private final long memorySizeInBytes;

	// ---------------------------------------------------------------------------------------------

	private FieldMemoryUsage(Builder builder) {

		this.memorySize = builder.memorySize;
		this.memorySizeInBytes = ModelTypeHelper.requireNonNull(builder.memorySizeInBytes, this, "memorySizeInBytes");

	}

	public static FieldMemoryUsage of(Function<Builder, ObjectBuilder<FieldMemoryUsage>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code memory_size}
	 */
	@Nullable
	public final String memorySize() {
		return this.memorySize;
	}

	/**
	 * Required - API name: {@code memory_size_in_bytes}
	 */
	public final long memorySizeInBytes() {
		return this.memorySizeInBytes;
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

		if (this.memorySize != null) {
			generator.writeKey("memory_size");
			generator.write(this.memorySize);

		}
		generator.writeKey("memory_size_in_bytes");
		generator.write(this.memorySizeInBytes);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldMemoryUsage}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FieldMemoryUsage> {
		@Nullable
		private String memorySize;

		private Long memorySizeInBytes;

		/**
		 * API name: {@code memory_size}
		 */
		public final Builder memorySize(@Nullable String value) {
			this.memorySize = value;
			return this;
		}

		/**
		 * Required - API name: {@code memory_size_in_bytes}
		 */
		public final Builder memorySizeInBytes(long value) {
			this.memorySizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link FieldMemoryUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldMemoryUsage build() {
			_checkSingleUse();

			return new FieldMemoryUsage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldMemoryUsage}
	 */
	public static final JsonpDeserializer<FieldMemoryUsage> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldMemoryUsage::setupFieldMemoryUsageDeserializer, Builder::build);

	protected static void setupFieldMemoryUsageDeserializer(DelegatingDeserializer<FieldMemoryUsage.Builder> op) {

		op.add(Builder::memorySize, JsonpDeserializer.stringDeserializer(), "memory_size");
		op.add(Builder::memorySizeInBytes, JsonpDeserializer.longDeserializer(), "memory_size_in_bytes");

	}

}
