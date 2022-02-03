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

package org.opensearch.clients.json.jackson;

import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpDeserializerBase;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpMapperBase;
import org.opensearch.clients.json.JsonpSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;

import java.io.IOException;
import java.util.EnumSet;

public class JacksonJsonpMapper extends JsonpMapperBase {

    private final JacksonJsonProvider provider;
    private final ObjectMapper objectMapper;

    public JacksonJsonpMapper(ObjectMapper objectMapper) {
        this.provider = new JacksonJsonProvider();
        this.objectMapper = objectMapper
            .configure(SerializationFeature.INDENT_OUTPUT, false)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public JacksonJsonpMapper() {
        this(new ObjectMapper());
    }

    /**
     * Returns the underlying Jackson mapper.
     */
    public ObjectMapper objectMapper() {
        return this.objectMapper;
    }

    @Override
    public JsonProvider jsonProvider() {
        return provider;
    }

    @Override
    protected  <T> JsonpDeserializer<T> getDefaultDeserializer(Class<T> clazz) {
        return new JacksonValueParser<>(clazz);
    }

    @Override
    public <T> void serialize(T value, JsonGenerator generator) {

        if (!(generator instanceof JacksonJsonpGenerator)) {
            throw new IllegalArgumentException("Jackson's ObjectMapper can only be used with the JacksonJsonpProvider");
        }

        JsonpSerializer<T> serializer = findSerializer(value);
        if (serializer != null) {
            serializer.serialize(value, generator, this);
            return;
        }

        com.fasterxml.jackson.core.JsonGenerator jkGenerator = ((JacksonJsonpGenerator)generator).jacksonGenerator();
        try {
            objectMapper.writeValue(jkGenerator, value);
        } catch (IOException ioe) {
            throw JacksonUtils.convertException(ioe);
        }
    }

    private class JacksonValueParser<T> extends JsonpDeserializerBase<T> {

        private final Class<T> clazz;

        protected JacksonValueParser(Class<T> clazz) {
            super(EnumSet.allOf(JsonParser.Event.class));
            this.clazz = clazz;
        }

        @Override
        public T deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

            if (!(parser instanceof JacksonJsonpParser)) {
                throw new IllegalArgumentException("Jackson's ObjectMapper can only be used with the JacksonJsonpProvider");
            }

            com.fasterxml.jackson.core.JsonParser jkParser = ((JacksonJsonpParser)parser).jacksonParser();

            try {
                return objectMapper.readValue(jkParser, clazz);
            } catch(IOException ioe) {
                throw JacksonUtils.convertException(ioe);
            }
        }
    }
}
