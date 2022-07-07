package io.jking.jswapi.core;

import io.jking.jswapi.action.impl.*;

public class SWAPI {

    public static PeopleAction people() {
        return new PeopleAction();
    }

    public static FilmsAction films() {
        return new FilmsAction();
    }

    public static SpeciesAction species() {
        return new SpeciesAction();
    }

    public static PlanetsAction planets() {
        return new PlanetsAction();
    }

    public static StarshipsAction starships() {
        return new StarshipsAction();
    }

    public static VehiclesAction vehicles() {
        return new VehiclesAction();
    }


}
