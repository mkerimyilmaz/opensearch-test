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

package org.opensearch.clients.opensearch._types.analysis;

import org.opensearch.clients.json.JsonEnum;
import org.opensearch.clients.json.JsonpDeserializable;

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/analysis/phonetic-plugin.ts#L38-L51">API
 *      specification</a>
 */
@JsonpDeserializable
public enum PhoneticLanguage implements JsonEnum {
	Any("any"),

	Common("common"),

	Cyrillic("cyrillic"),

	English("english"),

	French("french"),

	German("german"),

	Hebrew("hebrew"),

	Hungarian("hungarian"),

	Polish("polish"),

	Romanian("romanian"),

	Russian("russian"),

	Spanish("spanish"),

	;

	private final String jsonValue;

	PhoneticLanguage(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<PhoneticLanguage> _DESERIALIZER = new JsonEnum.Deserializer<>(
			PhoneticLanguage.values());
}
