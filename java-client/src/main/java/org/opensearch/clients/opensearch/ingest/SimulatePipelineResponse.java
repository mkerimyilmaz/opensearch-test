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

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.opensearch.ingest.simulate_pipeline.PipelineSimulation;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

// typedef: ingest.simulate_pipeline.Response
public final class SimulatePipelineResponse implements ToJsonp {
	private final List<PipelineSimulation> docs;

	// ---------------------------------------------------------------------------------------------

	protected SimulatePipelineResponse(Builder builder) {

		this.docs = Objects.requireNonNull(builder.docs, "docs");

	}

	/**
	 * API name: {@code docs}
	 */
	public List<PipelineSimulation> docs() {
		return this.docs;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("docs");
		generator.writeStartArray();
		for (PipelineSimulation item0 : this.docs) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulatePipelineResponse}.
	 */
	public static class Builder implements ObjectBuilder<SimulatePipelineResponse> {
		private List<PipelineSimulation> docs;

		/**
		 * API name: {@code docs}
		 */
		public Builder docs(List<PipelineSimulation> value) {
			this.docs = value;
			return this;
		}

		/**
		 * API name: {@code docs}
		 */
		public Builder docs(PipelineSimulation... value) {
			this.docs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #docs(List)}, creating the list if needed.
		 */
		public Builder addDocs(PipelineSimulation value) {
			if (this.docs == null) {
				this.docs = new ArrayList<>();
			}
			this.docs.add(value);
			return this;
		}

		/**
		 * Set {@link #docs(List)} to a singleton list.
		 */
		public Builder docs(Function<PipelineSimulation.Builder, ObjectBuilder<PipelineSimulation>> fn) {
			return this.docs(fn.apply(new PipelineSimulation.Builder()).build());
		}

		/**
		 * Add a value to {@link #docs(List)}, creating the list if needed.
		 */
		public Builder addDocs(Function<PipelineSimulation.Builder, ObjectBuilder<PipelineSimulation>> fn) {
			return this.addDocs(fn.apply(new PipelineSimulation.Builder()).build());
		}

		/**
		 * Builds a {@link SimulatePipelineResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulatePipelineResponse build() {

			return new SimulatePipelineResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SimulatePipelineResponse
	 */
	public static final JsonpDeserializer<SimulatePipelineResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SimulatePipelineResponse::setupSimulatePipelineResponseDeserializer);

	protected static void setupSimulatePipelineResponseDeserializer(
			DelegatingDeserializer<SimulatePipelineResponse.Builder> op) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(PipelineSimulation.DESERIALIZER), "docs");

	}

}
