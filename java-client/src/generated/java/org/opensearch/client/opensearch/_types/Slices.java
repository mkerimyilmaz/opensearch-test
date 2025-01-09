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
import javax.annotation.Nonnull;
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

// typedef: _types.Slices

/**
 * The slice configuration used to parallelize a process.
 */
@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class Slices implements TaggedUnion<Slices.Kind, Object>, PlainJsonSerializable {
    /**
     * {@link Slices} variant kinds.
     */
    public enum Kind {
        Calculation,
        Count
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

    private Slices(Kind kind, Object value) {
        this._kind = kind;
        this._value = value;
    }

    private Slices(Builder builder) {
        this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
        this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
    }

    public static Slices of(Function<Slices.Builder, ObjectBuilder<Slices>> fn) {
        return fn.apply(new Builder()).build();
    }

    public String _toJsonString() {
        switch (_kind) {
            case Calculation:
                return this.calculation().jsonValue();
            case Count:
                return String.valueOf(this.count());
            default:
                throw new IllegalStateException("Unknown kind " + _kind);
        }
    }

    /**
     * Is this variant instance of kind {@code calculation}?
     */
    public boolean isCalculation() {
        return _kind == Kind.Calculation;
    }

    /**
     * Get the {@code calculation} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code calculation} kind.
     */
    public SlicesCalculation calculation() {
        return TaggedUnionUtils.get(this, Kind.Calculation);
    }

    /**
     * Is this variant instance of kind {@code count}?
     */
    public boolean isCount() {
        return _kind == Kind.Count;
    }

    /**
     * Get the {@code count} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code count} kind.
     */
    public Integer count() {
        return TaggedUnionUtils.get(this, Kind.Count);
    }

    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        if (_value instanceof JsonpSerializable) {
            ((JsonpSerializable) _value).serialize(generator, mapper);
        } else {
            switch (_kind) {
                case Count:
                    generator.write(((Integer) this._value));
                    break;
            }
        }
    }

    @Nonnull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Nonnull
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Slices> {
        private Kind _kind;
        private Object _value;

        public Builder() {}

        private Builder(Slices o) {
            this._kind = o._kind;
            this._value = o._value;
        }

        public ObjectBuilder<Slices> calculation(SlicesCalculation v) {
            this._kind = Kind.Calculation;
            this._value = v;
            return this;
        }

        public ObjectBuilder<Slices> count(Integer v) {
            this._kind = Kind.Count;
            this._value = v;
            return this;
        }

        @Override
        public Slices build() {
            _checkSingleUse();
            return new Slices(this);
        }
    }

    private static JsonpDeserializer<Slices> buildSlicesDeserializer() {
        return new UnionDeserializer.Builder<Slices, Kind, Object>(Slices::new, false).addMember(
            Kind.Calculation,
            SlicesCalculation._DESERIALIZER
        ).addMember(Kind.Count, JsonpDeserializer.integerDeserializer()).build();
    }

    public static final JsonpDeserializer<Slices> _DESERIALIZER = JsonpDeserializer.lazy(Slices::buildSlicesDeserializer);

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
        Slices other = (Slices) o;
        return Objects.equals(this._kind, other._kind) && Objects.equals(this._value, other._value);
    }
}
