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

package org.opensearch.client.opensearch.cluster;

import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch._types.OpenSearchException;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.transport.endpoints.BooleanResponse;
import org.opensearch.client.util.ObjectBuilder;

/**
 * Client for the cluster namespace.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public abstract class OpenSearchClusterClientBase<Self extends OpenSearchClusterClientBase<Self>> extends ApiClient<
    OpenSearchTransport,
    Self> {
    public OpenSearchClusterClientBase(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    // ----- Endpoint: cluster.allocation_explain

    /**
     * Provides explanations for shard allocations in the cluster.
     */
    public AllocationExplainResponse allocationExplain(AllocationExplainRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequest(request, AllocationExplainRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Provides explanations for shard allocations in the cluster.
     *
     * @param fn a function that initializes a builder to create the {@link AllocationExplainRequest}
     */
    public final AllocationExplainResponse allocationExplain(
        Function<AllocationExplainRequest.Builder, ObjectBuilder<AllocationExplainRequest>> fn
    ) throws IOException, OpenSearchException {
        return allocationExplain(fn.apply(new AllocationExplainRequest.Builder()).build());
    }

    /**
     * Provides explanations for shard allocations in the cluster.
     */
    public final AllocationExplainResponse allocationExplain() throws IOException, OpenSearchException {
        return allocationExplain(new AllocationExplainRequest.Builder().build());
    }

    // ----- Endpoint: cluster.delete_component_template

    /**
     * Deletes a component template.
     */
    public DeleteComponentTemplateResponse deleteComponentTemplate(DeleteComponentTemplateRequest request) throws IOException,
        OpenSearchException {
        return this.transport.performRequest(request, DeleteComponentTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Deletes a component template.
     *
     * @param fn a function that initializes a builder to create the {@link DeleteComponentTemplateRequest}
     */
    public final DeleteComponentTemplateResponse deleteComponentTemplate(
        Function<DeleteComponentTemplateRequest.Builder, ObjectBuilder<DeleteComponentTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return deleteComponentTemplate(fn.apply(new DeleteComponentTemplateRequest.Builder()).build());
    }

    // ----- Endpoint: cluster.exists_component_template

    /**
     * Returns information about whether a particular component template exist.
     */
    public BooleanResponse existsComponentTemplate(ExistsComponentTemplateRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequest(request, ExistsComponentTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns information about whether a particular component template exist.
     *
     * @param fn a function that initializes a builder to create the {@link ExistsComponentTemplateRequest}
     */
    public final BooleanResponse existsComponentTemplate(
        Function<ExistsComponentTemplateRequest.Builder, ObjectBuilder<ExistsComponentTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return existsComponentTemplate(fn.apply(new ExistsComponentTemplateRequest.Builder()).build());
    }

    // ----- Endpoint: cluster.get_component_template

    /**
     * Returns one or more component templates.
     */
    public GetComponentTemplateResponse getComponentTemplate(GetComponentTemplateRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequest(request, GetComponentTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Returns one or more component templates.
     *
     * @param fn a function that initializes a builder to create the {@link GetComponentTemplateRequest}
     */
    public final GetComponentTemplateResponse getComponentTemplate(
        Function<GetComponentTemplateRequest.Builder, ObjectBuilder<GetComponentTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return getComponentTemplate(fn.apply(new GetComponentTemplateRequest.Builder()).build());
    }

    /**
     * Returns one or more component templates.
     */
    public final GetComponentTemplateResponse getComponentTemplate() throws IOException, OpenSearchException {
        return getComponentTemplate(new GetComponentTemplateRequest.Builder().build());
    }

    // ----- Endpoint: cluster.put_component_template

    /**
     * Creates or updates a component template.
     */
    public PutComponentTemplateResponse putComponentTemplate(PutComponentTemplateRequest request) throws IOException, OpenSearchException {
        return this.transport.performRequest(request, PutComponentTemplateRequest._ENDPOINT, this.transportOptions);
    }

    /**
     * Creates or updates a component template.
     *
     * @param fn a function that initializes a builder to create the {@link PutComponentTemplateRequest}
     */
    public final PutComponentTemplateResponse putComponentTemplate(
        Function<PutComponentTemplateRequest.Builder, ObjectBuilder<PutComponentTemplateRequest>> fn
    ) throws IOException, OpenSearchException {
        return putComponentTemplate(fn.apply(new PutComponentTemplateRequest.Builder()).build());
    }
}
