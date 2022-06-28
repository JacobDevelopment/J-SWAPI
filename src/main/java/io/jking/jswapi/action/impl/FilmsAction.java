package io.jking.jswapi.action.impl;

import io.jking.jswapi.action.RequestAction;
import io.jking.jswapi.internal.Resources;
import io.jking.jswapi.resources.impl.Films;

public class FilmsAction extends RequestAction<Films> {
    public FilmsAction() {
        super(Resources.FILMS, Films.class);
    }
}
