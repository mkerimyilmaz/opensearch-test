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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.DateHistogramBucket
@JsonpDeserializable
public class DateHistogramBucket extends MultiBucketBase {
	@Nullable
	private final String keyAsString;

	private final String key;

	// ---------------------------------------------------------------------------------------------

	private DateHistogramBucket(Builder builder) {
		super(builder);

		this.keyAsString = builder.keyAsString;
		this.key = ModelTypeHelper.requireNonNull(builder.key, this, "key");

	}

	public static DateHistogramBucket of(Function<Builder, ObjectBuilder<DateHistogramBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code key_as_string}
	 */
	@Nullable
	public final String keyAsString() {
		return this.keyAsString;
	}

	/**
	 * Required - API name: {@code key}
	 */
	public final String key() {
		return this.key;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.keyAsString != null) {
			generator.writeKey("key_as_string");
			generator.write(this.keyAsString);

		}
		generator.writeKey("key");
		generator.write(this.key);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateHistogramBucket}.
	 */
	public static class Builder extends MultiBucketBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DateHistogramBucket> {
		@Nullable
		private String keyAsString;

		private String key;

		/**
		 * API name: {@code key_as_string}
		 */
		public final Builder keyAsString(@Nullable String value) {
			this.keyAsString = value;
			return this;
		}

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
		 * Builds a {@link DateHistogramBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateHistogramBucket build() {
			_checkSingleUse();

			return new DateHistogramBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateHistogramBucket}
	 */
	public static final JsonpDeserializer<DateHistogramBucket> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateHistogramBucket::setupDateHistogramBucketDeserializer, Builder::build);

	protected static void setupDateHistogramBucketDeserializer(DelegatingDeserializer<DateHistogramBucket.Builder> op) {
		MultiBucketBase.setupMultiBucketBaseDeserializer(op);
		op.add(Builder::keyAsString, JsonpDeserializer.stringDeserializer(), "key_as_string");
		op.add(Builder::key, JsonpDeserializer.stringDeserializer(), "key");

	}

}
