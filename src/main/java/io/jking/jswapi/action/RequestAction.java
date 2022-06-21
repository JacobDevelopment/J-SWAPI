package io.jking.jswapi.action;

import io.jking.jswapi.resources.BaseResource;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

public interface RequestAction<T extends BaseResource> {

    T getById(int id) throws IOException;

    List<T> getAll() throws IOException;

    List<T> getBySearch(final String searchQuery) throws IOException;

}
