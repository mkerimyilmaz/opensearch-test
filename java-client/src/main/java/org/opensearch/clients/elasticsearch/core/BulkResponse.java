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

package org.opensearch.clients.elasticsearch.core;

import org.opensearch.clients.elasticsearch.core.bulk.ResponseItem;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.lang.Boolean;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.bulk.Response
@JsonpDeserializable
public class BulkResponse implements JsonpSerializable {
	private final boolean errors;

	private final List<ResponseItem> items;

	private final long took;

	@Nullable
	private final Long ingestTook;

	// ---------------------------------------------------------------------------------------------

	private BulkResponse(Builder builder) {

		this.errors = ModelTypeHelper.requireNonNull(builder.errors, this, "errors");
		this.items = ModelTypeHelper.unmodifiableRequired(builder.items, this, "items");
		this.took = ModelTypeHelper.requireNonNull(builder.took, this, "took");
		this.ingestTook = builder.ingestTook;

	}

	public static BulkResponse of(Function<Builder, ObjectBuilder<BulkResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code errors}
	 */
	public final boolean errors() {
		return this.errors;
	}

	/**
	 * Required - API name: {@code items}
	 */
	public final List<ResponseItem> items() {
		return this.items;
	}

	/**
	 * Required - API name: {@code took}
	 */
	public final long took() {
		return this.took;
	}

	/**
	 * API name: {@code ingest_took}
	 */
	@Nullable
	public final Long ingestTook() {
		return this.ingestTook;
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

		generator.writeKey("errors");
		generator.write(this.errors);

		if (ModelTypeHelper.isDefined(this.items)) {
			generator.writeKey("items");
			generator.writeStartArray();
			for (ResponseItem item0 : this.items) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("took");
		generator.write(this.took);

		if (this.ingestTook != null) {
			generator.writeKey("ingest_took");
			generator.write(this.ingestTook);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<BulkResponse> {
		private Boolean errors;

		private List<ResponseItem> items;

		private Long took;

		@Nullable
		private Long ingestTook;

		/**
		 * Required - API name: {@code errors}
		 */
		public final Builder errors(boolean value) {
			this.errors = value;
			return this;
		}

		/**
		 * Required - API name: {@code items}
		 */
		public final Builder items(List<ResponseItem> value) {
			this.items = value;
			return this;
		}

		/**
		 * Required - API name: {@code items}
		 */
		public final Builder items(ResponseItem... value) {
			this.items = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code items}
		 */
		@SafeVarargs
		public final Builder items(Function<ResponseItem.Builder, ObjectBuilder<ResponseItem>>... fns) {
			this.items = new ArrayList<>(fns.length);
			for (Function<ResponseItem.Builder, ObjectBuilder<ResponseItem>> fn : fns) {
				this.items.add(fn.apply(new ResponseItem.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code took}
		 */
		public final Builder took(long value) {
			this.took = value;
			return this;
		}

		/**
		 * API name: {@code ingest_took}
		 */
		public final Builder ingestTook(@Nullable Long value) {
			this.ingestTook = value;
			return this;
		}

		/**
		 * Builds a {@link BulkResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkResponse build() {
			_checkSingleUse();

			return new BulkResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BulkResponse}
	 */
	public static final JsonpDeserializer<BulkResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BulkResponse::setupBulkResponseDeserializer, Builder::build);

	protected static void setupBulkResponseDeserializer(DelegatingDeserializer<BulkResponse.Builder> op) {

		op.add(Builder::errors, JsonpDeserializer.booleanDeserializer(), "errors");
		op.add(Builder::items, JsonpDeserializer.arrayDeserializer(ResponseItem._DESERIALIZER), "items");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::ingestTook, JsonpDeserializer.longDeserializer(), "ingest_took");

	}

}
