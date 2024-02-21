package org.opensearch.client.opensearch._types.query_dsl;

import java.util.Collections;
import org.junit.Test;
import org.opensearch.client.opensearch.model.ModelTestCase;

public class SpanNearQueryTest extends ModelTestCase {
    @Test
    public void toBuilder() {
        SpanNearQuery origin = new SpanNearQuery.Builder().clauses(
            Collections.singletonList(
                new SpanQuery.Builder().spanOr(new SpanOrQuery.Builder().clauses(Collections.emptyList()).build()).build()
            )
        ).build();
        SpanNearQuery copied = origin.toBuilder().build();

        assertEquals(toJson(copied), toJson(origin));
    }
}
