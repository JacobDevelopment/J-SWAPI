package io.jking.jswapi;

import io.jking.jswapi.core.SWAPI;

import java.io.IOException;

public class VehiclesTest {

    public static void main(String[] args) throws IOException {
        SWAPI SWAPI = new SWAPI.Builder().build();

        SWAPI.vehicles().getAll().forEach(System.out::println);
        SWAPI.vehicles().getFirst().ifPresent(System.out::println);
    }

}
