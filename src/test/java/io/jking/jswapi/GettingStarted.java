package io.jking.jswapi;

import io.jking.jswapi.core.SWAPI;
import io.jking.jswapi.resources.impl.Films;
import io.jking.jswapi.resources.impl.Starships;

import java.io.IOException;
import java.util.List;

public class GettingStarted {
    public static void main(String[] args) throws IOException {
        SWAPI swapi = new SWAPI.Builder().build();

        swapi.films().getFirstBySearch("hope").ifPresent(System.out::println);
    }
}
