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

package org.opensearch.client.opensearch.experiments;

import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonParsingException;
import org.junit.Assert;
import org.junit.Test;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.jsonb.JsonbJsonpMapper;
import org.opensearch.client.opensearch._types.Time;
import org.opensearch.client.opensearch.experiments.api.FooRequest;
import org.opensearch.client.opensearch.indices.IndexSettings;
import org.opensearch.client.opensearch.indices.IndexSettingsMapping;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class ParsingTests extends Assert {

  @Test
  public void testFoo() throws Exception {

    try {

      FooRequest foo = FooRequest.builder()
              .name("z")
              .value(1)
              .indices("a", "b", "c")
              .bar(b -> b
                      .name("Raise the bar")
              )
              .build();

      String str = serialize(foo);
      assertEquals("{\"name\":\"z\",\"value\":1,\"indices\":[\"a\",\"b\",\"c\"],\"bar\":{\"name\":\"Raise the bar\"}}", str);

      FooRequest foo2 = deserialize(str, FooRequest.parser());
      assertEquals(foo.name(), foo2.name());
      assertEquals(foo.value(), foo2.value());
      assertNull(foo2.size());
      assertEquals(foo.indices(), foo2.indices());
      assertEquals("Raise the bar", foo.bar().name());
    } catch (JsonParsingException je) {
      throw new JsonParsingException(je.getMessage() + " at " + je.getLocation(), je, je.getLocation());
    }
  }

  @Test
  public void testIndexSettingsSyncIntervalTimeParsing() {

    try {

      var indexSettings = IndexSettings.of(_1 -> _1.translogSyncInterval(Time.of(_2 -> _2.time("10s"))));

      var str = serialize(indexSettings);
      assertEquals("{\"translog.sync_interval\":\"10s\"}", str);

      IndexSettings deserialized = deserialize(str, IndexSettings._DESERIALIZER);
      assertEquals(indexSettings.translogSyncInterval().time(), deserialized.translogSyncInterval().time());

      var responseStr = "{\"translog\":{\"sync_interval\":\"10s\"}}";
      IndexSettings responseDeserialized = deserialize(responseStr, IndexSettings._DESERIALIZER);
      assertEquals(indexSettings.translogSyncInterval().time(), responseDeserialized.translog().syncInterval().time());

    } catch (JsonParsingException je) {
      throw new JsonParsingException(je.getMessage() + " at " + je.getLocation(), je, je.getLocation());
    }
  }

  @Test
  public void testIndexSettingsMappingParsing() {

    try {

      var mapping = IndexSettingsMapping.of(b -> b
              .totalFields(d -> d.limit(1L))
              .depth(d -> d.limit(2L))
              .nestedFields(d -> d.limit(3L))
              .nestedObjects(d -> d.limit(4L))
              .fieldNameLength(d -> d.limit(5L)));

      var str = serialize(mapping);
      assertEquals("{\"total_fields\":{\"limit\":1},\"depth\":{\"limit\":2},\"nested_fields\":{\"limit\":3}," +
                   "\"nested_objects\":{\"limit\":4},\"field_name_length\":{\"limit\":5}}", str);

      var deserialized = deserialize(str, IndexSettingsMapping._DESERIALIZER);
      assertEquals(mapping.totalFields().limit(), deserialized.totalFields().limit());
      assertEquals(mapping.depth().limit(), deserialized.depth().limit());
      assertEquals(mapping.nestedFields().limit(), deserialized.nestedFields().limit());
      assertEquals(mapping.nestedObjects().limit(), deserialized.nestedObjects().limit());
      assertEquals(mapping.fieldNameLength().limit(), deserialized.fieldNameLength().limit());
    } catch (JsonParsingException je) {
      throw new JsonParsingException(je.getMessage() + " at " + je.getLocation(), je, je.getLocation());
    }
  }

  private <T extends JsonpSerializable> T deserialize(String serializedValue, JsonpDeserializer<T> deserializer) {
    var provider = JsonProvider.provider();
    var parser = provider.createParser(new ByteArrayInputStream(serializedValue.getBytes(StandardCharsets.UTF_8)));

    return deserializer.deserialize(parser, new JsonbJsonpMapper());
  }

  private String serialize(JsonpSerializable object) {
    var baos = new ByteArrayOutputStream();
    var provider = JsonProvider.provider();

    var generator = provider.createGenerator(baos);
    object.serialize(generator, new JsonbJsonpMapper());
    generator.close();

    return baos.toString();
  }
}
