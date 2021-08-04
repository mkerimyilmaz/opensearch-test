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

package org.opensearch.clients.opensearch.core.bulk;

import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import jakarta.json.stream.JsonGenerator;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: _global.bulk.WriteOperation

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_global/bulk/types.ts#L68-L72">API
 *      specification</a>
 */

public abstract class WriteOperation extends BulkOperationBase {
	private final Map<String, String> dynamicTemplates;

	@Nullable
	private final String pipeline;

	@Nullable
	private final Boolean requireAlias;

	// ---------------------------------------------------------------------------------------------

	protected WriteOperation(AbstractBuilder<?> builder) {
		super(builder);

		this.dynamicTemplates = ApiTypeHelper.unmodifiable(builder.dynamicTemplates);
		this.pipeline = builder.pipeline;
		this.requireAlias = builder.requireAlias;

	}

	/**
	 * API name: {@code dynamic_templates}
	 */
	public final Map<String, String> dynamicTemplates() {
		return this.dynamicTemplates;
	}

	/**
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final String pipeline() {
		return this.pipeline;
	}

	/**
	 * API name: {@code require_alias}
	 */
	@Nullable
	public final Boolean requireAlias() {
		return this.requireAlias;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.dynamicTemplates)) {
			generator.writeKey("dynamic_templates");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.dynamicTemplates.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.pipeline != null) {
			generator.writeKey("pipeline");
			generator.write(this.pipeline);

		}
		if (this.requireAlias != null) {
			generator.writeKey("require_alias");
			generator.write(this.requireAlias);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				BulkOperationBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Map<String, String> dynamicTemplates;

		@Nullable
		private String pipeline;

		@Nullable
		private Boolean requireAlias;

		/**
		 * API name: {@code dynamic_templates}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>dynamicTemplates</code>.
		 */
		public final BuilderT dynamicTemplates(Map<String, String> map) {
			this.dynamicTemplates = _mapPutAll(this.dynamicTemplates, map);
			return self();
		}

		/**
		 * API name: {@code dynamic_templates}
		 * <p>
		 * Adds an entry to <code>dynamicTemplates</code>.
		 */
		public final BuilderT dynamicTemplates(String key, String value) {
			this.dynamicTemplates = _mapPut(this.dynamicTemplates, key, value);
			return self();
		}

		/**
		 * API name: {@code pipeline}
		 */
		public final BuilderT pipeline(@Nullable String value) {
			this.pipeline = value;
			return self();
		}

		/**
		 * API name: {@code require_alias}
		 */
		public final BuilderT requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupWriteOperationDeserializer(
			ObjectDeserializer<BuilderT> op) {
		BulkOperationBase.setupBulkOperationBaseDeserializer(op);
		op.add(AbstractBuilder::dynamicTemplates,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "dynamic_templates");
		op.add(AbstractBuilder::pipeline, JsonpDeserializer.stringDeserializer(), "pipeline");
		op.add(AbstractBuilder::requireAlias, JsonpDeserializer.booleanDeserializer(), "require_alias");

	}

}
