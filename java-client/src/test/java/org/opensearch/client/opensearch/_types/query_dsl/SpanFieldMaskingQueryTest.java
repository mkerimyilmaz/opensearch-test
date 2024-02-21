package org.opensearch.client.opensearch._types.query_dsl;

import java.util.Collections;
import org.junit.Test;
import org.opensearch.client.opensearch.model.ModelTestCase;

public class SpanFieldMaskingQueryTest extends ModelTestCase {
    @Test
    public void toBuilder() {
        SpanFieldMaskingQuery origin = new SpanFieldMaskingQuery.Builder().field("field")
            .query(new SpanQuery.Builder().spanOr(new SpanOrQuery.Builder().clauses(Collections.emptyList()).build()).build())
            .build();
        SpanFieldMaskingQuery copied = origin.toBuilder().build();

        assertEquals(toJson(copied), toJson(origin));
    }
}
