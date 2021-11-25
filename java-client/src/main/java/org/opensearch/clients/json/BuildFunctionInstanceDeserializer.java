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

package org.opensearch.clients.json;

import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;

import java.util.function.Function;

/**
 * An instance deserializer based on a builder object deserializer and a build function
 */
public class BuildFunctionInstanceDeserializer<B, T> implements InstanceDeserializer<B, ObjectBuilder<T>> {

    private final InstanceDeserializer<B, B> builderDeserializer;
    private final Function<B, T> build;

    public BuildFunctionInstanceDeserializer(InstanceDeserializer<B, B> builderDeserializer, Function<B, T> buildFn) {
        this.builderDeserializer = builderDeserializer;
        this.build = buildFn;
    }

    @Override
    public ObjectBuilder<T> deserialize(B builder, JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
        builderDeserializer.deserialize(builder, parser, mapper, event);
        return () -> build.apply(builder);
    }
}
