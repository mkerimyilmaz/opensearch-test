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

package org.opensearch.clients.elasticsearch._types.mapping;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: _types.mapping.VersionProperty

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/mapping/core.ts#L270-L272">API
 *      specification</a>
 */
@JsonpDeserializable
public class VersionProperty extends DocValuesPropertyBase implements PropertyVariant {
	// ---------------------------------------------------------------------------------------------

	private VersionProperty(Builder builder) {
		super(builder);

	}

	public static VersionProperty of(Function<Builder, ObjectBuilder<VersionProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.Version;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "version");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VersionProperty}.
	 */

	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<VersionProperty> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link VersionProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VersionProperty build() {
			_checkSingleUse();

			return new VersionProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link VersionProperty}
	 */
	public static final JsonpDeserializer<VersionProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			VersionProperty::setupVersionPropertyDeserializer);

	protected static void setupVersionPropertyDeserializer(ObjectDeserializer<VersionProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);

		op.ignore("type");
	}

}
