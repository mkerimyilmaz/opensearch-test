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

import org.opensearch.clients.elasticsearch._types.ShardsOperationResponseBase;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;

// typedef: indices.clear_cache.Response
public final class ClearCacheResponse extends ShardsOperationResponseBase {
	// ---------------------------------------------------------------------------------------------

	protected ClearCacheResponse(Builder builder) {
		super(builder);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearCacheResponse}.
	 */
	public static class Builder extends ShardsOperationResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ClearCacheResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClearCacheResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearCacheResponse build() {

			return new ClearCacheResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClearCacheResponse
	 */
	public static final JsonpDeserializer<ClearCacheResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClearCacheResponse::setupClearCacheResponseDeserializer);

	protected static void setupClearCacheResponseDeserializer(DelegatingDeserializer<ClearCacheResponse.Builder> op) {
		ShardsOperationResponseBase.setupShardsOperationResponseBaseDeserializer(op);

	}

}
