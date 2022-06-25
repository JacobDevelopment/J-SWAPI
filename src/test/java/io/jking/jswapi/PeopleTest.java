package io.jking.jswapi;

import io.jking.jswapi.resources.impl.People;
import io.jking.jswapi.resources.impl.PeopleQuery;

import java.io.IOException;
import java.util.List;

public class PeopleTest {

    public static void main(String[] args) throws IOException {
        final API api = new API.Builder().build();

        byId(api);
        bySearch(api);
        getAll(api);
    }

    private static void byId(API api) throws IOException {
        final People people = api.people().getById(3);
        System.out.println(people.getName());
    }

    private static void bySearch(API api) throws IOException {
        final List<People> search = api.people().getBySearch("anakin skywalker");
        System.out.println(search.get(0).getName());
    }

    private static void getAll(API api) throws IOException {
        final List<People> all = api.people().getAll();
        all.forEach(people -> System.out.println(people.getName()));
    }
}
