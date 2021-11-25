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

package org.opensearch.client.opensearch.cluster.allocation_explain;

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
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// typedef: cluster.allocation_explain.ReservedSize
@JsonpDeserializable
public class ReservedSize implements JsonpSerializable {
	private final String nodeId;

	private final String path;

	private final long total;

	private final List<String> shards;

	// ---------------------------------------------------------------------------------------------

	private ReservedSize(Builder builder) {

		this.nodeId = ModelTypeHelper.requireNonNull(builder.nodeId, this, "nodeId");
		this.path = ModelTypeHelper.requireNonNull(builder.path, this, "path");
		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");
		this.shards = ModelTypeHelper.unmodifiableRequired(builder.shards, this, "shards");

	}

	public static ReservedSize of(Function<Builder, ObjectBuilder<ReservedSize>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code node_id}
	 */
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * Required - API name: {@code path}
	 */
	public final String path() {
		return this.path;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final long total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code shards}
	 */
	public final List<String> shards() {
		return this.shards;
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

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("path");
		generator.write(this.path);

		generator.writeKey("total");
		generator.write(this.total);

		if (ModelTypeHelper.isDefined(this.shards)) {
			generator.writeKey("shards");
			generator.writeStartArray();
			for (String item0 : this.shards) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReservedSize}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ReservedSize> {
		private String nodeId;

		private String path;

		private Long total;

		private List<String> shards;

		/**
		 * Required - API name: {@code node_id}
		 */
		public final Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Required - API name: {@code path}
		 */
		public final Builder path(String value) {
			this.path = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(long value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(List<String> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(String... value) {
			this.shards = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link ReservedSize}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReservedSize build() {
			_checkSingleUse();

			return new ReservedSize(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReservedSize}
	 */
	public static final JsonpDeserializer<ReservedSize> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReservedSize::setupReservedSizeDeserializer, Builder::build);

	protected static void setupReservedSizeDeserializer(DelegatingDeserializer<ReservedSize.Builder> op) {

		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::shards, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "shards");

	}

}
