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

package org.opensearch.clients.elasticsearch.cluster.allocation_explain;

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

// typedef: cluster.allocation_explain.NodeDiskUsage

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/cluster/allocation_explain/types.ts#L56-L60">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeDiskUsage implements JsonpSerializable {
	private final String nodeName;

	private final DiskUsage leastAvailable;

	private final DiskUsage mostAvailable;

	// ---------------------------------------------------------------------------------------------

	private NodeDiskUsage(Builder builder) {

		this.nodeName = ApiTypeHelper.requireNonNull(builder.nodeName, this, "nodeName");
		this.leastAvailable = ApiTypeHelper.requireNonNull(builder.leastAvailable, this, "leastAvailable");
		this.mostAvailable = ApiTypeHelper.requireNonNull(builder.mostAvailable, this, "mostAvailable");

	}

	public static NodeDiskUsage of(Function<Builder, ObjectBuilder<NodeDiskUsage>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code node_name}
	 */
	public final String nodeName() {
		return this.nodeName;
	}

	/**
	 * Required - API name: {@code least_available}
	 */
	public final DiskUsage leastAvailable() {
		return this.leastAvailable;
	}

	/**
	 * Required - API name: {@code most_available}
	 */
	public final DiskUsage mostAvailable() {
		return this.mostAvailable;
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

		generator.writeKey("node_name");
		generator.write(this.nodeName);

		generator.writeKey("least_available");
		this.leastAvailable.serialize(generator, mapper);

		generator.writeKey("most_available");
		this.mostAvailable.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeDiskUsage}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeDiskUsage> {
		private String nodeName;

		private DiskUsage leastAvailable;

		private DiskUsage mostAvailable;

		/**
		 * Required - API name: {@code node_name}
		 */
		public final Builder nodeName(String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * Required - API name: {@code least_available}
		 */
		public final Builder leastAvailable(DiskUsage value) {
			this.leastAvailable = value;
			return this;
		}

		/**
		 * Required - API name: {@code least_available}
		 */
		public final Builder leastAvailable(Function<DiskUsage.Builder, ObjectBuilder<DiskUsage>> fn) {
			return this.leastAvailable(fn.apply(new DiskUsage.Builder()).build());
		}

		/**
		 * Required - API name: {@code most_available}
		 */
		public final Builder mostAvailable(DiskUsage value) {
			this.mostAvailable = value;
			return this;
		}

		/**
		 * Required - API name: {@code most_available}
		 */
		public final Builder mostAvailable(Function<DiskUsage.Builder, ObjectBuilder<DiskUsage>> fn) {
			return this.mostAvailable(fn.apply(new DiskUsage.Builder()).build());
		}

		/**
		 * Builds a {@link NodeDiskUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeDiskUsage build() {
			_checkSingleUse();

			return new NodeDiskUsage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeDiskUsage}
	 */
	public static final JsonpDeserializer<NodeDiskUsage> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeDiskUsage::setupNodeDiskUsageDeserializer);

	protected static void setupNodeDiskUsageDeserializer(ObjectDeserializer<NodeDiskUsage.Builder> op) {

		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node_name");
		op.add(Builder::leastAvailable, DiskUsage._DESERIALIZER, "least_available");
		op.add(Builder::mostAvailable, DiskUsage._DESERIALIZER, "most_available");

	}

}
