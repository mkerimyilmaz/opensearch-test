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

package org.opensearch.client.opensearch.cluster;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: cluster._types.VotingConfigExclusionsItem
public final class VotingConfigExclusionsItem implements ToJsonp {
	private final String nodeId;

	private final String nodeName;

	// ---------------------------------------------------------------------------------------------

	protected VotingConfigExclusionsItem(Builder builder) {

		this.nodeId = Objects.requireNonNull(builder.nodeId, "node_id");
		this.nodeName = Objects.requireNonNull(builder.nodeName, "node_name");

	}

	/**
	 * API name: {@code node_id}
	 */
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code node_name}
	 */
	public String nodeName() {
		return this.nodeName;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("node_name");
		generator.write(this.nodeName);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VotingConfigExclusionsItem}.
	 */
	public static class Builder implements ObjectBuilder<VotingConfigExclusionsItem> {
		private String nodeId;

		private String nodeName;

		/**
		 * API name: {@code node_id}
		 */
		public Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * API name: {@code node_name}
		 */
		public Builder nodeName(String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * Builds a {@link VotingConfigExclusionsItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VotingConfigExclusionsItem build() {

			return new VotingConfigExclusionsItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for VotingConfigExclusionsItem
	 */
	public static final JsonpDeserializer<VotingConfigExclusionsItem> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, VotingConfigExclusionsItem::setupVotingConfigExclusionsItemDeserializer);

	protected static void setupVotingConfigExclusionsItemDeserializer(
			DelegatingDeserializer<VotingConfigExclusionsItem.Builder> op) {

		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node_name");

	}

}
