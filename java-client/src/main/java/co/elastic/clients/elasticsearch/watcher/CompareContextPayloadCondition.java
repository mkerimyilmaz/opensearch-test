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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher._types.CompareContextPayloadCondition
public final class CompareContextPayloadCondition implements JsonpSerializable {
	@Nullable
	private final JsonData eq;

	@Nullable
	private final JsonData lt;

	@Nullable
	private final JsonData gt;

	@Nullable
	private final JsonData lte;

	@Nullable
	private final JsonData gte;

	// ---------------------------------------------------------------------------------------------

	public CompareContextPayloadCondition(Builder builder) {

		this.eq = builder.eq;
		this.lt = builder.lt;
		this.gt = builder.gt;
		this.lte = builder.lte;
		this.gte = builder.gte;

	}

	/**
	 * API name: {@code eq}
	 */
	@Nullable
	public JsonData eq() {
		return this.eq;
	}

	/**
	 * API name: {@code lt}
	 */
	@Nullable
	public JsonData lt() {
		return this.lt;
	}

	/**
	 * API name: {@code gt}
	 */
	@Nullable
	public JsonData gt() {
		return this.gt;
	}

	/**
	 * API name: {@code lte}
	 */
	@Nullable
	public JsonData lte() {
		return this.lte;
	}

	/**
	 * API name: {@code gte}
	 */
	@Nullable
	public JsonData gte() {
		return this.gte;
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

		if (this.eq != null) {

			generator.writeKey("eq");
			this.eq.serialize(generator, mapper);

		}
		if (this.lt != null) {

			generator.writeKey("lt");
			this.lt.serialize(generator, mapper);

		}
		if (this.gt != null) {

			generator.writeKey("gt");
			this.gt.serialize(generator, mapper);

		}
		if (this.lte != null) {

			generator.writeKey("lte");
			this.lte.serialize(generator, mapper);

		}
		if (this.gte != null) {

			generator.writeKey("gte");
			this.gte.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompareContextPayloadCondition}.
	 */
	public static class Builder implements ObjectBuilder<CompareContextPayloadCondition> {
		@Nullable
		private JsonData eq;

		@Nullable
		private JsonData lt;

		@Nullable
		private JsonData gt;

		@Nullable
		private JsonData lte;

		@Nullable
		private JsonData gte;

		/**
		 * API name: {@code eq}
		 */
		public Builder eq(@Nullable JsonData value) {
			this.eq = value;
			return this;
		}

		/**
		 * API name: {@code lt}
		 */
		public Builder lt(@Nullable JsonData value) {
			this.lt = value;
			return this;
		}

		/**
		 * API name: {@code gt}
		 */
		public Builder gt(@Nullable JsonData value) {
			this.gt = value;
			return this;
		}

		/**
		 * API name: {@code lte}
		 */
		public Builder lte(@Nullable JsonData value) {
			this.lte = value;
			return this;
		}

		/**
		 * API name: {@code gte}
		 */
		public Builder gte(@Nullable JsonData value) {
			this.gte = value;
			return this;
		}

		/**
		 * Builds a {@link CompareContextPayloadCondition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompareContextPayloadCondition build() {

			return new CompareContextPayloadCondition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompareContextPayloadCondition}
	 */
	public static final JsonpDeserializer<CompareContextPayloadCondition> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					CompareContextPayloadCondition::setupCompareContextPayloadConditionDeserializer);

	protected static void setupCompareContextPayloadConditionDeserializer(
			DelegatingDeserializer<CompareContextPayloadCondition.Builder> op) {

		op.add(Builder::eq, JsonData.DESERIALIZER, "eq");
		op.add(Builder::lt, JsonData.DESERIALIZER, "lt");
		op.add(Builder::gt, JsonData.DESERIALIZER, "gt");
		op.add(Builder::lte, JsonData.DESERIALIZER, "lte");
		op.add(Builder::gte, JsonData.DESERIALIZER, "gte");

	}

}
