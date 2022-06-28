package io.jking.jswapi;

import io.jking.jswapi.core.API;

import java.io.IOException;

public class PlanetsTest {

    public static void main(String[] args) throws IOException {
        API api = new API.Builder().build();

        api.planets().getAll().forEach(System.out::println);
        api.planets().getFirstBySearch("hoth").ifPresent(System.out::println);
    }

}
