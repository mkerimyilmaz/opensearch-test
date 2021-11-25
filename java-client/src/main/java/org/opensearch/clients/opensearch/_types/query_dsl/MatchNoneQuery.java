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

package org.opensearch.clients.opensearch._types.query_dsl;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.function.Function;

// typedef: _types.query_dsl.MatchNoneQuery
@JsonpDeserializable
public class MatchNoneQuery extends QueryBase implements QueryVariant {
	// ---------------------------------------------------------------------------------------------

	private MatchNoneQuery(Builder builder) {
		super(builder);

	}

	public static MatchNoneQuery of(Function<Builder, ObjectBuilder<MatchNoneQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "match_none";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatchNoneQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<MatchNoneQuery> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MatchNoneQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatchNoneQuery build() {
			_checkSingleUse();

			return new MatchNoneQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatchNoneQuery}
	 */
	public static final JsonpDeserializer<MatchNoneQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MatchNoneQuery::setupMatchNoneQueryDeserializer, Builder::build);

	protected static void setupMatchNoneQueryDeserializer(DelegatingDeserializer<MatchNoneQuery.Builder> op) {
		setupQueryBaseDeserializer(op);

	}

}
