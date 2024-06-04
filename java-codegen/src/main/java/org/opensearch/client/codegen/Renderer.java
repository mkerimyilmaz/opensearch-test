/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.codegen;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.MustacheException;
import com.samskivert.mustache.Template;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.commons.text.StringEscapeUtils;
import org.opensearch.client.codegen.exceptions.JavaFormatterException;
import org.opensearch.client.codegen.exceptions.RenderException;
import org.opensearch.client.codegen.model.Shape;
import org.opensearch.client.codegen.model.Type;
import org.opensearch.client.codegen.model.Types;
import org.opensearch.client.codegen.utils.Strings;

public class Renderer {
    private static final Mustache.Compiler BASE_COMPILER = Mustache.compiler().escapeHTML(false).withLoader(name -> {
        var stream = Renderer.class.getResourceAsStream("templates/" + name + ".mustache");
        if (stream == null) {
            throw new MissingResourceException("Unable to find template", Renderer.class.getName(), name);
        }
        return new InputStreamReader(stream);
    });

    public static Mustache.Lambda transformer(Function<String, String> transform) {
        return ((frag, out) -> out.write(transform.apply(frag.execute())));
    }

    private static final Map<String, Object> GlobalContext = new HashMap<>() {
        {
            put("quoted", transformer(s -> '\"' + StringEscapeUtils.escapeJava(s) + '\"'));
            put("camelCase", transformer(Strings::toCamelCase));
            put("pascalCase", transformer(Strings::toPascalCase));
            put("toLower", transformer(String::toLowerCase));
            put("ERROR", (Mustache.Lambda) (frag, out) -> { throw new RuntimeException(frag.execute()); });
            put("TYPES", Types.asMap());
        }
    };

    private final Mustache.Compiler compiler;
    private final Context context;
    private final JavaFormatter javaFormatter;

    public Renderer(Consumer<Type> typeReferenceTracker, JavaFormatter javaFormatter) {
        compiler = BASE_COMPILER.withFormatter(new ValueFormatter(typeReferenceTracker));
        this.context = new Context(this);
        this.javaFormatter = javaFormatter;
    }

    public void render(String templateName, Object context, Writer out) throws RenderException {
        try {
            compiler.loadTemplate(templateName).execute(context, this.context, out);
        } catch (MustacheException e) {
            throw new RenderException("Failed to render: " + context, e);
        }
    }

    public String render(String templateName, Object context) throws RenderException {
        StringWriter writer = new StringWriter();
        render(templateName, context, writer);
        return writer.toString();
    }

    public void renderJava(Shape shape, File outputFile) throws RenderException {
        var classBody = render(shape.getClass().getSimpleName(), shape);
        var classHeader = render("Partials/ClassHeader", shape);

        try (Writer fileWriter = new FileWriter(outputFile)) {
            fileWriter.write(classHeader);
            fileWriter.write("\n\n");
            fileWriter.write(classBody);
        } catch (IOException e) {
            throw new RenderException("Unable to write rendered output to: " + outputFile, e);
        }

        try {
            javaFormatter.format(outputFile);
        } catch (JavaFormatterException e) {
            throw new RenderException("Unable to format rendered output: " + outputFile, e);
        }
    }

    public static Mustache.Lambda templateLambda(String templateName, Function<Template.Fragment, Object> contextGetter) {
        return (frag, out) -> {
            try {
                findContext(frag, Context.class).orElseThrow().getRenderer().render(templateName, contextGetter.apply(frag), out);
            } catch (RenderException e) {
                throw new RuntimeException(e);
            }
        };
    }

    @SuppressWarnings("unchecked")
    public static <T> Optional<T> findContext(Template.Fragment fragment, Class<T> clazz) {
        var i = 0;
        while (true) {
            Object ctx = null;

            try {
                ctx = fragment.context(i++);
            } catch (NullPointerException ignored) {}

            if (ctx == null) return Optional.empty();

            if (clazz.isAssignableFrom(ctx.getClass())) {
                return Optional.of((T) ctx);
            }
        }
    }

    private static class Context implements Mustache.CustomContext {
        private final Renderer renderer;

        public Context(Renderer renderer) {
            this.renderer = renderer;
        }

        @Override
        public Object get(String name) throws Exception {
            if (GlobalContext.containsKey(name)) {
                return GlobalContext.get(name);
            }

            return null;
        }

        public Renderer getRenderer() {
            return renderer;
        }
    }

    private static class ValueFormatter implements Mustache.Formatter {
        private final Consumer<Type> typeReferenceTracker;

        public ValueFormatter(Consumer<Type> typeReferenceTracker) {
            this.typeReferenceTracker = typeReferenceTracker;
        }

        @Override
        public CharSequence format(Object o) {
            if (o instanceof Type) {
                typeReferenceTracker.accept((Type) o);
            }
            return String.valueOf(o);
        }
    }
}
