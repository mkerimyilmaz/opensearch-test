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

package org.opensearch.clients.elasticsearch.core.search;

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

// typedef: _global.search._types.StupidBackoffSmoothingModel

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_global/search/_types/suggester.ts#L202-L204">API
 *      specification</a>
 */
@JsonpDeserializable
public class StupidBackoffSmoothingModel implements SmoothingModelVariant, JsonpSerializable {
    private final double discount;

    // ---------------------------------------------------------------------------------------------

    private StupidBackoffSmoothingModel(Builder builder) {

        this.discount = ApiTypeHelper.requireNonNull(builder.discount, this, "discount");

    }

    public static StupidBackoffSmoothingModel of(Function<Builder, ObjectBuilder<StupidBackoffSmoothingModel>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * SmoothingModel variant kind.
     */
    @Override
    public SmoothingModel.Kind _smoothingModelKind() {
        return SmoothingModel.Kind.StupidBackoff;
    }

    /**
     * Required - API name: {@code discount}
     */
    public final double discount() {
        return this.discount;
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

        generator.writeKey("discount");
        generator.write(this.discount);

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link StupidBackoffSmoothingModel}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<StupidBackoffSmoothingModel> {
        private Double discount;

        /**
         * Required - API name: {@code discount}
         */
        public final Builder discount(double value) {
            this.discount = value;
            return this;
        }

        /**
         * Builds a {@link StupidBackoffSmoothingModel}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public StupidBackoffSmoothingModel build() {
            _checkSingleUse();

            return new StupidBackoffSmoothingModel(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link StupidBackoffSmoothingModel}
     */
    public static final JsonpDeserializer<StupidBackoffSmoothingModel> _DESERIALIZER = ObjectBuilderDeserializer
            .lazy(Builder::new, StupidBackoffSmoothingModel::setupStupidBackoffSmoothingModelDeserializer);

    protected static void setupStupidBackoffSmoothingModelDeserializer(
            ObjectDeserializer<StupidBackoffSmoothingModel.Builder> op) {

        op.add(Builder::discount, JsonpDeserializer.doubleDeserializer(), "discount");

    }

}