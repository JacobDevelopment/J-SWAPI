package io.jking.jswapi.action.impl;

import io.jking.jswapi.action.RequestAction;
import io.jking.jswapi.internal.Resources;
import io.jking.jswapi.resources.impl.Vehicles;

public class VehiclesAction extends RequestAction<Vehicles> {
    public VehiclesAction() {
        super(Resources.VEHICLES, Vehicles.class);

    }
}
