package io.jking.jswapi.action;

import static io.jking.jswapi.utility.Binder.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jking.jswapi.resources.BaseResource;
import io.jking.jswapi.resources.GeneralQuery;
import io.jking.jswapi.utility.Binder;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public interface RequestAction<T extends BaseResource> {

    T getById(final int id) throws IOException;

    List<T> getAll() throws IOException;

    List<T> getBySearch(final String searchQuery) throws IOException;

    default GeneralQuery<T> getGeneralQuery(final String route, Class<T> clazz) throws IOException {
        return Binder.bind(route, clazz);
    }

    default List<T> getByFilter(final Predicate<T> filter) throws IOException {
        return getAll()
                .stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

    default Optional<T> getFirstBySearch(final String searchQuery) throws IOException {
        return getBySearch(searchQuery)
                .stream()
                .findFirst();
    }

}
