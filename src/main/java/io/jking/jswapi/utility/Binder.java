package io.jking.jswapi.utility;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jking.jswapi.resources.BaseResource;
import io.jking.jswapi.resources.GeneralQuery;

import java.io.IOException;
import java.net.URL;

public final class Binder {

    private Binder() throws IllegalAccessException {
        throw new IllegalAccessException("Cannot instantiate private classes.");
    }

    public static <T extends BaseResource> GeneralQuery<T> bind(String route, Class<T> clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructParametricType(GeneralQuery.class, clazz);
        return mapper.readValue(new URL(route), type);
    }

    public static <T extends BaseResource> T read(String route, Class<T> clazz) throws IOException {
        return new ObjectMapper().readValue(new URL(route), clazz);
    }
}
