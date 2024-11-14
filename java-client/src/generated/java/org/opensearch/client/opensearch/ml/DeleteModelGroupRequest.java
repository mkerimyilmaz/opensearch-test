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
import javax.annotation.Nonnull;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.transport.Endpoint;
import org.opensearch.client.transport.endpoints.SimpleEndpoint;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.CopyableBuilder;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import org.opensearch.client.util.ToCopyableBuilder;

// typedef: ml.delete_model_group.Request

/**
 * Deletes a model group.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class DeleteModelGroupRequest extends RequestBase
    implements
        ToCopyableBuilder<DeleteModelGroupRequest.Builder, DeleteModelGroupRequest> {

    @Nonnull
    private final String modelGroupId;

    // ---------------------------------------------------------------------------------------------

    private DeleteModelGroupRequest(Builder builder) {
        this.modelGroupId = ApiTypeHelper.requireNonNull(builder.modelGroupId, this, "modelGroupId");
    }

    public static DeleteModelGroupRequest of(Function<DeleteModelGroupRequest.Builder, ObjectBuilder<DeleteModelGroupRequest>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code model_group_id}
     */
    @Nonnull
    public final String modelGroupId() {
        return this.modelGroupId;
    }

    // ---------------------------------------------------------------------------------------------

    @Override
    @Nonnull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Nonnull
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for {@link DeleteModelGroupRequest}.
     */
    public static class Builder extends ObjectBuilderBase implements CopyableBuilder<Builder, DeleteModelGroupRequest> {
        private String modelGroupId;

        public Builder() {}

        private Builder(DeleteModelGroupRequest o) {
            this.modelGroupId = o.modelGroupId;
        }

        private Builder(Builder o) {
            this.modelGroupId = o.modelGroupId;
        }

        @Override
        @Nonnull
        public Builder copy() {
            return new Builder(this);
        }

        /**
         * Required - API name: {@code model_group_id}
         */
        @Nonnull
        public final Builder modelGroupId(String value) {
            this.modelGroupId = value;
            return this;
        }

        /**
         * Builds a {@link DeleteModelGroupRequest}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        @Override
        @Nonnull
        public DeleteModelGroupRequest build() {
            _checkSingleUse();

            return new DeleteModelGroupRequest(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Endpoint "{@code ml.delete_model_group}".
     */
    public static final Endpoint<DeleteModelGroupRequest, DeleteModelGroupResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
        // Request method
        request -> "DELETE",
        // Request path
        request -> {
            StringBuilder buf = new StringBuilder();
            buf.append("/_plugins/_ml/model_groups/");
            SimpleEndpoint.pathEncode(request.modelGroupId, buf);
            return buf.toString();
        },
        // Request parameters
        SimpleEndpoint.emptyMap(),
        SimpleEndpoint.emptyMap(),
        false,
        DeleteModelGroupResponse._DESERIALIZER
    );

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.modelGroupId.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        DeleteModelGroupRequest other = (DeleteModelGroupRequest) o;
        return this.modelGroupId.equals(other.modelGroupId);
    }
}
