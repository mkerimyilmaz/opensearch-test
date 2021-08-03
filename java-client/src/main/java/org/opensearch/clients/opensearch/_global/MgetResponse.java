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

package org.opensearch.clients.opensearch._global;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.opensearch._global.mget.Hit;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

// typedef: _global.mget.Response
public final class MgetResponse<TDocument> implements ToJsonp {
	private final List<Hit<TDocument>> docs;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected MgetResponse(Builder<TDocument> builder) {

		this.docs = Objects.requireNonNull(builder.docs, "docs");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code docs}
	 */
	public List<Hit<TDocument>> docs() {
		return this.docs;
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

		generator.writeKey("docs");
		generator.writeStartArray();
		for (Hit<TDocument> item0 : this.docs) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MgetResponse}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<MgetResponse<TDocument>> {
		private List<Hit<TDocument>> docs;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code docs}
		 */
		public Builder<TDocument> docs(List<Hit<TDocument>> value) {
			this.docs = value;
			return this;
		}

		/**
		 * API name: {@code docs}
		 */
		public Builder<TDocument> docs(Hit<TDocument>... value) {
			this.docs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #docs(List)}, creating the list if needed.
		 */
		public Builder<TDocument> addDocs(Hit<TDocument> value) {
			if (this.docs == null) {
				this.docs = new ArrayList<>();
			}
			this.docs.add(value);
			return this;
		}

		/**
		 * Set {@link #docs(List)} to a singleton list.
		 */
		public Builder<TDocument> docs(Function<Hit.Builder<TDocument>, ObjectBuilder<Hit<TDocument>>> fn) {
			return this.docs(fn.apply(new Hit.Builder<TDocument>()).build());
		}

		/**
		 * Add a value to {@link #docs(List)}, creating the list if needed.
		 */
		public Builder<TDocument> addDocs(Function<Hit.Builder<TDocument>, ObjectBuilder<Hit<TDocument>>> fn) {
			return this.addDocs(fn.apply(new Hit.Builder<TDocument>()).build());
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 *
		 */
		public Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link MgetResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MgetResponse<TDocument> build() {

			return new MgetResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for MgetResponse
	 */
	public static <TDocument> JsonpDeserializer<MgetResponse<TDocument>> createMgetResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> MgetResponse.setupMgetResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupMgetResponseDeserializer(
			DelegatingDeserializer<MgetResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(Hit.createHitDeserializer(tDocumentDeserializer)),
				"docs");

	}

}
