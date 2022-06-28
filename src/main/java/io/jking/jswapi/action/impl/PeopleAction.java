package io.jking.jswapi.action.impl;

import io.jking.jswapi.action.RequestAction;
import io.jking.jswapi.internal.Resources;
import io.jking.jswapi.resources.impl.People;

public class PeopleAction extends RequestAction<People> {
    public PeopleAction() {
        super(Resources.PEOPLE, People.class);
    }
}
