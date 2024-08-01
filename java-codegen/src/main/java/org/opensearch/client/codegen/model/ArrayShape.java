/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.codegen.model;

import java.util.Collection;
import java.util.List;

public class ArrayShape extends ObjectShape {
    private final Field valueBodyField;

    public ArrayShape(Namespace parent, String className, Type arrayType, String typedefName, String description) {
        super(parent, className, typedefName, description);
        this.valueBodyField = new Field("_value_body", arrayType, true, "Response value.", null);
    }

    @Override
    public Collection<Field> getFields() {
        return List.of(valueBodyField);
    }

    @Override
    public Collection<Type> getAnnotations() {
        return List.of(Types.Client.Json.JsonpDeserializable);
    }

    @Override
    public Collection<Type> getImplementsTypes() {
        return List.of(Types.Client.Json.PlainJsonSerializable);
    }

    public Field getValueBodyField() {
        return valueBodyField;
    }
}
