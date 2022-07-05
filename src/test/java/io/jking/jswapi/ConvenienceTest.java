package io.jking.jswapi;

import io.jking.jswapi.core.SWAPI;
import io.jking.jswapi.resources.impl.People;

import java.io.IOException;
import java.util.List;

public class ConvenienceTest {

    public static void main(String[] args) throws IOException {
        SWAPI SWAPI = new SWAPI.Builder().build();
        getByFilter(SWAPI);
        getFirst(SWAPI);
    }

    private static void getByFilter(SWAPI SWAPI) throws IOException {
        final List<People> people = SWAPI.people().getByFilter(
                filter -> filter.getHairColor().equalsIgnoreCase("blond")
        );

        people.forEach(person -> System.out.println(person.getName()));
    }

    private static void getFirst(SWAPI SWAPI) throws IOException {
        SWAPI.people().getFirstBySearch("boba fett").ifPresent(System.out::println);
    }


}
