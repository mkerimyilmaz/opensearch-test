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

package org.opensearch.client.opensearch.indices.simulate_template;

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

import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: indices.simulate_template.Overlapping
@JsonpDeserializable
public class Overlapping implements JsonpSerializable {
	private final String name;

	private final List<String> indexPatterns;

	// ---------------------------------------------------------------------------------------------

	private Overlapping(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.indexPatterns = ModelTypeHelper.unmodifiableRequired(builder.indexPatterns, this, "indexPatterns");

	}

	public static Overlapping of(Function<Builder, ObjectBuilder<Overlapping>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code index_patterns}
	 */
	public final List<String> indexPatterns() {
		return this.indexPatterns;
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

		generator.writeKey("name");
		generator.write(this.name);

		if (ModelTypeHelper.isDefined(this.indexPatterns)) {
			generator.writeKey("index_patterns");
			generator.writeStartArray();
			for (String item0 : this.indexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Overlapping}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Overlapping> {
		private String name;

		private List<String> indexPatterns;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_patterns}
		 */
		public final Builder indexPatterns(List<String> value) {
			this.indexPatterns = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_patterns}
		 */
		public final Builder indexPatterns(String... value) {
			this.indexPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link Overlapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Overlapping build() {
			_checkSingleUse();

			return new Overlapping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Overlapping}
	 */
	public static final JsonpDeserializer<Overlapping> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Overlapping::setupOverlappingDeserializer, Builder::build);

	protected static void setupOverlappingDeserializer(DelegatingDeserializer<Overlapping.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::indexPatterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"index_patterns");

	}

}
