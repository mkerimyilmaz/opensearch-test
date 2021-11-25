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

package org.opensearch.client.opensearch._types.mapping;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.CompletionProperty
@JsonpDeserializable
public class CompletionProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final String analyzer;

	private final List<SuggestContext> contexts;

	@Nullable
	private final Integer maxInputLength;

	@Nullable
	private final Boolean preservePositionIncrements;

	@Nullable
	private final Boolean preserveSeparators;

	@Nullable
	private final String searchAnalyzer;

	// ---------------------------------------------------------------------------------------------

	private CompletionProperty(Builder builder) {
		super(builder);

		this.analyzer = builder.analyzer;
		this.contexts = ModelTypeHelper.unmodifiable(builder.contexts);
		this.maxInputLength = builder.maxInputLength;
		this.preservePositionIncrements = builder.preservePositionIncrements;
		this.preserveSeparators = builder.preserveSeparators;
		this.searchAnalyzer = builder.searchAnalyzer;

	}

	public static CompletionProperty of(Function<Builder, ObjectBuilder<CompletionProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "completion";
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code contexts}
	 */
	public final List<SuggestContext> contexts() {
		return this.contexts;
	}

	/**
	 * API name: {@code max_input_length}
	 */
	@Nullable
	public final Integer maxInputLength() {
		return this.maxInputLength;
	}

	/**
	 * API name: {@code preserve_position_increments}
	 */
	@Nullable
	public final Boolean preservePositionIncrements() {
		return this.preservePositionIncrements;
	}

	/**
	 * API name: {@code preserve_separators}
	 */
	@Nullable
	public final Boolean preserveSeparators() {
		return this.preserveSeparators;
	}

	/**
	 * API name: {@code search_analyzer}
	 */
	@Nullable
	public final String searchAnalyzer() {
		return this.searchAnalyzer;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "completion");
		super.serializeInternal(generator, mapper);
		if (this.analyzer != null) {
			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (ModelTypeHelper.isDefined(this.contexts)) {
			generator.writeKey("contexts");
			generator.writeStartArray();
			for (SuggestContext item0 : this.contexts) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.maxInputLength != null) {
			generator.writeKey("max_input_length");
			generator.write(this.maxInputLength);

		}
		if (this.preservePositionIncrements != null) {
			generator.writeKey("preserve_position_increments");
			generator.write(this.preservePositionIncrements);

		}
		if (this.preserveSeparators != null) {
			generator.writeKey("preserve_separators");
			generator.write(this.preserveSeparators);

		}
		if (this.searchAnalyzer != null) {
			generator.writeKey("search_analyzer");
			generator.write(this.searchAnalyzer);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompletionProperty}.
	 */
	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CompletionProperty> {
		@Nullable
		private String analyzer;

		@Nullable
		private List<SuggestContext> contexts;

		@Nullable
		private Integer maxInputLength;

		@Nullable
		private Boolean preservePositionIncrements;

		@Nullable
		private Boolean preserveSeparators;

		@Nullable
		private String searchAnalyzer;

		/**
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code contexts}
		 */
		public final Builder contexts(@Nullable List<SuggestContext> value) {
			this.contexts = value;
			return this;
		}

		/**
		 * API name: {@code contexts}
		 */
		public final Builder contexts(SuggestContext... value) {
			this.contexts = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code contexts}
		 */
		@SafeVarargs
		public final Builder contexts(Function<SuggestContext.Builder, ObjectBuilder<SuggestContext>>... fns) {
			this.contexts = new ArrayList<>(fns.length);
			for (Function<SuggestContext.Builder, ObjectBuilder<SuggestContext>> fn : fns) {
				this.contexts.add(fn.apply(new SuggestContext.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code max_input_length}
		 */
		public final Builder maxInputLength(@Nullable Integer value) {
			this.maxInputLength = value;
			return this;
		}

		/**
		 * API name: {@code preserve_position_increments}
		 */
		public final Builder preservePositionIncrements(@Nullable Boolean value) {
			this.preservePositionIncrements = value;
			return this;
		}

		/**
		 * API name: {@code preserve_separators}
		 */
		public final Builder preserveSeparators(@Nullable Boolean value) {
			this.preserveSeparators = value;
			return this;
		}

		/**
		 * API name: {@code search_analyzer}
		 */
		public final Builder searchAnalyzer(@Nullable String value) {
			this.searchAnalyzer = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompletionProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompletionProperty build() {
			_checkSingleUse();

			return new CompletionProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompletionProperty}
	 */
	public static final JsonpDeserializer<CompletionProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CompletionProperty::setupCompletionPropertyDeserializer, Builder::build);

	protected static void setupCompletionPropertyDeserializer(DelegatingDeserializer<CompletionProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::contexts, JsonpDeserializer.arrayDeserializer(SuggestContext._DESERIALIZER), "contexts");
		op.add(Builder::maxInputLength, JsonpDeserializer.integerDeserializer(), "max_input_length");
		op.add(Builder::preservePositionIncrements, JsonpDeserializer.booleanDeserializer(),
				"preserve_position_increments");
		op.add(Builder::preserveSeparators, JsonpDeserializer.booleanDeserializer(), "preserve_separators");
		op.add(Builder::searchAnalyzer, JsonpDeserializer.stringDeserializer(), "search_analyzer");

		op.ignore("type");
	}

}
