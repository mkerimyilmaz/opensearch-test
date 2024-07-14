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

package org.opensearch.client.opensearch._types.query_dsl;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ObjectBuilder;

@JsonpDeserializable
public class RankFeatureFunctionLinear extends RankFeatureFunction implements PlainJsonSerializable {

    public static final class Builder implements ObjectBuilder<RankFeatureFunctionLinear> {
        @Override
        public RankFeatureFunctionLinear build() {
            return RankFeatureFunctionLinear._INSTANCE;
        }
    }

    /**
     * Serialize this object to JSON.
     */
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeStartObject();
        generator.writeEnd();
    }

    /**
     * Singleton instance for empty class {@link RankFeatureFunctionLinear}.
     */
    public static final RankFeatureFunctionLinear _INSTANCE = new RankFeatureFunctionLinear();

    public static final JsonpDeserializer<RankFeatureFunctionLinear> _DESERIALIZER = JsonpDeserializer.emptyObject(
        RankFeatureFunctionLinear._INSTANCE
    );

}
