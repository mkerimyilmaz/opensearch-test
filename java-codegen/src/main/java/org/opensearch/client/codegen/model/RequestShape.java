/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.codegen.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.opensearch.client.codegen.model.overrides.ShouldGenerate;
import org.opensearch.client.codegen.utils.Streams;
import org.opensearch.client.codegen.utils.Strings;
import org.semver4j.Semver;

public class RequestShape extends ObjectShape {
    private static final Logger LOGGER = LogManager.getLogger();
    @Nonnull
    private final OperationGroup operationGroup;
    @Nonnull
    private final Set<String> httpMethods = new HashSet<>();
    @Nonnull
    private final List<HttpPath> httpPaths = new ArrayList<>();
    @Nonnull
    private final Map<String, Field> queryParams = new TreeMap<>();
    @Nonnull
    private final Map<String, Field> pathParams = new TreeMap<>();
    @Nonnull
    private final Map<String, Field> fields = new TreeMap<>();
    private boolean isBooleanRequest;
    @Nullable
    private Field delegatedBodyField;

    public RequestShape(
        @Nonnull Namespace parent,
        @Nonnull OperationGroup operationGroup,
        @Nullable String description,
        @Nonnull ShouldGenerate shouldGenerate
    ) {
        super(parent, requestClassName(operationGroup), operationGroup.asTypedefPrefix() + ".Request", description, shouldGenerate);
        this.operationGroup = operationGroup;
    }

    @Nonnull
    public OperationGroup getOperationGroup() {
        return operationGroup;
    }

    public String getId() {
        return operationGroup.getName();
    }

    public String getHttpMethod() {
        return Streams.sortedBy(httpMethods.stream(), m -> {
            switch (m) {
                case "PUT":
                case "DELETE":
                case "PATCH":
                case "HEAD":
                    return 0;
                case "POST":
                    return 1;
                case "GET":
                    return 2;
                default:
                    return 99;
            }
        }).findFirst().orElseThrow();
    }

    public void addSupportedHttpMethod(String method) {
        httpMethods.add(method);
    }

    public void setIsBooleanRequest() {
        isBooleanRequest = true;
    }

    public boolean isBooleanRequest() {
        return isBooleanRequest;
    }

    public Type getResponseType() {
        return !isBooleanRequest
            ? Type.builder().withPackage(getPackageName()).withName(responseClassName(operationGroup)).build()
            : Types.Client.Transport.Endpoints.BooleanResponse;
    }

    @Override
    public boolean canBeSingleton() {
        return !hasRequestBody() && !hasQueryParams() && hasSinglePath() && !getFirstPath().hasParams();
    }

    @Override
    public boolean hasFieldsToSerialize() {
        return hasRequestBody();
    }

    public boolean hasRequestBody() {
        return hasDelegatedBodyField() || !getBodyFields().isEmpty();
    }

    public void addQueryParam(Field field) {
        if (addField(field)) {
            queryParams.put(field.getName(), field);
        }
    }

    public Collection<Field> getQueryParams() {
        return queryParams.values();
    }

    public boolean hasQueryParams() {
        return !queryParams.isEmpty();
    }

    public void addHttpPath(HttpPath httpPath) {
        httpPaths.add(httpPath);
    }

    public Collection<HttpPath> getHttpPaths() {
        return httpPaths;
    }

    public HttpPath getFirstPath() {
        return httpPaths.get(0);
    }

    public boolean hasSinglePath() {
        return httpPaths.size() == 1;
    }

    public void addPathParam(Field field) {
        if (addField(field)) {
            pathParams.put(field.getName(), field);
        }
    }

    public Collection<Pair<String, Integer>> getIndexedPathParams() {
        var indexed = new ArrayList<Pair<String, Integer>>();
        var i = 0;
        for (var param : pathParams.values()) {
            indexed.add(Pair.of(param.getName(), i++));
        }
        return indexed;
    }

    public Collection<Field> getPathParams() {
        return pathParams.values();
    }

    @Override
    public void addBodyField(Field field) {
        if (addField(field)) {
            super.addBodyField(field);
        }
    }

    public void setDelegatedBodyField(String name, Type type) {
        this.delegatedBodyField = Field.builder().withName(name).withType(type).withRequired(true).withDescription("Request body.").build();
        addField(this.delegatedBodyField);
    }

    public boolean hasDelegatedBodyField() {
        return delegatedBodyField != null;
    }

    public Field getDelegatedBodyField() {
        return delegatedBodyField;
    }

    private boolean addField(Field field) {
        if (fields.containsKey(field.getName())) {
            LOGGER.warn("Attempted to add duplicate field {} to request {}", field.getName(), getOperationGroup());
            return false;
        }
        fields.put(field.getName(), field);
        tryAddReference(ReferenceKind.Field, field.getType());
        return true;
    }

    @Override
    public Collection<Field> getFields() {
        return fields.values();
    }

    @Override
    public boolean hasFields() {
        return !fields.isEmpty();
    }

    public boolean hasAnyRequiredFields() {
        return fields.values().stream().anyMatch(Field::isRequired);
    }

    public Type getJsonEndpointType() {
        return Types.Client.Transport.JsonEndpoint(getType(), getResponseType(), Types.Client.OpenSearch._Types.ErrorResponse);
    }

    public Deprecation getDeprecation() {
        var deprecations = new ArrayList<Deprecation>(httpPaths.size());
        for (var httpPath : httpPaths) {
            var deprecation = httpPath.getDeprecation();
            if (deprecation == null) {
                return null;
            }
            deprecations.add(deprecation);
        }
        deprecations.sort(Comparator.comparing(Deprecation::getVersion));
        return deprecations.get(deprecations.size() - 1);
    }

    @Nonnull
    private static String requestClassName(@Nonnull OperationGroup operationGroup) {
        return classBaseName(operationGroup) + "Request";
    }

    @Nonnull
    private static String responseClassName(@Nonnull OperationGroup operationGroup) {
        return classBaseName(operationGroup) + "Response";
    }

    @Nonnull
    private static String classBaseName(@Nonnull OperationGroup operationGroup) {
        Objects.requireNonNull(operationGroup, "operationGroup must not be null");

        switch (operationGroup.toString()) {
            case "indices.clone":
                return "CloneIndex";
            case "indices.close":
                return "CloseIndex";
            case "indices.create":
                return "CreateIndex";
            case "indices.delete":
                return "DeleteIndex";
            case "indices.get":
                return "GetIndex";
            case "indices.get_settings":
                return "GetIndicesSettings";
            case "indices.put_settings":
                return "PutIndicesSettings";
            case "snapshot.clone":
                return "CloneSnapshot";
            case "snapshot.create":
                return "CreateSnapshot";
            case "snapshot.delete":
                return "DeleteSnapshot";
            case "snapshot.get":
                return "GetSnapshot";
            case "snapshot.restore":
                return "RestoreSnapshot";
            case "snapshot.status":
                return "SnapshotStatus";
            case "tasks.get":
                return "GetTasks";
            default:
                return Strings.toPascalCase(operationGroup.getName());
        }
    }
}
