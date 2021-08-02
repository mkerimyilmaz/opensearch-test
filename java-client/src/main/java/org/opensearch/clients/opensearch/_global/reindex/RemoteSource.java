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

package org.opensearch.clients.opensearch._global.reindex;

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.Objects;

// typedef: _global.reindex.RemoteSource
public final class RemoteSource implements ToJsonp {
	private final JsonValue connectTimeout;

	private final String host;

	private final String username;

	private final String password;

	private final JsonValue socketTimeout;

	// ---------------------------------------------------------------------------------------------

	protected RemoteSource(Builder builder) {

		this.connectTimeout = Objects.requireNonNull(builder.connectTimeout, "connect_timeout");
		this.host = Objects.requireNonNull(builder.host, "host");
		this.username = Objects.requireNonNull(builder.username, "username");
		this.password = Objects.requireNonNull(builder.password, "password");
		this.socketTimeout = Objects.requireNonNull(builder.socketTimeout, "socket_timeout");

	}

	/**
	 * API name: {@code connect_timeout}
	 */
	public JsonValue connectTimeout() {
		return this.connectTimeout;
	}

	/**
	 * API name: {@code host}
	 */
	public String host() {
		return this.host;
	}

	/**
	 * API name: {@code username}
	 */
	public String username() {
		return this.username;
	}

	/**
	 * API name: {@code password}
	 */
	public String password() {
		return this.password;
	}

	/**
	 * API name: {@code socket_timeout}
	 */
	public JsonValue socketTimeout() {
		return this.socketTimeout;
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

		generator.writeKey("connect_timeout");
		generator.write(this.connectTimeout);

		generator.writeKey("host");
		generator.write(this.host);

		generator.writeKey("username");
		generator.write(this.username);

		generator.writeKey("password");
		generator.write(this.password);

		generator.writeKey("socket_timeout");
		generator.write(this.socketTimeout);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemoteSource}.
	 */
	public static class Builder implements ObjectBuilder<RemoteSource> {
		private JsonValue connectTimeout;

		private String host;

		private String username;

		private String password;

		private JsonValue socketTimeout;

		/**
		 * API name: {@code connect_timeout}
		 */
		public Builder connectTimeout(JsonValue value) {
			this.connectTimeout = value;
			return this;
		}

		/**
		 * API name: {@code host}
		 */
		public Builder host(String value) {
			this.host = value;
			return this;
		}

		/**
		 * API name: {@code username}
		 */
		public Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * API name: {@code password}
		 */
		public Builder password(String value) {
			this.password = value;
			return this;
		}

		/**
		 * API name: {@code socket_timeout}
		 */
		public Builder socketTimeout(JsonValue value) {
			this.socketTimeout = value;
			return this;
		}

		/**
		 * Builds a {@link RemoteSource}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemoteSource build() {

			return new RemoteSource(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RemoteSource
	 */
	public static final JsonpDeserializer<RemoteSource> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RemoteSource::setupRemoteSourceDeserializer);

	protected static void setupRemoteSourceDeserializer(DelegatingDeserializer<RemoteSource.Builder> op) {

		op.add(Builder::connectTimeout, JsonpDeserializer.jsonValueDeserializer(), "connect_timeout");
		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::password, JsonpDeserializer.stringDeserializer(), "password");
		op.add(Builder::socketTimeout, JsonpDeserializer.jsonValueDeserializer(), "socket_timeout");

	}

}
