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

import org.opensearch.clients.opensearch._types.AcknowledgedResponseBase;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.function.Function;

// typedef: indices.migrate_to_data_stream.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/indices/migrate_to_data_stream/IndicesMigrateToDataStreamResponse.ts#L22-L22">API
 *      specification</a>
 */
@JsonpDeserializable
public class MigrateToDataStreamResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	private MigrateToDataStreamResponse(Builder builder) {
		super(builder);

	}

	public static MigrateToDataStreamResponse of(Function<Builder, ObjectBuilder<MigrateToDataStreamResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MigrateToDataStreamResponse}.
	 */

	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MigrateToDataStreamResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MigrateToDataStreamResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MigrateToDataStreamResponse build() {
			_checkSingleUse();

			return new MigrateToDataStreamResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MigrateToDataStreamResponse}
	 */
	public static final JsonpDeserializer<MigrateToDataStreamResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MigrateToDataStreamResponse::setupMigrateToDataStreamResponseDeserializer);

	protected static void setupMigrateToDataStreamResponseDeserializer(
			ObjectDeserializer<MigrateToDataStreamResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);

	}

}
