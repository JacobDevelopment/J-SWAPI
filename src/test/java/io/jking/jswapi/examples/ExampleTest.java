package io.jking.jswapi.examples;

import io.jking.jswapi.core.SWAPI;
import io.jking.jswapi.resources.impl.People;
import io.jking.jswapi.resources.impl.Species;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class ExampleTest {

    @Test
    public void getAllPeopleTest() throws IOException {
        SWAPI.people().getAll().forEach(System.out::println);
    }

    @Test
    public void getAllFilmsTest() throws IOException {
        SWAPI.films().getAll().forEach(System.out::println);
    }

    @Test
    public void getAllPlanetsTest() throws IOException {
        SWAPI.planets().getAll().forEach(System.out::println);
    }

    @Test
    public void getAllSpeciesTest() throws IOException {
        SWAPI.species().getAll().forEach(System.out::println);
    }

    @Test
    public void getStarshipsTest() throws IOException {
        SWAPI.starships().getAll().forEach(System.out::println);
    }

    @Test
    public void getAllVehiclesTest() throws IOException {
        SWAPI.vehicles().getAll().forEach(System.out::println);
    }

    @Test
    public void getPersonByIdTest() throws IOException {
        var person = SWAPI.people().getById(3);
        System.out.println(person);
    }

    @Test
    public void getSpeciesByFilterTest() throws IOException {
        var species = SWAPI.species().getByFilter(filter -> !filter.getAverageHeight().equalsIgnoreCase("N/A"));
        for (Species iteration : species) {
            System.out.println(iteration);
        }
    }

    @Test
    public void getPersonBySearchTest() throws IOException {
        var person = SWAPI.people().getBySearch("anakin");
        System.out.println(person);
    }

    @Test
    public void getFirstPersonBySearchTest() throws IOException {
        SWAPI.people().getFirstBySearch("anakin").ifPresent(System.out::println);
    }

}
