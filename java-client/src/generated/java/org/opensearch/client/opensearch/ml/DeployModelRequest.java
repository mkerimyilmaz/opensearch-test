/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.ml;

import java.util.function.Function;
import javax.annotation.Generated;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.transport.Endpoint;
import org.opensearch.client.transport.endpoints.SimpleEndpoint;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: ml.deploy_model.Request

/**
 * Deploys a model.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class DeployModelRequest extends RequestBase {

    private final String modelId;

    // ---------------------------------------------------------------------------------------------

    private DeployModelRequest(Builder builder) {
        this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
    }

    public static DeployModelRequest of(Function<DeployModelRequest.Builder, ObjectBuilder<DeployModelRequest>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code model_id}
     */
    public final String modelId() {
        return this.modelId;
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link DeployModelRequest}.
     */
    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DeployModelRequest> {
        private String modelId;

        /**
         * Required - API name: {@code model_id}
         */
        public final Builder modelId(String value) {
            this.modelId = value;
            return this;
        }

        /**
         * Builds a {@link DeployModelRequest}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        public DeployModelRequest build() {
            _checkSingleUse();

            return new DeployModelRequest(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Endpoint "{@code ml.deploy_model}".
     */
    public static final Endpoint<DeployModelRequest, DeployModelResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
        // Request method
        request -> "POST",
        // Request path
        request -> {
            StringBuilder buf = new StringBuilder();
            buf.append("/_plugins/_ml/models/");
            SimpleEndpoint.pathEncode(request.modelId, buf);
            buf.append("/_deploy");
            return buf.toString();
        },
        // Request parameters
        SimpleEndpoint.emptyMap(),
        SimpleEndpoint.emptyMap(),
        false,
        DeployModelResponse._DESERIALIZER
    );
}
