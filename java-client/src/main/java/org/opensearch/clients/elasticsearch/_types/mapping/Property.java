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

package org.opensearch.clients.elasticsearch._types.mapping;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import org.opensearch.clients.util.TaggedUnion;
import org.opensearch.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

// typedef: _types.mapping.Property
@JsonpDeserializable
public class Property implements TaggedUnion<PropertyVariant>, JsonpSerializable {

	public static final String AGGREGATE_METRIC_DOUBLE = "aggregate_metric_double";
	public static final String BINARY = "binary";
	public static final String BOOLEAN = "boolean";
	public static final String BYTE = "byte";
	public static final String COMPLETION = "completion";
	public static final String CONSTANT_KEYWORD = "constant_keyword";
	public static final String DATE_NANOS = "date_nanos";
	public static final String DATE = "date";
	public static final String DATE_RANGE = "date_range";
	public static final String DENSE_VECTOR = "dense_vector";
	public static final String DOUBLE = "double";
	public static final String DOUBLE_RANGE = "double_range";
	public static final String ALIAS = "alias";
	public static final String FLATTENED = "flattened";
	public static final String FLOAT = "float";
	public static final String FLOAT_RANGE = "float_range";
	public static final String GEO_POINT = "geo_point";
	public static final String GEO_SHAPE = "geo_shape";
	public static final String HALF_FLOAT = "half_float";
	public static final String HISTOGRAM = "histogram";
	public static final String INTEGER = "integer";
	public static final String INTEGER_RANGE = "integer_range";
	public static final String IP = "ip";
	public static final String IP_RANGE = "ip_range";
	public static final String JOIN = "join";
	public static final String KEYWORD = "keyword";
	public static final String LONG = "long";
	public static final String LONG_RANGE = "long_range";
	public static final String MURMUR3 = "murmur3";
	public static final String NESTED = "nested";
	public static final String OBJECT = "object";
	public static final String PERCOLATOR = "percolator";
	public static final String POINT = "point";
	public static final String RANK_FEATURE = "rank_feature";
	public static final String RANK_FEATURES = "rank_features";
	public static final String SCALED_FLOAT = "scaled_float";
	public static final String SEARCH_AS_YOU_TYPE = "search_as_you_type";
	public static final String SHAPE = "shape";
	public static final String SHORT = "short";
	public static final String TEXT = "text";
	public static final String TOKEN_COUNT = "token_count";
	public static final String UNSIGNED_LONG = "unsigned_long";
	public static final String VERSION = "version";
	public static final String WILDCARD = "wildcard";

	// Tagged union implementation

	private final String _type;
	private final PropertyVariant _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final PropertyVariant _get() {
		return _value;
	}

	public Property(PropertyVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Property(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Property of(Function<Builder, ObjectBuilder<Property>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code aggregate_metric_double} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code aggregate_metric_double} kind.
	 */
	public AggregateMetricDoubleProperty aggregateMetricDouble() {
		return TaggedUnionUtils.get(this, AGGREGATE_METRIC_DOUBLE);
	}

	/**
	 * Get the {@code binary} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code binary} kind.
	 */
	public BinaryProperty binary() {
		return TaggedUnionUtils.get(this, BINARY);
	}

	/**
	 * Get the {@code boolean} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code boolean} kind.
	 */
	public BooleanProperty boolean_() {
		return TaggedUnionUtils.get(this, BOOLEAN);
	}

	/**
	 * Get the {@code byte} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code byte} kind.
	 */
	public ByteNumberProperty byte_() {
		return TaggedUnionUtils.get(this, BYTE);
	}

	/**
	 * Get the {@code completion} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code completion} kind.
	 */
	public CompletionProperty completion() {
		return TaggedUnionUtils.get(this, COMPLETION);
	}

	/**
	 * Get the {@code constant_keyword} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code constant_keyword}
	 *             kind.
	 */
	public ConstantKeywordProperty constantKeyword() {
		return TaggedUnionUtils.get(this, CONSTANT_KEYWORD);
	}

	/**
	 * Get the {@code date_nanos} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_nanos} kind.
	 */
	public DateNanosProperty dateNanos() {
		return TaggedUnionUtils.get(this, DATE_NANOS);
	}

	/**
	 * Get the {@code date} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date} kind.
	 */
	public DateProperty date() {
		return TaggedUnionUtils.get(this, DATE);
	}

	/**
	 * Get the {@code date_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_range} kind.
	 */
	public DateRangeProperty dateRange() {
		return TaggedUnionUtils.get(this, DATE_RANGE);
	}

	/**
	 * Get the {@code dense_vector} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dense_vector} kind.
	 */
	public DenseVectorProperty denseVector() {
		return TaggedUnionUtils.get(this, DENSE_VECTOR);
	}

	/**
	 * Get the {@code double} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code double} kind.
	 */
	public DoubleNumberProperty double_() {
		return TaggedUnionUtils.get(this, DOUBLE);
	}

	/**
	 * Get the {@code double_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code double_range} kind.
	 */
	public DoubleRangeProperty doubleRange() {
		return TaggedUnionUtils.get(this, DOUBLE_RANGE);
	}

	/**
	 * Get the {@code alias} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code alias} kind.
	 */
	public FieldAliasProperty alias() {
		return TaggedUnionUtils.get(this, ALIAS);
	}

	/**
	 * Get the {@code flattened} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code flattened} kind.
	 */
	public FlattenedProperty flattened() {
		return TaggedUnionUtils.get(this, FLATTENED);
	}

	/**
	 * Get the {@code float} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code float} kind.
	 */
	public FloatNumberProperty float_() {
		return TaggedUnionUtils.get(this, FLOAT);
	}

	/**
	 * Get the {@code float_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code float_range} kind.
	 */
	public FloatRangeProperty floatRange() {
		return TaggedUnionUtils.get(this, FLOAT_RANGE);
	}

	/**
	 * Get the {@code geo_point} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_point} kind.
	 */
	public GeoPointProperty geoPoint() {
		return TaggedUnionUtils.get(this, GEO_POINT);
	}

	/**
	 * Get the {@code geo_shape} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geo_shape} kind.
	 */
	public GeoShapeProperty geoShape() {
		return TaggedUnionUtils.get(this, GEO_SHAPE);
	}

	/**
	 * Get the {@code half_float} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code half_float} kind.
	 */
	public HalfFloatNumberProperty halfFloat() {
		return TaggedUnionUtils.get(this, HALF_FLOAT);
	}

	/**
	 * Get the {@code histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code histogram} kind.
	 */
	public HistogramProperty histogram() {
		return TaggedUnionUtils.get(this, HISTOGRAM);
	}

	/**
	 * Get the {@code integer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code integer} kind.
	 */
	public IntegerNumberProperty integer() {
		return TaggedUnionUtils.get(this, INTEGER);
	}

	/**
	 * Get the {@code integer_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code integer_range} kind.
	 */
	public IntegerRangeProperty integerRange() {
		return TaggedUnionUtils.get(this, INTEGER_RANGE);
	}

	/**
	 * Get the {@code ip} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ip} kind.
	 */
	public IpProperty ip() {
		return TaggedUnionUtils.get(this, IP);
	}

	/**
	 * Get the {@code ip_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ip_range} kind.
	 */
	public IpRangeProperty ipRange() {
		return TaggedUnionUtils.get(this, IP_RANGE);
	}

	/**
	 * Get the {@code join} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code join} kind.
	 */
	public JoinProperty join() {
		return TaggedUnionUtils.get(this, JOIN);
	}

	/**
	 * Get the {@code keyword} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keyword} kind.
	 */
	public KeywordProperty keyword() {
		return TaggedUnionUtils.get(this, KEYWORD);
	}

	/**
	 * Get the {@code long} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code long} kind.
	 */
	public LongNumberProperty long_() {
		return TaggedUnionUtils.get(this, LONG);
	}

	/**
	 * Get the {@code long_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code long_range} kind.
	 */
	public LongRangeProperty longRange() {
		return TaggedUnionUtils.get(this, LONG_RANGE);
	}

	/**
	 * Get the {@code murmur3} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code murmur3} kind.
	 */
	public Murmur3HashProperty murmur3() {
		return TaggedUnionUtils.get(this, MURMUR3);
	}

	/**
	 * Get the {@code nested} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nested} kind.
	 */
	public NestedProperty nested() {
		return TaggedUnionUtils.get(this, NESTED);
	}

	/**
	 * Get the {@code object} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code object} kind.
	 */
	public ObjectProperty object() {
		return TaggedUnionUtils.get(this, OBJECT);
	}

	/**
	 * Get the {@code percolator} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code percolator} kind.
	 */
	public PercolatorProperty percolator() {
		return TaggedUnionUtils.get(this, PERCOLATOR);
	}

	/**
	 * Get the {@code point} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code point} kind.
	 */
	public PointProperty point() {
		return TaggedUnionUtils.get(this, POINT);
	}

	/**
	 * Get the {@code rank_feature} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rank_feature} kind.
	 */
	public RankFeatureProperty rankFeature() {
		return TaggedUnionUtils.get(this, RANK_FEATURE);
	}

	/**
	 * Get the {@code rank_features} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rank_features} kind.
	 */
	public RankFeaturesProperty rankFeatures() {
		return TaggedUnionUtils.get(this, RANK_FEATURES);
	}

	/**
	 * Get the {@code scaled_float} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code scaled_float} kind.
	 */
	public ScaledFloatNumberProperty scaledFloat() {
		return TaggedUnionUtils.get(this, SCALED_FLOAT);
	}

	/**
	 * Get the {@code search_as_you_type} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code search_as_you_type}
	 *             kind.
	 */
	public SearchAsYouTypeProperty searchAsYouType() {
		return TaggedUnionUtils.get(this, SEARCH_AS_YOU_TYPE);
	}

	/**
	 * Get the {@code shape} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code shape} kind.
	 */
	public ShapeProperty shape() {
		return TaggedUnionUtils.get(this, SHAPE);
	}

	/**
	 * Get the {@code short} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code short} kind.
	 */
	public ShortNumberProperty short_() {
		return TaggedUnionUtils.get(this, SHORT);
	}

	/**
	 * Get the {@code text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text} kind.
	 */
	public TextProperty text() {
		return TaggedUnionUtils.get(this, TEXT);
	}

	/**
	 * Get the {@code token_count} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code token_count} kind.
	 */
	public TokenCountProperty tokenCount() {
		return TaggedUnionUtils.get(this, TOKEN_COUNT);
	}

	/**
	 * Get the {@code unsigned_long} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code unsigned_long} kind.
	 */
	public UnsignedLongNumberProperty unsignedLong() {
		return TaggedUnionUtils.get(this, UNSIGNED_LONG);
	}

	/**
	 * Get the {@code version} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code version} kind.
	 */
	public VersionProperty version() {
		return TaggedUnionUtils.get(this, VERSION);
	}

	/**
	 * Get the {@code wildcard} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code wildcard} kind.
	 */
	public WildcardProperty wildcard() {
		return TaggedUnionUtils.get(this, WILDCARD);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Property> {
		private String _type;
		private PropertyVariant _value;

		public Builder aggregateMetricDouble(AggregateMetricDoubleProperty v) {
			this._type = AGGREGATE_METRIC_DOUBLE;
			this._value = v;
			return this;
		}

		public Builder aggregateMetricDouble(
				Function<AggregateMetricDoubleProperty.Builder, ObjectBuilder<AggregateMetricDoubleProperty>> f) {
			return this.aggregateMetricDouble(f.apply(new AggregateMetricDoubleProperty.Builder()).build());
		}

		public Builder binary(BinaryProperty v) {
			this._type = BINARY;
			this._value = v;
			return this;
		}

		public Builder binary(Function<BinaryProperty.Builder, ObjectBuilder<BinaryProperty>> f) {
			return this.binary(f.apply(new BinaryProperty.Builder()).build());
		}

		public Builder boolean_(BooleanProperty v) {
			this._type = BOOLEAN;
			this._value = v;
			return this;
		}

		public Builder boolean_(Function<BooleanProperty.Builder, ObjectBuilder<BooleanProperty>> f) {
			return this.boolean_(f.apply(new BooleanProperty.Builder()).build());
		}

		public Builder byte_(ByteNumberProperty v) {
			this._type = BYTE;
			this._value = v;
			return this;
		}

		public Builder byte_(Function<ByteNumberProperty.Builder, ObjectBuilder<ByteNumberProperty>> f) {
			return this.byte_(f.apply(new ByteNumberProperty.Builder()).build());
		}

		public Builder completion(CompletionProperty v) {
			this._type = COMPLETION;
			this._value = v;
			return this;
		}

		public Builder completion(Function<CompletionProperty.Builder, ObjectBuilder<CompletionProperty>> f) {
			return this.completion(f.apply(new CompletionProperty.Builder()).build());
		}

		public Builder constantKeyword(ConstantKeywordProperty v) {
			this._type = CONSTANT_KEYWORD;
			this._value = v;
			return this;
		}

		public Builder constantKeyword(
				Function<ConstantKeywordProperty.Builder, ObjectBuilder<ConstantKeywordProperty>> f) {
			return this.constantKeyword(f.apply(new ConstantKeywordProperty.Builder()).build());
		}

		public Builder dateNanos(DateNanosProperty v) {
			this._type = DATE_NANOS;
			this._value = v;
			return this;
		}

		public Builder dateNanos(Function<DateNanosProperty.Builder, ObjectBuilder<DateNanosProperty>> f) {
			return this.dateNanos(f.apply(new DateNanosProperty.Builder()).build());
		}

		public Builder date(DateProperty v) {
			this._type = DATE;
			this._value = v;
			return this;
		}

		public Builder date(Function<DateProperty.Builder, ObjectBuilder<DateProperty>> f) {
			return this.date(f.apply(new DateProperty.Builder()).build());
		}

		public Builder dateRange(DateRangeProperty v) {
			this._type = DATE_RANGE;
			this._value = v;
			return this;
		}

		public Builder dateRange(Function<DateRangeProperty.Builder, ObjectBuilder<DateRangeProperty>> f) {
			return this.dateRange(f.apply(new DateRangeProperty.Builder()).build());
		}

		public Builder denseVector(DenseVectorProperty v) {
			this._type = DENSE_VECTOR;
			this._value = v;
			return this;
		}

		public Builder denseVector(Function<DenseVectorProperty.Builder, ObjectBuilder<DenseVectorProperty>> f) {
			return this.denseVector(f.apply(new DenseVectorProperty.Builder()).build());
		}

		public Builder double_(DoubleNumberProperty v) {
			this._type = DOUBLE;
			this._value = v;
			return this;
		}

		public Builder double_(Function<DoubleNumberProperty.Builder, ObjectBuilder<DoubleNumberProperty>> f) {
			return this.double_(f.apply(new DoubleNumberProperty.Builder()).build());
		}

		public Builder doubleRange(DoubleRangeProperty v) {
			this._type = DOUBLE_RANGE;
			this._value = v;
			return this;
		}

		public Builder doubleRange(Function<DoubleRangeProperty.Builder, ObjectBuilder<DoubleRangeProperty>> f) {
			return this.doubleRange(f.apply(new DoubleRangeProperty.Builder()).build());
		}

		public Builder alias(FieldAliasProperty v) {
			this._type = ALIAS;
			this._value = v;
			return this;
		}

		public Builder alias(Function<FieldAliasProperty.Builder, ObjectBuilder<FieldAliasProperty>> f) {
			return this.alias(f.apply(new FieldAliasProperty.Builder()).build());
		}

		public Builder flattened(FlattenedProperty v) {
			this._type = FLATTENED;
			this._value = v;
			return this;
		}

		public Builder flattened(Function<FlattenedProperty.Builder, ObjectBuilder<FlattenedProperty>> f) {
			return this.flattened(f.apply(new FlattenedProperty.Builder()).build());
		}

		public Builder float_(FloatNumberProperty v) {
			this._type = FLOAT;
			this._value = v;
			return this;
		}

		public Builder float_(Function<FloatNumberProperty.Builder, ObjectBuilder<FloatNumberProperty>> f) {
			return this.float_(f.apply(new FloatNumberProperty.Builder()).build());
		}

		public Builder floatRange(FloatRangeProperty v) {
			this._type = FLOAT_RANGE;
			this._value = v;
			return this;
		}

		public Builder floatRange(Function<FloatRangeProperty.Builder, ObjectBuilder<FloatRangeProperty>> f) {
			return this.floatRange(f.apply(new FloatRangeProperty.Builder()).build());
		}

		public Builder geoPoint(GeoPointProperty v) {
			this._type = GEO_POINT;
			this._value = v;
			return this;
		}

		public Builder geoPoint(Function<GeoPointProperty.Builder, ObjectBuilder<GeoPointProperty>> f) {
			return this.geoPoint(f.apply(new GeoPointProperty.Builder()).build());
		}

		public Builder geoShape(GeoShapeProperty v) {
			this._type = GEO_SHAPE;
			this._value = v;
			return this;
		}

		public Builder geoShape(Function<GeoShapeProperty.Builder, ObjectBuilder<GeoShapeProperty>> f) {
			return this.geoShape(f.apply(new GeoShapeProperty.Builder()).build());
		}

		public Builder halfFloat(HalfFloatNumberProperty v) {
			this._type = HALF_FLOAT;
			this._value = v;
			return this;
		}

		public Builder halfFloat(Function<HalfFloatNumberProperty.Builder, ObjectBuilder<HalfFloatNumberProperty>> f) {
			return this.halfFloat(f.apply(new HalfFloatNumberProperty.Builder()).build());
		}

		public Builder histogram(HistogramProperty v) {
			this._type = HISTOGRAM;
			this._value = v;
			return this;
		}

		public Builder histogram(Function<HistogramProperty.Builder, ObjectBuilder<HistogramProperty>> f) {
			return this.histogram(f.apply(new HistogramProperty.Builder()).build());
		}

		public Builder integer(IntegerNumberProperty v) {
			this._type = INTEGER;
			this._value = v;
			return this;
		}

		public Builder integer(Function<IntegerNumberProperty.Builder, ObjectBuilder<IntegerNumberProperty>> f) {
			return this.integer(f.apply(new IntegerNumberProperty.Builder()).build());
		}

		public Builder integerRange(IntegerRangeProperty v) {
			this._type = INTEGER_RANGE;
			this._value = v;
			return this;
		}

		public Builder integerRange(Function<IntegerRangeProperty.Builder, ObjectBuilder<IntegerRangeProperty>> f) {
			return this.integerRange(f.apply(new IntegerRangeProperty.Builder()).build());
		}

		public Builder ip(IpProperty v) {
			this._type = IP;
			this._value = v;
			return this;
		}

		public Builder ip(Function<IpProperty.Builder, ObjectBuilder<IpProperty>> f) {
			return this.ip(f.apply(new IpProperty.Builder()).build());
		}

		public Builder ipRange(IpRangeProperty v) {
			this._type = IP_RANGE;
			this._value = v;
			return this;
		}

		public Builder ipRange(Function<IpRangeProperty.Builder, ObjectBuilder<IpRangeProperty>> f) {
			return this.ipRange(f.apply(new IpRangeProperty.Builder()).build());
		}

		public Builder join(JoinProperty v) {
			this._type = JOIN;
			this._value = v;
			return this;
		}

		public Builder join(Function<JoinProperty.Builder, ObjectBuilder<JoinProperty>> f) {
			return this.join(f.apply(new JoinProperty.Builder()).build());
		}

		public Builder keyword(KeywordProperty v) {
			this._type = KEYWORD;
			this._value = v;
			return this;
		}

		public Builder keyword(Function<KeywordProperty.Builder, ObjectBuilder<KeywordProperty>> f) {
			return this.keyword(f.apply(new KeywordProperty.Builder()).build());
		}

		public Builder long_(LongNumberProperty v) {
			this._type = LONG;
			this._value = v;
			return this;
		}

		public Builder long_(Function<LongNumberProperty.Builder, ObjectBuilder<LongNumberProperty>> f) {
			return this.long_(f.apply(new LongNumberProperty.Builder()).build());
		}

		public Builder longRange(LongRangeProperty v) {
			this._type = LONG_RANGE;
			this._value = v;
			return this;
		}

		public Builder longRange(Function<LongRangeProperty.Builder, ObjectBuilder<LongRangeProperty>> f) {
			return this.longRange(f.apply(new LongRangeProperty.Builder()).build());
		}

		public Builder murmur3(Murmur3HashProperty v) {
			this._type = MURMUR3;
			this._value = v;
			return this;
		}

		public Builder murmur3(Function<Murmur3HashProperty.Builder, ObjectBuilder<Murmur3HashProperty>> f) {
			return this.murmur3(f.apply(new Murmur3HashProperty.Builder()).build());
		}

		public Builder nested(NestedProperty v) {
			this._type = NESTED;
			this._value = v;
			return this;
		}

		public Builder nested(Function<NestedProperty.Builder, ObjectBuilder<NestedProperty>> f) {
			return this.nested(f.apply(new NestedProperty.Builder()).build());
		}

		public Builder object(ObjectProperty v) {
			this._type = OBJECT;
			this._value = v;
			return this;
		}

		public Builder object(Function<ObjectProperty.Builder, ObjectBuilder<ObjectProperty>> f) {
			return this.object(f.apply(new ObjectProperty.Builder()).build());
		}

		public Builder percolator(PercolatorProperty v) {
			this._type = PERCOLATOR;
			this._value = v;
			return this;
		}

		public Builder percolator(Function<PercolatorProperty.Builder, ObjectBuilder<PercolatorProperty>> f) {
			return this.percolator(f.apply(new PercolatorProperty.Builder()).build());
		}

		public Builder point(PointProperty v) {
			this._type = POINT;
			this._value = v;
			return this;
		}

		public Builder point(Function<PointProperty.Builder, ObjectBuilder<PointProperty>> f) {
			return this.point(f.apply(new PointProperty.Builder()).build());
		}

		public Builder rankFeature(RankFeatureProperty v) {
			this._type = RANK_FEATURE;
			this._value = v;
			return this;
		}

		public Builder rankFeature(Function<RankFeatureProperty.Builder, ObjectBuilder<RankFeatureProperty>> f) {
			return this.rankFeature(f.apply(new RankFeatureProperty.Builder()).build());
		}

		public Builder rankFeatures(RankFeaturesProperty v) {
			this._type = RANK_FEATURES;
			this._value = v;
			return this;
		}

		public Builder rankFeatures(Function<RankFeaturesProperty.Builder, ObjectBuilder<RankFeaturesProperty>> f) {
			return this.rankFeatures(f.apply(new RankFeaturesProperty.Builder()).build());
		}

		public Builder scaledFloat(ScaledFloatNumberProperty v) {
			this._type = SCALED_FLOAT;
			this._value = v;
			return this;
		}

		public Builder scaledFloat(
				Function<ScaledFloatNumberProperty.Builder, ObjectBuilder<ScaledFloatNumberProperty>> f) {
			return this.scaledFloat(f.apply(new ScaledFloatNumberProperty.Builder()).build());
		}

		public Builder searchAsYouType(SearchAsYouTypeProperty v) {
			this._type = SEARCH_AS_YOU_TYPE;
			this._value = v;
			return this;
		}

		public Builder searchAsYouType(
				Function<SearchAsYouTypeProperty.Builder, ObjectBuilder<SearchAsYouTypeProperty>> f) {
			return this.searchAsYouType(f.apply(new SearchAsYouTypeProperty.Builder()).build());
		}

		public Builder shape(ShapeProperty v) {
			this._type = SHAPE;
			this._value = v;
			return this;
		}

		public Builder shape(Function<ShapeProperty.Builder, ObjectBuilder<ShapeProperty>> f) {
			return this.shape(f.apply(new ShapeProperty.Builder()).build());
		}

		public Builder short_(ShortNumberProperty v) {
			this._type = SHORT;
			this._value = v;
			return this;
		}

		public Builder short_(Function<ShortNumberProperty.Builder, ObjectBuilder<ShortNumberProperty>> f) {
			return this.short_(f.apply(new ShortNumberProperty.Builder()).build());
		}

		public Builder text(TextProperty v) {
			this._type = TEXT;
			this._value = v;
			return this;
		}

		public Builder text(Function<TextProperty.Builder, ObjectBuilder<TextProperty>> f) {
			return this.text(f.apply(new TextProperty.Builder()).build());
		}

		public Builder tokenCount(TokenCountProperty v) {
			this._type = TOKEN_COUNT;
			this._value = v;
			return this;
		}

		public Builder tokenCount(Function<TokenCountProperty.Builder, ObjectBuilder<TokenCountProperty>> f) {
			return this.tokenCount(f.apply(new TokenCountProperty.Builder()).build());
		}

		public Builder unsignedLong(UnsignedLongNumberProperty v) {
			this._type = UNSIGNED_LONG;
			this._value = v;
			return this;
		}

		public Builder unsignedLong(
				Function<UnsignedLongNumberProperty.Builder, ObjectBuilder<UnsignedLongNumberProperty>> f) {
			return this.unsignedLong(f.apply(new UnsignedLongNumberProperty.Builder()).build());
		}

		public Builder version(VersionProperty v) {
			this._type = VERSION;
			this._value = v;
			return this;
		}

		public Builder version(Function<VersionProperty.Builder, ObjectBuilder<VersionProperty>> f) {
			return this.version(f.apply(new VersionProperty.Builder()).build());
		}

		public Builder wildcard(WildcardProperty v) {
			this._type = WILDCARD;
			this._value = v;
			return this;
		}

		public Builder wildcard(Function<WildcardProperty.Builder, ObjectBuilder<WildcardProperty>> f) {
			return this.wildcard(f.apply(new WildcardProperty.Builder()).build());
		}

		public Property build() {
			_checkSingleUse();
			return new Property(this);
		}

	}

	protected static void setupPropertyDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::aggregateMetricDouble, AggregateMetricDoubleProperty._DESERIALIZER, "aggregate_metric_double");
		op.add(Builder::binary, BinaryProperty._DESERIALIZER, "binary");
		op.add(Builder::boolean_, BooleanProperty._DESERIALIZER, "boolean");
		op.add(Builder::byte_, ByteNumberProperty._DESERIALIZER, "byte");
		op.add(Builder::completion, CompletionProperty._DESERIALIZER, "completion");
		op.add(Builder::constantKeyword, ConstantKeywordProperty._DESERIALIZER, "constant_keyword");
		op.add(Builder::dateNanos, DateNanosProperty._DESERIALIZER, "date_nanos");
		op.add(Builder::date, DateProperty._DESERIALIZER, "date");
		op.add(Builder::dateRange, DateRangeProperty._DESERIALIZER, "date_range");
		op.add(Builder::denseVector, DenseVectorProperty._DESERIALIZER, "dense_vector");
		op.add(Builder::double_, DoubleNumberProperty._DESERIALIZER, "double");
		op.add(Builder::doubleRange, DoubleRangeProperty._DESERIALIZER, "double_range");
		op.add(Builder::alias, FieldAliasProperty._DESERIALIZER, "alias");
		op.add(Builder::flattened, FlattenedProperty._DESERIALIZER, "flattened");
		op.add(Builder::float_, FloatNumberProperty._DESERIALIZER, "float");
		op.add(Builder::floatRange, FloatRangeProperty._DESERIALIZER, "float_range");
		op.add(Builder::geoPoint, GeoPointProperty._DESERIALIZER, "geo_point");
		op.add(Builder::geoShape, GeoShapeProperty._DESERIALIZER, "geo_shape");
		op.add(Builder::halfFloat, HalfFloatNumberProperty._DESERIALIZER, "half_float");
		op.add(Builder::histogram, HistogramProperty._DESERIALIZER, "histogram");
		op.add(Builder::integer, IntegerNumberProperty._DESERIALIZER, "integer");
		op.add(Builder::integerRange, IntegerRangeProperty._DESERIALIZER, "integer_range");
		op.add(Builder::ip, IpProperty._DESERIALIZER, "ip");
		op.add(Builder::ipRange, IpRangeProperty._DESERIALIZER, "ip_range");
		op.add(Builder::join, JoinProperty._DESERIALIZER, "join");
		op.add(Builder::keyword, KeywordProperty._DESERIALIZER, "keyword");
		op.add(Builder::long_, LongNumberProperty._DESERIALIZER, "long");
		op.add(Builder::longRange, LongRangeProperty._DESERIALIZER, "long_range");
		op.add(Builder::murmur3, Murmur3HashProperty._DESERIALIZER, "murmur3");
		op.add(Builder::nested, NestedProperty._DESERIALIZER, "nested");
		op.add(Builder::object, ObjectProperty._DESERIALIZER, "object");
		op.add(Builder::percolator, PercolatorProperty._DESERIALIZER, "percolator");
		op.add(Builder::point, PointProperty._DESERIALIZER, "point");
		op.add(Builder::rankFeature, RankFeatureProperty._DESERIALIZER, "rank_feature");
		op.add(Builder::rankFeatures, RankFeaturesProperty._DESERIALIZER, "rank_features");
		op.add(Builder::scaledFloat, ScaledFloatNumberProperty._DESERIALIZER, "scaled_float");
		op.add(Builder::searchAsYouType, SearchAsYouTypeProperty._DESERIALIZER, "search_as_you_type");
		op.add(Builder::shape, ShapeProperty._DESERIALIZER, "shape");
		op.add(Builder::short_, ShortNumberProperty._DESERIALIZER, "short");
		op.add(Builder::text, TextProperty._DESERIALIZER, "text");
		op.add(Builder::tokenCount, TokenCountProperty._DESERIALIZER, "token_count");
		op.add(Builder::unsignedLong, UnsignedLongNumberProperty._DESERIALIZER, "unsigned_long");
		op.add(Builder::version, VersionProperty._DESERIALIZER, "version");
		op.add(Builder::wildcard, WildcardProperty._DESERIALIZER, "wildcard");

		op.setTypeProperty("type");

	}

	public static final JsonpDeserializer<Property> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Property::setupPropertyDeserializer, Builder::build);
}
