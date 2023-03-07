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

public class OpenSearchExceptionFactory {

    private OpenSearchExceptionFactory() {
        //should be empty
    }

    public static <ErrorT> OpenSearchException createException(ErrorT error) {
        if (error instanceof ErrorResponse) {
            return new OpenSearchException((ErrorResponse) error);
        } else if (error instanceof ErrorStringResponse) {
            ErrorStringResponse errorStringResponse = (ErrorStringResponse) error;
            return new OpenSearchException(getErrorResponse(errorStringResponse.status(), "string_error", errorStringResponse.error()));
        } else {
            throw new OpenSearchException(getErrorResponse(500, "error_type", "Unknown error type: " + error.getClass()));
        }
    }

    private static ErrorResponse getErrorResponse(int status, String type, String reason) {
        return ErrorResponse.of(
                builder -> builder.status(status).error(
                        builder1 -> builder1.type(type).reason(reason)
                )
        );
    }
}
