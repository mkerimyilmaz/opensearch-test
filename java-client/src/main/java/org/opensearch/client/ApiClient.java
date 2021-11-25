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
package org.opensearch.client;

import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.transport.Transport;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapperBase;

import javax.annotation.Nullable;

public abstract class ApiClient<Self extends ApiClient<Self>> {

    protected final Transport transport;
    protected final TransportOptions transportOptions;

    protected ApiClient(Transport transport, TransportOptions transportOptions) {
        this.transport = transport;
        this.transportOptions = transportOptions;
    }

    protected <T> JsonpDeserializer<T> getDeserializer(Class<T> clazz) {
        // Try the built-in deserializers first to avoid repeated lookups in the Jsonp mapper for client-defined classes
        JsonpDeserializer<T> result = JsonpMapperBase.findDeserializer(clazz);
        if (result != null) {
            return result;
        }

        return JsonpDeserializer.of(clazz);
    }

    /**
     * Creates a new client with some request options
     */
    public abstract Self withTransportOptions(@Nullable TransportOptions transportOptions);

    public Transport _transport() {
        return this.transport;
    }

    public TransportOptions _transportOptions() {
        return this.transportOptions;
    }
}
