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

package org.opensearch.clients.opensearch.ingest;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.DateProcessor
@JsonpDeserializable
public class DateProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	private final List<String> formats;

	@Nullable
	private final String locale;

	@Nullable
	private final String targetField;

	@Nullable
	private final String timezone;

	// ---------------------------------------------------------------------------------------------

	private DateProcessor(Builder builder) {
		super(builder);

		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.formats = ModelTypeHelper.unmodifiableRequired(builder.formats, this, "formats");
		this.locale = builder.locale;
		this.targetField = builder.targetField;
		this.timezone = builder.timezone;

	}

	public static DateProcessor of(Function<Builder, ObjectBuilder<DateProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "date";
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code formats}
	 */
	public final List<String> formats() {
		return this.formats;
	}

	/**
	 * API name: {@code locale}
	 */
	@Nullable
	public final String locale() {
		return this.locale;
	}

	/**
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * API name: {@code timezone}
	 */
	@Nullable
	public final String timezone() {
		return this.timezone;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (ModelTypeHelper.isDefined(this.formats)) {
			generator.writeKey("formats");
			generator.writeStartArray();
			for (String item0 : this.formats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.locale != null) {
			generator.writeKey("locale");
			generator.write(this.locale);

		}
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}
		if (this.timezone != null) {
			generator.writeKey("timezone");
			generator.write(this.timezone);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<DateProcessor> {
		private String field;

		private List<String> formats;

		@Nullable
		private String locale;

		@Nullable
		private String targetField;

		@Nullable
		private String timezone;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code formats}
		 */
		public final Builder formats(List<String> value) {
			this.formats = value;
			return this;
		}

		/**
		 * Required - API name: {@code formats}
		 */
		public final Builder formats(String... value) {
			this.formats = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code locale}
		 */
		public final Builder locale(@Nullable String value) {
			this.locale = value;
			return this;
		}

		/**
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * API name: {@code timezone}
		 */
		public final Builder timezone(@Nullable String value) {
			this.timezone = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DateProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateProcessor build() {
			_checkSingleUse();

			return new DateProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateProcessor}
	 */
	public static final JsonpDeserializer<DateProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DateProcessor::setupDateProcessorDeserializer, Builder::build);

	protected static void setupDateProcessorDeserializer(DelegatingDeserializer<DateProcessor.Builder> op) {
		setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::formats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"formats");
		op.add(Builder::locale, JsonpDeserializer.stringDeserializer(), "locale");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::timezone, JsonpDeserializer.stringDeserializer(), "timezone");

	}

}
