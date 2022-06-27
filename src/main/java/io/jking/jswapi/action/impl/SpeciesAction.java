package io.jking.jswapi.action.impl;

import io.jking.jswapi.action.RequestAction;
import io.jking.jswapi.internal.Resources;
import io.jking.jswapi.internal.Routes;
import io.jking.jswapi.resources.impl.Species;
import io.jking.jswapi.utility.Binder;

import java.io.IOException;
import java.util.List;

public class SpeciesAction implements RequestAction<Species> {
    @Override
    public Species getById(int id) throws IOException {
        return null;
    }

    @Override
    public List<Species> getAll() throws IOException {
        return null;
    }

    @Override
    public List<Species> getBySearch(String searchQuery) throws IOException {
        return null;
    }
}
