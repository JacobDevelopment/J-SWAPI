package io.jking.jswapi;

import io.jking.jswapi.core.SWAPI;

import java.io.IOException;

public class PlanetsTest {

    public static void main(String[] args) throws IOException {
        SWAPI SWAPI = new SWAPI.Builder().build();

        SWAPI.planets().getAll().forEach(System.out::println);
        SWAPI.planets().getFirstBySearch("hoth").ifPresent(System.out::println);
    }

}
