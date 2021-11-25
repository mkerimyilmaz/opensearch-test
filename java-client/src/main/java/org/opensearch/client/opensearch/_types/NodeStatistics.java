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

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.NodeStatistics
@JsonpDeserializable
public class NodeStatistics implements JsonpSerializable {
	private final List<ErrorCause> failures;

	private final int total;

	private final int successful;

	private final int failed;

	// ---------------------------------------------------------------------------------------------

	private NodeStatistics(Builder builder) {

		this.failures = ModelTypeHelper.unmodifiable(builder.failures);
		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");
		this.successful = ModelTypeHelper.requireNonNull(builder.successful, this, "successful");
		this.failed = ModelTypeHelper.requireNonNull(builder.failed, this, "failed");

	}

	public static NodeStatistics of(Function<Builder, ObjectBuilder<NodeStatistics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code failures}
	 */
	public final List<ErrorCause> failures() {
		return this.failures;
	}

	/**
	 * Required - Total number of nodes selected by the request.
	 * <p>
	 * API name: {@code total}
	 */
	public final int total() {
		return this.total;
	}

	/**
	 * Required - Number of nodes that responded successfully to the request.
	 * <p>
	 * API name: {@code successful}
	 */
	public final int successful() {
		return this.successful;
	}

	/**
	 * Required - Number of nodes that rejected the request or failed to respond. If
	 * this value is not 0, a reason for the rejection or failure is included in the
	 * response.
	 * <p>
	 * API name: {@code failed}
	 */
	public final int failed() {
		return this.failed;
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

		if (ModelTypeHelper.isDefined(this.failures)) {
			generator.writeKey("failures");
			generator.writeStartArray();
			for (ErrorCause item0 : this.failures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("successful");
		generator.write(this.successful);

		generator.writeKey("failed");
		generator.write(this.failed);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeStatistics}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeStatistics> {
		@Nullable
		private List<ErrorCause> failures;

		private Integer total;

		private Integer successful;

		private Integer failed;

		/**
		 * API name: {@code failures}
		 */
		public final Builder failures(@Nullable List<ErrorCause> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public final Builder failures(ErrorCause... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		@SafeVarargs
		public final Builder failures(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>>... fns) {
			this.failures = new ArrayList<>(fns.length);
			for (Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn : fns) {
				this.failures.add(fn.apply(new ErrorCause.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - Total number of nodes selected by the request.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder total(int value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - Number of nodes that responded successfully to the request.
		 * <p>
		 * API name: {@code successful}
		 */
		public final Builder successful(int value) {
			this.successful = value;
			return this;
		}

		/**
		 * Required - Number of nodes that rejected the request or failed to respond. If
		 * this value is not 0, a reason for the rejection or failure is included in the
		 * response.
		 * <p>
		 * API name: {@code failed}
		 */
		public final Builder failed(int value) {
			this.failed = value;
			return this;
		}

		/**
		 * Builds a {@link NodeStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeStatistics build() {
			_checkSingleUse();

			return new NodeStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeStatistics}
	 */
	public static final JsonpDeserializer<NodeStatistics> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeStatistics::setupNodeStatisticsDeserializer, Builder::build);

	protected static void setupNodeStatisticsDeserializer(DelegatingDeserializer<NodeStatistics.Builder> op) {

		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER), "failures");
		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");
		op.add(Builder::successful, JsonpDeserializer.integerDeserializer(), "successful");
		op.add(Builder::failed, JsonpDeserializer.integerDeserializer(), "failed");

	}

}
