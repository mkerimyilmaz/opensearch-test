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
 * Exception thrown by API client methods when OpenSearch could not accept or
 * process a request.
 * <p>
 * The {@link #error()} contains the error's type and reason along with
 * additional details that depend on the error type and the API endpoint that
 * was called.
 */
public class OpenSearchException extends RuntimeException {

    private final ErrorResponse response;

    public OpenSearchException(ErrorResponse response) {
        super("Request failed: [" + response.error().type() + "] " + response.error().reason());
        this.response = response;
    }

    /**
     * The error response sent by OpenSearch
     */
    public ErrorResponse response() {
        return this.response;
    }

    /**
     * The cause of the error. Shortcut for {@code response().error()}.
     */
    public ErrorCause error() {
        return this.response.error();
    }

    /**
     * Status code returned by OpenSearch. Shortcut for
     * {@code response().status()}.
     */
    public int status() {
        return this.response.status();
    }
}
