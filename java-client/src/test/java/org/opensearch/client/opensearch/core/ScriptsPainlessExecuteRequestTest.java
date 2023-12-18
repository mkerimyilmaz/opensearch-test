package org.opensearch.client.opensearch.core;

import org.junit.Test;
import org.opensearch.client.opensearch.model.ModelTestCase;

public class ScriptsPainlessExecuteRequestTest extends ModelTestCase {

    @Test
    public void toBuilder() {
        ScriptsPainlessExecuteRequest origin = new ScriptsPainlessExecuteRequest.Builder().build();
        ScriptsPainlessExecuteRequest copied = origin.toBuilder().build();

        assertEquals(toJson(copied), toJson(origin));
    }
}
