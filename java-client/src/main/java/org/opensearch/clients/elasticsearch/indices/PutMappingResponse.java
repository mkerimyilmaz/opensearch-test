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

import org.opensearch.clients.elasticsearch._types.IndicesResponseBase;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;

// typedef: indices.put_mapping.Response
public final class PutMappingResponse extends IndicesResponseBase {
	// ---------------------------------------------------------------------------------------------

	protected PutMappingResponse(Builder builder) {
		super(builder);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutMappingResponse}.
	 */
	public static class Builder extends IndicesResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutMappingResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutMappingResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutMappingResponse build() {

			return new PutMappingResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutMappingResponse
	 */
	public static final JsonpDeserializer<PutMappingResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutMappingResponse::setupPutMappingResponseDeserializer);

	protected static void setupPutMappingResponseDeserializer(DelegatingDeserializer<PutMappingResponse.Builder> op) {
		IndicesResponseBase.setupIndicesResponseBaseDeserializer(op);

	}

}
