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

package org.opensearch.client.opensearch.core.search;

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
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.PointInTimeReference
@JsonpDeserializable
public class PointInTimeReference implements JsonpSerializable {
	private final String id;

	@Nullable
	private final String keepAlive;

	// ---------------------------------------------------------------------------------------------

	private PointInTimeReference(Builder builder) {

		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.keepAlive = builder.keepAlive;

	}

	public static PointInTimeReference of(Function<Builder, ObjectBuilder<PointInTimeReference>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public final String keepAlive() {
		return this.keepAlive;
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

		generator.writeKey("id");
		generator.write(this.id);

		if (this.keepAlive != null) {
			generator.writeKey("keep_alive");
			generator.write(this.keepAlive);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PointInTimeReference}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PointInTimeReference> {
		private String id;

		@Nullable
		private String keepAlive;

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(@Nullable String value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Builds a {@link PointInTimeReference}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PointInTimeReference build() {
			_checkSingleUse();

			return new PointInTimeReference(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PointInTimeReference}
	 */
	public static final JsonpDeserializer<PointInTimeReference> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PointInTimeReference::setupPointInTimeReferenceDeserializer, Builder::build);

	protected static void setupPointInTimeReferenceDeserializer(
			DelegatingDeserializer<PointInTimeReference.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::keepAlive, JsonpDeserializer.stringDeserializer(), "keep_alive");

	}

}
