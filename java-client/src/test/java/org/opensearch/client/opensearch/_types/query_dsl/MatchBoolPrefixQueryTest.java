package org.opensearch.client.opensearch._types.query_dsl;

import org.junit.Test;
import org.opensearch.client.opensearch.model.ModelTestCase;

public class MatchBoolPrefixQueryTest extends ModelTestCase {
    @Test
    public void toBuilder() {
        MatchBoolPrefixQuery origin = new MatchBoolPrefixQuery.Builder().field("field").query("query").build();
        MatchBoolPrefixQuery copied = origin.toBuilder().build();

        assertEquals(toJson(copied), toJson(origin));
    }
}
