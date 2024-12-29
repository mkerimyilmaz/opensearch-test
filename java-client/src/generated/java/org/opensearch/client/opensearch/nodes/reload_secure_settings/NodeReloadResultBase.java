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

package org.opensearch.client.opensearch.nodes.reload_secure_settings;

import jakarta.json.stream.JsonGenerator;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: nodes.reload_secure_settings.NodeReloadResultBase

@Generated("org.opensearch.client.codegen.CodeGenerator")
public abstract class NodeReloadResultBase implements PlainJsonSerializable {

    @Nonnull
    private final String name;

    // ---------------------------------------------------------------------------------------------

    protected NodeReloadResultBase(AbstractBuilder<?> builder) {
        this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
    }

    /**
     * Required - API name: {@code name}
     */
    @Nonnull
    public final String name() {
        return this.name;
    }

    /**
     * Serialize this object to JSON.
     */
    @Override
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

    protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> extends ObjectBuilderBase {
        private String name;

        protected AbstractBuilder() {}

        protected AbstractBuilder(NodeReloadResultBase o) {
            this.name = o.name;
        }

        protected AbstractBuilder(AbstractBuilder<BuilderT> o) {
            this.name = o.name;
        }

        @Nonnull
        protected abstract BuilderT self();

        /**
         * Required - API name: {@code name}
         */
        @Nonnull
        public final BuilderT name(String value) {
            this.name = value;
            return self();
        }
    }

    // ---------------------------------------------------------------------------------------------

    protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupNodeReloadResultBaseDeserializer(
        ObjectDeserializer<BuilderT> op
    ) {
        op.add(AbstractBuilder::name, JsonpDeserializer.stringDeserializer(), "name");
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.name.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        NodeReloadResultBase other = (NodeReloadResultBase) o;
        return this.name.equals(other.name);
    }
}
