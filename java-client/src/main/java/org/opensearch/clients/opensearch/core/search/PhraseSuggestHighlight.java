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

package org.opensearch.clients.opensearch.core.search;

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

// typedef: _global.search._types.PhraseSuggestHighlight

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_global/search/_types/suggester.ts#L176-L179">API
 *      specification</a>
 */
@JsonpDeserializable
public class PhraseSuggestHighlight implements JsonpSerializable {
	private final String postTag;

	private final String preTag;

	// ---------------------------------------------------------------------------------------------

	private PhraseSuggestHighlight(Builder builder) {

		this.postTag = ApiTypeHelper.requireNonNull(builder.postTag, this, "postTag");
		this.preTag = ApiTypeHelper.requireNonNull(builder.preTag, this, "preTag");

	}

	public static PhraseSuggestHighlight of(Function<Builder, ObjectBuilder<PhraseSuggestHighlight>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code post_tag}
	 */
	public final String postTag() {
		return this.postTag;
	}

	/**
	 * Required - API name: {@code pre_tag}
	 */
	public final String preTag() {
		return this.preTag;
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

		generator.writeKey("post_tag");
		generator.write(this.postTag);

		generator.writeKey("pre_tag");
		generator.write(this.preTag);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PhraseSuggestHighlight}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PhraseSuggestHighlight> {
		private String postTag;

		private String preTag;

		/**
		 * Required - API name: {@code post_tag}
		 */
		public final Builder postTag(String value) {
			this.postTag = value;
			return this;
		}

		/**
		 * Required - API name: {@code pre_tag}
		 */
		public final Builder preTag(String value) {
			this.preTag = value;
			return this;
		}

		/**
		 * Builds a {@link PhraseSuggestHighlight}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PhraseSuggestHighlight build() {
			_checkSingleUse();

			return new PhraseSuggestHighlight(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PhraseSuggestHighlight}
	 */
	public static final JsonpDeserializer<PhraseSuggestHighlight> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PhraseSuggestHighlight::setupPhraseSuggestHighlightDeserializer);

	protected static void setupPhraseSuggestHighlightDeserializer(
			ObjectDeserializer<PhraseSuggestHighlight.Builder> op) {

		op.add(Builder::postTag, JsonpDeserializer.stringDeserializer(), "post_tag");
		op.add(Builder::preTag, JsonpDeserializer.stringDeserializer(), "pre_tag");

	}

}
