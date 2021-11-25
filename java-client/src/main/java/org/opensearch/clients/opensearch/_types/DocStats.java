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

package org.opensearch.clients.opensearch._types;

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
import java.lang.Long;
import java.util.function.Function;

// typedef: _types.DocStats
@JsonpDeserializable
public class DocStats implements JsonpSerializable {
	private final long count;

	private final long deleted;

	// ---------------------------------------------------------------------------------------------

	private DocStats(Builder builder) {

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.deleted = ModelTypeHelper.requireNonNull(builder.deleted, this, "deleted");

	}

	public static DocStats of(Function<Builder, ObjectBuilder<DocStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code deleted}
	 */
	public final long deleted() {
		return this.deleted;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("deleted");
		generator.write(this.deleted);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DocStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DocStats> {
		private Long count;

		private Long deleted;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code deleted}
		 */
		public final Builder deleted(long value) {
			this.deleted = value;
			return this;
		}

		/**
		 * Builds a {@link DocStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DocStats build() {
			_checkSingleUse();

			return new DocStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DocStats}
	 */
	public static final JsonpDeserializer<DocStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DocStats::setupDocStatsDeserializer, Builder::build);

	protected static void setupDocStatsDeserializer(DelegatingDeserializer<DocStats.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::deleted, JsonpDeserializer.longDeserializer(), "deleted");

	}

}
