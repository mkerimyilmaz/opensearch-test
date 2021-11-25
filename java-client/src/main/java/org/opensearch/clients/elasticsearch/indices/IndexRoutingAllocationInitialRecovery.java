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

package org.opensearch.clients.elasticsearch.indices;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexRoutingAllocationInitialRecovery
@JsonpDeserializable
public class IndexRoutingAllocationInitialRecovery implements JsonpSerializable {
	@Nullable
	private final String id;

	// ---------------------------------------------------------------------------------------------

	private IndexRoutingAllocationInitialRecovery(Builder builder) {

		this.id = builder.id;

	}

	public static IndexRoutingAllocationInitialRecovery of(
			Function<Builder, ObjectBuilder<IndexRoutingAllocationInitialRecovery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code _id}
	 */
	@Nullable
	public final String id() {
		return this.id;
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

		if (this.id != null) {
			generator.writeKey("_id");
			generator.write(this.id);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexRoutingAllocationInitialRecovery}.
	 */
	public static class Builder extends ObjectBuilderBase
			implements
				ObjectBuilder<IndexRoutingAllocationInitialRecovery> {
		@Nullable
		private String id;

		/**
		 * API name: {@code _id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Builds a {@link IndexRoutingAllocationInitialRecovery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRoutingAllocationInitialRecovery build() {
			_checkSingleUse();

			return new IndexRoutingAllocationInitialRecovery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexRoutingAllocationInitialRecovery}
	 */
	public static final JsonpDeserializer<IndexRoutingAllocationInitialRecovery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					IndexRoutingAllocationInitialRecovery::setupIndexRoutingAllocationInitialRecoveryDeserializer,
					Builder::build);

	protected static void setupIndexRoutingAllocationInitialRecoveryDeserializer(
			DelegatingDeserializer<IndexRoutingAllocationInitialRecovery.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");

	}

}
