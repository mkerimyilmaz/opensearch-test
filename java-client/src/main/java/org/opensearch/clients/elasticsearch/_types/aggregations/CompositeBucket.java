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

package org.opensearch.clients.elasticsearch._types.aggregations;

import org.opensearch.clients.json.JsonData;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Map;
import java.util.function.Function;

// typedef: _types.aggregations.CompositeBucket

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/aggregations/Aggregate.ts#L580-L582">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompositeBucket extends MultiBucketBase {
	private final Map<String, JsonData> key;

	// ---------------------------------------------------------------------------------------------

	private CompositeBucket(Builder builder) {
		super(builder);

		this.key = ApiTypeHelper.unmodifiableRequired(builder.key, this, "key");

	}

	public static CompositeBucket of(Function<Builder, ObjectBuilder<CompositeBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code key}
	 */
	public final Map<String, JsonData> key() {
		return this.key;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.key)) {
			generator.writeKey("key");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.key.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompositeBucket}.
	 */

	public static class Builder extends MultiBucketBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CompositeBucket> {
		private Map<String, JsonData> key;

		/**
		 * Required - API name: {@code key}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>key</code>.
		 */
		public final Builder key(Map<String, JsonData> map) {
			this.key = _mapPutAll(this.key, map);
			return this;
		}

		/**
		 * Required - API name: {@code key}
		 * <p>
		 * Adds an entry to <code>key</code>.
		 */
		public final Builder key(String key, JsonData value) {
			this.key = _mapPut(this.key, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompositeBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompositeBucket build() {
			_checkSingleUse();

			return new CompositeBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompositeBucket}
	 */
	public static final JsonpDeserializer<CompositeBucket> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CompositeBucket::setupCompositeBucketDeserializer);

	protected static void setupCompositeBucketDeserializer(ObjectDeserializer<CompositeBucket.Builder> op) {
		MultiBucketBase.setupMultiBucketBaseDeserializer(op);
		op.add(Builder::key, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "key");

	}

}
