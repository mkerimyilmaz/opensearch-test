package org.opensearch.client.opensearch.core;

import org.junit.Assert;
import org.junit.Test;

public class SearchTemplateRequestTest extends Assert {

    @Test
    public void toBuilder() {
        SearchTemplateRequest origin = new SearchTemplateRequest.Builder().index("index").build();
        SearchTemplateRequest copied = origin.toBuilder().build();

        assertEquals(copied.index(), origin.index());
    }
}
