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

package org.opensearch.clients.opensearch._types.aggregations;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.DateRangeExpression

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/aggregations/bucket.ts#L144-L148">API
 *      specification</a>
 */
@JsonpDeserializable
public class DateRangeExpression implements JsonpSerializable {
	@Nullable
	private final FieldDateMath from;

	@Nullable
	private final String key;

	@Nullable
	private final FieldDateMath to;

	// ---------------------------------------------------------------------------------------------

	private DateRangeExpression(Builder builder) {

		this.from = builder.from;
		this.key = builder.key;
		this.to = builder.to;

	}

	public static DateRangeExpression of(Function<Builder, ObjectBuilder<DateRangeExpression>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public final FieldDateMath from() {
		return this.from;
	}

	/**
	 * API name: {@code key}
	 */
	@Nullable
	public final String key() {
		return this.key;
	}

	/**
	 * API name: {@code to}
	 */
	@Nullable
	public final FieldDateMath to() {
		return this.to;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.from != null) {
			generator.writeKey("from");
			this.from.serialize(generator, mapper);

		}
		if (this.key != null) {
			generator.writeKey("key");
			generator.write(this.key);

		}
		if (this.to != null) {
			generator.writeKey("to");
			this.to.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateRangeExpression}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DateRangeExpression> {
		@Nullable
		private FieldDateMath from;

		@Nullable
		private String key;

		@Nullable
		private FieldDateMath to;

		/**
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable FieldDateMath value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public final Builder from(Function<FieldDateMath.Builder, ObjectBuilder<FieldDateMath>> fn) {
			return this.from(fn.apply(new FieldDateMath.Builder()).build());
		}

		/**
		 * API name: {@code key}
		 */
		public final Builder key(@Nullable String value) {
			this.key = value;
			return this;
		}

		/**
		 * API name: {@code to}
		 */
		public final Builder to(@Nullable FieldDateMath value) {
			this.to = value;
			return this;
		}

		/**
		 * API name: {@code to}
		 */
		public final Builder to(Function<FieldDateMath.Builder, ObjectBuilder<FieldDateMath>> fn) {
			return this.to(fn.apply(new FieldDateMath.Builder()).build());
		}

		/**
		 * Builds a {@link DateRangeExpression}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateRangeExpression build() {
			_checkSingleUse();

			return new DateRangeExpression(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateRangeExpression}
	 */
	public static final JsonpDeserializer<DateRangeExpression> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateRangeExpression::setupDateRangeExpressionDeserializer);

	protected static void setupDateRangeExpressionDeserializer(ObjectDeserializer<DateRangeExpression.Builder> op) {

		op.add(Builder::from, FieldDateMath._DESERIALIZER, "from");
		op.add(Builder::key, JsonpDeserializer.stringDeserializer(), "key");
		op.add(Builder::to, FieldDateMath._DESERIALIZER, "to");

	}

}
