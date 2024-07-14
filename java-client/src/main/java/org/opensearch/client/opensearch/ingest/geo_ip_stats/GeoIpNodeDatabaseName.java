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

package org.opensearch.client.opensearch.ingest.geo_ip_stats;

import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: ingest.geo_ip_stats.GeoIpNodeDatabaseName

@JsonpDeserializable
public class GeoIpNodeDatabaseName implements PlainJsonSerializable {
    private final String name;

    // ---------------------------------------------------------------------------------------------

    private GeoIpNodeDatabaseName(Builder builder) {

        this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

    }

    public static GeoIpNodeDatabaseName of(Function<Builder, ObjectBuilder<GeoIpNodeDatabaseName>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - Name of the database.
     * <p>
     * API name: {@code name}
     */
    public final String name() {
        return this.name;
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

        generator.writeKey("name");
        generator.write(this.name);

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link GeoIpNodeDatabaseName}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GeoIpNodeDatabaseName> {
        private String name;

        /**
         * Required - Name of the database.
         * <p>
         * API name: {@code name}
         */
        public final Builder name(String value) {
            this.name = value;
            return this;
        }

        /**
         * Builds a {@link GeoIpNodeDatabaseName}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public GeoIpNodeDatabaseName build() {
            _checkSingleUse();

            return new GeoIpNodeDatabaseName(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link GeoIpNodeDatabaseName}
     */
    public static final JsonpDeserializer<GeoIpNodeDatabaseName> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        GeoIpNodeDatabaseName::setupGeoIpNodeDatabaseNameDeserializer
    );

    protected static void setupGeoIpNodeDatabaseNameDeserializer(ObjectDeserializer<GeoIpNodeDatabaseName.Builder> op) {

        op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

    }

}
