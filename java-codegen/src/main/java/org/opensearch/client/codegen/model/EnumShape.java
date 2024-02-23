/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.codegen.model;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.opensearch.client.codegen.utils.Strings;

public class EnumShape extends Shape {
    private final List<Variant> variants;

    public EnumShape(Namespace parent, String className, List<Variant> variants) {
        super(parent, className);
        this.variants = variants;
    }

    public Collection<Variant> getVariants() {
        return Collections.unmodifiableCollection(variants);
    }

    public static class Variant {
        private final String wireName;

        public Variant(String wireName) {
            this.wireName = wireName;
        }

        public String getWireName() {
            return wireName;
        }

        public String getName() {
            return Strings.toPascalCase(wireName);
        }
    }
}
