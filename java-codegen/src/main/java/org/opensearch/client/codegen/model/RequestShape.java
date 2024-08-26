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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;
import org.opensearch.client.codegen.utils.Streams;
import org.opensearch.client.codegen.utils.Strings;

public class RequestShape extends ObjectShape {
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

    public RequestShape(@Nonnull Namespace parent, @Nonnull OperationGroup operationGroup, @Nullable String description) {
        super(parent, requestClassName(operationGroup), operationGroup.asTypedefPrefix() + ".Request", description);
        this.operationGroup = operationGroup;
    }

    @Nonnull
    public OperationGroup getOperationGroup() {
        return operationGroup;
    }

    public String getId() {
        return operationGroup.getName();
    }

    @Override
    public boolean extendsOtherShape() {
        return extendsType != Types.Client.OpenSearch._Types.RequestBase;
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

    public Type getResponseType() {
        return Type.builder().pkg(getPackageName()).name(responseClassName(operationGroup)).build();
    }

    public boolean canBeSingleton() {
        return !hasRequestBody() && !hasQueryParams() && hasSinglePath() && !getFirstPath().hasParams();
    }

    public boolean hasRequestBody() {
        return !getBodyFields().isEmpty();
    }

    public void addQueryParam(Field field) {
        queryParams.put(field.getName(), field);
        addField(field);
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
        pathParams.put(field.getName(), field);
        addField(field);
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
        super.addBodyField(field);
        addField(field);
    }

    private void addField(Field field) {
        fields.put(field.getName(), field);
    }

    @Override
    public Collection<Field> getFields() {
        return fields.values();
    }

    public boolean hasAnyRequiredFields() {
        return fields.values().stream().anyMatch(Field::isRequired);
    }

    public Type getJsonEndpointType() {
        return Types.Client.Transport.JsonEndpoint(getType(), getResponseType(), Types.Client.OpenSearch._Types.ErrorResponse);
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
            case "tasks.get":
                return "GetTasks";
            default:
                return Strings.toPascalCase(operationGroup.getName());
        }
    }
}
