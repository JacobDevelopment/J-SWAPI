package io.jking.jswapi.action.impl;

import io.jking.jswapi.action.RequestAction;
import io.jking.jswapi.internal.Resources;
import io.jking.jswapi.resources.impl.Planets;

public class PlanetsAction extends RequestAction<Planets> {
    public PlanetsAction() {
        super(Resources.PLANETS, Planets.class);
    }
}
