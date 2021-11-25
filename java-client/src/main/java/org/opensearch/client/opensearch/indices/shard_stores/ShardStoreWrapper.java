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

package org.opensearch.client.opensearch.indices.shard_stores;

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: indices.shard_stores.ShardStoreWrapper
@JsonpDeserializable
public class ShardStoreWrapper implements JsonpSerializable {
	private final List<ShardStore> stores;

	// ---------------------------------------------------------------------------------------------

	private ShardStoreWrapper(Builder builder) {

		this.stores = ModelTypeHelper.unmodifiableRequired(builder.stores, this, "stores");

	}

	public static ShardStoreWrapper of(Function<Builder, ObjectBuilder<ShardStoreWrapper>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code stores}
	 */
	public final List<ShardStore> stores() {
		return this.stores;
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

		if (ModelTypeHelper.isDefined(this.stores)) {
			generator.writeKey("stores");
			generator.writeStartArray();
			for (ShardStore item0 : this.stores) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardStoreWrapper}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ShardStoreWrapper> {
		private List<ShardStore> stores;

		/**
		 * Required - API name: {@code stores}
		 */
		public final Builder stores(List<ShardStore> value) {
			this.stores = value;
			return this;
		}

		/**
		 * Required - API name: {@code stores}
		 */
		public final Builder stores(ShardStore... value) {
			this.stores = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code stores}
		 */
		@SafeVarargs
		public final Builder stores(Function<ShardStore.Builder, ObjectBuilder<ShardStore>>... fns) {
			this.stores = new ArrayList<>(fns.length);
			for (Function<ShardStore.Builder, ObjectBuilder<ShardStore>> fn : fns) {
				this.stores.add(fn.apply(new ShardStore.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link ShardStoreWrapper}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardStoreWrapper build() {
			_checkSingleUse();

			return new ShardStoreWrapper(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardStoreWrapper}
	 */
	public static final JsonpDeserializer<ShardStoreWrapper> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardStoreWrapper::setupShardStoreWrapperDeserializer, Builder::build);

	protected static void setupShardStoreWrapperDeserializer(DelegatingDeserializer<ShardStoreWrapper.Builder> op) {

		op.add(Builder::stores, JsonpDeserializer.arrayDeserializer(ShardStore._DESERIALIZER), "stores");

	}

}
