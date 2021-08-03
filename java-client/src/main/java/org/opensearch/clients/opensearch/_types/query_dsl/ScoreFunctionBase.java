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
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.function.Function;

// typedef: _types.query_dsl.ScoreFunctionBase
public abstract class ScoreFunctionBase implements ToJsonp {
	@Nullable
	private final QueryContainer filter;

	@Nullable
	private final Number weight;

	// ---------------------------------------------------------------------------------------------

	protected ScoreFunctionBase(AbstractBuilder<?> builder) {

		this.filter = builder.filter;
		this.weight = builder.weight;

	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public QueryContainer filter() {
		return this.filter;
	}

	/**
	 * API name: {@code weight}
	 */
	@Nullable
	public Number weight() {
		return this.weight;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.toJsonp(generator, mapper);

		}
		if (this.weight != null) {

			generator.writeKey("weight");
			generator.write(this.weight.doubleValue());

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private QueryContainer filter;

		@Nullable
		private Number weight;

		/**
		 * API name: {@code filter}
		 */
		public BuilderT filter(@Nullable QueryContainer value) {
			this.filter = value;
			return self();
		}

		/**
		 * API name: {@code filter}
		 */
		public BuilderT filter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.filter(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code weight}
		 */
		public BuilderT weight(@Nullable Number value) {
			this.weight = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupScoreFunctionBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::filter, QueryContainer.DESERIALIZER, "filter");
		op.add(AbstractBuilder::weight, JsonpDeserializer.numberDeserializer(), "weight");

	}

}
