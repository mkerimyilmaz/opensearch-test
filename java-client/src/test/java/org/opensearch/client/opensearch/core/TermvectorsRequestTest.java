package org.opensearch.client.opensearch.core;

import org.junit.Assert;
import org.junit.Test;

public class TermvectorsRequestTest extends Assert {

    @Test
    public void toBuilder() {
        TermvectorsRequest<MyDoc> origin = new TermvectorsRequest.Builder<MyDoc>().index("index").build();
        TermvectorsRequest<MyDoc> copied = origin.toBuilder().build();

        assertEquals(copied.index(), origin.index());
    }

    static class MyDoc {}
}
