package org.opensearch.client.opensearch._types.query_dsl;

import org.junit.Test;
import org.opensearch.client.opensearch.model.ModelTestCase;

public class RankFeatureFunctionSaturationTest extends ModelTestCase {
    @Test
    public void toBuilder() {
        RankFeatureFunctionSaturation origin = new RankFeatureFunctionSaturation.Builder().pivot(1.0f).build();
        RankFeatureFunctionSaturation copied = origin.toBuilder().build();

        assertEquals(toJson(copied), toJson(origin));
    }
}
