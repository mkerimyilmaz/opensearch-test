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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.master.MasterRecord;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.master.Response
@JsonpDeserializable
public final class MasterResponse implements JsonpSerializable {
	private final List<MasterRecord> value;

	// ---------------------------------------------------------------------------------------------

	public MasterResponse(Builder builder) {

		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * Response value.
	 * <p>
	 * API name: {@code value}
	 */
	public List<MasterRecord> value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (MasterRecord item0 : this.value) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MasterResponse}.
	 */
	public static class Builder implements ObjectBuilder<MasterResponse> {
		private List<MasterRecord> value;

		/**
		 * Response value.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(List<MasterRecord> value) {
			this.value = value;
			return this;
		}

		/**
		 * Response value.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(MasterRecord... value) {
			this.value = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(MasterRecord value) {
			if (this.value == null) {
				this.value = new ArrayList<>();
			}
			this.value.add(value);
			return this;
		}

		/**
		 * Set {@link #value(List)} to a singleton list.
		 */
		public Builder value(Function<MasterRecord.Builder, ObjectBuilder<MasterRecord>> fn) {
			return this.value(fn.apply(new MasterRecord.Builder()).build());
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(Function<MasterRecord.Builder, ObjectBuilder<MasterRecord>> fn) {
			return this.addValue(fn.apply(new MasterRecord.Builder()).build());
		}

		/**
		 * Builds a {@link MasterResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MasterResponse build() {

			return new MasterResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MasterResponse}
	 */
	public static final JsonpDeserializer<MasterResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MasterResponse::setupMasterResponseDeserializer, Builder::build);

	protected static void setupMasterResponseDeserializer(DelegatingDeserializer<MasterResponse.Builder> op) {

		op.add(Builder::value, JsonpDeserializer.arrayDeserializer(MasterRecord._DESERIALIZER), "value");

	}

}
