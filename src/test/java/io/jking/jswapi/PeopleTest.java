package io.jking.jswapi;

import io.jking.jswapi.core.SWAPI;
import io.jking.jswapi.resources.impl.People;
import okhttp3.OkHttpClient;

import java.io.IOException;
import java.util.List;

public class PeopleTest {

    public static void main(String[] args) throws IOException {
        final SWAPI SWAPI = new SWAPI.Builder().build();

        byId(SWAPI);
        bySearch(SWAPI);
        getAll(SWAPI);

        SWAPI swapi = new SWAPI.Builder()
                .setHttpClient(new OkHttpClient())
                .build();
    }

    private static void byId(SWAPI SWAPI) throws IOException {
        final People people = SWAPI.people().getById(3);
        System.out.println(people.getName());
    }

    private static void bySearch(SWAPI SWAPI) throws IOException {
        final List<People> search = SWAPI.people().getBySearch("anakin skywalker");
        System.out.println(search.get(0).getName());
    }

    private static void getAll(SWAPI SWAPI) throws IOException {
        final List<People> all = SWAPI.people().getAll();
        all.forEach(people -> System.out.println(people.getName()));
    }
}
