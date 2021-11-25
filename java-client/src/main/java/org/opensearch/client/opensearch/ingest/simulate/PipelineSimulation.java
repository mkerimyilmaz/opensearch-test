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

package org.opensearch.client.opensearch.ingest.simulate;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ActionStatusOptions;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest.simulate.PipelineSimulation
@JsonpDeserializable
public class PipelineSimulation implements JsonpSerializable {
	@Nullable
	private final DocumentSimulation doc;

	private final List<PipelineSimulation> processorResults;

	@Nullable
	private final String tag;

	@Nullable
	private final String processorType;

	@Nullable
	private final ActionStatusOptions status;

	// ---------------------------------------------------------------------------------------------

	private PipelineSimulation(Builder builder) {

		this.doc = builder.doc;
		this.processorResults = ModelTypeHelper.unmodifiable(builder.processorResults);
		this.tag = builder.tag;
		this.processorType = builder.processorType;
		this.status = builder.status;

	}

	public static PipelineSimulation of(Function<Builder, ObjectBuilder<PipelineSimulation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code doc}
	 */
	@Nullable
	public final DocumentSimulation doc() {
		return this.doc;
	}

	/**
	 * API name: {@code processor_results}
	 */
	public final List<PipelineSimulation> processorResults() {
		return this.processorResults;
	}

	/**
	 * API name: {@code tag}
	 */
	@Nullable
	public final String tag() {
		return this.tag;
	}

	/**
	 * API name: {@code processor_type}
	 */
	@Nullable
	public final String processorType() {
		return this.processorType;
	}

	/**
	 * API name: {@code status}
	 */
	@Nullable
	public final ActionStatusOptions status() {
		return this.status;
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

		if (this.doc != null) {
			generator.writeKey("doc");
			this.doc.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.processorResults)) {
			generator.writeKey("processor_results");
			generator.writeStartArray();
			for (PipelineSimulation item0 : this.processorResults) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.tag != null) {
			generator.writeKey("tag");
			generator.write(this.tag);

		}
		if (this.processorType != null) {
			generator.writeKey("processor_type");
			generator.write(this.processorType);

		}
		if (this.status != null) {
			generator.writeKey("status");
			this.status.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PipelineSimulation}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PipelineSimulation> {
		@Nullable
		private DocumentSimulation doc;

		@Nullable
		private List<PipelineSimulation> processorResults;

		@Nullable
		private String tag;

		@Nullable
		private String processorType;

		@Nullable
		private ActionStatusOptions status;

		/**
		 * API name: {@code doc}
		 */
		public final Builder doc(@Nullable DocumentSimulation value) {
			this.doc = value;
			return this;
		}

		/**
		 * API name: {@code doc}
		 */
		public final Builder doc(Function<DocumentSimulation.Builder, ObjectBuilder<DocumentSimulation>> fn) {
			return this.doc(fn.apply(new DocumentSimulation.Builder()).build());
		}

		/**
		 * API name: {@code processor_results}
		 */
		public final Builder processorResults(@Nullable List<PipelineSimulation> value) {
			this.processorResults = value;
			return this;
		}

		/**
		 * API name: {@code processor_results}
		 */
		public final Builder processorResults(PipelineSimulation... value) {
			this.processorResults = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code processor_results}
		 */
		@SafeVarargs
		public final Builder processorResults(
				Function<PipelineSimulation.Builder, ObjectBuilder<PipelineSimulation>>... fns) {
			this.processorResults = new ArrayList<>(fns.length);
			for (Function<PipelineSimulation.Builder, ObjectBuilder<PipelineSimulation>> fn : fns) {
				this.processorResults.add(fn.apply(new PipelineSimulation.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code tag}
		 */
		public final Builder tag(@Nullable String value) {
			this.tag = value;
			return this;
		}

		/**
		 * API name: {@code processor_type}
		 */
		public final Builder processorType(@Nullable String value) {
			this.processorType = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable ActionStatusOptions value) {
			this.status = value;
			return this;
		}

		/**
		 * Builds a {@link PipelineSimulation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PipelineSimulation build() {
			_checkSingleUse();

			return new PipelineSimulation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PipelineSimulation}
	 */
	public static final JsonpDeserializer<PipelineSimulation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PipelineSimulation::setupPipelineSimulationDeserializer, Builder::build);

	protected static void setupPipelineSimulationDeserializer(DelegatingDeserializer<PipelineSimulation.Builder> op) {

		op.add(Builder::doc, DocumentSimulation._DESERIALIZER, "doc");
		op.add(Builder::processorResults, JsonpDeserializer.arrayDeserializer(PipelineSimulation._DESERIALIZER),
				"processor_results");
		op.add(Builder::tag, JsonpDeserializer.stringDeserializer(), "tag");
		op.add(Builder::processorType, JsonpDeserializer.stringDeserializer(), "processor_type");
		op.add(Builder::status, ActionStatusOptions._DESERIALIZER, "status");

	}

}
