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

package org.opensearch.client.opensearch._types.mapping;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.UnsignedLongNumberProperty
@JsonpDeserializable
public class UnsignedLongNumberProperty extends NumberPropertyBase implements PropertyVariant {
	@Nullable
	private final Number nullValue;

	// ---------------------------------------------------------------------------------------------

	private UnsignedLongNumberProperty(Builder builder) {
		super(builder);

		this.nullValue = builder.nullValue;

	}

	public static UnsignedLongNumberProperty of(Function<Builder, ObjectBuilder<UnsignedLongNumberProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "unsigned_long";
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public final Number nullValue() {
		return this.nullValue;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "unsigned_long");
		super.serializeInternal(generator, mapper);
		if (this.nullValue != null) {
			generator.writeKey("null_value");
			generator.write(this.nullValue.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UnsignedLongNumberProperty}.
	 */
	public static class Builder extends NumberPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UnsignedLongNumberProperty> {
		@Nullable
		private Number nullValue;

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable Number value) {
			this.nullValue = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UnsignedLongNumberProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UnsignedLongNumberProperty build() {
			_checkSingleUse();

			return new UnsignedLongNumberProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UnsignedLongNumberProperty}
	 */
	public static final JsonpDeserializer<UnsignedLongNumberProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, UnsignedLongNumberProperty::setupUnsignedLongNumberPropertyDeserializer, Builder::build);

	protected static void setupUnsignedLongNumberPropertyDeserializer(
			DelegatingDeserializer<UnsignedLongNumberProperty.Builder> op) {
		setupNumberPropertyBaseDeserializer(op);
		op.add(Builder::nullValue, JsonpDeserializer.numberDeserializer(), "null_value");

		op.ignore("type");
	}

}
