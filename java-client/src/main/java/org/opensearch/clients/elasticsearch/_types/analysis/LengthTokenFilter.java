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

package org.opensearch.clients.elasticsearch._types.analysis;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.function.Function;

// typedef: _types.analysis.LengthTokenFilter
@JsonpDeserializable
public class LengthTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final int max;

	private final int min;

	// ---------------------------------------------------------------------------------------------

	private LengthTokenFilter(Builder builder) {
		super(builder);

		this.max = ModelTypeHelper.requireNonNull(builder.max, this, "max");
		this.min = ModelTypeHelper.requireNonNull(builder.min, this, "min");

	}

	public static LengthTokenFilter of(Function<Builder, ObjectBuilder<LengthTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "length";
	}

	/**
	 * Required - API name: {@code max}
	 */
	public final int max() {
		return this.max;
	}

	/**
	 * Required - API name: {@code min}
	 */
	public final int min() {
		return this.min;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "length");
		super.serializeInternal(generator, mapper);
		generator.writeKey("max");
		generator.write(this.max);

		generator.writeKey("min");
		generator.write(this.min);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LengthTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<LengthTokenFilter> {
		private Integer max;

		private Integer min;

		/**
		 * Required - API name: {@code max}
		 */
		public final Builder max(int value) {
			this.max = value;
			return this;
		}

		/**
		 * Required - API name: {@code min}
		 */
		public final Builder min(int value) {
			this.min = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LengthTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LengthTokenFilter build() {
			_checkSingleUse();

			return new LengthTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LengthTokenFilter}
	 */
	public static final JsonpDeserializer<LengthTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LengthTokenFilter::setupLengthTokenFilterDeserializer, Builder::build);

	protected static void setupLengthTokenFilterDeserializer(DelegatingDeserializer<LengthTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);
		op.add(Builder::max, JsonpDeserializer.integerDeserializer(), "max");
		op.add(Builder::min, JsonpDeserializer.integerDeserializer(), "min");

		op.ignore("type");
	}

}
