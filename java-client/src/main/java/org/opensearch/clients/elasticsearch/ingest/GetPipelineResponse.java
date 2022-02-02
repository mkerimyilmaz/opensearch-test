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

package org.opensearch.clients.elasticsearch.ingest;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.transport.endpoints.DictionaryResponse;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.function.Function;

// typedef: ingest.get_pipeline.Response

@JsonpDeserializable
public class GetPipelineResponse extends DictionaryResponse<String, Pipeline> {
	// ---------------------------------------------------------------------------------------------

	private GetPipelineResponse(Builder builder) {
		super(builder);

	}

	public static GetPipelineResponse of(Function<Builder, ObjectBuilder<GetPipelineResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetPipelineResponse}.
	 */

	public static class Builder extends DictionaryResponse.AbstractBuilder<String, Pipeline, Builder>
			implements
				ObjectBuilder<GetPipelineResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetPipelineResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetPipelineResponse build() {
			_checkSingleUse();
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new GetPipelineResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetPipelineResponse}
	 */
	public static final JsonpDeserializer<GetPipelineResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetPipelineResponse::setupGetPipelineResponseDeserializer);

	protected static void setupGetPipelineResponseDeserializer(ObjectDeserializer<GetPipelineResponse.Builder> op) {
		DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				Pipeline._DESERIALIZER);

	}

}
