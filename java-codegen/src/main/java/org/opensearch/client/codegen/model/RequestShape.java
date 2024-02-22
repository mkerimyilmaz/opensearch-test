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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.tuple.Pair;
import org.opensearch.client.codegen.openapi.MimeType;
import org.opensearch.client.codegen.openapi.OpenApiMediaType;
import org.opensearch.client.codegen.openapi.OpenApiOperation;
import org.opensearch.client.codegen.openapi.OpenApiParameter;
import org.opensearch.client.codegen.openapi.OpenApiRequestBody;
import org.opensearch.client.codegen.openapi.OpenApiSchema;
import org.opensearch.client.codegen.utils.Streams;
import org.opensearch.client.codegen.utils.Strings;

public class RequestShape extends ObjectShape {
    public static RequestShape from(Context ctx, OperationGroup operationGroup, List<OpenApiOperation> variants) {
        var seenHttpPaths = new HashSet<String>();
        HashSet<String> requiredPathParams = null;
        var allPathParams = new HashMap<String, Field>();
        var canonicalPaths = new HashMap<Set<String>, HttpPath>();
        var deprecatedPaths = new HashMap<Set<String>, HttpPath>();

        for (var variant : variants) {
            var httpPathStr = variant.getHttpPath();
            if (!seenHttpPaths.add(httpPathStr)) continue;

            variant.getAllApplicableParameters(OpenApiParameter.In.PATH).forEach(parameter -> {
                var paramName = parameter.getName();
                if (!allPathParams.containsKey(paramName)) {
                    allPathParams.put(paramName, Field.from(ctx, parameter));
                }
            });

            var httpPath = HttpPath.from(httpPathStr, variant, allPathParams);

            (httpPath.deprecation() == null ? canonicalPaths : deprecatedPaths).put(httpPath.paramNameSet(), httpPath);

            if (requiredPathParams != null) {
                requiredPathParams.retainAll(httpPath.paramNameSet());
            } else {
                requiredPathParams = new HashSet<>(httpPath.paramNameSet());
            }
        }

        var paths = Stream.of(
            canonicalPaths.values().stream(),
            deprecatedPaths.entrySet().stream().filter(p -> !canonicalPaths.containsKey(p.getKey())).map(Map.Entry::getValue)
        ).flatMap(Function.identity()).sorted((p1, p2) -> {
            var params1 = p1.params();
            var p1Size = params1.size();
            var params2 = p2.params();
            var p2Size = params2.size();
            var len = Math.max(p1Size, p2Size);

            for (int i = 0; i < len; i++) {
                if (i >= p1Size) return -1;
                if (i >= p2Size) return 1;
                var cmp = params1.get(i).name().compareTo(params2.get(i).name());
                if (cmp != 0) return cmp;
            }

            return 0;
        }).toList();

        for (var entry : allPathParams.entrySet()) {
            entry.getValue().setRequired(requiredPathParams.contains(entry.getKey()));
        }

        var bodySchema = variants.get(0)
            .getRequestBody()
            .map(OpenApiRequestBody::resolve)
            .flatMap(OpenApiRequestBody::getContent)
            .flatMap(c -> c.get(MimeType.JSON))
            .flatMap(OpenApiMediaType::getSchema)
            .map(OpenApiSchema::resolve)
            .orElse(OpenApiSchema.EMPTY);

        var queryParams = variants.stream()
            .flatMap(v -> v.getAllApplicableParameters(OpenApiParameter.In.QUERY))
            .map(p -> Field.from(ctx, p))
            .toList();

        return new RequestShape(
            ctx,
            operationGroup,
            variants.get(0).getDescription(),
            variants.stream().map(OpenApiOperation::getHttpMethod).map(Enum::name).collect(Collectors.toSet()),
            paths,
            bodySchema,
            queryParams,
            allPathParams.values()
        );
    }

    private final OperationGroup operationGroup;
    private final String description;
    private final Set<String> httpMethods;
    private final List<HttpPath> httpPaths;
    private final Map<String, Field> queryParams = new TreeMap<>();
    private final Map<String, Field> pathParams = new TreeMap<>();
    private final Map<String, Field> fields = new TreeMap<>();

    private RequestShape(
        Context ctx,
        OperationGroup operationGroup,
        String description,
        Set<String> httpMethods,
        List<HttpPath> httpPaths,
        OpenApiSchema bodySchema,
        Collection<Field> queryParams,
        Collection<Field> pathParams
    ) {
        super(ctx, requestClassName(operationGroup), bodySchema);
        this.operationGroup = operationGroup;
        this.description = description;
        this.httpMethods = httpMethods;
        this.httpPaths = httpPaths;
        queryParams.forEach(f -> this.queryParams.put(f.name(), f));
        pathParams.forEach(f -> this.pathParams.put(f.name(), f));
        this.fields.putAll(this.bodyFields);
        this.fields.putAll(this.queryParams);
        this.fields.putAll(this.pathParams);
        if (super.extendsType == null) {
            super.extendsType = Types.Client.OpenSearch._Types.RequestBase;
        }
    }

    public OperationGroup operationGroup() {
        return operationGroup;
    }

    public String id() {
        return operationGroup.name();
    }

    public String description() {
        return description;
    }

    public String httpMethod() {
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

    public String responseType() {
        return responseClassName(operationGroup);
    }

    public boolean hasRequestBody() {
        return !bodyFields().isEmpty();
    }

    public Collection<Field> queryParams() {
        return queryParams.values();
    }

    public boolean hasQueryParams() {
        return !queryParams.isEmpty();
    }

    public Collection<HttpPath> httpPaths() {
        return httpPaths;
    }

    public HttpPath firstHttpPath() {
        return httpPaths.get(0);
    }

    public boolean hasSinglePath() {
        return httpPaths.size() == 1;
    }

    public Collection<Pair<String, Integer>> indexedPathParams() {
        var indexed = new ArrayList<Pair<String, Integer>>();
        var i = 0;
        for (var param : pathParams.values()) {
            indexed.add(Pair.of(param.name(), i++));
        }
        return indexed;
    }

    public Collection<Field> pathParams() {
        return pathParams.values();
    }

    @Override
    public Collection<Field> fields() {
        return fields.values();
    }

    public boolean hasAnyRequiredFields() {
        return fields.values().stream().anyMatch(Field::required);
    }

    public static String requestClassName(OperationGroup operationGroup) {
        return Strings.toPascalCase(operationGroup.name()) + "Request";
    }

    public static String responseClassName(OperationGroup operationGroup) {
        return Strings.toPascalCase(operationGroup.name()) + "Response";
    }
}
