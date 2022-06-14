package io.jking.api;

import io.jking.core.Checks;

public enum Root {

    FILMS("films"),
    PEOPLE("people"),
    PLANETS("planets"),
    SPECIES("species"),
    STARSHIPS("starships"),
    VEHICLES("vehicles");

    private static final String ROOT_URL = "https://swapi.dev/api/%s";
    private final        String rootAttributes;

    Root(String rootAttributes) {
        this.rootAttributes = rootAttributes;
    }

    public String getRootAttributes() {
        return rootAttributes;
    }

    public String getAllUrl() {
        return String.format("%s/", ROOT_URL.formatted(rootAttributes));
    }

    public String getUrlBySearch(String searchParameter) {
        Checks.notEmpty(searchParameter, "Search Parameter");
        return String.format("%s/?search=%s", ROOT_URL.formatted(rootAttributes), searchParameter)
                .replaceAll("\\s+", "%20");
    }

    public String getUrlById(int id) {
        Checks.check(id > 0, "ID must be greater than 0!");
        return getAllUrl().concat("%d/").formatted(id);
    }
}
