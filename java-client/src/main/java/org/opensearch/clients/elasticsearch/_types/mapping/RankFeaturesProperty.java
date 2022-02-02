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

// typedef: _types.mapping.RankFeaturesProperty

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/mapping/core.ts#L224-L226">API
 *      specification</a>
 */
@JsonpDeserializable
public class RankFeaturesProperty extends PropertyBase implements PropertyVariant {
	// ---------------------------------------------------------------------------------------------

	private RankFeaturesProperty(Builder builder) {
		super(builder);

	}

	public static RankFeaturesProperty of(Function<Builder, ObjectBuilder<RankFeaturesProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.RankFeatures;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "rank_features");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankFeaturesProperty}.
	 */

	public static class Builder extends PropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RankFeaturesProperty> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankFeaturesProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankFeaturesProperty build() {
			_checkSingleUse();

			return new RankFeaturesProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankFeaturesProperty}
	 */
	public static final JsonpDeserializer<RankFeaturesProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RankFeaturesProperty::setupRankFeaturesPropertyDeserializer);

	protected static void setupRankFeaturesPropertyDeserializer(ObjectDeserializer<RankFeaturesProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);

		op.ignore("type");
	}

}
