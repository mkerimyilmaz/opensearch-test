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

package org.opensearch.client.opensearch.core;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.JsonpSerializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.msearch.Response

public class MsearchResponse<TDocument> implements JsonpSerializable {
	private final long took;

	private final List<JsonValue /*
									 * Union(_global.msearch.SearchResult<_global.msearch.TDocument> |
									 * _types.ErrorResponseBase)
									 */> responses;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private MsearchResponse(Builder<TDocument> builder) {

		this.took = ModelTypeHelper.requireNonNull(builder.took, this, "took");
		this.responses = ModelTypeHelper.unmodifiableRequired(builder.responses, this, "responses");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> MsearchResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<MsearchResponse<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - API name: {@code took}
	 */
	public final long took() {
		return this.took;
	}

	/**
	 * Required - API name: {@code responses}
	 */
	public final List<JsonValue /*
								 * Union(_global.msearch.SearchResult<_global.msearch.TDocument> |
								 * _types.ErrorResponseBase)
								 */> responses() {
		return this.responses;
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

		generator.writeKey("took");
		generator.write(this.took);

		if (ModelTypeHelper.isDefined(this.responses)) {
			generator.writeKey("responses");
			generator.writeStartArray();
			for (JsonValue /*
							 * Union(_global.msearch.SearchResult<_global.msearch.TDocument> |
							 * _types.ErrorResponseBase)
							 */ item0 : this.responses) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MsearchResponse}.
	 */
	public static class Builder<TDocument> extends ObjectBuilderBase
			implements
				ObjectBuilder<MsearchResponse<TDocument>> {
		private Long took;

		private List<JsonValue /*
								 * Union(_global.msearch.SearchResult<_global.msearch.TDocument> |
								 * _types.ErrorResponseBase)
								 */> responses;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code took}
		 */
		public final Builder<TDocument> took(long value) {
			this.took = value;
			return this;
		}

		/**
		 * Required - API name: {@code responses}
		 */
		public final Builder<TDocument> responses(List<JsonValue /*
																	 * Union(_global.msearch.SearchResult<_global.
																	 * msearch.TDocument> | _types.ErrorResponseBase)
																	 */> value) {
			this.responses = value;
			return this;
		}

		/**
		 * Required - API name: {@code responses}
		 */
		public final Builder<TDocument> responses(JsonValue /*
															 * Union(_global.msearch.SearchResult<_global.msearch.
															 * TDocument> | _types.ErrorResponseBase)
															 */... value) {
			this.responses = Arrays.asList(value);
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link MsearchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MsearchResponse<TDocument> build() {
			_checkSingleUse();

			return new MsearchResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for MsearchResponse
	 */
	public static <TDocument> JsonpDeserializer<MsearchResponse<TDocument>> createMsearchResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> MsearchResponse.setupMsearchResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupMsearchResponseDeserializer(
			DelegatingDeserializer<MsearchResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::responses, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"responses");

	}

}
