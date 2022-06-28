package io.jking.jswapi.core;

import io.jking.jswapi.action.impl.FilmsAction;
import io.jking.jswapi.action.impl.PeopleAction;
import io.jking.jswapi.action.impl.SpeciesAction;
import io.jking.jswapi.utility.Checks;
import io.jking.jswapi.request.Requester;
import okhttp3.OkHttpClient;

public class API {

    private final OkHttpClient client;
    private final Requester    requester;

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

    public FilmsAction films() {
        return new FilmsAction();
    }

    public SpeciesAction species() {
        return new SpeciesAction();
    }

    public static class Builder {
        private OkHttpClient client;

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
