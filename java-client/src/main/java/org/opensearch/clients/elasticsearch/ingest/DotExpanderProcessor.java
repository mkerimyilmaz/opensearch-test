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

package org.opensearch.clients.elasticsearch.ingest;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.DotExpanderProcessor

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/ingest/_types/Processors.ts#L193-L196">API
 *      specification</a>
 */
@JsonpDeserializable
public class DotExpanderProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	@Nullable
	private final String path;

	// ---------------------------------------------------------------------------------------------

	private DotExpanderProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.path = builder.path;

	}

	public static DotExpanderProcessor of(Function<Builder, ObjectBuilder<DotExpanderProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.DotExpander;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code path}
	 */
	@Nullable
	public final String path() {
		return this.path;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (this.path != null) {
			generator.writeKey("path");
			generator.write(this.path);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DotExpanderProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DotExpanderProcessor> {
		private String field;

		@Nullable
		private String path;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code path}
		 */
		public final Builder path(@Nullable String value) {
			this.path = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DotExpanderProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DotExpanderProcessor build() {
			_checkSingleUse();

			return new DotExpanderProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DotExpanderProcessor}
	 */
	public static final JsonpDeserializer<DotExpanderProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DotExpanderProcessor::setupDotExpanderProcessorDeserializer);

	protected static void setupDotExpanderProcessorDeserializer(ObjectDeserializer<DotExpanderProcessor.Builder> op) {
		setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");

	}

}
