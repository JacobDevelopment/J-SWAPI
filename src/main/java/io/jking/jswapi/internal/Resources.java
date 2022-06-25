package io.jking.jswapi.internal;

import io.jking.jswapi.utility.Checks;

public enum Resources {
    PEOPLE("people"),
    FILMS("films"),
    STARSHIPS("starships"),
    VEHICLES("vehicles"),
    SPECIES("species"),
    PLANETS("planets");

    private final String resource;

    Resources(String resource) {
        this.resource = resource;
    }

    public String getRouteBySearch(String searchParameter) {
        Checks.notNull(searchParameter, "Search Parameter");
        String resource = this.getResource();
        return Routes.SEARCH.getBaseRouteUrl().formatted(resource, searchParameter.replaceAll("\\s+", "%20"));
    }

    public String getRouteById(int id) {
        Checks.check(id > 0, "ID must be greater than 0.");
        String resource = this.getResource();
        return Routes.ID.getBaseRouteUrl().formatted(resource, id);
    }

    public String getAllRoute() {
        String resource = this.getResource();
        return Routes.ALL.getBaseRouteUrl().formatted(resource);
    }

    public String getPageRoute(int pageNumber) {
        Checks.check(pageNumber > 0, "Page Number must be greater than 0.");
        String resource = this.getResource();
        return Routes.PAGE.getBaseRouteUrl().formatted(resource, pageNumber);
    }

    public String getResource() {
        return resource;
    }
}
