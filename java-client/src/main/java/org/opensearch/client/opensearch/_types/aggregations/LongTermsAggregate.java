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

package org.opensearch.client.opensearch._types.aggregations;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import java.util.function.Function;

// typedef: _types.aggregations.LongTermsAggregate
@JsonpDeserializable
public class LongTermsAggregate extends TermsAggregateBase<LongTermsBucket> implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private LongTermsAggregate(Builder builder) {
		super(builder);

	}

	public static LongTermsAggregate of(Function<Builder, ObjectBuilder<LongTermsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "lterms";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LongTermsAggregate}.
	 */
	public static class Builder extends TermsAggregateBase.AbstractBuilder<LongTermsBucket, Builder>
			implements
				ObjectBuilder<LongTermsAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LongTermsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LongTermsAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new LongTermsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LongTermsAggregate}
	 */
	public static final JsonpDeserializer<LongTermsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LongTermsAggregate::setupLongTermsAggregateDeserializer, Builder::build);

	protected static void setupLongTermsAggregateDeserializer(DelegatingDeserializer<LongTermsAggregate.Builder> op) {
		setupTermsAggregateBaseDeserializer(op, LongTermsBucket._DESERIALIZER);

	}

}
