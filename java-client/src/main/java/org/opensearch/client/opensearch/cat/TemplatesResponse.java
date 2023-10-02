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

package org.opensearch.client.opensearch.cat;

import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.function.Function;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.opensearch.cat.templates.TemplatesRecord;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: cat.templates.Response

@JsonpDeserializable
public class TemplatesResponse implements JsonpSerializable {
    private final List<TemplatesRecord> valueBody;

    // ---------------------------------------------------------------------------------------------

    private TemplatesResponse(Builder builder) {

        this.valueBody = ApiTypeHelper.unmodifiableRequired(builder.valueBody, this, "valueBody");

    }

    public static TemplatesResponse of(Function<Builder, ObjectBuilder<TemplatesResponse>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - Response value.
     * <p>
     * API name: {@code _value_body}
     */
    public final List<TemplatesRecord> valueBody() {
        return this.valueBody;
    }

    /**
     * Serialize this value to JSON.
     */
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeStartArray();
        for (TemplatesRecord item0 : this.valueBody) {
            item0.serialize(generator, mapper);

        }
        generator.writeEnd();

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link TemplatesResponse}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TemplatesResponse> {
        private List<TemplatesRecord> valueBody;

        /**
         * Required - Response value.
         * <p>
         * API name: {@code _value_body}
         * <p>
         * Adds all elements of <code>list</code> to <code>valueBody</code>.
         */
        public final Builder valueBody(List<TemplatesRecord> list) {
            this.valueBody = _listAddAll(this.valueBody, list);
            return this;
        }

        /**
         * Required - Response value.
         * <p>
         * API name: {@code _value_body}
         * <p>
         * Adds one or more values to <code>valueBody</code>.
         */
        public final Builder valueBody(TemplatesRecord value, TemplatesRecord... values) {
            this.valueBody = _listAdd(this.valueBody, value, values);
            return this;
        }

        /**
         * Required - Response value.
         * <p>
         * API name: {@code _value_body}
         * <p>
         * Adds a value to <code>valueBody</code> using a builder lambda.
         */
        public final Builder valueBody(Function<TemplatesRecord.Builder, ObjectBuilder<TemplatesRecord>> fn) {
            return valueBody(fn.apply(new TemplatesRecord.Builder()).build());
        }

        /**
         * Builds a {@link TemplatesResponse}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public TemplatesResponse build() {
            _checkSingleUse();

            return new TemplatesResponse(this);
        }
    }

    public static final JsonpDeserializer<TemplatesResponse> _DESERIALIZER = createTemplatesResponseDeserializer();

    protected static JsonpDeserializer<TemplatesResponse> createTemplatesResponseDeserializer() {

        JsonpDeserializer<List<TemplatesRecord>> valueDeserializer = JsonpDeserializer.arrayDeserializer(TemplatesRecord._DESERIALIZER);

        return JsonpDeserializer.of(
            valueDeserializer.acceptedEvents(),
            (parser, mapper) -> new Builder().valueBody(valueDeserializer.deserialize(parser, mapper)).build()
        );
    }

}
