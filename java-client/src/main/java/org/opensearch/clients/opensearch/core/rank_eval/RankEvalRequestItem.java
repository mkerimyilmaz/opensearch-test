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

package org.opensearch.clients.opensearch.core.rank_eval;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonData;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.RankEvalRequestItem
@JsonpDeserializable
public class RankEvalRequestItem implements JsonpSerializable {
	private final String id;

	@Nullable
	private final RankEvalQuery request;

	private final List<DocumentRating> ratings;

	@Nullable
	private final String templateId;

	private final Map<String, JsonData> params;

	// ---------------------------------------------------------------------------------------------

	private RankEvalRequestItem(Builder builder) {

		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.request = builder.request;
		this.ratings = ModelTypeHelper.unmodifiableRequired(builder.ratings, this, "ratings");
		this.templateId = builder.templateId;
		this.params = ModelTypeHelper.unmodifiable(builder.params);

	}

	public static RankEvalRequestItem of(Function<Builder, ObjectBuilder<RankEvalRequestItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The search request’s ID, used to group result details later.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * The query being evaluated.
	 * <p>
	 * API name: {@code request}
	 */
	@Nullable
	public final RankEvalQuery request() {
		return this.request;
	}

	/**
	 * Required - List of document ratings
	 * <p>
	 * API name: {@code ratings}
	 */
	public final List<DocumentRating> ratings() {
		return this.ratings;
	}

	/**
	 * The search template Id
	 * <p>
	 * API name: {@code template_id}
	 */
	@Nullable
	public final String templateId() {
		return this.templateId;
	}

	/**
	 * The search template parameters.
	 * <p>
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
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

		generator.writeKey("id");
		generator.write(this.id);

		if (this.request != null) {
			generator.writeKey("request");
			this.request.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.ratings)) {
			generator.writeKey("ratings");
			generator.writeStartArray();
			for (DocumentRating item0 : this.ratings) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.templateId != null) {
			generator.writeKey("template_id");
			generator.write(this.templateId);

		}
		if (ModelTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalRequestItem}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RankEvalRequestItem> {
		private String id;

		@Nullable
		private RankEvalQuery request;

		private List<DocumentRating> ratings;

		@Nullable
		private String templateId;

		@Nullable
		private Map<String, JsonData> params;

		/**
		 * Required - The search request’s ID, used to group result details later.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * The query being evaluated.
		 * <p>
		 * API name: {@code request}
		 */
		public final Builder request(@Nullable RankEvalQuery value) {
			this.request = value;
			return this;
		}

		/**
		 * The query being evaluated.
		 * <p>
		 * API name: {@code request}
		 */
		public final Builder request(Function<RankEvalQuery.Builder, ObjectBuilder<RankEvalQuery>> fn) {
			return this.request(fn.apply(new RankEvalQuery.Builder()).build());
		}

		/**
		 * Required - List of document ratings
		 * <p>
		 * API name: {@code ratings}
		 */
		public final Builder ratings(List<DocumentRating> value) {
			this.ratings = value;
			return this;
		}

		/**
		 * Required - List of document ratings
		 * <p>
		 * API name: {@code ratings}
		 */
		public final Builder ratings(DocumentRating... value) {
			this.ratings = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - List of document ratings
		 * <p>
		 * API name: {@code ratings}
		 */
		@SafeVarargs
		public final Builder ratings(Function<DocumentRating.Builder, ObjectBuilder<DocumentRating>>... fns) {
			this.ratings = new ArrayList<>(fns.length);
			for (Function<DocumentRating.Builder, ObjectBuilder<DocumentRating>> fn : fns) {
				this.ratings.add(fn.apply(new DocumentRating.Builder()).build());
			}
			return this;
		}

		/**
		 * The search template Id
		 * <p>
		 * API name: {@code template_id}
		 */
		public final Builder templateId(@Nullable String value) {
			this.templateId = value;
			return this;
		}

		/**
		 * The search template parameters.
		 * <p>
		 * API name: {@code params}
		 */
		public final Builder params(@Nullable Map<String, JsonData> value) {
			this.params = value;
			return this;
		}

		/**
		 * Builds a {@link RankEvalRequestItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalRequestItem build() {
			_checkSingleUse();

			return new RankEvalRequestItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalRequestItem}
	 */
	public static final JsonpDeserializer<RankEvalRequestItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RankEvalRequestItem::setupRankEvalRequestItemDeserializer, Builder::build);

	protected static void setupRankEvalRequestItemDeserializer(DelegatingDeserializer<RankEvalRequestItem.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::request, RankEvalQuery._DESERIALIZER, "request");
		op.add(Builder::ratings, JsonpDeserializer.arrayDeserializer(DocumentRating._DESERIALIZER), "ratings");
		op.add(Builder::templateId, JsonpDeserializer.stringDeserializer(), "template_id");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");

	}

}
