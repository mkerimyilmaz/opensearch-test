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

package org.opensearch.client.opensearch.indices;

import org.opensearch.client.opensearch._types.ShardStatistics;
import org.opensearch.client.opensearch.indices.validate_query.IndicesValidationExplanation;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.validate_query.Response
@JsonpDeserializable
public class ValidateQueryResponse implements JsonpSerializable {
	private final List<IndicesValidationExplanation> explanations;

	@Nullable
	private final ShardStatistics shards;

	private final boolean valid;

	@Nullable
	private final String error;

	// ---------------------------------------------------------------------------------------------

	private ValidateQueryResponse(Builder builder) {

		this.explanations = ModelTypeHelper.unmodifiable(builder.explanations);
		this.shards = builder.shards;
		this.valid = ModelTypeHelper.requireNonNull(builder.valid, this, "valid");
		this.error = builder.error;

	}

	public static ValidateQueryResponse of(Function<Builder, ObjectBuilder<ValidateQueryResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code explanations}
	 */
	public final List<IndicesValidationExplanation> explanations() {
		return this.explanations;
	}

	/**
	 * API name: {@code _shards}
	 */
	@Nullable
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code valid}
	 */
	public final boolean valid() {
		return this.valid;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final String error() {
		return this.error;
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

		if (ModelTypeHelper.isDefined(this.explanations)) {
			generator.writeKey("explanations");
			generator.writeStartArray();
			for (IndicesValidationExplanation item0 : this.explanations) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.shards != null) {
			generator.writeKey("_shards");
			this.shards.serialize(generator, mapper);

		}
		generator.writeKey("valid");
		generator.write(this.valid);

		if (this.error != null) {
			generator.writeKey("error");
			generator.write(this.error);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ValidateQueryResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ValidateQueryResponse> {
		@Nullable
		private List<IndicesValidationExplanation> explanations;

		@Nullable
		private ShardStatistics shards;

		private Boolean valid;

		@Nullable
		private String error;

		/**
		 * API name: {@code explanations}
		 */
		public final Builder explanations(@Nullable List<IndicesValidationExplanation> value) {
			this.explanations = value;
			return this;
		}

		/**
		 * API name: {@code explanations}
		 */
		public final Builder explanations(IndicesValidationExplanation... value) {
			this.explanations = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code explanations}
		 */
		@SafeVarargs
		public final Builder explanations(
				Function<IndicesValidationExplanation.Builder, ObjectBuilder<IndicesValidationExplanation>>... fns) {
			this.explanations = new ArrayList<>(fns.length);
			for (Function<IndicesValidationExplanation.Builder, ObjectBuilder<IndicesValidationExplanation>> fn : fns) {
				this.explanations.add(fn.apply(new IndicesValidationExplanation.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public final Builder shards(@Nullable ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public final Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code valid}
		 */
		public final Builder valid(boolean value) {
			this.valid = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable String value) {
			this.error = value;
			return this;
		}

		/**
		 * Builds a {@link ValidateQueryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ValidateQueryResponse build() {
			_checkSingleUse();

			return new ValidateQueryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ValidateQueryResponse}
	 */
	public static final JsonpDeserializer<ValidateQueryResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ValidateQueryResponse::setupValidateQueryResponseDeserializer, Builder::build);

	protected static void setupValidateQueryResponseDeserializer(
			DelegatingDeserializer<ValidateQueryResponse.Builder> op) {

		op.add(Builder::explanations, JsonpDeserializer.arrayDeserializer(IndicesValidationExplanation._DESERIALIZER),
				"explanations");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::valid, JsonpDeserializer.booleanDeserializer(), "valid");
		op.add(Builder::error, JsonpDeserializer.stringDeserializer(), "error");

	}

}
