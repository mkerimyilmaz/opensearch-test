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

package org.opensearch.clients.opensearch.snapshot;

import jakarta.json.stream.JsonGenerator;
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

// typedef: snapshot._types.InfoFeatureState
public final class InfoFeatureState implements ToJsonp {
	private final String featureName;

	private final List<String> indices;

	// ---------------------------------------------------------------------------------------------

	protected InfoFeatureState(Builder builder) {

		this.featureName = Objects.requireNonNull(builder.featureName, "feature_name");
		this.indices = Objects.requireNonNull(builder.indices, "indices");

	}

	/**
	 * API name: {@code feature_name}
	 */
	public String featureName() {
		return this.featureName;
	}

	/**
	 * API name: {@code indices}
	 */
	public List<String> indices() {
		return this.indices;
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

		generator.writeKey("feature_name");
		generator.write(this.featureName);

		generator.writeKey("indices");
		generator.writeStartArray();
		for (String item0 : this.indices) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InfoFeatureState}.
	 */
	public static class Builder implements ObjectBuilder<InfoFeatureState> {
		private String featureName;

		private List<String> indices;

		/**
		 * API name: {@code feature_name}
		 */
		public Builder featureName(String value) {
			this.featureName = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(String value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * Builds a {@link InfoFeatureState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InfoFeatureState build() {

			return new InfoFeatureState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for InfoFeatureState
	 */
	public static final JsonpDeserializer<InfoFeatureState> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, InfoFeatureState::setupInfoFeatureStateDeserializer);

	protected static void setupInfoFeatureStateDeserializer(DelegatingDeserializer<InfoFeatureState.Builder> op) {

		op.add(Builder::featureName, JsonpDeserializer.stringDeserializer(), "feature_name");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");

	}

}
