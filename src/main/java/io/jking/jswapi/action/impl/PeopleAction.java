package io.jking.jswapi.action.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jking.jswapi.action.RequestAction;
import io.jking.jswapi.internal.Resources;
import io.jking.jswapi.resources.impl.People;
import io.jking.jswapi.resources.GeneralQuery;
import io.jking.jswapi.utility.Binder;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleAction implements RequestAction<People> {
    @Override
    public People getById(int id) throws IOException {
        final String ROUTE = Resources.PEOPLE.getRouteById(id);
        return Binder.read(ROUTE, People.class);
    }

    // Needs Optimization
    @Override
    public List<People> getAll() throws IOException {
        final String ROUTE = Resources.PEOPLE.getAllRoute();
        final GeneralQuery<People> generalQuery = getGeneralQuery(ROUTE, People.class);
        if (generalQuery.getResults().isEmpty())
            return Collections.emptyList();

        final List<People> allPeople = new ArrayList<>();
        final int totalPages = (int) (Math.round(generalQuery.getCount() / 10.0) + 1);
        for (int i = 1; i <= totalPages; i++) {
            final String PAGE_ROUTE = Resources.PEOPLE.getPageRoute(i);
            final GeneralQuery<People> newQuery = getGeneralQuery(PAGE_ROUTE, People.class);
            if (newQuery.getResults().isEmpty())
                break;

            allPeople.addAll(newQuery.getResults());
        }

        return allPeople;
    }

    @Override
    public List<People> getBySearch(String searchQuery) throws IOException {
        final String ROUTE = Resources.PEOPLE.getRouteBySearch(searchQuery);
        final GeneralQuery<People> generalQuery = getGeneralQuery(ROUTE, People.class);

        if (generalQuery.getResults().isEmpty())
            return Collections.emptyList();

        return generalQuery.getResults();
    }

}
