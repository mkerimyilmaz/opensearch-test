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

package co.elastic.clients.elasticsearch;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch.cat.ElasticsearchCatClient;
import co.elastic.clients.elasticsearch.cluster.ElasticsearchClusterClient;
import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.BulkResponse;
import co.elastic.clients.elasticsearch.core.ClearScrollRequest;
import co.elastic.clients.elasticsearch.core.ClearScrollResponse;
import co.elastic.clients.elasticsearch.core.ClosePointInTimeRequest;
import co.elastic.clients.elasticsearch.core.ClosePointInTimeResponse;
import co.elastic.clients.elasticsearch.core.CountRequest;
import co.elastic.clients.elasticsearch.core.CountResponse;
import co.elastic.clients.elasticsearch.core.CreateRequest;
import co.elastic.clients.elasticsearch.core.CreateResponse;
import co.elastic.clients.elasticsearch.core.DeleteByQueryRequest;
import co.elastic.clients.elasticsearch.core.DeleteByQueryResponse;
import co.elastic.clients.elasticsearch.core.DeleteByQueryRethrottleRequest;
import co.elastic.clients.elasticsearch.core.DeleteByQueryRethrottleResponse;
import co.elastic.clients.elasticsearch.core.DeleteRequest;
import co.elastic.clients.elasticsearch.core.DeleteResponse;
import co.elastic.clients.elasticsearch.core.DeleteScriptRequest;
import co.elastic.clients.elasticsearch.core.DeleteScriptResponse;
import co.elastic.clients.elasticsearch.core.ExistsRequest;
import co.elastic.clients.elasticsearch.core.ExistsSourceRequest;
import co.elastic.clients.elasticsearch.core.ExplainRequest;
import co.elastic.clients.elasticsearch.core.ExplainResponse;
import co.elastic.clients.elasticsearch.core.FieldCapsRequest;
import co.elastic.clients.elasticsearch.core.FieldCapsResponse;
import co.elastic.clients.elasticsearch.core.GetRequest;
import co.elastic.clients.elasticsearch.core.GetResponse;
import co.elastic.clients.elasticsearch.core.GetScriptContextRequest;
import co.elastic.clients.elasticsearch.core.GetScriptContextResponse;
import co.elastic.clients.elasticsearch.core.GetScriptLanguagesRequest;
import co.elastic.clients.elasticsearch.core.GetScriptLanguagesResponse;
import co.elastic.clients.elasticsearch.core.GetScriptRequest;
import co.elastic.clients.elasticsearch.core.GetScriptResponse;
import co.elastic.clients.elasticsearch.core.GetSourceRequest;
import co.elastic.clients.elasticsearch.core.GetSourceResponse;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.elasticsearch.core.InfoRequest;
import co.elastic.clients.elasticsearch.core.InfoResponse;
import co.elastic.clients.elasticsearch.core.KnnSearchRequest;
import co.elastic.clients.elasticsearch.core.KnnSearchResponse;
import co.elastic.clients.elasticsearch.core.MgetRequest;
import co.elastic.clients.elasticsearch.core.MgetResponse;
import co.elastic.clients.elasticsearch.core.MsearchRequest;
import co.elastic.clients.elasticsearch.core.MsearchResponse;
import co.elastic.clients.elasticsearch.core.MsearchTemplateRequest;
import co.elastic.clients.elasticsearch.core.MsearchTemplateResponse;
import co.elastic.clients.elasticsearch.core.MtermvectorsRequest;
import co.elastic.clients.elasticsearch.core.MtermvectorsResponse;
import co.elastic.clients.elasticsearch.core.OpenPointInTimeRequest;
import co.elastic.clients.elasticsearch.core.OpenPointInTimeResponse;
import co.elastic.clients.elasticsearch.core.PingRequest;
import co.elastic.clients.elasticsearch.core.PutScriptRequest;
import co.elastic.clients.elasticsearch.core.PutScriptResponse;
import co.elastic.clients.elasticsearch.core.RankEvalRequest;
import co.elastic.clients.elasticsearch.core.RankEvalResponse;
import co.elastic.clients.elasticsearch.core.ReindexRequest;
import co.elastic.clients.elasticsearch.core.ReindexResponse;
import co.elastic.clients.elasticsearch.core.ReindexRethrottleRequest;
import co.elastic.clients.elasticsearch.core.ReindexRethrottleResponse;
import co.elastic.clients.elasticsearch.core.ScriptsPainlessExecuteRequest;
import co.elastic.clients.elasticsearch.core.ScriptsPainlessExecuteResponse;
import co.elastic.clients.elasticsearch.core.SearchMvtRequest;
import co.elastic.clients.elasticsearch.core.SearchMvtResponse;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.SearchShardsRequest;
import co.elastic.clients.elasticsearch.core.SearchShardsResponse;
import co.elastic.clients.elasticsearch.core.SearchTemplateRequest;
import co.elastic.clients.elasticsearch.core.SearchTemplateResponse;
import co.elastic.clients.elasticsearch.core.TermsEnumRequest;
import co.elastic.clients.elasticsearch.core.TermsEnumResponse;
import co.elastic.clients.elasticsearch.core.TermvectorsRequest;
import co.elastic.clients.elasticsearch.core.TermvectorsResponse;
import co.elastic.clients.elasticsearch.core.UpdateByQueryRequest;
import co.elastic.clients.elasticsearch.core.UpdateByQueryResponse;
import co.elastic.clients.elasticsearch.core.UpdateByQueryRethrottleRequest;
import co.elastic.clients.elasticsearch.core.UpdateByQueryRethrottleResponse;
import co.elastic.clients.elasticsearch.core.UpdateRequest;
import co.elastic.clients.elasticsearch.core.UpdateResponse;
import co.elastic.clients.elasticsearch.dangling_indices.ElasticsearchDanglingIndicesClient;
import co.elastic.clients.elasticsearch.features.ElasticsearchFeaturesClient;
import co.elastic.clients.elasticsearch.indices.ElasticsearchIndicesClient;
import co.elastic.clients.elasticsearch.ingest.ElasticsearchIngestClient;
import co.elastic.clients.elasticsearch.nodes.ElasticsearchNodesClient;
import co.elastic.clients.elasticsearch.shutdown.ElasticsearchShutdownClient;
import co.elastic.clients.elasticsearch.snapshot.ElasticsearchSnapshotClient;
import co.elastic.clients.elasticsearch.tasks.ElasticsearchTasksClient;
import co.elastic.clients.transport.BooleanResponse;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;

import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the namespace.
 */
public class ElasticsearchClient extends ApiClient<ElasticsearchClient> {

    public ElasticsearchClient(Transport transport) {
        super(transport, null);
    }

    public ElasticsearchClient(Transport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public ElasticsearchClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new ElasticsearchClient(this.transport, transportOptions);
    }

    // ----- Child clients

    public ElasticsearchCatClient cat() {
        return new ElasticsearchCatClient(this.transport, this.transportOptions);
    }

    public ElasticsearchClusterClient cluster() {
        return new ElasticsearchClusterClient(this.transport, this.transportOptions);
    }

    public ElasticsearchDanglingIndicesClient danglingIndices() {
        return new ElasticsearchDanglingIndicesClient(this.transport, this.transportOptions);
    }

    public ElasticsearchFeaturesClient features() {
        return new ElasticsearchFeaturesClient(this.transport, this.transportOptions);
    }

    public ElasticsearchIndicesClient indices() {
        return new ElasticsearchIndicesClient(this.transport, this.transportOptions);
    }

    public ElasticsearchIngestClient ingest() {
        return new ElasticsearchIngestClient(this.transport, this.transportOptions);
    }

    public ElasticsearchNodesClient nodes() {
        return new ElasticsearchNodesClient(this.transport, this.transportOptions);
    }

    public ElasticsearchShutdownClient shutdown() {
        return new ElasticsearchShutdownClient(this.transport, this.transportOptions);
    }

    public ElasticsearchSnapshotClient snapshot() {
        return new ElasticsearchSnapshotClient(this.transport, this.transportOptions);
    }

    public ElasticsearchTasksClient tasks() {
        return new ElasticsearchTasksClient(this.transport, this.transportOptions);
    }

    // ----- Endpoint: bulk

    /**
     * Allows to perform multiple index/update/delete operations in a single
     * request.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-bulk.html">Documentation
     * on elastic.co</a>
     */

    public BulkResponse bulk(BulkRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, BulkRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Allows to perform multiple index/update/delete operations in a single
     * request.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link BulkRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-bulk.html">Documentation
     * on elastic.co</a>
     */

    public final BulkResponse bulk(Function<BulkRequest.Builder, ObjectBuilder<BulkRequest>> fn)
            throws IOException, ElasticsearchException {
        return bulk(fn.apply(new BulkRequest.Builder()).build());
    }

    /**
     * Allows to perform multiple index/update/delete operations in a single
     * request.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-bulk.html">Documentation
     * on elastic.co</a>
     */

    public BulkResponse bulk() throws IOException, ElasticsearchException {
        return this.transport.performRequest(new BulkRequest.Builder().build(), BulkRequest.ENDPOINT,
                this.transportOptions);
    }

    // ----- Endpoint: clear_scroll

    /**
     * Explicitly clears the search context for a scroll.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-scroll-api.html">Documentation
     * on elastic.co</a>
     */

    public ClearScrollResponse clearScroll(ClearScrollRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, ClearScrollRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Explicitly clears the search context for a scroll.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link ClearScrollRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-scroll-api.html">Documentation
     * on elastic.co</a>
     */

    public final ClearScrollResponse clearScroll(
            Function<ClearScrollRequest.Builder, ObjectBuilder<ClearScrollRequest>> fn)
            throws IOException, ElasticsearchException {
        return clearScroll(fn.apply(new ClearScrollRequest.Builder()).build());
    }

    /**
     * Explicitly clears the search context for a scroll.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-scroll-api.html">Documentation
     * on elastic.co</a>
     */

    public ClearScrollResponse clearScroll() throws IOException, ElasticsearchException {
        return this.transport.performRequest(new ClearScrollRequest.Builder().build(), ClearScrollRequest.ENDPOINT,
                this.transportOptions);
    }

    // ----- Endpoint: close_point_in_time

    /**
     * Close a point in time
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
     * on elastic.co</a>
     */

    public ClosePointInTimeResponse closePointInTime(ClosePointInTimeRequest request)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, ClosePointInTimeRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Close a point in time
     *
     * @param fn a function that initializes a builder to create the
     *           {@link ClosePointInTimeRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
     * on elastic.co</a>
     */

    public final ClosePointInTimeResponse closePointInTime(
            Function<ClosePointInTimeRequest.Builder, ObjectBuilder<ClosePointInTimeRequest>> fn)
            throws IOException, ElasticsearchException {
        return closePointInTime(fn.apply(new ClosePointInTimeRequest.Builder()).build());
    }

    // ----- Endpoint: count

    /**
     * Returns number of documents matching a query.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-count.html">Documentation
     * on elastic.co</a>
     */

    public CountResponse count(CountRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, CountRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Returns number of documents matching a query.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link CountRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-count.html">Documentation
     * on elastic.co</a>
     */

    public final CountResponse count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn)
            throws IOException, ElasticsearchException {
        return count(fn.apply(new CountRequest.Builder()).build());
    }

    /**
     * Returns number of documents matching a query.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-count.html">Documentation
     * on elastic.co</a>
     */

    public CountResponse count() throws IOException, ElasticsearchException {
        return this.transport.performRequest(new CountRequest.Builder().build(), CountRequest.ENDPOINT,
                this.transportOptions);
    }

    // ----- Endpoint: create

    /**
     * Creates a new document in the index.
     * <p>
     * Returns a 409 response when a document with a same ID already exists in the
     * index.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
     * on elastic.co</a>
     */

    public <TDocument> CreateResponse create(CreateRequest<TDocument> request)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, CreateRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Creates a new document in the index.
     * <p>
     * Returns a 409 response when a document with a same ID already exists in the
     * index.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link CreateRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
     * on elastic.co</a>
     */

    public final <TDocument> CreateResponse create(
            Function<CreateRequest.Builder<TDocument>, ObjectBuilder<CreateRequest<TDocument>>> fn)
            throws IOException, ElasticsearchException {
        return create(fn.apply(new CreateRequest.Builder<TDocument>()).build());
    }

    // ----- Endpoint: delete

    /**
     * Removes a document from the index.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete.html">Documentation
     * on elastic.co</a>
     */

    public DeleteResponse delete(DeleteRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, DeleteRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Removes a document from the index.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link DeleteRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete.html">Documentation
     * on elastic.co</a>
     */

    public final DeleteResponse delete(Function<DeleteRequest.Builder, ObjectBuilder<DeleteRequest>> fn)
            throws IOException, ElasticsearchException {
        return delete(fn.apply(new DeleteRequest.Builder()).build());
    }

    // ----- Endpoint: delete_by_query

    /**
     * Deletes documents matching the provided query.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete-by-query.html">Documentation
     * on elastic.co</a>
     */

    public DeleteByQueryResponse deleteByQuery(DeleteByQueryRequest request)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, DeleteByQueryRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes documents matching the provided query.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link DeleteByQueryRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete-by-query.html">Documentation
     * on elastic.co</a>
     */

    public final DeleteByQueryResponse deleteByQuery(
            Function<DeleteByQueryRequest.Builder, ObjectBuilder<DeleteByQueryRequest>> fn)
            throws IOException, ElasticsearchException {
        return deleteByQuery(fn.apply(new DeleteByQueryRequest.Builder()).build());
    }

    // ----- Endpoint: delete_by_query_rethrottle

    /**
     * Changes the number of requests per second for a particular Delete By Query
     * operation.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-delete-by-query.html">Documentation
     * on elastic.co</a>
     */

    public DeleteByQueryRethrottleResponse deleteByQueryRethrottle(DeleteByQueryRethrottleRequest request)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, DeleteByQueryRethrottleRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Changes the number of requests per second for a particular Delete By Query
     * operation.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link DeleteByQueryRethrottleRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-delete-by-query.html">Documentation
     * on elastic.co</a>
     */

    public final DeleteByQueryRethrottleResponse deleteByQueryRethrottle(
            Function<DeleteByQueryRethrottleRequest.Builder, ObjectBuilder<DeleteByQueryRethrottleRequest>> fn)
            throws IOException, ElasticsearchException {
        return deleteByQueryRethrottle(fn.apply(new DeleteByQueryRethrottleRequest.Builder()).build());
    }

    // ----- Endpoint: delete_script

    /**
     * Deletes a script.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
     * on elastic.co</a>
     */

    public DeleteScriptResponse deleteScript(DeleteScriptRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, DeleteScriptRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a script.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link DeleteScriptRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
     * on elastic.co</a>
     */

    public final DeleteScriptResponse deleteScript(
            Function<DeleteScriptRequest.Builder, ObjectBuilder<DeleteScriptRequest>> fn)
            throws IOException, ElasticsearchException {
        return deleteScript(fn.apply(new DeleteScriptRequest.Builder()).build());
    }

    // ----- Endpoint: exists

    /**
     * Returns information about whether a document exists in an index.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
     * on elastic.co</a>
     */

    public BooleanResponse exists(ExistsRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, ExistsRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about whether a document exists in an index.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link ExistsRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
     * on elastic.co</a>
     */

    public final BooleanResponse exists(Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn)
            throws IOException, ElasticsearchException {
        return exists(fn.apply(new ExistsRequest.Builder()).build());
    }

    // ----- Endpoint: exists_source

    /**
     * Returns information about whether a document source exists in an index.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
     * on elastic.co</a>
     */

    public BooleanResponse existsSource(ExistsSourceRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, ExistsSourceRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about whether a document source exists in an index.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link ExistsSourceRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
     * on elastic.co</a>
     */

    public final BooleanResponse existsSource(
            Function<ExistsSourceRequest.Builder, ObjectBuilder<ExistsSourceRequest>> fn)
            throws IOException, ElasticsearchException {
        return existsSource(fn.apply(new ExistsSourceRequest.Builder()).build());
    }

    // ----- Endpoint: explain

    /**
     * Returns information about why a specific matches (or doesn't match) a query.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-explain.html">Documentation
     * on elastic.co</a>
     */

    public <TDocument> ExplainResponse<TDocument> explain(ExplainRequest request, Class<TDocument> tDocumentClass)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request,
                ExplainRequest.createExplainEndpoint(getDeserializer(tDocumentClass)), this.transportOptions);
    }

    /**
     * Returns information about why a specific matches (or doesn't match) a query.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link ExplainRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-explain.html">Documentation
     * on elastic.co</a>
     */

    public final <TDocument> ExplainResponse<TDocument> explain(
            Function<ExplainRequest.Builder, ObjectBuilder<ExplainRequest>> fn, Class<TDocument> tDocumentClass)
            throws IOException, ElasticsearchException {
        return explain(fn.apply(new ExplainRequest.Builder()).build(), tDocumentClass);
    }

    // ----- Endpoint: field_caps

    /**
     * Returns the information about the capabilities of fields among multiple
     * indices.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
     * on elastic.co</a>
     */

    public FieldCapsResponse fieldCaps(FieldCapsRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, FieldCapsRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Returns the information about the capabilities of fields among multiple
     * indices.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link FieldCapsRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
     * on elastic.co</a>
     */

    public final FieldCapsResponse fieldCaps(Function<FieldCapsRequest.Builder, ObjectBuilder<FieldCapsRequest>> fn)
            throws IOException, ElasticsearchException {
        return fieldCaps(fn.apply(new FieldCapsRequest.Builder()).build());
    }

    /**
     * Returns the information about the capabilities of fields among multiple
     * indices.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
     * on elastic.co</a>
     */

    public FieldCapsResponse fieldCaps() throws IOException, ElasticsearchException {
        return this.transport.performRequest(new FieldCapsRequest.Builder().build(), FieldCapsRequest.ENDPOINT,
                this.transportOptions);
    }

    // ----- Endpoint: get

    /**
     * Returns a document.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
     * on elastic.co</a>
     */

    public <TDocument> GetResponse<TDocument> get(GetRequest request, Class<TDocument> tDocumentClass)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, GetRequest.createGetEndpoint(getDeserializer(tDocumentClass)),
                this.transportOptions);
    }

    /**
     * Returns a document.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link GetRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
     * on elastic.co</a>
     */

    public final <TDocument> GetResponse<TDocument> get(Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn,
                                                        Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
        return get(fn.apply(new GetRequest.Builder()).build(), tDocumentClass);
    }

    // ----- Endpoint: get_script

    /**
     * Returns a script.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
     * on elastic.co</a>
     */

    public GetScriptResponse getScript(GetScriptRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, GetScriptRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Returns a script.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link GetScriptRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
     * on elastic.co</a>
     */

    public final GetScriptResponse getScript(Function<GetScriptRequest.Builder, ObjectBuilder<GetScriptRequest>> fn)
            throws IOException, ElasticsearchException {
        return getScript(fn.apply(new GetScriptRequest.Builder()).build());
    }

    // ----- Endpoint: get_script_context

    /**
     * Returns all script contexts.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-contexts.html">Documentation
     * on elastic.co</a>
     */
    public GetScriptContextResponse getScriptContext() throws IOException, ElasticsearchException {
        return this.transport.performRequest(GetScriptContextRequest._INSTANCE, GetScriptContextRequest.ENDPOINT,
                this.transportOptions);
    }

    // ----- Endpoint: get_script_languages

    /**
     * Returns available script types, languages and contexts
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
     * on elastic.co</a>
     */
    public GetScriptLanguagesResponse getScriptLanguages() throws IOException, ElasticsearchException {
        return this.transport.performRequest(GetScriptLanguagesRequest._INSTANCE, GetScriptLanguagesRequest.ENDPOINT,
                this.transportOptions);
    }

    // ----- Endpoint: get_source

    /**
     * Returns the source of a document.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
     * on elastic.co</a>
     */

    public <TDocument> GetSourceResponse<TDocument> getSource(GetSourceRequest request, Class<TDocument> tDocumentClass)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request,
                GetSourceRequest.createGetSourceEndpoint(getDeserializer(tDocumentClass)), this.transportOptions);
    }

    /**
     * Returns the source of a document.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link GetSourceRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
     * on elastic.co</a>
     */

    public final <TDocument> GetSourceResponse<TDocument> getSource(
            Function<GetSourceRequest.Builder, ObjectBuilder<GetSourceRequest>> fn, Class<TDocument> tDocumentClass)
            throws IOException, ElasticsearchException {
        return getSource(fn.apply(new GetSourceRequest.Builder()).build(), tDocumentClass);
    }

    // ----- Endpoint: index

    /**
     * Creates or updates a document in an index.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
     * on elastic.co</a>
     */

    public <TDocument> IndexResponse index(IndexRequest<TDocument> request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, IndexRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or updates a document in an index.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link IndexRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
     * on elastic.co</a>
     */

    public final <TDocument> IndexResponse index(
            Function<IndexRequest.Builder<TDocument>, ObjectBuilder<IndexRequest<TDocument>>> fn)
            throws IOException, ElasticsearchException {
        return index(fn.apply(new IndexRequest.Builder<TDocument>()).build());
    }

    // ----- Endpoint: info

    /**
     * Returns basic information about the cluster.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html">Documentation
     * on elastic.co</a>
     */
    public InfoResponse info() throws IOException, ElasticsearchException {
        return this.transport.performRequest(InfoRequest._INSTANCE, InfoRequest.ENDPOINT, this.transportOptions);
    }

    // ----- Endpoint: knn_search

    /**
     * Performs a kNN search.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
     * on elastic.co</a>
     */

    public <TDocument> KnnSearchResponse<TDocument> knnSearch(KnnSearchRequest request, Class<TDocument> tDocumentClass)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request,
                KnnSearchRequest.createKnnSearchEndpoint(getDeserializer(tDocumentClass)), this.transportOptions);
    }

    /**
     * Performs a kNN search.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link KnnSearchRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
     * on elastic.co</a>
     */

    public final <TDocument> KnnSearchResponse<TDocument> knnSearch(
            Function<KnnSearchRequest.Builder, ObjectBuilder<KnnSearchRequest>> fn, Class<TDocument> tDocumentClass)
            throws IOException, ElasticsearchException {
        return knnSearch(fn.apply(new KnnSearchRequest.Builder()).build(), tDocumentClass);
    }

    // ----- Endpoint: mget

    /**
     * Allows to get multiple documents in one request.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-get.html">Documentation
     * on elastic.co</a>
     */

    public <TDocument> MgetResponse<TDocument> mget(MgetRequest request, Class<TDocument> tDocumentClass)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, MgetRequest.createMgetEndpoint(getDeserializer(tDocumentClass)),
                this.transportOptions);
    }

    /**
     * Allows to get multiple documents in one request.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link MgetRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-get.html">Documentation
     * on elastic.co</a>
     */

    public final <TDocument> MgetResponse<TDocument> mget(Function<MgetRequest.Builder, ObjectBuilder<MgetRequest>> fn,
                                                          Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
        return mget(fn.apply(new MgetRequest.Builder()).build(), tDocumentClass);
    }

    // ----- Endpoint: msearch

    /**
     * Allows to execute several search operations in one request.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-multi-search.html">Documentation
     * on elastic.co</a>
     */

    public <TDocument> MsearchResponse<TDocument> msearch(MsearchRequest request, Class<TDocument> tDocumentClass)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request,
                MsearchRequest.createMsearchEndpoint(getDeserializer(tDocumentClass)), this.transportOptions);
    }

    /**
     * Allows to execute several search operations in one request.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link MsearchRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-multi-search.html">Documentation
     * on elastic.co</a>
     */

    public final <TDocument> MsearchResponse<TDocument> msearch(
            Function<MsearchRequest.Builder, ObjectBuilder<MsearchRequest>> fn, Class<TDocument> tDocumentClass)
            throws IOException, ElasticsearchException {
        return msearch(fn.apply(new MsearchRequest.Builder()).build(), tDocumentClass);
    }

    // ----- Endpoint: msearch_template

    /**
     * Allows to execute several search template operations in one request.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-multi-search.html">Documentation
     * on elastic.co</a>
     */

    public <TDocument> MsearchTemplateResponse<TDocument> msearchTemplate(MsearchTemplateRequest request,
                                                                          Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request,
                MsearchTemplateRequest.createMsearchTemplateEndpoint(getDeserializer(tDocumentClass)),
                this.transportOptions);
    }

    /**
     * Allows to execute several search template operations in one request.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link MsearchTemplateRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-multi-search.html">Documentation
     * on elastic.co</a>
     */

    public final <TDocument> MsearchTemplateResponse<TDocument> msearchTemplate(
            Function<MsearchTemplateRequest.Builder, ObjectBuilder<MsearchTemplateRequest>> fn,
            Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
        return msearchTemplate(fn.apply(new MsearchTemplateRequest.Builder()).build(), tDocumentClass);
    }

    // ----- Endpoint: mtermvectors

    /**
     * Returns multiple termvectors in one request.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-termvectors.html">Documentation
     * on elastic.co</a>
     */

    public MtermvectorsResponse mtermvectors(MtermvectorsRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, MtermvectorsRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Returns multiple termvectors in one request.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link MtermvectorsRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-termvectors.html">Documentation
     * on elastic.co</a>
     */

    public final MtermvectorsResponse mtermvectors(
            Function<MtermvectorsRequest.Builder, ObjectBuilder<MtermvectorsRequest>> fn)
            throws IOException, ElasticsearchException {
        return mtermvectors(fn.apply(new MtermvectorsRequest.Builder()).build());
    }

    /**
     * Returns multiple termvectors in one request.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-termvectors.html">Documentation
     * on elastic.co</a>
     */

    public MtermvectorsResponse mtermvectors() throws IOException, ElasticsearchException {
        return this.transport.performRequest(new MtermvectorsRequest.Builder().build(), MtermvectorsRequest.ENDPOINT,
                this.transportOptions);
    }

    // ----- Endpoint: open_point_in_time

    /**
     * Open a point in time that can be used in subsequent searches
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
     * on elastic.co</a>
     */

    public OpenPointInTimeResponse openPointInTime(OpenPointInTimeRequest request)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, OpenPointInTimeRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Open a point in time that can be used in subsequent searches
     *
     * @param fn a function that initializes a builder to create the
     *           {@link OpenPointInTimeRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
     * on elastic.co</a>
     */

    public final OpenPointInTimeResponse openPointInTime(
            Function<OpenPointInTimeRequest.Builder, ObjectBuilder<OpenPointInTimeRequest>> fn)
            throws IOException, ElasticsearchException {
        return openPointInTime(fn.apply(new OpenPointInTimeRequest.Builder()).build());
    }

    // ----- Endpoint: ping

    /**
     * Returns whether the cluster is running.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html">Documentation
     * on elastic.co</a>
     */
    public BooleanResponse ping() throws IOException, ElasticsearchException {
        return this.transport.performRequest(PingRequest._INSTANCE, PingRequest.ENDPOINT, this.transportOptions);
    }

    // ----- Endpoint: put_script

    /**
     * Creates or updates a script.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
     * on elastic.co</a>
     */

    public PutScriptResponse putScript(PutScriptRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, PutScriptRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or updates a script.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link PutScriptRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
     * on elastic.co</a>
     */

    public final PutScriptResponse putScript(Function<PutScriptRequest.Builder, ObjectBuilder<PutScriptRequest>> fn)
            throws IOException, ElasticsearchException {
        return putScript(fn.apply(new PutScriptRequest.Builder()).build());
    }

    // ----- Endpoint: rank_eval

    /**
     * Allows to evaluate the quality of ranked search results over a set of typical
     * search queries
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-rank-eval.html">Documentation
     * on elastic.co</a>
     */

    public RankEvalResponse rankEval(RankEvalRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, RankEvalRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Allows to evaluate the quality of ranked search results over a set of typical
     * search queries
     *
     * @param fn a function that initializes a builder to create the
     *           {@link RankEvalRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-rank-eval.html">Documentation
     * on elastic.co</a>
     */

    public final RankEvalResponse rankEval(Function<RankEvalRequest.Builder, ObjectBuilder<RankEvalRequest>> fn)
            throws IOException, ElasticsearchException {
        return rankEval(fn.apply(new RankEvalRequest.Builder()).build());
    }

    // ----- Endpoint: reindex

    /**
     * Allows to copy documents from one index to another, optionally filtering the
     * source documents by a query, changing the destination index settings, or
     * fetching the documents from a remote cluster.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
     * on elastic.co</a>
     */

    public ReindexResponse reindex(ReindexRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, ReindexRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Allows to copy documents from one index to another, optionally filtering the
     * source documents by a query, changing the destination index settings, or
     * fetching the documents from a remote cluster.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link ReindexRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
     * on elastic.co</a>
     */

    public final ReindexResponse reindex(Function<ReindexRequest.Builder, ObjectBuilder<ReindexRequest>> fn)
            throws IOException, ElasticsearchException {
        return reindex(fn.apply(new ReindexRequest.Builder()).build());
    }

    /**
     * Allows to copy documents from one index to another, optionally filtering the
     * source documents by a query, changing the destination index settings, or
     * fetching the documents from a remote cluster.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
     * on elastic.co</a>
     */

    public ReindexResponse reindex() throws IOException, ElasticsearchException {
        return this.transport.performRequest(new ReindexRequest.Builder().build(), ReindexRequest.ENDPOINT,
                this.transportOptions);
    }

    // ----- Endpoint: reindex_rethrottle

    /**
     * Changes the number of requests per second for a particular Reindex operation.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
     * on elastic.co</a>
     */

    public ReindexRethrottleResponse reindexRethrottle(ReindexRethrottleRequest request)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, ReindexRethrottleRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Changes the number of requests per second for a particular Reindex operation.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link ReindexRethrottleRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
     * on elastic.co</a>
     */

    public final ReindexRethrottleResponse reindexRethrottle(
            Function<ReindexRethrottleRequest.Builder, ObjectBuilder<ReindexRethrottleRequest>> fn)
            throws IOException, ElasticsearchException {
        return reindexRethrottle(fn.apply(new ReindexRethrottleRequest.Builder()).build());
    }

    // ----- Endpoint: scripts_painless_execute

    /**
     * Allows an arbitrary script to be executed and a result to be returned
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-execute-api.html">Documentation
     * on elastic.co</a>
     */

    public <TResult> ScriptsPainlessExecuteResponse<TResult> scriptsPainlessExecute(
            ScriptsPainlessExecuteRequest request, Class<TResult> tResultClass)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request,
                ScriptsPainlessExecuteRequest.createScriptsPainlessExecuteEndpoint(getDeserializer(tResultClass)),
                this.transportOptions);
    }

    /**
     * Allows an arbitrary script to be executed and a result to be returned
     *
     * @param fn a function that initializes a builder to create the
     *           {@link ScriptsPainlessExecuteRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-execute-api.html">Documentation
     * on elastic.co</a>
     */

    public final <TResult> ScriptsPainlessExecuteResponse<TResult> scriptsPainlessExecute(
            Function<ScriptsPainlessExecuteRequest.Builder, ObjectBuilder<ScriptsPainlessExecuteRequest>> fn,
            Class<TResult> tResultClass) throws IOException, ElasticsearchException {
        return scriptsPainlessExecute(fn.apply(new ScriptsPainlessExecuteRequest.Builder()).build(), tResultClass);
    }

    // ----- Endpoint: search

    /**
     * Returns results matching a query.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
     * on elastic.co</a>
     */

    public <TDocument> SearchResponse<TDocument> search(SearchRequest request, Class<TDocument> tDocumentClass)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request,
                SearchRequest.createSearchEndpoint(getDeserializer(tDocumentClass)), this.transportOptions);
    }

    /**
     * Returns results matching a query.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link SearchRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
     * on elastic.co</a>
     */

    public final <TDocument> SearchResponse<TDocument> search(
            Function<SearchRequest.Builder, ObjectBuilder<SearchRequest>> fn, Class<TDocument> tDocumentClass)
            throws IOException, ElasticsearchException {
        return search(fn.apply(new SearchRequest.Builder()).build(), tDocumentClass);
    }

    // ----- Endpoint: search_mvt

    /**
     * Searches a vector tile for geospatial values. Returns results as a binary
     * Mapbox vector tile.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-vector-tile-api.html">Documentation
     * on elastic.co</a>
     */

    public SearchMvtResponse searchMvt(SearchMvtRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, SearchMvtRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Searches a vector tile for geospatial values. Returns results as a binary
     * Mapbox vector tile.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link SearchMvtRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-vector-tile-api.html">Documentation
     * on elastic.co</a>
     */

    public final SearchMvtResponse searchMvt(Function<SearchMvtRequest.Builder, ObjectBuilder<SearchMvtRequest>> fn)
            throws IOException, ElasticsearchException {
        return searchMvt(fn.apply(new SearchMvtRequest.Builder()).build());
    }

    // ----- Endpoint: search_shards

    /**
     * Returns information about the indices and shards that a search request would
     * be executed against.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-shards.html">Documentation
     * on elastic.co</a>
     */

    public SearchShardsResponse searchShards(SearchShardsRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, SearchShardsRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about the indices and shards that a search request would
     * be executed against.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link SearchShardsRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-shards.html">Documentation
     * on elastic.co</a>
     */

    public final SearchShardsResponse searchShards(
            Function<SearchShardsRequest.Builder, ObjectBuilder<SearchShardsRequest>> fn)
            throws IOException, ElasticsearchException {
        return searchShards(fn.apply(new SearchShardsRequest.Builder()).build());
    }

    /**
     * Returns information about the indices and shards that a search request would
     * be executed against.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-shards.html">Documentation
     * on elastic.co</a>
     */

    public SearchShardsResponse searchShards() throws IOException, ElasticsearchException {
        return this.transport.performRequest(new SearchShardsRequest.Builder().build(), SearchShardsRequest.ENDPOINT,
                this.transportOptions);
    }

    // ----- Endpoint: search_template

    /**
     * Allows to use the Mustache language to pre-render a search definition.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-template.html">Documentation
     * on elastic.co</a>
     */

    public <TDocument> SearchTemplateResponse<TDocument> searchTemplate(SearchTemplateRequest request,
                                                                        Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request,
                SearchTemplateRequest.createSearchTemplateEndpoint(getDeserializer(tDocumentClass)),
                this.transportOptions);
    }

    /**
     * Allows to use the Mustache language to pre-render a search definition.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link SearchTemplateRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-template.html">Documentation
     * on elastic.co</a>
     */

    public final <TDocument> SearchTemplateResponse<TDocument> searchTemplate(
            Function<SearchTemplateRequest.Builder, ObjectBuilder<SearchTemplateRequest>> fn,
            Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
        return searchTemplate(fn.apply(new SearchTemplateRequest.Builder()).build(), tDocumentClass);
    }

    // ----- Endpoint: terms_enum

    /**
     * The terms enum API can be used to discover terms in the index that begin with
     * the provided string. It is designed for low-latency look-ups used in
     * auto-complete scenarios.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-terms-enum.html">Documentation
     * on elastic.co</a>
     */

    public TermsEnumResponse termsEnum(TermsEnumRequest request) throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, TermsEnumRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * The terms enum API can be used to discover terms in the index that begin with
     * the provided string. It is designed for low-latency look-ups used in
     * auto-complete scenarios.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link TermsEnumRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-terms-enum.html">Documentation
     * on elastic.co</a>
     */

    public final TermsEnumResponse termsEnum(Function<TermsEnumRequest.Builder, ObjectBuilder<TermsEnumRequest>> fn)
            throws IOException, ElasticsearchException {
        return termsEnum(fn.apply(new TermsEnumRequest.Builder()).build());
    }

    // ----- Endpoint: termvectors

    /**
     * Returns information and statistics about terms in the fields of a particular
     * document.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-termvectors.html">Documentation
     * on elastic.co</a>
     */

    public <TDocument> TermvectorsResponse termvectors(TermvectorsRequest<TDocument> request)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, TermvectorsRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information and statistics about terms in the fields of a particular
     * document.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link TermvectorsRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-termvectors.html">Documentation
     * on elastic.co</a>
     */

    public final <TDocument> TermvectorsResponse termvectors(
            Function<TermvectorsRequest.Builder<TDocument>, ObjectBuilder<TermvectorsRequest<TDocument>>> fn)
            throws IOException, ElasticsearchException {
        return termvectors(fn.apply(new TermvectorsRequest.Builder<TDocument>()).build());
    }

    // ----- Endpoint: update

    /**
     * Updates a document with a script or partial document.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update.html">Documentation
     * on elastic.co</a>
     */

    public <TDocument, TPartialDocument> UpdateResponse<TDocument> update(
            UpdateRequest<TDocument, TPartialDocument> request, Class<TDocument> tDocumentClass)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request,
                UpdateRequest.createUpdateEndpoint(getDeserializer(tDocumentClass)), this.transportOptions);
    }

    /**
     * Updates a document with a script or partial document.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link UpdateRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update.html">Documentation
     * on elastic.co</a>
     */

    public final <TDocument, TPartialDocument> UpdateResponse<TDocument> update(
            Function<UpdateRequest.Builder<TDocument, TPartialDocument>, ObjectBuilder<UpdateRequest<TDocument, TPartialDocument>>> fn,
            Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
        return update(fn.apply(new UpdateRequest.Builder<TDocument, TPartialDocument>()).build(), tDocumentClass);
    }

    // ----- Endpoint: update_by_query

    /**
     * Performs an update on every document in the index without changing the
     * source, for example to pick up a mapping change.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update-by-query.html">Documentation
     * on elastic.co</a>
     */

    public UpdateByQueryResponse updateByQuery(UpdateByQueryRequest request)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, UpdateByQueryRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Performs an update on every document in the index without changing the
     * source, for example to pick up a mapping change.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link UpdateByQueryRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update-by-query.html">Documentation
     * on elastic.co</a>
     */

    public final UpdateByQueryResponse updateByQuery(
            Function<UpdateByQueryRequest.Builder, ObjectBuilder<UpdateByQueryRequest>> fn)
            throws IOException, ElasticsearchException {
        return updateByQuery(fn.apply(new UpdateByQueryRequest.Builder()).build());
    }

    // ----- Endpoint: update_by_query_rethrottle

    /**
     * Changes the number of requests per second for a particular Update By Query
     * operation.
     *
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-update-by-query.html">Documentation
     * on elastic.co</a>
     */

    public UpdateByQueryRethrottleResponse updateByQueryRethrottle(UpdateByQueryRethrottleRequest request)
            throws IOException, ElasticsearchException {
        return this.transport.performRequest(request, UpdateByQueryRethrottleRequest.ENDPOINT, this.transportOptions);
    }

    /**
     * Changes the number of requests per second for a particular Update By Query
     * operation.
     *
     * @param fn a function that initializes a builder to create the
     *           {@link UpdateByQueryRethrottleRequest}
     * @see <a href=
     * "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-update-by-query.html">Documentation
     * on elastic.co</a>
     */

    public final UpdateByQueryRethrottleResponse updateByQueryRethrottle(
            Function<UpdateByQueryRethrottleRequest.Builder, ObjectBuilder<UpdateByQueryRethrottleRequest>> fn)
            throws IOException, ElasticsearchException {
        return updateByQueryRethrottle(fn.apply(new UpdateByQueryRethrottleRequest.Builder()).build());
    }

}
