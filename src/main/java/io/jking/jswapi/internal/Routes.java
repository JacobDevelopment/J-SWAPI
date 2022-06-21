package io.jking.jswapi.internal;

public enum Routes {

    SEARCH("https://swapi.dev/api/%s/?search=%s&format=json", true),
    ID("https://swapi.dev/api/%s/%d/?format=json", false),
    ALL("https://swapi.dev/api/%s/?format=json", false);

    private final String  baseRouteUrl;
    private final boolean isSearchRoute;

    Routes(String baseRouteUrl, boolean isSearchRoute) {
        this.baseRouteUrl = baseRouteUrl;
        this.isSearchRoute = isSearchRoute;
    }

    public String getBaseRouteUrl() {
        return baseRouteUrl;
    }

    public boolean isSearchRoute() {
        return isSearchRoute;
    }
}
