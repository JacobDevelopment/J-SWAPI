package io.jking.jswapi.action.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jking.jswapi.action.RequestAction;
import io.jking.jswapi.internal.Resources;
import io.jking.jswapi.resources.impl.People;
import io.jking.jswapi.resources.impl.PeopleQuery;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

public class PeopleAction implements RequestAction<People> {
    @Override
    public People getById(int id) throws IOException {
        final String ROUTE = Resources.PEOPLE.getRouteById(id);
        return new ObjectMapper().readValue(new URL(ROUTE), People.class);
    }

    @Override
    public List<People> getAll() throws IOException {
        final String ROUTE = Resources.PEOPLE.getAllRoute();
        final PeopleQuery peopleQuery = new ObjectMapper().readValue(new URL(ROUTE), PeopleQuery.class);

        if (peopleQuery.getResults().isEmpty())
            return Collections.emptyList();

        return peopleQuery.getResults();
    }

    @Override
    public List<People> getBySearch(String searchQuery) throws IOException {
        final String ROUTE = Resources.PEOPLE.getRouteBySearch(searchQuery);
        final PeopleQuery peopleQuery = new ObjectMapper().readValue(new URL(ROUTE), PeopleQuery.class);

        if (peopleQuery.getResults().isEmpty())
            return Collections.emptyList();

        return peopleQuery.getResults();
    }
}
