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

package org.opensearch.clients.opensearch.cluster;

import org.opensearch.clients.opensearch.cluster.reroute.RerouteExplanation;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonData;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.reroute.Response
@JsonpDeserializable
public class RerouteResponse implements JsonpSerializable {
	private final List<RerouteExplanation> explanations;

	private final JsonData state;

	// ---------------------------------------------------------------------------------------------

	private RerouteResponse(Builder builder) {

		this.explanations = ModelTypeHelper.unmodifiable(builder.explanations);
		this.state = ModelTypeHelper.requireNonNull(builder.state, this, "state");

	}

	public static RerouteResponse of(Function<Builder, ObjectBuilder<RerouteResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code explanations}
	 */
	public final List<RerouteExplanation> explanations() {
		return this.explanations;
	}

	/**
	 * Required - There aren't any guarantees on the output/structure of the raw
	 * cluster state. Here you will find the internal representation of the cluster,
	 * which can differ from the external representation.
	 * <p>
	 * API name: {@code state}
	 */
	public final JsonData state() {
		return this.state;
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

		if (ModelTypeHelper.isDefined(this.explanations)) {
			generator.writeKey("explanations");
			generator.writeStartArray();
			for (RerouteExplanation item0 : this.explanations) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("state");
		this.state.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RerouteResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RerouteResponse> {
		@Nullable
		private List<RerouteExplanation> explanations;

		private JsonData state;

		/**
		 * API name: {@code explanations}
		 */
		public final Builder explanations(@Nullable List<RerouteExplanation> value) {
			this.explanations = value;
			return this;
		}

		/**
		 * API name: {@code explanations}
		 */
		public final Builder explanations(RerouteExplanation... value) {
			this.explanations = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code explanations}
		 */
		@SafeVarargs
		public final Builder explanations(
				Function<RerouteExplanation.Builder, ObjectBuilder<RerouteExplanation>>... fns) {
			this.explanations = new ArrayList<>(fns.length);
			for (Function<RerouteExplanation.Builder, ObjectBuilder<RerouteExplanation>> fn : fns) {
				this.explanations.add(fn.apply(new RerouteExplanation.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - There aren't any guarantees on the output/structure of the raw
		 * cluster state. Here you will find the internal representation of the cluster,
		 * which can differ from the external representation.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(JsonData value) {
			this.state = value;
			return this;
		}

		/**
		 * Builds a {@link RerouteResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RerouteResponse build() {
			_checkSingleUse();

			return new RerouteResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RerouteResponse}
	 */
	public static final JsonpDeserializer<RerouteResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RerouteResponse::setupRerouteResponseDeserializer, Builder::build);

	protected static void setupRerouteResponseDeserializer(DelegatingDeserializer<RerouteResponse.Builder> op) {

		op.add(Builder::explanations, JsonpDeserializer.arrayDeserializer(RerouteExplanation._DESERIALIZER),
				"explanations");
		op.add(Builder::state, JsonData._DESERIALIZER, "state");

	}

}
