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

import org.opensearch.client.opensearch._types.EmptyObject;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: _types.aggregations.SimpleMovingAverageAggregation

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/aggregations/pipeline.ts#L134-L137">API
 *      specification</a>
 */
@JsonpDeserializable
public class SimpleMovingAverageAggregation extends MovingAverageAggregationBase
		implements
			MovingAverageAggregationVariant {
	private final EmptyObject settings;

	// ---------------------------------------------------------------------------------------------

	private SimpleMovingAverageAggregation(Builder builder) {
		super(builder);

		this.settings = ApiTypeHelper.requireNonNull(builder.settings, this, "settings");

	}

	public static SimpleMovingAverageAggregation of(
			Function<Builder, ObjectBuilder<SimpleMovingAverageAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * MovingAverageAggregation variant kind.
	 */
	@Override
	public MovingAverageAggregation.Kind _movingAverageAggregationKind() {
		return MovingAverageAggregation.Kind.Simple;
	}

	/**
	 * Required - API name: {@code settings}
	 */
	public final EmptyObject settings() {
		return this.settings;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("model", "simple");
		super.serializeInternal(generator, mapper);
		generator.writeKey("settings");
		this.settings.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimpleMovingAverageAggregation}.
	 */

	public static class Builder extends MovingAverageAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SimpleMovingAverageAggregation> {
		private EmptyObject settings;

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(EmptyObject value) {
			this.settings = value;
			return this;
		}

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(Function<EmptyObject.Builder, ObjectBuilder<EmptyObject>> fn) {
			return this.settings(fn.apply(new EmptyObject.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SimpleMovingAverageAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimpleMovingAverageAggregation build() {
			_checkSingleUse();

			return new SimpleMovingAverageAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimpleMovingAverageAggregation}
	 */
	public static final JsonpDeserializer<SimpleMovingAverageAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SimpleMovingAverageAggregation::setupSimpleMovingAverageAggregationDeserializer);

	protected static void setupSimpleMovingAverageAggregationDeserializer(
			ObjectDeserializer<SimpleMovingAverageAggregation.Builder> op) {
		MovingAverageAggregationBase.setupMovingAverageAggregationBaseDeserializer(op);
		op.add(Builder::settings, EmptyObject._DESERIALIZER, "settings");

		op.ignore("model");
	}

}
