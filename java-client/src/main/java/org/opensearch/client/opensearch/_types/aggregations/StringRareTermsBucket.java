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

package org.opensearch.client.opensearch._types.aggregations;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.function.Function;

// typedef: _types.aggregations.StringRareTermsBucket
@JsonpDeserializable
public class StringRareTermsBucket extends MultiBucketBase {
	private final String key;

	// ---------------------------------------------------------------------------------------------

	private StringRareTermsBucket(Builder builder) {
		super(builder);

		this.key = ModelTypeHelper.requireNonNull(builder.key, this, "key");

	}

	public static StringRareTermsBucket of(Function<Builder, ObjectBuilder<StringRareTermsBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code key}
	 */
	public final String key() {
		return this.key;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("key");
		generator.write(this.key);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StringRareTermsBucket}.
	 */
	public static class Builder extends MultiBucketBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StringRareTermsBucket> {
		private String key;

		/**
		 * Required - API name: {@code key}
		 */
		public final Builder key(String value) {
			this.key = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StringRareTermsBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StringRareTermsBucket build() {
			_checkSingleUse();

			return new StringRareTermsBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StringRareTermsBucket}
	 */
	public static final JsonpDeserializer<StringRareTermsBucket> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StringRareTermsBucket::setupStringRareTermsBucketDeserializer, Builder::build);

	protected static void setupStringRareTermsBucketDeserializer(
			DelegatingDeserializer<StringRareTermsBucket.Builder> op) {
		setupMultiBucketBaseDeserializer(op);
		op.add(Builder::key, JsonpDeserializer.stringDeserializer(), "key");

	}

}
