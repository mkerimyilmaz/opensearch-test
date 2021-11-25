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

package org.opensearch.client.opensearch._types.aggregations;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import java.util.function.Function;

// typedef: _types.aggregations.GlobalAggregate
@JsonpDeserializable
public class GlobalAggregate extends SingleBucketAggregateBase implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private GlobalAggregate(Builder builder) {
		super(builder);

	}

	public static GlobalAggregate of(Function<Builder, ObjectBuilder<GlobalAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "global";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GlobalAggregate}.
	 */
	public static class Builder extends SingleBucketAggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GlobalAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GlobalAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GlobalAggregate build() {
			_checkSingleUse();

			return new GlobalAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GlobalAggregate}
	 */
	public static final JsonpDeserializer<GlobalAggregate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GlobalAggregate::setupGlobalAggregateDeserializer, Builder::build);

	protected static void setupGlobalAggregateDeserializer(DelegatingDeserializer<GlobalAggregate.Builder> op) {
		SingleBucketAggregateBase.setupSingleBucketAggregateBaseDeserializer(op);

	}

}
