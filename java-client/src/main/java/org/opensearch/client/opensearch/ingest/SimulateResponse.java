/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

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

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */
//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.ingest;

import org.opensearch.client.opensearch.ingest.simulate.PipelineSimulation;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: ingest.simulate.Response
@JsonpDeserializable
public class SimulateResponse implements JsonpSerializable {
	private final List<PipelineSimulation> docs;

	// ---------------------------------------------------------------------------------------------

	private SimulateResponse(Builder builder) {

		this.docs = ModelTypeHelper.unmodifiableRequired(builder.docs, this, "docs");

	}

	public static SimulateResponse of(Function<Builder, ObjectBuilder<SimulateResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code docs}
	 */
	public final List<PipelineSimulation> docs() {
		return this.docs;
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

		if (ModelTypeHelper.isDefined(this.docs)) {
			generator.writeKey("docs");
			generator.writeStartArray();
			for (PipelineSimulation item0 : this.docs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulateResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SimulateResponse> {
		private List<PipelineSimulation> docs;

		/**
		 * Required - API name: {@code docs}
		 */
		public final Builder docs(List<PipelineSimulation> value) {
			this.docs = value;
			return this;
		}

		/**
		 * Required - API name: {@code docs}
		 */
		public final Builder docs(PipelineSimulation... value) {
			this.docs = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code docs}
		 */
		@SafeVarargs
		public final Builder docs(Function<PipelineSimulation.Builder, ObjectBuilder<PipelineSimulation>>... fns) {
			this.docs = new ArrayList<>(fns.length);
			for (Function<PipelineSimulation.Builder, ObjectBuilder<PipelineSimulation>> fn : fns) {
				this.docs.add(fn.apply(new PipelineSimulation.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link SimulateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateResponse build() {
			_checkSingleUse();

			return new SimulateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulateResponse}
	 */
	public static final JsonpDeserializer<SimulateResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SimulateResponse::setupSimulateResponseDeserializer, Builder::build);

	protected static void setupSimulateResponseDeserializer(DelegatingDeserializer<SimulateResponse.Builder> op) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(PipelineSimulation._DESERIALIZER), "docs");

	}

}
