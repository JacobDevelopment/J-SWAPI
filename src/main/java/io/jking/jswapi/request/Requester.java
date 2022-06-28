package io.jking.jswapi.request;

import okhttp3.*;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class Requester {

    private final OkHttpClient client;

    public Requester(OkHttpClient client) {
        this.client = client;
    }

    @Nullable
    public String getUrlResponse(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            int code = response.code();
            if (code == 404)
                return null;

            ResponseBody responseBody = response.body();
            if (responseBody == null)
                return null;

            return responseBody.string();
        }
    }


}
