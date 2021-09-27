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

package co.elastic.clients.elasticsearch._core.scripts_painless_execute;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.scripts_painless_execute.PainlessExecutionPosition
@JsonpDeserializable
public final class PainlessExecutionPosition implements JsonpSerializable {
	private final Integer offset;

	private final Integer start;

	private final Integer end;

	// ---------------------------------------------------------------------------------------------

	public PainlessExecutionPosition(Builder builder) {

		this.offset = Objects.requireNonNull(builder.offset, "offset");
		this.start = Objects.requireNonNull(builder.start, "start");
		this.end = Objects.requireNonNull(builder.end, "end");

	}

	/**
	 * API name: {@code offset}
	 */
	public Integer offset() {
		return this.offset;
	}

	/**
	 * API name: {@code start}
	 */
	public Integer start() {
		return this.start;
	}

	/**
	 * API name: {@code end}
	 */
	public Integer end() {
		return this.end;
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

		generator.writeKey("offset");
		generator.write(this.offset);

		generator.writeKey("start");
		generator.write(this.start);

		generator.writeKey("end");
		generator.write(this.end);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PainlessExecutionPosition}.
	 */
	public static class Builder implements ObjectBuilder<PainlessExecutionPosition> {
		private Integer offset;

		private Integer start;

		private Integer end;

		/**
		 * API name: {@code offset}
		 */
		public Builder offset(Integer value) {
			this.offset = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public Builder start(Integer value) {
			this.start = value;
			return this;
		}

		/**
		 * API name: {@code end}
		 */
		public Builder end(Integer value) {
			this.end = value;
			return this;
		}

		/**
		 * Builds a {@link PainlessExecutionPosition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PainlessExecutionPosition build() {

			return new PainlessExecutionPosition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PainlessExecutionPosition}
	 */
	public static final JsonpDeserializer<PainlessExecutionPosition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PainlessExecutionPosition::setupPainlessExecutionPositionDeserializer, Builder::build);

	protected static void setupPainlessExecutionPositionDeserializer(
			DelegatingDeserializer<PainlessExecutionPosition.Builder> op) {

		op.add(Builder::offset, JsonpDeserializer.integerDeserializer(), "offset");
		op.add(Builder::start, JsonpDeserializer.integerDeserializer(), "start");
		op.add(Builder::end, JsonpDeserializer.integerDeserializer(), "end");

	}

}
