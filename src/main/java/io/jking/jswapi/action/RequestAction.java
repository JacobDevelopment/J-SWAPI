package io.jking.jswapi.action;

import io.jking.jswapi.internal.Resources;
import io.jking.jswapi.resources.BaseResource;
import io.jking.jswapi.resources.GeneralQuery;
import io.jking.jswapi.utility.Binder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class RequestAction<T extends BaseResource> {

    private final Resources resource;
    private final Class<T>  clazz;

    public RequestAction(Resources resource, Class<T> clazz) {
        this.resource = resource;
        this.clazz = clazz;
    }

    public T getById(final int id) throws IOException {
        final String route = resource.getRouteById(id);
        return Binder.read(route, clazz);
    }

    public List<T> getAll() throws IOException {
        final String route = resource.getAllRoute();
        final GeneralQuery<T> generalQuery = Binder.bind(route, clazz);
        if (generalQuery.getResults().isEmpty())
            return Collections.emptyList();

        if (generalQuery.getCount() > 9)
            return getAllByPages(generalQuery);

        return generalQuery.getResults();
    }

    public List<T> getBySearch(final String searchParameter) throws IOException {
        final String route = resource.getRouteBySearch(searchParameter);
        final GeneralQuery<T> generalQuery = Binder.bind(route, clazz);
        if (generalQuery.getResults().isEmpty())
            return Collections.emptyList();

        return generalQuery.getResults();
    }

    public List<T> getByFilter(final Predicate<T> filter) throws IOException {
        return getAll().stream().filter(filter).collect(Collectors.toList());
    }

    public Optional<T> getFirstBySearch(final String searchParameter) throws IOException {
        return getBySearch(searchParameter).stream().findFirst();
    }

    private List<T> getAllByPages(GeneralQuery<T> generalQuery) throws IOException {
        final List<T> allOfResources = new ArrayList<>();
        final int totalPages = (int) (Math.ceil(generalQuery.getCount() / 10.0));
        for (int i = 1; i <= totalPages; i++) {
            final String PAGE_ROUTE = resource.getPageRoute(i);
            final GeneralQuery<T> newGeneralQuery = Binder.bind(PAGE_ROUTE, clazz);
            if (newGeneralQuery.getResults().isEmpty())
                break;

            allOfResources.addAll(newGeneralQuery.getResults());
        }

        return allOfResources;
    }
}
