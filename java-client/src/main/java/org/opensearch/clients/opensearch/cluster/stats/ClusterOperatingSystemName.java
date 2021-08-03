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

package org.opensearch.clients.opensearch.cluster.stats;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.Objects;

// typedef: cluster.stats.ClusterOperatingSystemName
public final class ClusterOperatingSystemName implements ToJsonp {
	private final Number count;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	protected ClusterOperatingSystemName(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.name = Objects.requireNonNull(builder.name, "name");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("name");
		generator.write(this.name);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterOperatingSystemName}.
	 */
	public static class Builder implements ObjectBuilder<ClusterOperatingSystemName> {
		private Number count;

		private String name;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterOperatingSystemName}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterOperatingSystemName build() {

			return new ClusterOperatingSystemName(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClusterOperatingSystemName
	 */
	public static final JsonpDeserializer<ClusterOperatingSystemName> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterOperatingSystemName::setupClusterOperatingSystemNameDeserializer);

	protected static void setupClusterOperatingSystemNameDeserializer(
			DelegatingDeserializer<ClusterOperatingSystemName.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
