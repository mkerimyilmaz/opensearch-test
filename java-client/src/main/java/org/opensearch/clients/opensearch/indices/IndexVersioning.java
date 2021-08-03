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

package org.opensearch.clients.opensearch.indices;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.Objects;

// typedef: indices._types.IndexVersioning
public final class IndexVersioning implements ToJsonp {
	private final String created;

	// ---------------------------------------------------------------------------------------------

	protected IndexVersioning(Builder builder) {

		this.created = Objects.requireNonNull(builder.created, "created");

	}

	/**
	 * API name: {@code created}
	 */
	public String created() {
		return this.created;
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

		generator.writeKey("created");
		generator.write(this.created);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexVersioning}.
	 */
	public static class Builder implements ObjectBuilder<IndexVersioning> {
		private String created;

		/**
		 * API name: {@code created}
		 */
		public Builder created(String value) {
			this.created = value;
			return this;
		}

		/**
		 * Builds a {@link IndexVersioning}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexVersioning build() {

			return new IndexVersioning(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndexVersioning
	 */
	public static final JsonpDeserializer<IndexVersioning> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexVersioning::setupIndexVersioningDeserializer);

	protected static void setupIndexVersioningDeserializer(DelegatingDeserializer<IndexVersioning.Builder> op) {

		op.add(Builder::created, JsonpDeserializer.stringDeserializer(), "created");

	}

}
