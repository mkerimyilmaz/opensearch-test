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
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;

import java.lang.Void;
import java.util.function.Function;

// typedef: _types.aggregations.UnmappedRareTermsAggregate
@JsonpDeserializable
public class UnmappedRareTermsAggregate extends MultiBucketAggregateBase<Void> implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private UnmappedRareTermsAggregate(Builder builder) {
		super(builder);

	}

	public static UnmappedRareTermsAggregate of(Function<Builder, ObjectBuilder<UnmappedRareTermsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "umrareterms";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UnmappedRareTermsAggregate}.
	 */
	public static class Builder extends MultiBucketAggregateBase.AbstractBuilder<Void, Builder>
			implements
				ObjectBuilder<UnmappedRareTermsAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UnmappedRareTermsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UnmappedRareTermsAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new UnmappedRareTermsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UnmappedRareTermsAggregate}
	 */
	public static final JsonpDeserializer<UnmappedRareTermsAggregate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, UnmappedRareTermsAggregate::setupUnmappedRareTermsAggregateDeserializer, Builder::build);

	protected static void setupUnmappedRareTermsAggregateDeserializer(
			DelegatingDeserializer<UnmappedRareTermsAggregate.Builder> op) {
		setupMultiBucketAggregateBaseDeserializer(op, JsonpDeserializer.voidDeserializer());

	}

}
