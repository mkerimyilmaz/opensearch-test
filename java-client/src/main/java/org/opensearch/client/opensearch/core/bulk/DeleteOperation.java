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

package org.opensearch.client.opensearch.core.bulk;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import java.util.function.Function;

// typedef: _global.bulk.DeleteOperation
@JsonpDeserializable
public class DeleteOperation extends OperationBase implements OperationVariant {
	// ---------------------------------------------------------------------------------------------

	private DeleteOperation(Builder builder) {
		super(builder);

	}

	public static DeleteOperation of(Function<Builder, ObjectBuilder<DeleteOperation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Operation} variant type
	 */
	@Override
	public String _variantType() {
		return "delete";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteOperation}.
	 */
	public static class Builder extends OperationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteOperation> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteOperation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteOperation build() {
			_checkSingleUse();

			return new DeleteOperation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeleteOperation}
	 */
	public static final JsonpDeserializer<DeleteOperation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DeleteOperation::setupDeleteOperationDeserializer, Builder::build);

	protected static void setupDeleteOperationDeserializer(DelegatingDeserializer<DeleteOperation.Builder> op) {
		setupOperationBaseDeserializer(op);

	}

}
