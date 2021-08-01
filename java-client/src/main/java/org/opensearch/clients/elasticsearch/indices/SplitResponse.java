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

import org.opensearch.clients.elasticsearch._types.AcknowledgedResponseBase;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.split.Response
public final class SplitResponse extends AcknowledgedResponseBase {
	private final Boolean shardsAcknowledged;

	private final String index;

	// ---------------------------------------------------------------------------------------------

	protected SplitResponse(Builder builder) {
		super(builder);
		this.shardsAcknowledged = Objects.requireNonNull(builder.shardsAcknowledged, "shards_acknowledged");
		this.index = Objects.requireNonNull(builder.index, "index");

	}

	/**
	 * API name: {@code shards_acknowledged}
	 */
	public Boolean shardsAcknowledged() {
		return this.shardsAcknowledged;
	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("shards_acknowledged");
		generator.write(this.shardsAcknowledged);

		generator.writeKey("index");
		generator.write(this.index);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SplitResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SplitResponse> {
		private Boolean shardsAcknowledged;

		private String index;

		/**
		 * API name: {@code shards_acknowledged}
		 */
		public Builder shardsAcknowledged(Boolean value) {
			this.shardsAcknowledged = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SplitResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SplitResponse build() {

			return new SplitResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SplitResponse
	 */
	public static final JsonpDeserializer<SplitResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SplitResponse::setupSplitResponseDeserializer);

	protected static void setupSplitResponseDeserializer(DelegatingDeserializer<SplitResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::shardsAcknowledged, JsonpDeserializer.booleanDeserializer(), "shards_acknowledged");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");

	}

}
