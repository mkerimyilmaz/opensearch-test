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

package org.opensearch.clients.opensearch.cluster;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonData;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.get_settings.Response
@JsonpDeserializable
public class GetSettingsResponse implements JsonpSerializable {
	private final Map<String, JsonData> persistent;

	private final Map<String, JsonData> transient_;

	private final Map<String, JsonData> defaults;

	// ---------------------------------------------------------------------------------------------

	private GetSettingsResponse(Builder builder) {

		this.persistent = ModelTypeHelper.unmodifiableRequired(builder.persistent, this, "persistent");
		this.transient_ = ModelTypeHelper.unmodifiableRequired(builder.transient_, this, "transient_");
		this.defaults = ModelTypeHelper.unmodifiable(builder.defaults);

	}

	public static GetSettingsResponse of(Function<Builder, ObjectBuilder<GetSettingsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code persistent}
	 */
	public final Map<String, JsonData> persistent() {
		return this.persistent;
	}

	/**
	 * Required - API name: {@code transient}
	 */
	public final Map<String, JsonData> transient_() {
		return this.transient_;
	}

	/**
	 * API name: {@code defaults}
	 */
	public final Map<String, JsonData> defaults() {
		return this.defaults;
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

		if (ModelTypeHelper.isDefined(this.persistent)) {
			generator.writeKey("persistent");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.persistent.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.transient_)) {
			generator.writeKey("transient");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.transient_.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.defaults)) {
			generator.writeKey("defaults");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.defaults.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSettingsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetSettingsResponse> {
		private Map<String, JsonData> persistent;

		private Map<String, JsonData> transient_;

		@Nullable
		private Map<String, JsonData> defaults;

		/**
		 * Required - API name: {@code persistent}
		 */
		public final Builder persistent(Map<String, JsonData> value) {
			this.persistent = value;
			return this;
		}

		/**
		 * Required - API name: {@code transient}
		 */
		public final Builder transient_(Map<String, JsonData> value) {
			this.transient_ = value;
			return this;
		}

		/**
		 * API name: {@code defaults}
		 */
		public final Builder defaults(@Nullable Map<String, JsonData> value) {
			this.defaults = value;
			return this;
		}

		/**
		 * Builds a {@link GetSettingsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSettingsResponse build() {
			_checkSingleUse();

			return new GetSettingsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetSettingsResponse}
	 */
	public static final JsonpDeserializer<GetSettingsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetSettingsResponse::setupGetSettingsResponseDeserializer, Builder::build);

	protected static void setupGetSettingsResponseDeserializer(DelegatingDeserializer<GetSettingsResponse.Builder> op) {

		op.add(Builder::persistent, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "persistent");
		op.add(Builder::transient_, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "transient");
		op.add(Builder::defaults, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "defaults");

	}

}
