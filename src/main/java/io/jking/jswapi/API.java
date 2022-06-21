package io.jking.jswapi;

import io.jking.jswapi.action.impl.PeopleAction;
import io.jking.jswapi.core.Checks;
import io.jking.jswapi.request.Requester;
import okhttp3.OkHttpClient;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class API {

    private final OkHttpClient    client;
    private final ExecutorService executor;
    private final Requester       requester;

    private API(OkHttpClient client, ExecutorService executor) {
        this.client = client;
        this.executor = executor;
        this.requester = new Requester(client);
    }

    public OkHttpClient getClient() {
        return client;
    }

    public ExecutorService getExecutor() {
        return executor;
    }

    public Requester getRequester() {
        return requester;
    }

    public PeopleAction people() {
        return new PeopleAction();
    }

    public static class Builder {
        private OkHttpClient    client;
        private ExecutorService executor;

        public Builder() {
            this.client = new OkHttpClient();
            this.executor = Executors.newCachedThreadPool();
        }

        public Builder setHttpClient(OkHttpClient client) {
            Checks.notNull(client, "HTTP Client");
            this.client = client;
            return this;
        }

        public Builder setExecutor(ExecutorService executor) {
            Checks.notNull(executor, "ExecutorService");
            this.executor = executor;
            return this;
        }

        public API build() {
            return new API(client, executor);
        }
    }

}
