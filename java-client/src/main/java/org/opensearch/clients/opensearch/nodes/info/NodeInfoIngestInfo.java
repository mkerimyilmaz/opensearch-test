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

package org.opensearch.clients.opensearch.nodes.info;

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

import java.util.function.Function;

// typedef: nodes.info.NodeInfoIngestInfo
@JsonpDeserializable
public class NodeInfoIngestInfo implements JsonpSerializable {
	private final NodeInfoIngestDownloader downloader;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoIngestInfo(Builder builder) {

		this.downloader = ModelTypeHelper.requireNonNull(builder.downloader, this, "downloader");

	}

	public static NodeInfoIngestInfo of(Function<Builder, ObjectBuilder<NodeInfoIngestInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code downloader}
	 */
	public final NodeInfoIngestDownloader downloader() {
		return this.downloader;
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

		generator.writeKey("downloader");
		this.downloader.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoIngestInfo}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoIngestInfo> {
		private NodeInfoIngestDownloader downloader;

		/**
		 * Required - API name: {@code downloader}
		 */
		public final Builder downloader(NodeInfoIngestDownloader value) {
			this.downloader = value;
			return this;
		}

		/**
		 * Required - API name: {@code downloader}
		 */
		public final Builder downloader(
				Function<NodeInfoIngestDownloader.Builder, ObjectBuilder<NodeInfoIngestDownloader>> fn) {
			return this.downloader(fn.apply(new NodeInfoIngestDownloader.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoIngestInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoIngestInfo build() {
			_checkSingleUse();

			return new NodeInfoIngestInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoIngestInfo}
	 */
	public static final JsonpDeserializer<NodeInfoIngestInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoIngestInfo::setupNodeInfoIngestInfoDeserializer, Builder::build);

	protected static void setupNodeInfoIngestInfoDeserializer(DelegatingDeserializer<NodeInfoIngestInfo.Builder> op) {

		op.add(Builder::downloader, NodeInfoIngestDownloader._DESERIALIZER, "downloader");

	}

}
