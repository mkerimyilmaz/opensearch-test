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

package org.opensearch.clients.opensearch._global.search;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.Objects;

// typedef: _global.search._types.LaplaceSmoothingModel
public final class LaplaceSmoothingModel implements ToJsonp {
	private final Number alpha;

	// ---------------------------------------------------------------------------------------------

	protected LaplaceSmoothingModel(Builder builder) {

		this.alpha = Objects.requireNonNull(builder.alpha, "alpha");

	}

	/**
	 * API name: {@code alpha}
	 */
	public Number alpha() {
		return this.alpha;
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

		generator.writeKey("alpha");
		generator.write(this.alpha.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LaplaceSmoothingModel}.
	 */
	public static class Builder implements ObjectBuilder<LaplaceSmoothingModel> {
		private Number alpha;

		/**
		 * API name: {@code alpha}
		 */
		public Builder alpha(Number value) {
			this.alpha = value;
			return this;
		}

		/**
		 * Builds a {@link LaplaceSmoothingModel}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LaplaceSmoothingModel build() {

			return new LaplaceSmoothingModel(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for LaplaceSmoothingModel
	 */
	public static final JsonpDeserializer<LaplaceSmoothingModel> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, LaplaceSmoothingModel::setupLaplaceSmoothingModelDeserializer);

	protected static void setupLaplaceSmoothingModelDeserializer(
			DelegatingDeserializer<LaplaceSmoothingModel.Builder> op) {

		op.add(Builder::alpha, JsonpDeserializer.numberDeserializer(), "alpha");

	}

}
