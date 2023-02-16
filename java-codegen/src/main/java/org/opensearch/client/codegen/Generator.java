/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.codegen;

import org.opensearch.client.codegen.exceptions.ApiSpecificationParseException;
import org.opensearch.client.codegen.exceptions.RenderException;
import org.opensearch.client.codegen.model.Client;
import org.opensearch.client.codegen.model.EnumShape;
import org.opensearch.client.codegen.model.ObjectShape;
import org.opensearch.client.codegen.model.RequestShape;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Stream;

public class Generator {
    private final ApiSpecification apiSpecification;
    private final Renderer renderer;
    private final File outputDir;
    private final File packageDir;

    public Generator(File schemaFile, File outputDir) throws ApiSpecificationParseException {
        apiSpecification = ApiSpecification.parse(schemaFile);
        renderer = new Renderer();
        this.outputDir = outputDir;
        packageDir = new File(outputDir, "org/opensearch/client/opensearch/");
    }

    public void generate() throws RenderException {
        try (Stream<Path> walker = Files.walk(outputDir.toPath())) {
            walker.sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(File::delete);
        } catch (IOException e) {
            throw new RenderException("Unable to cleanup output directory: " + outputDir, e);
        }

        packageDir.mkdirs();

        Client client = new Client("");

        for (RequestShape requestShape : apiSpecification.getRequestShapes()) {
            File file = new File(packageDir, requestShape.className() + ".java");
            renderer.render(requestShape, file);

            client.addOperation(requestShape.id());
        }

        for (ObjectShape objectShape : apiSpecification.getObjectShapes()) {
            File file = new File(packageDir, objectShape.className() + ".java");
            renderer.render(objectShape, file);
        }

        for (EnumShape enumShape : apiSpecification.getEnumShapes()) {
            File file = new File(packageDir, enumShape.className() + ".java");
            renderer.render(enumShape, file);
        }

        File clientFile = new File(packageDir, client.className() + ".java");
        renderer.render(client, clientFile);

        client.async(true);

        File asyncClientFile = new File(packageDir, client.className() + ".java");
        renderer.render(client, asyncClientFile);
    }
}
