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

package org.opensearch.clients.elasticsearch.cluster.stats;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.FieldTypes
@JsonpDeserializable
public class FieldTypes implements JsonpSerializable {
	private final String name;

	private final int count;

	private final int indexCount;

	@Nullable
	private final Integer scriptCount;

	// ---------------------------------------------------------------------------------------------

	private FieldTypes(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.indexCount = ModelTypeHelper.requireNonNull(builder.indexCount, this, "indexCount");
		this.scriptCount = builder.scriptCount;

	}

	public static FieldTypes of(Function<Builder, ObjectBuilder<FieldTypes>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code index_count}
	 */
	public final int indexCount() {
		return this.indexCount;
	}

	/**
	 * API name: {@code script_count}
	 */
	@Nullable
	public final Integer scriptCount() {
		return this.scriptCount;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("index_count");
		generator.write(this.indexCount);

		if (this.scriptCount != null) {
			generator.writeKey("script_count");
			generator.write(this.scriptCount);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldTypes}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FieldTypes> {
		private String name;

		private Integer count;

		private Integer indexCount;

		@Nullable
		private Integer scriptCount;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_count}
		 */
		public final Builder indexCount(int value) {
			this.indexCount = value;
			return this;
		}

		/**
		 * API name: {@code script_count}
		 */
		public final Builder scriptCount(@Nullable Integer value) {
			this.scriptCount = value;
			return this;
		}

		/**
		 * Builds a {@link FieldTypes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldTypes build() {
			_checkSingleUse();

			return new FieldTypes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldTypes}
	 */
	public static final JsonpDeserializer<FieldTypes> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldTypes::setupFieldTypesDeserializer, Builder::build);

	protected static void setupFieldTypesDeserializer(DelegatingDeserializer<FieldTypes.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::indexCount, JsonpDeserializer.integerDeserializer(), "index_count");
		op.add(Builder::scriptCount, JsonpDeserializer.integerDeserializer(), "script_count");

	}

}
