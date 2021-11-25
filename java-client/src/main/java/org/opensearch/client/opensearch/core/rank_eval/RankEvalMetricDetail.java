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

package org.opensearch.client.opensearch.core.rank_eval;

import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonData;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ModelTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

// typedef: _global.rank_eval.RankEvalMetricDetail
@JsonpDeserializable
public class RankEvalMetricDetail implements JsonpSerializable {
	private final double metricScore;

	private final List<UnratedDocument> unratedDocs;

	private final List<RankEvalHitItem> hits;

	private final Map<String, Map<String, JsonData>> metricDetails;

	// ---------------------------------------------------------------------------------------------

	private RankEvalMetricDetail(Builder builder) {

		this.metricScore = ModelTypeHelper.requireNonNull(builder.metricScore, this, "metricScore");
		this.unratedDocs = ModelTypeHelper.unmodifiableRequired(builder.unratedDocs, this, "unratedDocs");
		this.hits = ModelTypeHelper.unmodifiableRequired(builder.hits, this, "hits");
		this.metricDetails = ModelTypeHelper.unmodifiableRequired(builder.metricDetails, this, "metricDetails");

	}

	public static RankEvalMetricDetail of(Function<Builder, ObjectBuilder<RankEvalMetricDetail>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The metric_score in the details section shows the contribution of
	 * this query to the global quality metric score
	 * <p>
	 * API name: {@code metric_score}
	 */
	public final double metricScore() {
		return this.metricScore;
	}

	/**
	 * Required - The unrated_docs section contains an _index and _id entry for each
	 * document in the search result for this query that didn't have a ratings
	 * value. This can be used to ask the user to supply ratings for these documents
	 * <p>
	 * API name: {@code unrated_docs}
	 */
	public final List<UnratedDocument> unratedDocs() {
		return this.unratedDocs;
	}

	/**
	 * Required - The hits section shows a grouping of the search results with their
	 * supplied ratings
	 * <p>
	 * API name: {@code hits}
	 */
	public final List<RankEvalHitItem> hits() {
		return this.hits;
	}

	/**
	 * Required - The metric_details give additional information about the
	 * calculated quality metric (e.g. how many of the retrieved documents were
	 * relevant). The content varies for each metric but allows for better
	 * interpretation of the results
	 * <p>
	 * API name: {@code metric_details}
	 */
	public final Map<String, Map<String, JsonData>> metricDetails() {
		return this.metricDetails;
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

		generator.writeKey("metric_score");
		generator.write(this.metricScore);

		if (ModelTypeHelper.isDefined(this.unratedDocs)) {
			generator.writeKey("unrated_docs");
			generator.writeStartArray();
			for (UnratedDocument item0 : this.unratedDocs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.hits)) {
			generator.writeKey("hits");
			generator.writeStartArray();
			for (RankEvalHitItem item0 : this.hits) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.metricDetails)) {
			generator.writeKey("metric_details");
			generator.writeStartObject();
			for (Map.Entry<String, Map<String, JsonData>> item0 : this.metricDetails.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartObject();
				if (item0.getValue() != null) {
					for (Map.Entry<String, JsonData> item1 : item0.getValue().entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalMetricDetail}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RankEvalMetricDetail> {
		private Double metricScore;

		private List<UnratedDocument> unratedDocs;

		private List<RankEvalHitItem> hits;

		private Map<String, Map<String, JsonData>> metricDetails;

		/**
		 * Required - The metric_score in the details section shows the contribution of
		 * this query to the global quality metric score
		 * <p>
		 * API name: {@code metric_score}
		 */
		public final Builder metricScore(double value) {
			this.metricScore = value;
			return this;
		}

		/**
		 * Required - The unrated_docs section contains an _index and _id entry for each
		 * document in the search result for this query that didn't have a ratings
		 * value. This can be used to ask the user to supply ratings for these documents
		 * <p>
		 * API name: {@code unrated_docs}
		 */
		public final Builder unratedDocs(List<UnratedDocument> value) {
			this.unratedDocs = value;
			return this;
		}

		/**
		 * Required - The unrated_docs section contains an _index and _id entry for each
		 * document in the search result for this query that didn't have a ratings
		 * value. This can be used to ask the user to supply ratings for these documents
		 * <p>
		 * API name: {@code unrated_docs}
		 */
		public final Builder unratedDocs(UnratedDocument... value) {
			this.unratedDocs = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - The unrated_docs section contains an _index and _id entry for each
		 * document in the search result for this query that didn't have a ratings
		 * value. This can be used to ask the user to supply ratings for these documents
		 * <p>
		 * API name: {@code unrated_docs}
		 */
		@SafeVarargs
		public final Builder unratedDocs(Function<UnratedDocument.Builder, ObjectBuilder<UnratedDocument>>... fns) {
			this.unratedDocs = new ArrayList<>(fns.length);
			for (Function<UnratedDocument.Builder, ObjectBuilder<UnratedDocument>> fn : fns) {
				this.unratedDocs.add(fn.apply(new UnratedDocument.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - The hits section shows a grouping of the search results with their
		 * supplied ratings
		 * <p>
		 * API name: {@code hits}
		 */
		public final Builder hits(List<RankEvalHitItem> value) {
			this.hits = value;
			return this;
		}

		/**
		 * Required - The hits section shows a grouping of the search results with their
		 * supplied ratings
		 * <p>
		 * API name: {@code hits}
		 */
		public final Builder hits(RankEvalHitItem... value) {
			this.hits = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - The hits section shows a grouping of the search results with their
		 * supplied ratings
		 * <p>
		 * API name: {@code hits}
		 */
		@SafeVarargs
		public final Builder hits(Function<RankEvalHitItem.Builder, ObjectBuilder<RankEvalHitItem>>... fns) {
			this.hits = new ArrayList<>(fns.length);
			for (Function<RankEvalHitItem.Builder, ObjectBuilder<RankEvalHitItem>> fn : fns) {
				this.hits.add(fn.apply(new RankEvalHitItem.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - The metric_details give additional information about the
		 * calculated quality metric (e.g. how many of the retrieved documents were
		 * relevant). The content varies for each metric but allows for better
		 * interpretation of the results
		 * <p>
		 * API name: {@code metric_details}
		 */
		public final Builder metricDetails(Map<String, Map<String, JsonData>> value) {
			this.metricDetails = value;
			return this;
		}

		/**
		 * Builds a {@link RankEvalMetricDetail}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalMetricDetail build() {
			_checkSingleUse();

			return new RankEvalMetricDetail(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalMetricDetail}
	 */
	public static final JsonpDeserializer<RankEvalMetricDetail> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RankEvalMetricDetail::setupRankEvalMetricDetailDeserializer, Builder::build);

	protected static void setupRankEvalMetricDetailDeserializer(
			DelegatingDeserializer<RankEvalMetricDetail.Builder> op) {

		op.add(Builder::metricScore, JsonpDeserializer.doubleDeserializer(), "metric_score");
		op.add(Builder::unratedDocs, JsonpDeserializer.arrayDeserializer(UnratedDocument._DESERIALIZER),
				"unrated_docs");
		op.add(Builder::hits, JsonpDeserializer.arrayDeserializer(RankEvalHitItem._DESERIALIZER), "hits");
		op.add(Builder::metricDetails, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER)), "metric_details");

	}

}
