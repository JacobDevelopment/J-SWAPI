package io.jking.jswapi.action.impl;

import io.jking.jswapi.action.RequestAction;
import io.jking.jswapi.internal.Resources;
import io.jking.jswapi.resources.impl.Starships;

public class StarshipsAction extends RequestAction<Starships> {
    public StarshipsAction() {
        super(Resources.STARSHIPS, Starships.class);
    }
}
