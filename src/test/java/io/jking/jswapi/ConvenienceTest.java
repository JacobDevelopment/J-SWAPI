package io.jking.jswapi;

import io.jking.jswapi.core.API;
import io.jking.jswapi.resources.impl.People;

import java.io.IOException;
import java.util.List;

public class ConvenienceTest {

    public static void main(String[] args) throws IOException {
        API api = new API.Builder().build();
        getByFilter(api);
        getFirst(api);
    }

    private static void getByFilter(API api) throws IOException {
        final List<People> people = api.people().getByFilter(
                filter -> filter.getHairColor().equalsIgnoreCase("blond")
        );

        people.forEach(person -> System.out.println(person.getName()));
    }

    private static void getFirst(API api) throws IOException {
        api.people().getFirst("boba fett").ifPresent(System.out::println);
    }


}
