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

package org.opensearch.clients.elasticsearch._types.aggregations;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.util.ModelTypeHelper;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TermsAggregateBase

public abstract class TermsAggregateBase<TBucket> extends MultiBucketAggregateBase<TBucket> {
	@Nullable
	private final Long docCountErrorUpperBound;

	private final long sumOtherDocCount;

	// ---------------------------------------------------------------------------------------------

	protected TermsAggregateBase(AbstractBuilder<TBucket, ?> builder) {
		super(builder);

		this.docCountErrorUpperBound = builder.docCountErrorUpperBound;
		this.sumOtherDocCount = ModelTypeHelper.requireNonNull(builder.sumOtherDocCount, this, "sumOtherDocCount");

	}

	/**
	 * API name: {@code doc_count_error_upper_bound}
	 */
	@Nullable
	public final Long docCountErrorUpperBound() {
		return this.docCountErrorUpperBound;
	}

	/**
	 * Required - API name: {@code sum_other_doc_count}
	 */
	public final long sumOtherDocCount() {
		return this.sumOtherDocCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.docCountErrorUpperBound != null) {
			generator.writeKey("doc_count_error_upper_bound");
			generator.write(this.docCountErrorUpperBound);

		}
		generator.writeKey("sum_other_doc_count");
		generator.write(this.sumOtherDocCount);

	}

	protected abstract static class AbstractBuilder<TBucket, BuilderT extends AbstractBuilder<TBucket, BuilderT>>
			extends
				MultiBucketAggregateBase.AbstractBuilder<TBucket, BuilderT> {
		@Nullable
		private Long docCountErrorUpperBound;

		private Long sumOtherDocCount;

		/**
		 * API name: {@code doc_count_error_upper_bound}
		 */
		public final BuilderT docCountErrorUpperBound(@Nullable Long value) {
			this.docCountErrorUpperBound = value;
			return self();
		}

		/**
		 * Required - API name: {@code sum_other_doc_count}
		 */
		public final BuilderT sumOtherDocCount(long value) {
			this.sumOtherDocCount = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <TBucket, BuilderT extends AbstractBuilder<TBucket, BuilderT>> void setupTermsAggregateBaseDeserializer(
			DelegatingDeserializer<BuilderT> op, JsonpDeserializer<TBucket> tBucketDeserializer) {
		setupMultiBucketAggregateBaseDeserializer(op, tBucketDeserializer);
		op.add(AbstractBuilder::docCountErrorUpperBound, JsonpDeserializer.longDeserializer(),
				"doc_count_error_upper_bound");
		op.add(AbstractBuilder::sumOtherDocCount, JsonpDeserializer.longDeserializer(), "sum_other_doc_count");

	}

}
