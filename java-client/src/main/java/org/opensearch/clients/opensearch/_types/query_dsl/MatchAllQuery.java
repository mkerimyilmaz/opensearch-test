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

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.function.Function;

// typedef: _types.query_dsl.MatchAllQuery

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/query_dsl/MatchAllQuery.ts#L22-L22">API
 *      specification</a>
 */
@JsonpDeserializable
public class MatchAllQuery extends QueryBase implements QueryVariant {
	// ---------------------------------------------------------------------------------------------

	private MatchAllQuery(Builder builder) {
		super(builder);

	}

	public static MatchAllQuery of(Function<Builder, ObjectBuilder<MatchAllQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.MatchAll;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatchAllQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<MatchAllQuery> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MatchAllQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatchAllQuery build() {
			_checkSingleUse();

			return new MatchAllQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatchAllQuery}
	 */
	public static final JsonpDeserializer<MatchAllQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MatchAllQuery::setupMatchAllQueryDeserializer);

	protected static void setupMatchAllQueryDeserializer(ObjectDeserializer<MatchAllQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);

	}

}
