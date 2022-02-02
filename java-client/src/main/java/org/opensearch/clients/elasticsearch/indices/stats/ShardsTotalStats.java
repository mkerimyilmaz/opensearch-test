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

package org.opensearch.clients.elasticsearch.indices.stats;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;

// typedef: indices.stats.ShardsTotalStats

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/indices/stats/types.ts#L158-L160">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardsTotalStats implements JsonpSerializable {
	private final long totalCount;

	// ---------------------------------------------------------------------------------------------

	private ShardsTotalStats(Builder builder) {

		this.totalCount = ApiTypeHelper.requireNonNull(builder.totalCount, this, "totalCount");

	}

	public static ShardsTotalStats of(Function<Builder, ObjectBuilder<ShardsTotalStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code total_count}
	 */
	public final long totalCount() {
		return this.totalCount;
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

		generator.writeKey("total_count");
		generator.write(this.totalCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsTotalStats}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ShardsTotalStats> {
		private Long totalCount;

		/**
		 * Required - API name: {@code total_count}
		 */
		public final Builder totalCount(long value) {
			this.totalCount = value;
			return this;
		}

		/**
		 * Builds a {@link ShardsTotalStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsTotalStats build() {
			_checkSingleUse();

			return new ShardsTotalStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsTotalStats}
	 */
	public static final JsonpDeserializer<ShardsTotalStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardsTotalStats::setupShardsTotalStatsDeserializer);

	protected static void setupShardsTotalStatsDeserializer(ObjectDeserializer<ShardsTotalStats.Builder> op) {

		op.add(Builder::totalCount, JsonpDeserializer.longDeserializer(), "total_count");

	}

}
