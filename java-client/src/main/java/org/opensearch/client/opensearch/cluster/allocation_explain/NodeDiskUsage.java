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

package org.opensearch.client.opensearch.cluster.allocation_explain;

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

// typedef: cluster.allocation_explain.NodeDiskUsage

@JsonpDeserializable
public class NodeDiskUsage implements PlainJsonSerializable {
    private final String nodeName;

    private final DiskUsage leastAvailable;

    private final DiskUsage mostAvailable;

    // ---------------------------------------------------------------------------------------------

    private NodeDiskUsage(Builder builder) {

        this.nodeName = ApiTypeHelper.requireNonNull(builder.nodeName, this, "nodeName");
        this.leastAvailable = ApiTypeHelper.requireNonNull(builder.leastAvailable, this, "leastAvailable");
        this.mostAvailable = ApiTypeHelper.requireNonNull(builder.mostAvailable, this, "mostAvailable");

    }

    public static NodeDiskUsage of(Function<Builder, ObjectBuilder<NodeDiskUsage>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code node_name}
     */
    public final String nodeName() {
        return this.nodeName;
    }

    /**
     * Required - API name: {@code least_available}
     */
    public final DiskUsage leastAvailable() {
        return this.leastAvailable;
    }

    /**
     * Required - API name: {@code most_available}
     */
    public final DiskUsage mostAvailable() {
        return this.mostAvailable;
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

        generator.writeKey("node_name");
        generator.write(this.nodeName);

        generator.writeKey("least_available");
        this.leastAvailable.serialize(generator, mapper);

        generator.writeKey("most_available");
        this.mostAvailable.serialize(generator, mapper);

    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link NodeDiskUsage}.
     */

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeDiskUsage> {
        private String nodeName;

        private DiskUsage leastAvailable;

        private DiskUsage mostAvailable;

        /**
         * Required - API name: {@code node_name}
         */
        public final Builder nodeName(String value) {
            this.nodeName = value;
            return this;
        }

        /**
         * Required - API name: {@code least_available}
         */
        public final Builder leastAvailable(DiskUsage value) {
            this.leastAvailable = value;
            return this;
        }

        /**
         * Required - API name: {@code least_available}
         */
        public final Builder leastAvailable(Function<DiskUsage.Builder, ObjectBuilder<DiskUsage>> fn) {
            return this.leastAvailable(fn.apply(new DiskUsage.Builder()).build());
        }

        /**
         * Required - API name: {@code most_available}
         */
        public final Builder mostAvailable(DiskUsage value) {
            this.mostAvailable = value;
            return this;
        }

        /**
         * Required - API name: {@code most_available}
         */
        public final Builder mostAvailable(Function<DiskUsage.Builder, ObjectBuilder<DiskUsage>> fn) {
            return this.mostAvailable(fn.apply(new DiskUsage.Builder()).build());
        }

        /**
         * Builds a {@link NodeDiskUsage}.
         *
         * @throws NullPointerException
         *             if some of the required fields are null.
         */
        public NodeDiskUsage build() {
            _checkSingleUse();

            return new NodeDiskUsage(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link NodeDiskUsage}
     */
    public static final JsonpDeserializer<NodeDiskUsage> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        NodeDiskUsage::setupNodeDiskUsageDeserializer
    );

    protected static void setupNodeDiskUsageDeserializer(ObjectDeserializer<NodeDiskUsage.Builder> op) {

        op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node_name");
        op.add(Builder::leastAvailable, DiskUsage._DESERIALIZER, "least_available");
        op.add(Builder::mostAvailable, DiskUsage._DESERIALIZER, "most_available");

    }

}
