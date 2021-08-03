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
import org.opensearch.clients.opensearch.indices.get_data_stream.IndicesGetDataStreamItem;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices.get_data_stream.Response
public final class GetDataStreamResponse implements ToJsonp {
	private final List<IndicesGetDataStreamItem> dataStreams;

	// ---------------------------------------------------------------------------------------------

	protected GetDataStreamResponse(Builder builder) {

		this.dataStreams = Objects.requireNonNull(builder.dataStreams, "data_streams");

	}

	/**
	 * API name: {@code data_streams}
	 */
	public List<IndicesGetDataStreamItem> dataStreams() {
		return this.dataStreams;
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

		generator.writeKey("data_streams");
		generator.writeStartArray();
		for (IndicesGetDataStreamItem item0 : this.dataStreams) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDataStreamResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetDataStreamResponse> {
		private List<IndicesGetDataStreamItem> dataStreams;

		/**
		 * API name: {@code data_streams}
		 */
		public Builder dataStreams(List<IndicesGetDataStreamItem> value) {
			this.dataStreams = value;
			return this;
		}

		/**
		 * API name: {@code data_streams}
		 */
		public Builder dataStreams(IndicesGetDataStreamItem... value) {
			this.dataStreams = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #dataStreams(List)}, creating the list if needed.
		 */
		public Builder addDataStreams(IndicesGetDataStreamItem value) {
			if (this.dataStreams == null) {
				this.dataStreams = new ArrayList<>();
			}
			this.dataStreams.add(value);
			return this;
		}

		/**
		 * Set {@link #dataStreams(List)} to a singleton list.
		 */
		public Builder dataStreams(
				Function<IndicesGetDataStreamItem.Builder, ObjectBuilder<IndicesGetDataStreamItem>> fn) {
			return this.dataStreams(fn.apply(new IndicesGetDataStreamItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #dataStreams(List)}, creating the list if needed.
		 */
		public Builder addDataStreams(
				Function<IndicesGetDataStreamItem.Builder, ObjectBuilder<IndicesGetDataStreamItem>> fn) {
			return this.addDataStreams(fn.apply(new IndicesGetDataStreamItem.Builder()).build());
		}

		/**
		 * Builds a {@link GetDataStreamResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDataStreamResponse build() {

			return new GetDataStreamResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetDataStreamResponse
	 */
	public static final JsonpDeserializer<GetDataStreamResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetDataStreamResponse::setupGetDataStreamResponseDeserializer);

	protected static void setupGetDataStreamResponseDeserializer(
			DelegatingDeserializer<GetDataStreamResponse.Builder> op) {

		op.add(Builder::dataStreams, JsonpDeserializer.arrayDeserializer(IndicesGetDataStreamItem.DESERIALIZER),
				"data_streams");

	}

}
