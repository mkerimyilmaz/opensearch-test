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

package org.opensearch.clients.opensearch.core.bulk;

import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.NdJsonpSerializable;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import org.opensearch.clients.util.TaggedUnion;
import org.opensearch.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Iterator;
import java.util.function.Function;

// typedef: _global.bulk.OperationContainer

public class Operation implements TaggedUnion<Object>, NdJsonpSerializable, JsonpSerializable {

	public static final String INDEX = "index";
	public static final String CREATE = "create";
	public static final String UPDATE = "update";
	public static final String DELETE = "delete";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public Operation(OperationVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Operation(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Operation of(Function<Builder, ObjectBuilder<Operation>> fn) {
		return fn.apply(new Builder()).build();
	}

	@Override
	public Iterator<?> _serializables() {
		return TaggedUnionUtils.ndJsonIterator(this);
	}
	/**
	 * Get the {@code index} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code index} kind.
	 */
	public <TDocument> IndexOperation<TDocument> index() {
		return TaggedUnionUtils.get(this, INDEX);
	}

	/**
	 * Get the {@code create} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code create} kind.
	 */
	public <TDocument> CreateOperation<TDocument> create() {
		return TaggedUnionUtils.get(this, CREATE);
	}

	/**
	 * Get the {@code update} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code update} kind.
	 */
	public <TDocument> UpdateOperation<TDocument> update() {
		return TaggedUnionUtils.get(this, UPDATE);
	}

	/**
	 * Get the {@code delete} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code delete} kind.
	 */
	public DeleteOperation delete() {
		return TaggedUnionUtils.get(this, DELETE);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Operation> {
		private String _type;
		private Object _value;

		public <TDocument> Builder index(IndexOperation<TDocument> v) {
			this._type = INDEX;
			this._value = v;
			return this;
		}

		public <TDocument> Builder index(
				Function<IndexOperation.Builder<TDocument>, ObjectBuilder<IndexOperation<TDocument>>> f) {
			return this.index(f.apply(new IndexOperation.Builder<TDocument>()).build());
		}

		public <TDocument> Builder create(CreateOperation<TDocument> v) {
			this._type = CREATE;
			this._value = v;
			return this;
		}

		public <TDocument> Builder create(
				Function<CreateOperation.Builder<TDocument>, ObjectBuilder<CreateOperation<TDocument>>> f) {
			return this.create(f.apply(new CreateOperation.Builder<TDocument>()).build());
		}

		public <TDocument> Builder update(UpdateOperation<TDocument> v) {
			this._type = UPDATE;
			this._value = v;
			return this;
		}

		public <TDocument> Builder update(
				Function<UpdateOperation.Builder<TDocument>, ObjectBuilder<UpdateOperation<TDocument>>> f) {
			return this.update(f.apply(new UpdateOperation.Builder<TDocument>()).build());
		}

		public Builder delete(DeleteOperation v) {
			this._type = DELETE;
			this._value = v;
			return this;
		}

		public Builder delete(Function<DeleteOperation.Builder, ObjectBuilder<DeleteOperation>> f) {
			return this.delete(f.apply(new DeleteOperation.Builder()).build());
		}

		public Operation build() {
			_checkSingleUse();
			return new Operation(this);
		}

	}

}
