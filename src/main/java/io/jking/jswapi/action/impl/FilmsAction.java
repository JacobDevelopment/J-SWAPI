package io.jking.jswapi.action.impl;

import io.jking.jswapi.action.RequestAction;
import io.jking.jswapi.internal.Resources;
import io.jking.jswapi.resources.GeneralQuery;
import io.jking.jswapi.resources.impl.Films;
import io.jking.jswapi.utility.Binder;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class FilmsAction implements RequestAction<Films> {
    @Override
    public Films getById(int id) throws IOException {
        final String ROUTE = Resources.FILMS.getRouteById(id);
        return Binder.read(ROUTE, Films.class);
    }

    @Override
    public List<Films> getAll() throws IOException {
        final String ROUTE = Resources.FILMS.getAllRoute();
        final GeneralQuery<Films> generalQuery = getGeneralQuery(ROUTE, Films.class);

        if (generalQuery.getResults().isEmpty())
            return Collections.emptyList();

        return generalQuery.getResults();
    }

    @Override
    public List<Films> getBySearch(String searchQuery) throws IOException {
        final String ROUTE = Resources.FILMS.getRouteBySearch(searchQuery);
        final GeneralQuery<Films> generalQuery = getGeneralQuery(ROUTE, Films.class);

        if (generalQuery.getResults().isEmpty())
            return Collections.emptyList();

        return generalQuery.getResults();
    }
}
