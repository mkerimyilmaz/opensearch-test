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

package org.opensearch.clients.opensearch._types.query_dsl;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.function.Function;

// typedef: _types.query_dsl.ConstantScoreQuery
public final class ConstantScoreQuery extends QueryBase {
	@Nullable
	private final QueryContainer filter;

	// ---------------------------------------------------------------------------------------------

	protected ConstantScoreQuery(Builder builder) {
		super(builder);
		this.filter = builder.filter;

	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public QueryContainer filter() {
		return this.filter;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ConstantScoreQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ConstantScoreQuery> {
		@Nullable
		private QueryContainer filter;

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable QueryContainer value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.filter(fn.apply(new QueryContainer.Builder()).build());
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

			return new ConstantScoreQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ConstantScoreQuery
	 */
	public static final JsonpDeserializer<ConstantScoreQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ConstantScoreQuery::setupConstantScoreQueryDeserializer);

	protected static void setupConstantScoreQueryDeserializer(DelegatingDeserializer<ConstantScoreQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::filter, QueryContainer.DESERIALIZER, "filter");

	}

}
