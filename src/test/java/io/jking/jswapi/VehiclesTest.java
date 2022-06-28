package io.jking.jswapi;

import io.jking.jswapi.core.API;

import java.io.IOException;

public class VehiclesTest {

    public static void main(String[] args) throws IOException {
        API api = new API.Builder().build();

        api.vehicles().getAll().forEach(System.out::println);
        api.vehicles().getFirst().ifPresent(System.out::println);
    }

}
