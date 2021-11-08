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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.elasticsearch.core.search.SortOrder;
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

// typedef: ingest._types.SortProcessor
@JsonpDeserializable
public class SortProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	private final SortOrder order;

	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	private SortProcessor(Builder builder) {
		super(builder);

		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.order = ModelTypeHelper.requireNonNull(builder.order, this, "order");
		this.targetField = ModelTypeHelper.requireNonNull(builder.targetField, this, "targetField");

	}

	public static SortProcessor of(Function<Builder, ObjectBuilder<SortProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "sort";
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code order}
	 */
	public final SortOrder order() {
		return this.order;
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

		generator.writeKey("order");
		this.order.serialize(generator, mapper);
		generator.writeKey("target_field");
		generator.write(this.targetField);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SortProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<SortProcessor> {
		private String field;

		private SortOrder order;

		private String targetField;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code order}
		 */
		public final Builder order(SortOrder value) {
			this.order = value;
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
		 * Builds a {@link SortProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SortProcessor build() {
			_checkSingleUse();

			return new SortProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SortProcessor}
	 */
	public static final JsonpDeserializer<SortProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SortProcessor::setupSortProcessorDeserializer, Builder::build);

	protected static void setupSortProcessorDeserializer(DelegatingDeserializer<SortProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::order, SortOrder._DESERIALIZER, "order");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");

	}

}
