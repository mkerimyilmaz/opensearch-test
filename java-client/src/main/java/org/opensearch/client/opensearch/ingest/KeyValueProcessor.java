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

package org.opensearch.client.opensearch.ingest;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.KeyValueProcessor
@JsonpDeserializable
public class KeyValueProcessor extends ProcessorBase implements ProcessorVariant {
	private final List<String> excludeKeys;

	private final String field;

	private final String fieldSplit;

	@Nullable
	private final Boolean ignoreMissing;

	private final List<String> includeKeys;

	@Nullable
	private final String prefix;

	@Nullable
	private final Boolean stripBrackets;

	@Nullable
	private final String targetField;

	@Nullable
	private final String trimKey;

	@Nullable
	private final String trimValue;

	private final String valueSplit;

	// ---------------------------------------------------------------------------------------------

	private KeyValueProcessor(Builder builder) {
		super(builder);

		this.excludeKeys = ModelTypeHelper.unmodifiable(builder.excludeKeys);
		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.fieldSplit = ModelTypeHelper.requireNonNull(builder.fieldSplit, this, "fieldSplit");
		this.ignoreMissing = builder.ignoreMissing;
		this.includeKeys = ModelTypeHelper.unmodifiable(builder.includeKeys);
		this.prefix = builder.prefix;
		this.stripBrackets = builder.stripBrackets;
		this.targetField = builder.targetField;
		this.trimKey = builder.trimKey;
		this.trimValue = builder.trimValue;
		this.valueSplit = ModelTypeHelper.requireNonNull(builder.valueSplit, this, "valueSplit");

	}

	public static KeyValueProcessor of(Function<Builder, ObjectBuilder<KeyValueProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "kv";
	}

	/**
	 * API name: {@code exclude_keys}
	 */
	public final List<String> excludeKeys() {
		return this.excludeKeys;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code field_split}
	 */
	public final String fieldSplit() {
		return this.fieldSplit;
	}

	/**
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * API name: {@code include_keys}
	 */
	public final List<String> includeKeys() {
		return this.includeKeys;
	}

	/**
	 * API name: {@code prefix}
	 */
	@Nullable
	public final String prefix() {
		return this.prefix;
	}

	/**
	 * API name: {@code strip_brackets}
	 */
	@Nullable
	public final Boolean stripBrackets() {
		return this.stripBrackets;
	}

	/**
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * API name: {@code trim_key}
	 */
	@Nullable
	public final String trimKey() {
		return this.trimKey;
	}

	/**
	 * API name: {@code trim_value}
	 */
	@Nullable
	public final String trimValue() {
		return this.trimValue;
	}

	/**
	 * Required - API name: {@code value_split}
	 */
	public final String valueSplit() {
		return this.valueSplit;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.excludeKeys)) {
			generator.writeKey("exclude_keys");
			generator.writeStartArray();
			for (String item0 : this.excludeKeys) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("field_split");
		generator.write(this.fieldSplit);

		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}
		if (ModelTypeHelper.isDefined(this.includeKeys)) {
			generator.writeKey("include_keys");
			generator.writeStartArray();
			for (String item0 : this.includeKeys) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.prefix != null) {
			generator.writeKey("prefix");
			generator.write(this.prefix);

		}
		if (this.stripBrackets != null) {
			generator.writeKey("strip_brackets");
			generator.write(this.stripBrackets);

		}
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}
		if (this.trimKey != null) {
			generator.writeKey("trim_key");
			generator.write(this.trimKey);

		}
		if (this.trimValue != null) {
			generator.writeKey("trim_value");
			generator.write(this.trimValue);

		}
		generator.writeKey("value_split");
		generator.write(this.valueSplit);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KeyValueProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KeyValueProcessor> {
		@Nullable
		private List<String> excludeKeys;

		private String field;

		private String fieldSplit;

		@Nullable
		private Boolean ignoreMissing;

		@Nullable
		private List<String> includeKeys;

		@Nullable
		private String prefix;

		@Nullable
		private Boolean stripBrackets;

		@Nullable
		private String targetField;

		@Nullable
		private String trimKey;

		@Nullable
		private String trimValue;

		private String valueSplit;

		/**
		 * API name: {@code exclude_keys}
		 */
		public final Builder excludeKeys(@Nullable List<String> value) {
			this.excludeKeys = value;
			return this;
		}

		/**
		 * API name: {@code exclude_keys}
		 */
		public final Builder excludeKeys(String... value) {
			this.excludeKeys = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code field_split}
		 */
		public final Builder fieldSplit(String value) {
			this.fieldSplit = value;
			return this;
		}

		/**
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * API name: {@code include_keys}
		 */
		public final Builder includeKeys(@Nullable List<String> value) {
			this.includeKeys = value;
			return this;
		}

		/**
		 * API name: {@code include_keys}
		 */
		public final Builder includeKeys(String... value) {
			this.includeKeys = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code prefix}
		 */
		public final Builder prefix(@Nullable String value) {
			this.prefix = value;
			return this;
		}

		/**
		 * API name: {@code strip_brackets}
		 */
		public final Builder stripBrackets(@Nullable Boolean value) {
			this.stripBrackets = value;
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
		 * API name: {@code trim_key}
		 */
		public final Builder trimKey(@Nullable String value) {
			this.trimKey = value;
			return this;
		}

		/**
		 * API name: {@code trim_value}
		 */
		public final Builder trimValue(@Nullable String value) {
			this.trimValue = value;
			return this;
		}

		/**
		 * Required - API name: {@code value_split}
		 */
		public final Builder valueSplit(String value) {
			this.valueSplit = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KeyValueProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KeyValueProcessor build() {
			_checkSingleUse();

			return new KeyValueProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KeyValueProcessor}
	 */
	public static final JsonpDeserializer<KeyValueProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KeyValueProcessor::setupKeyValueProcessorDeserializer, Builder::build);

	protected static void setupKeyValueProcessorDeserializer(DelegatingDeserializer<KeyValueProcessor.Builder> op) {
		setupProcessorBaseDeserializer(op);
		op.add(Builder::excludeKeys, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"exclude_keys");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::fieldSplit, JsonpDeserializer.stringDeserializer(), "field_split");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::includeKeys, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"include_keys");
		op.add(Builder::prefix, JsonpDeserializer.stringDeserializer(), "prefix");
		op.add(Builder::stripBrackets, JsonpDeserializer.booleanDeserializer(), "strip_brackets");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::trimKey, JsonpDeserializer.stringDeserializer(), "trim_key");
		op.add(Builder::trimValue, JsonpDeserializer.stringDeserializer(), "trim_value");
		op.add(Builder::valueSplit, JsonpDeserializer.stringDeserializer(), "value_split");

	}

}
