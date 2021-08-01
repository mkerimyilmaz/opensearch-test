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

import org.opensearch.clients.elasticsearch._types.AcknowledgedResponseBase;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

// typedef: ingest.put_pipeline.Response
public final class PutPipelineResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	protected PutPipelineResponse(Builder builder) {
		super(builder);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutPipelineResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutPipelineResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutPipelineResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutPipelineResponse build() {

			return new PutPipelineResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutPipelineResponse
	 */
	public static final JsonpDeserializer<PutPipelineResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutPipelineResponse::setupPutPipelineResponseDeserializer);

	protected static void setupPutPipelineResponseDeserializer(DelegatingDeserializer<PutPipelineResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);

	}

}
