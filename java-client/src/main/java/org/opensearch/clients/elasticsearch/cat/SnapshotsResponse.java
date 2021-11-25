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

package org.opensearch.clients.elasticsearch.cat;

import org.opensearch.clients.elasticsearch.cat.snapshots.SnapshotsRecord;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: cat.snapshots.Response
@JsonpDeserializable
public class SnapshotsResponse implements JsonpSerializable {
	private final List<SnapshotsRecord> valueBody;

	// ---------------------------------------------------------------------------------------------

	private SnapshotsResponse(Builder builder) {

		this.valueBody = ModelTypeHelper.unmodifiableRequired(builder.valueBody, this, "valueBody");

	}

	public static SnapshotsResponse of(Function<Builder, ObjectBuilder<SnapshotsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final List<SnapshotsRecord> valueBody() {
		return this.valueBody;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (SnapshotsRecord item0 : this.valueBody) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SnapshotsResponse> {
		private List<SnapshotsRecord> valueBody;

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder valueBody(List<SnapshotsRecord> value) {
			this.valueBody = value;
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder valueBody(SnapshotsRecord... value) {
			this.valueBody = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		@SafeVarargs
		public final Builder valueBody(Function<SnapshotsRecord.Builder, ObjectBuilder<SnapshotsRecord>>... fns) {
			this.valueBody = new ArrayList<>(fns.length);
			for (Function<SnapshotsRecord.Builder, ObjectBuilder<SnapshotsRecord>> fn : fns) {
				this.valueBody.add(fn.apply(new SnapshotsRecord.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link SnapshotsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotsResponse build() {
			_checkSingleUse();

			return new SnapshotsResponse(this);
		}
	}

	public static final JsonpDeserializer<SnapshotsResponse> _DESERIALIZER = createSnapshotsResponseDeserializer();
	protected static JsonpDeserializer<SnapshotsResponse> createSnapshotsResponseDeserializer() {

		JsonpDeserializer<List<SnapshotsRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(SnapshotsRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.valueBody(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
