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

import org.opensearch.clients.util.QuadConsumer;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;
import jakarta.json.stream.JsonParsingException;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

public class ObjectDeserializer<ObjectType> extends DelegatingDeserializer<ObjectType>
    implements InstanceDeserializer<ObjectType, ObjectType> {

    /** A field deserializer parses a value and calls the setter on the target object. */
    public abstract static class FieldDeserializer<ObjectType> {
        protected final String name;
        protected final String[] deprecatedNames;

        public FieldDeserializer(String name, String[] deprecatedNames) {
            this.name = name;
            this.deprecatedNames = deprecatedNames;
        }

        public abstract void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object);

        public abstract void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object, Event event);
    }

    /** Field deserializer for objects (and boxed primitives) */
    public static class FieldObjectDeserializer<ObjectType, FieldType> extends FieldDeserializer<ObjectType> {
        private final BiConsumer<ObjectType, FieldType> setter;
        private final JsonpDeserializer<FieldType> deserializer;

        public FieldObjectDeserializer(
            BiConsumer<ObjectType, FieldType> setter, JsonpDeserializer<FieldType> deserializer,
            String name, String[] deprecatedNames
        ) {
            super(name, deprecatedNames);
            this.setter = setter;
            this.deserializer = deserializer;
        }

        public String name() {
            return this.name;
        }

        public void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object) {
            FieldType fieldValue = deserializer.deserialize(parser, mapper);
            setter.accept(object, fieldValue);
        }

        public void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object, Event event) {
            JsonpUtils.ensureAccepts(deserializer, parser, event);
            FieldType fieldValue = deserializer.deserialize(parser, mapper, event);
            setter.accept(object, fieldValue);
        }
    }

    private static final FieldDeserializer<?> IGNORED_FIELD = new FieldDeserializer<Object>("-", null) {

        @Override
        public void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, Object object) {
            JsonpUtils.skipValue(parser);
        }

        @Override
        public void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, Object object, Event event) {
            JsonpUtils.skipValue(parser, event);
        }
    };

    //---------------------------------------------------------------------------------------------
    private static final EnumSet<Event> EventSetObject = EnumSet.of(Event.START_OBJECT);

    private EnumSet<Event> acceptedEvents = EventSetObject; // May be changed in `shortcutProperty()`
    private final Supplier<ObjectType> constructor;
    protected final Map<String, FieldDeserializer<ObjectType>> fieldDeserializers;
    private FieldDeserializer<ObjectType> singleKey;
    private String typeProperty;
    private FieldDeserializer<ObjectType> shortcutProperty;
    private QuadConsumer<ObjectType, String, JsonParser, JsonpMapper> unknownFieldHandler;

    public ObjectDeserializer(Supplier<ObjectType> constructor) {
        this.constructor = constructor;
        this.fieldDeserializers = new HashMap<>();
    }

    @Override
    public EnumSet<Event> acceptedEvents() {
        return acceptedEvents;
    }

    public ObjectType deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
        return deserialize(constructor.get(), parser, mapper, event);
    }

    @Override
    public ObjectType deserialize(JsonParser parser, JsonpMapper mapper) {
        Event event = parser.next();
        JsonpUtils.ensureAccepts(this, parser, event);
        return deserialize(parser, mapper, event);
    }

    public ObjectType deserialize(ObjectType value, JsonParser parser, JsonpMapper mapper, Event event) {
        if (event == Event.VALUE_NULL) {
            return null;
        }

        if (singleKey != null) {
            // There's a wrapping property whose name is the key value
            event = JsonpUtils.expectNextEvent(parser, Event.KEY_NAME);
            singleKey.deserialize(parser, mapper, null, value, event);
            event = parser.next();
        }

        if (shortcutProperty != null && event != Event.START_OBJECT) {
            // This is the shortcut property (should be a value event, this will be checked by its deserializer)
            shortcutProperty.deserialize(parser, mapper, shortcutProperty.name, value, event);

        } else {
            JsonpUtils.expectEvent(parser, Event.START_OBJECT, event);
            if (typeProperty == null) {
                // Regular object: read all properties until we reach the end of the object
                while ((event = parser.next()) != Event.END_OBJECT) {

                    JsonpUtils.expectEvent(parser, Event.KEY_NAME, event);
                    String fieldName = parser.getString();

                    FieldDeserializer<ObjectType> fieldDeserializer = fieldDeserializers.get(fieldName);
                    if (fieldDeserializer == null) {
                        parseUnknownField(parser, mapper, fieldName, value);
                    } else {
                        fieldDeserializer.deserialize(parser, mapper, fieldName, value);
                    }
                }

            } else {
                // Union variant: find the property to find the proper deserializer
                Map.Entry<String, JsonParser> unionInfo = JsonpUtils.lookAheadFieldValue(typeProperty, parser, mapper);
                String variant = unionInfo.getKey();
                JsonParser innerParser = unionInfo.getValue();

                FieldDeserializer<ObjectType> fieldDeserializer = fieldDeserializers.get(variant);
                if (fieldDeserializer == null) {
                    parseUnknownField(parser, mapper, variant, value);
                } else {
                    fieldDeserializer.deserialize(innerParser, mapper, variant, value);
                }
            }
        }

        if (singleKey != null) {
            JsonpUtils.expectNextEvent(parser, Event.END_OBJECT);
        }

        return value;
    }

    protected void parseUnknownField(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object) {
        if (this.unknownFieldHandler != null) {
            this.unknownFieldHandler.accept(object, fieldName, parser, mapper);

        } else if (mapper.ignoreUnknownFields()) {
            JsonpUtils.skipValue(parser);

        } else {
            throw new JsonParsingException(
                "Unknown field [" + fieldName + "] for type [" + object.getClass().getName() +"]",
                parser.getLocation()
            );
        }
    }

    public void setUnknownFieldHandler(QuadConsumer<ObjectType, String, JsonParser, JsonpMapper> unknownFieldHandler) {
        this.unknownFieldHandler = unknownFieldHandler;
    }

    @SuppressWarnings("unchecked")
    public void ignore(String name) {
        this.fieldDeserializers.put(name, (FieldDeserializer<ObjectType>) IGNORED_FIELD);
    }

    @Override
    public void shortcutProperty(String name) {
        this.shortcutProperty = this.fieldDeserializers.get(name);
        if (this.shortcutProperty == null) {
            throw new NoSuchElementException("No deserializer was setup for '" + name + "'");
        }

        acceptedEvents = EnumSet.of(Event.START_OBJECT, Event.VALUE_STRING);
    }

    //----- Object types

    @Override
    public <FieldType> void add(
        BiConsumer<ObjectType, FieldType> setter,
        JsonpDeserializer<FieldType> deserializer,
        String name, String... deprecatedNames
    ) {
        FieldObjectDeserializer<ObjectType, FieldType> fieldDeserializer =
            new FieldObjectDeserializer<>(setter, deserializer, name, deprecatedNames);
        this.fieldDeserializers.put(name, fieldDeserializer);
        for (String alias: deprecatedNames) {
            this.fieldDeserializers.put(alias, fieldDeserializer);
        }
    }

    @Override
    public <FieldType> void setKey(BiConsumer<ObjectType, FieldType> setter, JsonpDeserializer<FieldType> deserializer) {
        this.singleKey = new FieldObjectDeserializer<>(setter, deserializer, null, null);
    }

    @Override
    public void setTypeProperty(String name) {
        this.typeProperty = name;
    }

    //----- Primitive types

    public void add(ObjIntConsumer<ObjectType> setter, String name, String... deprecatedNames) {
        // FIXME (perf): add specialized deserializer to avoid intermediate boxing
        add(setter::accept, integerDeserializer(), name, deprecatedNames);
    }

// Experiment: avoid boxing, allow multiple primitive parsers (e.g. int as number & string)
//    public void add(
//        ObjIntConsumer<ObjectType> setter,
//        JsonpIntParser vp,
//        String name, String... deprecatedNames
//    ) {
//        this.fieldDeserializers.put(name, new FieldDeserializer<ObjectType>(name, deprecatedNames) {
//            @Override
//            public void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object) {
//                JsonpUtils.expectNextEvent(parser, Event.VALUE_NUMBER);
//                setter.accept(object, vp.parse(parser));
//            }
//        });
//    }
//
//    public static class JsonpIntParser {
//        public int parse(JsonParser parser) {
//            JsonpUtils.expectNextEvent(parser, Event.VALUE_NUMBER);
//            return parser.getInt();
//        }
//    }

}
