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

package org.opensearch.client.opensearch._types;

import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Generated;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.json.UnionDeserializer;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import org.opensearch.client.util.TaggedUnion;
import org.opensearch.client.util.TaggedUnionUtils;

// typedef: _types.ScriptLanguage

@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class ScriptLanguage implements TaggedUnion<ScriptLanguage.Kind, Object>, PlainJsonSerializable {
    /**
     * {@link ScriptLanguage} variant kinds.
     */
    public enum Kind {
        Builtin,
        Custom
    }

    private final Kind _kind;
    private final Object _value;

    @Override
    public final Kind _kind() {
        return _kind;
    }

    @Override
    public final Object _get() {
        return _value;
    }

    private ScriptLanguage(Kind kind, Object value) {
        this._kind = kind;
        this._value = value;
    }

    private ScriptLanguage(Builder builder) {
        this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
        this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
    }

    public static ScriptLanguage of(Function<ScriptLanguage.Builder, ObjectBuilder<ScriptLanguage>> fn) {
        return fn.apply(new Builder()).build();
    }

    public String _toJsonString() {
        switch (_kind) {
            case Builtin:
                return this.builtin().jsonValue();
            case Custom:
                return this.custom();
            default:
                throw new IllegalStateException("Unknown kind " + _kind);
        }
    }

    /**
     * Is this variant instance of kind {@code builtin}?
     */
    public boolean isBuiltin() {
        return _kind == Kind.Builtin;
    }

    /**
     * Get the {@code builtin} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code builtin} kind.
     */
    public BuiltinScriptLanguage builtin() {
        return TaggedUnionUtils.get(this, Kind.Builtin);
    }

    /**
     * Is this variant instance of kind {@code custom}?
     */
    public boolean isCustom() {
        return _kind == Kind.Custom;
    }

    /**
     * Get the {@code custom} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code custom} kind.
     */
    public String custom() {
        return TaggedUnionUtils.get(this, Kind.Custom);
    }

    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        if (_value instanceof JsonpSerializable) {
            ((JsonpSerializable) _value).serialize(generator, mapper);
        } else {
            switch (_kind) {
                case Custom:
                    generator.write(((String) this._value));
                    break;
            }
        }
    }

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ScriptLanguage> {
        private Kind _kind;
        private Object _value;

        public ObjectBuilder<ScriptLanguage> builtin(BuiltinScriptLanguage v) {
            this._kind = Kind.Builtin;
            this._value = v;
            return this;
        }

        public ObjectBuilder<ScriptLanguage> custom(String v) {
            this._kind = Kind.Custom;
            this._value = v;
            return this;
        }

        @Override
        public ScriptLanguage build() {
            _checkSingleUse();
            return new ScriptLanguage(this);
        }
    }

    private static JsonpDeserializer<ScriptLanguage> buildScriptLanguageDeserializer() {
        return new UnionDeserializer.Builder<ScriptLanguage, Kind, Object>(ScriptLanguage::new, true).addMember(
            Kind.Builtin,
            BuiltinScriptLanguage._DESERIALIZER
        ).addMember(Kind.Custom, JsonpDeserializer.stringDeserializer()).build();
    }

    public static final JsonpDeserializer<ScriptLanguage> _DESERIALIZER = JsonpDeserializer.lazy(
        ScriptLanguage::buildScriptLanguageDeserializer
    );

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hashCode(this._kind);
        result = 31 * result + Objects.hashCode(this._value);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        ScriptLanguage other = (ScriptLanguage) o;
        return Objects.equals(this._kind, other._kind) && Objects.equals(this._value, other._value);
    }
}
