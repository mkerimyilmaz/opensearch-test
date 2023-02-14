package org.opensearch.client.codegen;

import org.openapi4j.core.exception.DecodeException;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.model.OAIContext;
import org.openapi4j.core.model.reference.Reference;
import org.openapi4j.core.model.v3.OAI3SchemaKeywords;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.OpenApi3Parser;
import org.openapi4j.parser.model.AbsRefOpenApiSchema;
import org.openapi4j.parser.model.v3.*;
import org.opensearch.client.codegen.exceptions.ApiSpecificationParseException;
import org.opensearch.client.codegen.model.Field;
import org.opensearch.client.codegen.model.ObjectShape;
import org.opensearch.client.codegen.model.OperationRequest;

import java.io.File;
import java.util.*;
import java.util.stream.Stream;

public class ApiSpecification {
    private final OpenApi3 api;
    private final OAIContext context;
    private final Set<String> visitedReferencedSchemas;
    private final List<OperationRequest> operationRequests;
    private final List<ObjectShape> objectShapes;
    private final TypeMapper typeMapper;

    private ApiSpecification(OpenApi3 api) throws ApiSpecificationParseException {
        this.api = api;
        context = api.getContext();
        visitedReferencedSchemas = new HashSet<>();
        operationRequests = new ArrayList<>();
        objectShapes = new ArrayList<>();
        typeMapper = new TypeMapper(this.api, this::visitReferencedSchema);
        visit(this.api);
    }

    public static ApiSpecification parse(File schemaFile) throws ApiSpecificationParseException {
        try {
            OpenApi3 api = new OpenApi3Parser().parse(schemaFile, true);
            return new ApiSpecification(api);
        } catch (ResolutionException | ValidationException e) {
            throw new ApiSpecificationParseException("Failed to parse schema: " + schemaFile, e);
        }
    }

    public List<OperationRequest> getOperationRequests() {
        return Collections.unmodifiableList(operationRequests);
    }

    public List<ObjectShape> getObjectShapes() { return Collections.unmodifiableList(objectShapes); }

    private void visit(OpenApi3 api) throws ApiSpecificationParseException {
        for (Map.Entry<String, Path> entry : api.getPaths().entrySet()) {
            String httpPath = entry.getKey();
            Path path = entry.getValue();

            visit(httpPath, path);
        }
    }

    private void visit(String httpPath, Path path) throws ApiSpecificationParseException {
        for (Map.Entry<String, Operation> entry : path.getOperations().entrySet()) {
            String httpMethod = entry.getKey();
            Operation operation = entry.getValue();
            visit(httpPath, path, httpMethod, operation);
        }
    }

    private void visit(String httpPath, Path path, String httpMethod, Operation operation) throws ApiSpecificationParseException {
        OperationRequest operationRequest = new OperationRequest();
        operationRequest.operationId = operation.getOperationId();
        operationRequest.description = operation.getDescription();
        operationRequest.httpMethod = httpMethod;
        operationRequest.httpPath = httpPath;

        RequestBody requestBody = resolve(operation.getRequestBody());

        if (requestBody != null) {
            resolve(requestBody.getContentMediaType("application/json").getSchema())
                    .getProperties()
                    .forEach((name, schema) -> operationRequest.addBodyField(new Field(name, typeMapper.mapType(schema))));
        }

        Stream.of(path.getParametersIn(context, "query"), operation.getParametersIn(context, "query"))
                .flatMap(List::stream)
                .map(p -> new Field(p.getName(), typeMapper.mapType(p.getSchema())))
                .forEach(operationRequest::addQueryParam);

        operationRequests.add(operationRequest);
    }

    private void visitReferencedSchema(String ref, Schema schema) {
        if (!visitedReferencedSchemas.add(ref)) return;

        String[] refParts = ref.split("/");
        String name = refParts[refParts.length - 1];

        if (OAI3SchemaKeywords.TYPE_OBJECT.equals(schema.getType())) {
            ObjectShape shape = new ObjectShape();

            shape.name = name;

            for (Map.Entry<String, Schema> entry : schema.getProperties().entrySet()) {
                shape.addField(new Field(entry.getKey(), typeMapper.mapType(entry.getValue())));
            }

            objectShapes.add(shape);
        }
    }

    private RequestBody resolve(RequestBody body) throws ApiSpecificationParseException {
        return resolve(body, RequestBody.class);
    }

    private Schema resolve(Schema schema) throws ApiSpecificationParseException {
        return resolve(schema, Schema.class);
    }

    private <S extends AbsRefOpenApiSchema<S>> S resolve(S schema, Class<S> clazz) throws ApiSpecificationParseException {
        while (schema != null && schema.isRef()) {
            Reference ref = schema.getReference(context);
            try {
                schema = ref.getMappedContent(clazz);
            } catch (DecodeException e) {
                throw new ApiSpecificationParseException("Failed to decode reference as " + clazz + ": " + ref, e);
            }
        }
        return schema;
    }
}
