package org.opensearch.client.opensearch.integTest.restclient;

import java.io.IOException;
import org.apache.hc.core5.http.HttpHost;
import org.opensearch.client.json.jackson.JacksonJsonpMapper;
import org.opensearch.client.opensearch.integTest.AbstractTasksIT;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.rest_client.RestClientTransport;
import org.opensearch.common.settings.Settings;

public class TasksIT extends AbstractTasksIT {
    @Override
    public OpenSearchTransport buildTransport(Settings settings, HttpHost[] hosts) throws IOException {
        return new RestClientTransport(buildClient(settings, hosts), new JacksonJsonpMapper());
    }
}
