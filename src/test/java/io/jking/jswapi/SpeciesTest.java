package io.jking.jswapi;

import io.jking.jswapi.core.API;
import io.jking.jswapi.resources.impl.Films;
import io.jking.jswapi.resources.impl.Species;

import java.io.IOException;
import java.util.List;

public class SpeciesTest {

    public static void main(String[] args) throws IOException {
        final API api = new API.Builder().build();

        byId(api);
        bySearch(api);
        getAll(api);
    }

    private static void byId(API api) throws IOException {
        System.out.println("By ID:");
        final Species species = api.species().getById(1);
        System.out.println(species.getName());
        System.out.println();
    }

    private static void bySearch(API api) throws IOException {
        System.out.println("By Search: ");
        final List<Species> species = api.species().getBySearch("Rodian");
        for (Species iteration : species) {
            System.out.println(iteration);
        }
        System.out.println();
    }

    private static void getAll(API api) throws IOException {
        System.out.println("By All: ");
        final List<Species> all = api.species().getAll();
        all.forEach(System.out::println);
        System.out.println();
    }

}
