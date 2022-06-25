package io.jking.jswapi;

import io.jking.jswapi.core.API;
import io.jking.jswapi.resources.impl.Films;
import io.jking.jswapi.resources.impl.People;

import java.io.IOException;
import java.util.List;

public class FilmsTest {

    public static void main(String[] args) throws IOException {
        final API api = new API.Builder().build();

        byId(api);
        bySearch(api);
        getAll(api);
    }

    private static void byId(API api) throws IOException {
        System.out.println("By ID:");
        final Films film = api.films().getById(1);
        System.out.println(film.getTitle());
        System.out.println();
    }

    private static void bySearch(API api) throws IOException {
        System.out.println("By Search: ");
        final List<Films> film = api.films().getBySearch("hope"); // boooooooo
        System.out.println(film.get(0).getTitle());
        System.out.println();
    }

    private static void getAll(API api) throws IOException {
        System.out.println("By All: ");
        final List<Films> all = api.films().getAll();
        all.forEach(film -> System.out.println(film.getTitle()));
        System.out.println();
    }
}
