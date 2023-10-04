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

package org.opensearch.client.opensearch._types;

/**
 * Builders for {@link GeoBounds} variants.
 */
public class GeoBoundsBuilders {
    private GeoBoundsBuilders() {}

    /**
     * Creates a builder for the {@link CoordsGeoBounds coords} {@code GeoBounds}
     * variant.
     */
    public static CoordsGeoBounds.Builder coords() {
        return new CoordsGeoBounds.Builder();
    }

    /**
     * Creates a builder for the {@link TopLeftBottomRightGeoBounds tlbr}
     * {@code GeoBounds} variant.
     */
    public static TopLeftBottomRightGeoBounds.Builder tlbr() {
        return new TopLeftBottomRightGeoBounds.Builder();
    }

    /**
     * Creates a builder for the {@link TopRightBottomLeftGeoBounds trbl}
     * {@code GeoBounds} variant.
     */
    public static TopRightBottomLeftGeoBounds.Builder trbl() {
        return new TopRightBottomLeftGeoBounds.Builder();
    }

    /**
     * Creates a builder for the {@link WktGeoBounds wkt} {@code GeoBounds} variant.
     */
    public static WktGeoBounds.Builder wkt() {
        return new WktGeoBounds.Builder();
    }

}
