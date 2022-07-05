package io.jking.jswapi;

import io.jking.jswapi.core.SWAPI;
import io.jking.jswapi.resources.impl.Species;

import java.io.IOException;
import java.util.List;

public class SpeciesTest {

    public static void main(String[] args) throws IOException {
        final SWAPI SWAPI = new SWAPI.Builder().build();

        byId(SWAPI);
        bySearch(SWAPI);
        getAll(SWAPI);
    }

    private static void byId(SWAPI SWAPI) throws IOException {
        System.out.println("By ID:");
        final Species species = SWAPI.species().getById(1);
        System.out.println(species.getName());
        System.out.println();
    }

    private static void bySearch(SWAPI SWAPI) throws IOException {
        System.out.println("By Search: ");
        final List<Species> species = SWAPI.species().getBySearch("Rodian");
        for (Species iteration : species) {
            System.out.println(iteration);
        }
        System.out.println();
    }

    private static void getAll(SWAPI SWAPI) throws IOException {
        System.out.println("By All: ");
        final List<Species> all = SWAPI.species().getAll();
        all.forEach(System.out::println);
        System.out.println();
    }

}
