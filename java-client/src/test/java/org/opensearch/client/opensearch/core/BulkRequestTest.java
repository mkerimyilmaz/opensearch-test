package org.opensearch.client.opensearch.core;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.opensearch.client.opensearch.core.bulk.BulkOperation;
import org.opensearch.client.opensearch.core.bulk.DeleteOperation;

public class BulkRequestTest extends Assert {

    @Test
    public void toBuilder() {
        BulkRequest origin = new BulkRequest.Builder().index("index")
            .operations(List.of(new BulkOperation.Builder().delete(new DeleteOperation.Builder().id("id").build()).build()))
            .build();
        BulkRequest copied = origin.toBuilder().build();

        assertEquals(copied.index(), origin.index());
    }
}
