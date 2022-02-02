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

package org.opensearch.clients.elasticsearch._types.query_dsl;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsPrefix

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/query_dsl/fulltext.ts#L110-L114">API
 *      specification</a>
 */
@JsonpDeserializable
public class IntervalsPrefix implements IntervalsQueryVariant, IntervalsVariant, JsonpSerializable {
	@Nullable
	private final String analyzer;

	private final String prefix;

	@Nullable
	private final String useField;

	// ---------------------------------------------------------------------------------------------

	private IntervalsPrefix(Builder builder) {

		this.analyzer = builder.analyzer;
		this.prefix = ApiTypeHelper.requireNonNull(builder.prefix, this, "prefix");
		this.useField = builder.useField;

	}

	public static IntervalsPrefix of(Function<Builder, ObjectBuilder<IntervalsPrefix>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * IntervalsQuery variant kind.
	 */
	@Override
	public IntervalsQuery.Kind _intervalsQueryKind() {
		return IntervalsQuery.Kind.Prefix;
	}

	/**
	 * Intervals variant kind.
	 */
	@Override
	public Intervals.Kind _intervalsKind() {
		return Intervals.Kind.Prefix;
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * Required - API name: {@code prefix}
	 */
	public final String prefix() {
		return this.prefix;
	}

	/**
	 * API name: {@code use_field}
	 */
	@Nullable
	public final String useField() {
		return this.useField;
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

		if (this.analyzer != null) {
			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		generator.writeKey("prefix");
		generator.write(this.prefix);

		if (this.useField != null) {
			generator.writeKey("use_field");
			generator.write(this.useField);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IntervalsPrefix}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IntervalsPrefix> {
		@Nullable
		private String analyzer;

		private String prefix;

		@Nullable
		private String useField;

		/**
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Required - API name: {@code prefix}
		 */
		public final Builder prefix(String value) {
			this.prefix = value;
			return this;
		}

		/**
		 * API name: {@code use_field}
		 */
		public final Builder useField(@Nullable String value) {
			this.useField = value;
			return this;
		}

		/**
		 * Builds a {@link IntervalsPrefix}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IntervalsPrefix build() {
			_checkSingleUse();

			return new IntervalsPrefix(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IntervalsPrefix}
	 */
	public static final JsonpDeserializer<IntervalsPrefix> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IntervalsPrefix::setupIntervalsPrefixDeserializer);

	protected static void setupIntervalsPrefixDeserializer(ObjectDeserializer<IntervalsPrefix.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::prefix, JsonpDeserializer.stringDeserializer(), "prefix");
		op.add(Builder::useField, JsonpDeserializer.stringDeserializer(), "use_field");

	}

}
