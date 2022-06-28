package io.jking.jswapi;

import io.jking.jswapi.core.API;

import java.io.IOException;

public class StarshipsTest {

    public static void main(String[] args) throws IOException {
        API api = new API.Builder().build();

        api.starships().getAll().forEach(System.out::println);

        var corvette = api.starships().getById(2);
        System.out.println(corvette.getCargoCapacity());
    }

}
