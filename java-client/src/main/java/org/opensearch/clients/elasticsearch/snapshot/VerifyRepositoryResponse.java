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

package org.opensearch.clients.elasticsearch.snapshot;

import org.opensearch.clients.elasticsearch.snapshot.verify_repository.CompactNodeInfo;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.MapBuilder;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

// typedef: snapshot.verify_repository.Response
@JsonpDeserializable
public class VerifyRepositoryResponse implements JsonpSerializable {
	private final Map<String, CompactNodeInfo> nodes;

	// ---------------------------------------------------------------------------------------------

	private VerifyRepositoryResponse(Builder builder) {

		this.nodes = ModelTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");

	}

	public static VerifyRepositoryResponse of(Function<Builder, ObjectBuilder<VerifyRepositoryResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code nodes}
	 */
	public final Map<String, CompactNodeInfo> nodes() {
		return this.nodes;
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

		if (ModelTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, CompactNodeInfo> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VerifyRepositoryResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<VerifyRepositoryResponse> {
		private Map<String, CompactNodeInfo> nodes;

		/**
		 * Required - API name: {@code nodes}
		 */
		public final Builder nodes(Map<String, CompactNodeInfo> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key, Function<CompactNodeInfo.Builder, ObjectBuilder<CompactNodeInfo>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new CompactNodeInfo.Builder()).build()));
		}

		public final Builder nodes(
				Function<MapBuilder<String, CompactNodeInfo, CompactNodeInfo.Builder>, ObjectBuilder<Map<String, CompactNodeInfo>>> fn) {
			return nodes(fn.apply(new MapBuilder<>(CompactNodeInfo.Builder::new)).build());
		}

		/**
		 * Builds a {@link VerifyRepositoryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VerifyRepositoryResponse build() {
			_checkSingleUse();

			return new VerifyRepositoryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link VerifyRepositoryResponse}
	 */
	public static final JsonpDeserializer<VerifyRepositoryResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, VerifyRepositoryResponse::setupVerifyRepositoryResponseDeserializer, Builder::build);

	protected static void setupVerifyRepositoryResponseDeserializer(
			DelegatingDeserializer<VerifyRepositoryResponse.Builder> op) {

		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(CompactNodeInfo._DESERIALIZER), "nodes");

	}

}
