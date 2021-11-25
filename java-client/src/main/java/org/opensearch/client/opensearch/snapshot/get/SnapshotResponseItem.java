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

package org.opensearch.client.opensearch.snapshot.get;

import org.opensearch.client.opensearch._types.ErrorCause;
import org.opensearch.client.opensearch.snapshot.SnapshotInfo;
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

import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot.get.SnapshotResponseItem
@JsonpDeserializable
public class SnapshotResponseItem implements JsonpSerializable {
	private final String repository;

	private final List<SnapshotInfo> snapshots;

	@Nullable
	private final ErrorCause error;

	// ---------------------------------------------------------------------------------------------

	private SnapshotResponseItem(Builder builder) {

		this.repository = ModelTypeHelper.requireNonNull(builder.repository, this, "repository");
		this.snapshots = ModelTypeHelper.unmodifiable(builder.snapshots);
		this.error = builder.error;

	}

	public static SnapshotResponseItem of(Function<Builder, ObjectBuilder<SnapshotResponseItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code repository}
	 */
	public final String repository() {
		return this.repository;
	}

	/**
	 * API name: {@code snapshots}
	 */
	public final List<SnapshotInfo> snapshots() {
		return this.snapshots;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final ErrorCause error() {
		return this.error;
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

		generator.writeKey("repository");
		generator.write(this.repository);

		if (ModelTypeHelper.isDefined(this.snapshots)) {
			generator.writeKey("snapshots");
			generator.writeStartArray();
			for (SnapshotInfo item0 : this.snapshots) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.error != null) {
			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotResponseItem}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SnapshotResponseItem> {
		private String repository;

		@Nullable
		private List<SnapshotInfo> snapshots;

		@Nullable
		private ErrorCause error;

		/**
		 * Required - API name: {@code repository}
		 */
		public final Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 */
		public final Builder snapshots(@Nullable List<SnapshotInfo> value) {
			this.snapshots = value;
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 */
		public final Builder snapshots(SnapshotInfo... value) {
			this.snapshots = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 */
		@SafeVarargs
		public final Builder snapshots(Function<SnapshotInfo.Builder, ObjectBuilder<SnapshotInfo>>... fns) {
			this.snapshots = new ArrayList<>(fns.length);
			for (Function<SnapshotInfo.Builder, ObjectBuilder<SnapshotInfo>> fn : fns) {
				this.snapshots.add(fn.apply(new SnapshotInfo.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Builds a {@link SnapshotResponseItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotResponseItem build() {
			_checkSingleUse();

			return new SnapshotResponseItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnapshotResponseItem}
	 */
	public static final JsonpDeserializer<SnapshotResponseItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnapshotResponseItem::setupSnapshotResponseItemDeserializer, Builder::build);

	protected static void setupSnapshotResponseItemDeserializer(
			DelegatingDeserializer<SnapshotResponseItem.Builder> op) {

		op.add(Builder::repository, JsonpDeserializer.stringDeserializer(), "repository");
		op.add(Builder::snapshots, JsonpDeserializer.arrayDeserializer(SnapshotInfo._DESERIALIZER), "snapshots");
		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");

	}

}
