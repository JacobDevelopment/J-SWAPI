package io.jking.jswapi;

import io.jking.jswapi.core.SWAPI;

import java.io.IOException;

public class StarshipsTest {

    public static void main(String[] args) throws IOException {
        SWAPI SWAPI = new SWAPI.Builder().build();

        SWAPI.starships().getAll().forEach(System.out::println);

        var corvette = SWAPI.starships().getById(2);
        System.out.println(corvette.getCargoCapacity());
    }

}
