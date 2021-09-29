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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.NestedProperty
@JsonpDeserializable
public final class NestedProperty extends CorePropertyBase implements PropertyVariant {
	@Nullable
	private final Boolean enabled;

	@Nullable
	private final Boolean includeInParent;

	@Nullable
	private final Boolean includeInRoot;

	// ---------------------------------------------------------------------------------------------

	public NestedProperty(Builder builder) {
		super(builder);

		this.enabled = builder.enabled;
		this.includeInParent = builder.includeInParent;
		this.includeInRoot = builder.includeInRoot;

	}

	public NestedProperty(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "nested";
	}

	/**
	 * API name: {@code enabled}
	 */
	@Nullable
	public Boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code include_in_parent}
	 */
	@Nullable
	public Boolean includeInParent() {
		return this.includeInParent;
	}

	/**
	 * API name: {@code include_in_root}
	 */
	@Nullable
	public Boolean includeInRoot() {
		return this.includeInRoot;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "nested");
		super.serializeInternal(generator, mapper);
		if (this.enabled != null) {

			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.includeInParent != null) {

			generator.writeKey("include_in_parent");
			generator.write(this.includeInParent);

		}
		if (this.includeInRoot != null) {

			generator.writeKey("include_in_root");
			generator.write(this.includeInRoot);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NestedProperty}.
	 */
	public static class Builder extends CorePropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<NestedProperty> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private Boolean includeInParent;

		@Nullable
		private Boolean includeInRoot;

		/**
		 * API name: {@code enabled}
		 */
		public Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code include_in_parent}
		 */
		public Builder includeInParent(@Nullable Boolean value) {
			this.includeInParent = value;
			return this;
		}

		/**
		 * API name: {@code include_in_root}
		 */
		public Builder includeInRoot(@Nullable Boolean value) {
			this.includeInRoot = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NestedProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NestedProperty build() {

			return new NestedProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NestedProperty}
	 */
	public static final JsonpDeserializer<NestedProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NestedProperty::setupNestedPropertyDeserializer, Builder::build);

	protected static void setupNestedPropertyDeserializer(DelegatingDeserializer<NestedProperty.Builder> op) {
		CorePropertyBase.setupCorePropertyBaseDeserializer(op);
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::includeInParent, JsonpDeserializer.booleanDeserializer(), "include_in_parent");
		op.add(Builder::includeInRoot, JsonpDeserializer.booleanDeserializer(), "include_in_root");

		op.ignore("type");
	}

}
