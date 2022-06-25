package io.jking.jswapi;

import io.jking.jswapi.action.impl.PeopleAction;
import io.jking.jswapi.core.Checks;
import io.jking.jswapi.request.Requester;
import okhttp3.OkHttpClient;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class API {

    private final OkHttpClient    client;
    private final Requester       requester;

    private API(OkHttpClient client) {
        this.client = client;
        this.requester = new Requester(client);
    }

    public OkHttpClient getClient() {
        return client;
    }

    public Requester getRequester() {
        return requester;
    }

    public PeopleAction people() {
        return new PeopleAction();
    }

    public static class Builder {
        private OkHttpClient    client;

        public Builder() {
            this.client = new OkHttpClient();
        }

        public Builder setHttpClient(OkHttpClient client) {
            Checks.notNull(client, "HTTP Client");
            this.client = client;
            return this;
        }

        public API build() {
            return new API(client);
        }
    }

}
