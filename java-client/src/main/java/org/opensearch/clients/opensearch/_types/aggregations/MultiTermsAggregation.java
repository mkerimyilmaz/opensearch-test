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

package org.opensearch.clients.opensearch._types.aggregations;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: _types.aggregations.MultiTermsAggregation
@JsonpDeserializable
public class MultiTermsAggregation extends BucketAggregationBase implements AggregationVariant {
	private final List<MultiTermLookup> terms;

	// ---------------------------------------------------------------------------------------------

	private MultiTermsAggregation(Builder builder) {
		super(builder);

		this.terms = ModelTypeHelper.unmodifiableRequired(builder.terms, this, "terms");

	}

	public static MultiTermsAggregation of(Function<Builder, ObjectBuilder<MultiTermsAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "multi_terms";
	}

	/**
	 * Required - API name: {@code terms}
	 */
	public final List<MultiTermLookup> terms() {
		return this.terms;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.terms)) {
			generator.writeKey("terms");
			generator.writeStartArray();
			for (MultiTermLookup item0 : this.terms) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultiTermsAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MultiTermsAggregation> {
		private List<MultiTermLookup> terms;

		/**
		 * Required - API name: {@code terms}
		 */
		public final Builder terms(List<MultiTermLookup> value) {
			this.terms = value;
			return this;
		}

		/**
		 * Required - API name: {@code terms}
		 */
		public final Builder terms(MultiTermLookup... value) {
			this.terms = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code terms}
		 */
		@SafeVarargs
		public final Builder terms(Function<MultiTermLookup.Builder, ObjectBuilder<MultiTermLookup>>... fns) {
			this.terms = new ArrayList<>(fns.length);
			for (Function<MultiTermLookup.Builder, ObjectBuilder<MultiTermLookup>> fn : fns) {
				this.terms.add(fn.apply(new MultiTermLookup.Builder()).build());
			}
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MultiTermsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultiTermsAggregation build() {
			_checkSingleUse();

			return new MultiTermsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MultiTermsAggregation}
	 */
	public static final JsonpDeserializer<MultiTermsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MultiTermsAggregation::setupMultiTermsAggregationDeserializer, Builder::build);

	protected static void setupMultiTermsAggregationDeserializer(
			DelegatingDeserializer<MultiTermsAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::terms, JsonpDeserializer.arrayDeserializer(MultiTermLookup._DESERIALIZER), "terms");

	}

}
