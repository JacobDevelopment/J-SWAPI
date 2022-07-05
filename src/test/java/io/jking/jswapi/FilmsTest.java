package io.jking.jswapi;

import io.jking.jswapi.core.SWAPI;
import io.jking.jswapi.resources.impl.Films;

import java.io.IOException;
import java.util.List;

public class FilmsTest {

    public static void main(String[] args) throws IOException {
        final SWAPI SWAPI = new SWAPI.Builder().build();

        byId(SWAPI);
        bySearch(SWAPI);
        getAll(SWAPI);
    }

    private static void byId(SWAPI SWAPI) throws IOException {
        System.out.println("By ID:");
        final Films film = SWAPI.films().getById(1);
        System.out.println(film.getTitle());
        System.out.println();
    }

    private static void bySearch(SWAPI SWAPI) throws IOException {
        System.out.println("By Search: ");
        final List<Films> film = SWAPI.films().getBySearch("hope"); // boooooooo
        System.out.println(film.get(0).getTitle());
        System.out.println();
    }

    private static void getAll(SWAPI SWAPI) throws IOException {
        System.out.println("By All: ");
        final List<Films> all = SWAPI.films().getAll();
        all.forEach(film -> System.out.println(film.getTitle()));
        System.out.println();
    }
}
