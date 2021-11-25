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

// typedef: ingest._types.UserAgentProcessor
@JsonpDeserializable
public class UserAgentProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	private final boolean ignoreMissing;

	private final List<UserAgentProperty> options;

	private final String regexFile;

	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	private UserAgentProcessor(Builder builder) {
		super(builder);

		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.ignoreMissing = ModelTypeHelper.requireNonNull(builder.ignoreMissing, this, "ignoreMissing");
		this.options = ModelTypeHelper.unmodifiableRequired(builder.options, this, "options");
		this.regexFile = ModelTypeHelper.requireNonNull(builder.regexFile, this, "regexFile");
		this.targetField = ModelTypeHelper.requireNonNull(builder.targetField, this, "targetField");

	}

	public static UserAgentProcessor of(Function<Builder, ObjectBuilder<UserAgentProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "user_agent";
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code ignore_missing}
	 */
	public final boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * Required - API name: {@code options}
	 */
	public final List<UserAgentProperty> options() {
		return this.options;
	}

	/**
	 * Required - API name: {@code regex_file}
	 */
	public final String regexFile() {
		return this.regexFile;
	}

	/**
	 * Required - API name: {@code target_field}
	 */
	public final String targetField() {
		return this.targetField;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("ignore_missing");
		generator.write(this.ignoreMissing);

		if (ModelTypeHelper.isDefined(this.options)) {
			generator.writeKey("options");
			generator.writeStartArray();
			for (UserAgentProperty item0 : this.options) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		generator.writeKey("regex_file");
		generator.write(this.regexFile);

		generator.writeKey("target_field");
		generator.write(this.targetField);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UserAgentProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UserAgentProcessor> {
		private String field;

		private Boolean ignoreMissing;

		private List<UserAgentProperty> options;

		private String regexFile;

		private String targetField;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * Required - API name: {@code options}
		 */
		public final Builder options(List<UserAgentProperty> value) {
			this.options = value;
			return this;
		}

		/**
		 * Required - API name: {@code options}
		 */
		public final Builder options(UserAgentProperty... value) {
			this.options = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code regex_file}
		 */
		public final Builder regexFile(String value) {
			this.regexFile = value;
			return this;
		}

		/**
		 * Required - API name: {@code target_field}
		 */
		public final Builder targetField(String value) {
			this.targetField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UserAgentProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UserAgentProcessor build() {
			_checkSingleUse();

			return new UserAgentProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UserAgentProcessor}
	 */
	public static final JsonpDeserializer<UserAgentProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UserAgentProcessor::setupUserAgentProcessorDeserializer, Builder::build);

	protected static void setupUserAgentProcessorDeserializer(DelegatingDeserializer<UserAgentProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::options, JsonpDeserializer.arrayDeserializer(UserAgentProperty._DESERIALIZER), "options");
		op.add(Builder::regexFile, JsonpDeserializer.stringDeserializer(), "regex_file");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");

	}

}
