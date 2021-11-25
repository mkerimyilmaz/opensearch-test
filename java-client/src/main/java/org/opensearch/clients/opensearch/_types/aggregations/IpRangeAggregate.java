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

import java.util.function.Function;

// typedef: _types.aggregations.IpRangeAggregate
@JsonpDeserializable
public class IpRangeAggregate extends MultiBucketAggregateBase<IpRangeBucket> implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private IpRangeAggregate(Builder builder) {
		super(builder);

	}

	public static IpRangeAggregate of(Function<Builder, ObjectBuilder<IpRangeAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "ip_range";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IpRangeAggregate}.
	 */
	public static class Builder extends MultiBucketAggregateBase.AbstractBuilder<IpRangeBucket, Builder>
			implements
				ObjectBuilder<IpRangeAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IpRangeAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IpRangeAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new IpRangeAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IpRangeAggregate}
	 */
	public static final JsonpDeserializer<IpRangeAggregate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IpRangeAggregate::setupIpRangeAggregateDeserializer, Builder::build);

	protected static void setupIpRangeAggregateDeserializer(DelegatingDeserializer<IpRangeAggregate.Builder> op) {
		setupMultiBucketAggregateBaseDeserializer(op, IpRangeBucket._DESERIALIZER);

	}

}
