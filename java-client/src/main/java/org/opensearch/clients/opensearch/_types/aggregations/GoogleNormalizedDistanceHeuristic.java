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

package org.opensearch.clients.opensearch._types.aggregations;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.GoogleNormalizedDistanceHeuristic
@JsonpDeserializable
public class GoogleNormalizedDistanceHeuristic implements JsonpSerializable {
	@Nullable
	private final Boolean backgroundIsSuperset;

	// ---------------------------------------------------------------------------------------------

	private GoogleNormalizedDistanceHeuristic(Builder builder) {

		this.backgroundIsSuperset = builder.backgroundIsSuperset;

	}

	public static GoogleNormalizedDistanceHeuristic of(
			Function<Builder, ObjectBuilder<GoogleNormalizedDistanceHeuristic>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code background_is_superset}
	 */
	@Nullable
	public final Boolean backgroundIsSuperset() {
		return this.backgroundIsSuperset;
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

		if (this.backgroundIsSuperset != null) {
			generator.writeKey("background_is_superset");
			generator.write(this.backgroundIsSuperset);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GoogleNormalizedDistanceHeuristic}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GoogleNormalizedDistanceHeuristic> {
		@Nullable
		private Boolean backgroundIsSuperset;

		/**
		 * API name: {@code background_is_superset}
		 */
		public final Builder backgroundIsSuperset(@Nullable Boolean value) {
			this.backgroundIsSuperset = value;
			return this;
		}

		/**
		 * Builds a {@link GoogleNormalizedDistanceHeuristic}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GoogleNormalizedDistanceHeuristic build() {
			_checkSingleUse();

			return new GoogleNormalizedDistanceHeuristic(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GoogleNormalizedDistanceHeuristic}
	 */
	public static final JsonpDeserializer<GoogleNormalizedDistanceHeuristic> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GoogleNormalizedDistanceHeuristic::setupGoogleNormalizedDistanceHeuristicDeserializer,
					Builder::build);

	protected static void setupGoogleNormalizedDistanceHeuristicDeserializer(
			DelegatingDeserializer<GoogleNormalizedDistanceHeuristic.Builder> op) {

		op.add(Builder::backgroundIsSuperset, JsonpDeserializer.booleanDeserializer(), "background_is_superset");

	}

}
