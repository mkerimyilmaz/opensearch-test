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

package org.opensearch.clients.elasticsearch._types.query_dsl;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: _types.query_dsl.ConstantScoreQuery
@JsonpDeserializable
public class ConstantScoreQuery extends QueryBase implements QueryVariant {
	private final Query filter;

	// ---------------------------------------------------------------------------------------------

	private ConstantScoreQuery(Builder builder) {
		super(builder);

		this.filter = ModelTypeHelper.requireNonNull(builder.filter, this, "filter");

	}

	public static ConstantScoreQuery of(Function<Builder, ObjectBuilder<ConstantScoreQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "constant_score";
	}

	/**
	 * Required - API name: {@code filter}
	 */
	public final Query filter() {
		return this.filter;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("filter");
		this.filter.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ConstantScoreQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ConstantScoreQuery> {
		private Query filter;

		/**
		 * Required - API name: {@code filter}
		 */
		public final Builder filter(Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * Required - API name: {@code filter}
		 */
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ConstantScoreQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ConstantScoreQuery build() {
			_checkSingleUse();

			return new ConstantScoreQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ConstantScoreQuery}
	 */
	public static final JsonpDeserializer<ConstantScoreQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ConstantScoreQuery::setupConstantScoreQueryDeserializer, Builder::build);

	protected static void setupConstantScoreQueryDeserializer(DelegatingDeserializer<ConstantScoreQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::filter, Query._DESERIALIZER, "filter");

	}

}
