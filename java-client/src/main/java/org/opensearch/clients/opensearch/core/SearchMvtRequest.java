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

package org.opensearch.clients.opensearch.core;

import org.opensearch.clients.opensearch._types.ErrorResponse;
import org.opensearch.clients.opensearch._types.RequestBase;
import org.opensearch.clients.opensearch._types.aggregations.Aggregation;
import org.opensearch.clients.opensearch._types.mapping.RuntimeField;
import org.opensearch.clients.opensearch._types.query_dsl.Query;
import org.opensearch.clients.opensearch.core.search_mvt.GridType;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.transport.Endpoint;
import org.opensearch.clients.transport.SimpleEndpoint;
import org.opensearch.clients.util.MapBuilder;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.search_mvt.Request
@JsonpDeserializable
public class SearchMvtRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, Aggregation> aggs;

	@Nullable
	private final Boolean exactBounds;

	@Nullable
	private final Integer extent;

	private final String field;

	private final List<String> fields;

	@Nullable
	private final Integer gridPrecision;

	@Nullable
	private final GridType gridType;

	private final List<String> index;

	@Nullable
	private final Query query;

	private final Map<String, RuntimeField> runtimeMappings;

	@Nullable
	private final Integer size;

	private final List<JsonValue /* _global.search._types.SortCombinations */> sort;

	private final int x;

	private final int y;

	private final int zoom;

	// ---------------------------------------------------------------------------------------------

	private SearchMvtRequest(Builder builder) {

		this.aggs = ModelTypeHelper.unmodifiable(builder.aggs);
		this.exactBounds = builder.exactBounds;
		this.extent = builder.extent;
		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.gridPrecision = builder.gridPrecision;
		this.gridType = builder.gridType;
		this.index = ModelTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.query = builder.query;
		this.runtimeMappings = ModelTypeHelper.unmodifiable(builder.runtimeMappings);
		this.size = builder.size;
		this.sort = ModelTypeHelper.unmodifiable(builder.sort);
		this.x = ModelTypeHelper.requireNonNull(builder.x, this, "x");
		this.y = ModelTypeHelper.requireNonNull(builder.y, this, "y");
		this.zoom = ModelTypeHelper.requireNonNull(builder.zoom, this, "zoom");

	}

	public static SearchMvtRequest of(Function<Builder, ObjectBuilder<SearchMvtRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Sub-aggregations for the geotile_grid.
	 * <p>
	 * Supports the following aggregation types:
	 * <ul>
	 * <li>avg</li>
	 * <li>cardinality</li>
	 * <li>max</li>
	 * <li>min</li>
	 * <li>sum</li>
	 * </ul>
	 * <p>
	 * API name: {@code aggs}
	 */
	public final Map<String, Aggregation> aggs() {
		return this.aggs;
	}

	/**
	 * If false, the meta layer’s feature is the bounding box of the tile. If true,
	 * the meta layer’s feature is a bounding box resulting from a geo_bounds
	 * aggregation. The aggregation runs on &lt;field&gt; values that intersect the
	 * &lt;zoom&gt;/&lt;x&gt;/&lt;y&gt; tile with wrap_longitude set to false. The
	 * resulting bounding box may be larger than the vector tile.
	 * <p>
	 * API name: {@code exact_bounds}
	 */
	@Nullable
	public final Boolean exactBounds() {
		return this.exactBounds;
	}

	/**
	 * Size, in pixels, of a side of the tile. Vector tiles are square with equal
	 * sides.
	 * <p>
	 * API name: {@code extent}
	 */
	@Nullable
	public final Integer extent() {
		return this.extent;
	}

	/**
	 * Required - Field containing geospatial data to return
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Fields to return in the <code>hits</code> layer. Supports wildcards
	 * (<code>*</code>). This parameter does not support fields with array values.
	 * Fields with array values may return inconsistent results.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * Additional zoom levels available through the aggs layer. For example, if
	 * &lt;zoom&gt; is 7 and grid_precision is 8, you can zoom in up to level 15.
	 * Accepts 0-8. If 0, results don’t include the aggs layer.
	 * <p>
	 * API name: {@code grid_precision}
	 */
	@Nullable
	public final Integer gridPrecision() {
		return this.gridPrecision;
	}

	/**
	 * Determines the geometry type for features in the aggs layer. In the aggs
	 * layer, each feature represents a geotile_grid cell. If 'grid' each feature is
	 * a Polygon of the cells bounding box. If 'point' each feature is a Point that
	 * is the centroid of the cell.
	 * <p>
	 * API name: {@code grid_type}
	 */
	@Nullable
	public final GridType gridType() {
		return this.gridType;
	}

	/**
	 * Required - Comma-separated list of data streams, indices, or aliases to
	 * search
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Query DSL used to filter documents for the search.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Defines one or more runtime fields in the search request. These fields take
	 * precedence over mapped fields with the same name.
	 * <p>
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * Maximum number of features to return in the hits layer. Accepts 0-10000. If
	 * 0, results don’t include the hits layer.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Sorts features in the hits layer. By default, the API calculates a bounding
	 * box for each feature. It sorts features based on this box’s diagonal length,
	 * from longest to shortest.
	 * <p>
	 * API name: {@code sort}
	 */
	public final List<JsonValue /* _global.search._types.SortCombinations */> sort() {
		return this.sort;
	}

	/**
	 * Required - X coordinate for the vector tile to search
	 * <p>
	 * API name: {@code x}
	 */
	public final int x() {
		return this.x;
	}

	/**
	 * Required - Y coordinate for the vector tile to search
	 * <p>
	 * API name: {@code y}
	 */
	public final int y() {
		return this.y;
	}

	/**
	 * Required - Zoom level for the vector tile to search
	 * <p>
	 * API name: {@code zoom}
	 */
	public final int zoom() {
		return this.zoom;
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

		if (ModelTypeHelper.isDefined(this.aggs)) {
			generator.writeKey("aggs");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggs.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.exactBounds != null) {
			generator.writeKey("exact_bounds");
			generator.write(this.exactBounds);

		}
		if (this.extent != null) {
			generator.writeKey("extent");
			generator.write(this.extent);

		}
		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.gridPrecision != null) {
			generator.writeKey("grid_precision");
			generator.write(this.gridPrecision);

		}
		if (this.gridType != null) {
			generator.writeKey("grid_type");
			this.gridType.serialize(generator, mapper);
		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.runtimeMappings)) {
			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (ModelTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue /* _global.search._types.SortCombinations */ item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchMvtRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SearchMvtRequest> {
		@Nullable
		private Map<String, Aggregation> aggs;

		@Nullable
		private Boolean exactBounds;

		@Nullable
		private Integer extent;

		private String field;

		@Nullable
		private List<String> fields;

		@Nullable
		private Integer gridPrecision;

		@Nullable
		private GridType gridType;

		private List<String> index;

		@Nullable
		private Query query;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private Integer size;

		@Nullable
		private List<JsonValue /* _global.search._types.SortCombinations */> sort;

		private Integer x;

		private Integer y;

		private Integer zoom;

		/**
		 * Sub-aggregations for the geotile_grid.
		 * <p>
		 * Supports the following aggregation types:
		 * <ul>
		 * <li>avg</li>
		 * <li>cardinality</li>
		 * <li>max</li>
		 * <li>min</li>
		 * <li>sum</li>
		 * </ul>
		 * <p>
		 * API name: {@code aggs}
		 */
		public final Builder aggs(@Nullable Map<String, Aggregation> value) {
			this.aggs = value;
			return this;
		}

		/**
		 * Set {@link #aggs(Map)} to a singleton map.
		 */
		public Builder aggs(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggs(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		public final Builder aggs(
				Function<MapBuilder<String, Aggregation, Aggregation.Builder>, ObjectBuilder<Map<String, Aggregation>>> fn) {
			return aggs(fn.apply(new MapBuilder<>(Aggregation.Builder::new)).build());
		}

		/**
		 * If false, the meta layer’s feature is the bounding box of the tile. If true,
		 * the meta layer’s feature is a bounding box resulting from a geo_bounds
		 * aggregation. The aggregation runs on &lt;field&gt; values that intersect the
		 * &lt;zoom&gt;/&lt;x&gt;/&lt;y&gt; tile with wrap_longitude set to false. The
		 * resulting bounding box may be larger than the vector tile.
		 * <p>
		 * API name: {@code exact_bounds}
		 */
		public final Builder exactBounds(@Nullable Boolean value) {
			this.exactBounds = value;
			return this;
		}

		/**
		 * Size, in pixels, of a side of the tile. Vector tiles are square with equal
		 * sides.
		 * <p>
		 * API name: {@code extent}
		 */
		public final Builder extent(@Nullable Integer value) {
			this.extent = value;
			return this;
		}

		/**
		 * Required - Field containing geospatial data to return
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Fields to return in the <code>hits</code> layer. Supports wildcards
		 * (<code>*</code>). This parameter does not support fields with array values.
		 * Fields with array values may return inconsistent results.
		 * <p>
		 * API name: {@code fields}
		 */
		public final Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Fields to return in the <code>hits</code> layer. Supports wildcards
		 * (<code>*</code>). This parameter does not support fields with array values.
		 * Fields with array values may return inconsistent results.
		 * <p>
		 * API name: {@code fields}
		 */
		public final Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Additional zoom levels available through the aggs layer. For example, if
		 * &lt;zoom&gt; is 7 and grid_precision is 8, you can zoom in up to level 15.
		 * Accepts 0-8. If 0, results don’t include the aggs layer.
		 * <p>
		 * API name: {@code grid_precision}
		 */
		public final Builder gridPrecision(@Nullable Integer value) {
			this.gridPrecision = value;
			return this;
		}

		/**
		 * Determines the geometry type for features in the aggs layer. In the aggs
		 * layer, each feature represents a geotile_grid cell. If 'grid' each feature is
		 * a Polygon of the cells bounding box. If 'point' each feature is a Point that
		 * is the centroid of the cell.
		 * <p>
		 * API name: {@code grid_type}
		 */
		public final Builder gridType(@Nullable GridType value) {
			this.gridType = value;
			return this;
		}

		/**
		 * Required - Comma-separated list of data streams, indices, or aliases to
		 * search
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - Comma-separated list of data streams, indices, or aliases to
		 * search
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Query DSL used to filter documents for the search.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Query DSL used to filter documents for the search.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 */
		public final Builder runtimeMappings(@Nullable Map<String, RuntimeField> value) {
			this.runtimeMappings = value;
			return this;
		}

		/**
		 * Set {@link #runtimeMappings(Map)} to a singleton map.
		 */
		public Builder runtimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.runtimeMappings(Collections.singletonMap(key, fn.apply(new RuntimeField.Builder()).build()));
		}

		public final Builder runtimeMappings(
				Function<MapBuilder<String, RuntimeField, RuntimeField.Builder>, ObjectBuilder<Map<String, RuntimeField>>> fn) {
			return runtimeMappings(fn.apply(new MapBuilder<>(RuntimeField.Builder::new)).build());
		}

		/**
		 * Maximum number of features to return in the hits layer. Accepts 0-10000. If
		 * 0, results don’t include the hits layer.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Sorts features in the hits layer. By default, the API calculates a bounding
		 * box for each feature. It sorts features based on this box’s diagonal length,
		 * from longest to shortest.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable List<JsonValue /* _global.search._types.SortCombinations */> value) {
			this.sort = value;
			return this;
		}

		/**
		 * Sorts features in the hits layer. By default, the API calculates a bounding
		 * box for each feature. It sorts features based on this box’s diagonal length,
		 * from longest to shortest.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(JsonValue /* _global.search._types.SortCombinations */... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - X coordinate for the vector tile to search
		 * <p>
		 * API name: {@code x}
		 */
		public final Builder x(int value) {
			this.x = value;
			return this;
		}

		/**
		 * Required - Y coordinate for the vector tile to search
		 * <p>
		 * API name: {@code y}
		 */
		public final Builder y(int value) {
			this.y = value;
			return this;
		}

		/**
		 * Required - Zoom level for the vector tile to search
		 * <p>
		 * API name: {@code zoom}
		 */
		public final Builder zoom(int value) {
			this.zoom = value;
			return this;
		}

		/**
		 * Builds a {@link SearchMvtRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchMvtRequest build() {
			_checkSingleUse();

			return new SearchMvtRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchMvtRequest}
	 */
	public static final JsonpDeserializer<SearchMvtRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SearchMvtRequest::setupSearchMvtRequestDeserializer, Builder::build);

	protected static void setupSearchMvtRequestDeserializer(DelegatingDeserializer<SearchMvtRequest.Builder> op) {

		op.add(Builder::aggs, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER), "aggs");
		op.add(Builder::exactBounds, JsonpDeserializer.booleanDeserializer(), "exact_bounds");
		op.add(Builder::extent, JsonpDeserializer.integerDeserializer(), "extent");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::gridPrecision, JsonpDeserializer.integerDeserializer(), "grid_precision");
		op.add(Builder::gridType, GridType._DESERIALIZER, "grid_type");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code search_mvt}".
	 */
	public static final Endpoint<SearchMvtRequest, SearchMvtResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _field = 1 << 0;
				final int _x = 1 << 1;
				final int _index = 1 << 2;
				final int _y = 1 << 3;
				final int _zoom = 1 << 4;

				int propsSet = 0;

				propsSet |= _field;
				propsSet |= _x;
				propsSet |= _index;
				propsSet |= _y;
				propsSet |= _zoom;

				if (propsSet == (_index | _field | _zoom | _x | _y)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_mvt");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.field, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(String.valueOf(request.zoom), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(String.valueOf(request.x), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(String.valueOf(request.y), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, SearchMvtResponse._DESERIALIZER);
}
