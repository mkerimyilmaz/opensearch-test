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

// typedef: cluster.stats.ClusterOperatingSystemPrettyName

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/cluster/stats/types.ts#L239-L242">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterOperatingSystemPrettyName implements JsonpSerializable {
	private final int count;

	private final String prettyName;

	// ---------------------------------------------------------------------------------------------

	private ClusterOperatingSystemPrettyName(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.prettyName = ApiTypeHelper.requireNonNull(builder.prettyName, this, "prettyName");

	}

	public static ClusterOperatingSystemPrettyName of(
			Function<Builder, ObjectBuilder<ClusterOperatingSystemPrettyName>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code pretty_name}
	 */
	public final String prettyName() {
		return this.prettyName;
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

		generator.writeKey("pretty_name");
		generator.write(this.prettyName);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterOperatingSystemPrettyName}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClusterOperatingSystemPrettyName> {
		private Integer count;

		private String prettyName;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code pretty_name}
		 */
		public final Builder prettyName(String value) {
			this.prettyName = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterOperatingSystemPrettyName}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterOperatingSystemPrettyName build() {
			_checkSingleUse();

			return new ClusterOperatingSystemPrettyName(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterOperatingSystemPrettyName}
	 */
	public static final JsonpDeserializer<ClusterOperatingSystemPrettyName> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterOperatingSystemPrettyName::setupClusterOperatingSystemPrettyNameDeserializer);

	protected static void setupClusterOperatingSystemPrettyNameDeserializer(
			ObjectDeserializer<ClusterOperatingSystemPrettyName.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::prettyName, JsonpDeserializer.stringDeserializer(), "pretty_name");

	}

}
