package io.jking.jswapi;

import io.jking.jswapi.request.Requester;
import okhttp3.OkHttpClient;

import java.io.IOException;

public class URLTest {

    public static void main(String[] args) throws IOException {
        final Requester requester = new Requester(new OkHttpClient());
        final String response = requester.getUrlResponse("https://swapi.dev/api/species/?page=5&format=json");
        System.out.println(response);
    }

}
