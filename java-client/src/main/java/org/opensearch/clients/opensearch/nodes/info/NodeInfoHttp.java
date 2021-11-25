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

import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoHttp
@JsonpDeserializable
public class NodeInfoHttp implements JsonpSerializable {
	private final List<String> boundAddress;

	@Nullable
	private final String maxContentLength;

	private final long maxContentLengthInBytes;

	private final String publishAddress;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoHttp(Builder builder) {

		this.boundAddress = ModelTypeHelper.unmodifiableRequired(builder.boundAddress, this, "boundAddress");
		this.maxContentLength = builder.maxContentLength;
		this.maxContentLengthInBytes = ModelTypeHelper.requireNonNull(builder.maxContentLengthInBytes, this,
				"maxContentLengthInBytes");
		this.publishAddress = ModelTypeHelper.requireNonNull(builder.publishAddress, this, "publishAddress");

	}

	public static NodeInfoHttp of(Function<Builder, ObjectBuilder<NodeInfoHttp>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code bound_address}
	 */
	public final List<String> boundAddress() {
		return this.boundAddress;
	}

	/**
	 * API name: {@code max_content_length}
	 */
	@Nullable
	public final String maxContentLength() {
		return this.maxContentLength;
	}

	/**
	 * Required - API name: {@code max_content_length_in_bytes}
	 */
	public final long maxContentLengthInBytes() {
		return this.maxContentLengthInBytes;
	}

	/**
	 * Required - API name: {@code publish_address}
	 */
	public final String publishAddress() {
		return this.publishAddress;
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

		if (ModelTypeHelper.isDefined(this.boundAddress)) {
			generator.writeKey("bound_address");
			generator.writeStartArray();
			for (String item0 : this.boundAddress) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.maxContentLength != null) {
			generator.writeKey("max_content_length");
			generator.write(this.maxContentLength);

		}
		generator.writeKey("max_content_length_in_bytes");
		generator.write(this.maxContentLengthInBytes);

		generator.writeKey("publish_address");
		generator.write(this.publishAddress);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoHttp}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoHttp> {
		private List<String> boundAddress;

		@Nullable
		private String maxContentLength;

		private Long maxContentLengthInBytes;

		private String publishAddress;

		/**
		 * Required - API name: {@code bound_address}
		 */
		public final Builder boundAddress(List<String> value) {
			this.boundAddress = value;
			return this;
		}

		/**
		 * Required - API name: {@code bound_address}
		 */
		public final Builder boundAddress(String... value) {
			this.boundAddress = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code max_content_length}
		 */
		public final Builder maxContentLength(@Nullable String value) {
			this.maxContentLength = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_content_length_in_bytes}
		 */
		public final Builder maxContentLengthInBytes(long value) {
			this.maxContentLengthInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code publish_address}
		 */
		public final Builder publishAddress(String value) {
			this.publishAddress = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoHttp}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoHttp build() {
			_checkSingleUse();

			return new NodeInfoHttp(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoHttp}
	 */
	public static final JsonpDeserializer<NodeInfoHttp> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoHttp::setupNodeInfoHttpDeserializer, Builder::build);

	protected static void setupNodeInfoHttpDeserializer(DelegatingDeserializer<NodeInfoHttp.Builder> op) {

		op.add(Builder::boundAddress, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"bound_address");
		op.add(Builder::maxContentLength, JsonpDeserializer.stringDeserializer(), "max_content_length");
		op.add(Builder::maxContentLengthInBytes, JsonpDeserializer.longDeserializer(), "max_content_length_in_bytes");
		op.add(Builder::publishAddress, JsonpDeserializer.stringDeserializer(), "publish_address");

	}

}
