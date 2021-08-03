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

package org.opensearch.clients.opensearch.nodes.info;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.Objects;

// typedef: nodes.info.NodeInfoBootstrap
public final class NodeInfoBootstrap implements ToJsonp {
	private final String memoryLock;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoBootstrap(Builder builder) {

		this.memoryLock = Objects.requireNonNull(builder.memoryLock, "memory_lock");

	}

	/**
	 * API name: {@code memory_lock}
	 */
	public String memoryLock() {
		return this.memoryLock;
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

		generator.writeKey("memory_lock");
		generator.write(this.memoryLock);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoBootstrap}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoBootstrap> {
		private String memoryLock;

		/**
		 * API name: {@code memory_lock}
		 */
		public Builder memoryLock(String value) {
			this.memoryLock = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoBootstrap}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoBootstrap build() {

			return new NodeInfoBootstrap(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoBootstrap
	 */
	public static final JsonpDeserializer<NodeInfoBootstrap> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoBootstrap::setupNodeInfoBootstrapDeserializer);

	protected static void setupNodeInfoBootstrapDeserializer(DelegatingDeserializer<NodeInfoBootstrap.Builder> op) {

		op.add(Builder::memoryLock, JsonpDeserializer.stringDeserializer(), "memory_lock");

	}

}
