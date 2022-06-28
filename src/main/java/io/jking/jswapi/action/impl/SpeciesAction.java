package io.jking.jswapi.action.impl;

import io.jking.jswapi.action.RequestAction;
import io.jking.jswapi.internal.Resources;
import io.jking.jswapi.resources.impl.Species;

public class SpeciesAction extends RequestAction<Species> {
    public SpeciesAction() {
        super(Resources.SPECIES, Species.class);
    }
}
