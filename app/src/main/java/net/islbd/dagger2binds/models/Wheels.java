package net.islbd.dagger2binds.models;

import javax.inject.Inject;

public class Wheels {

    private Tyres tyres;
    private Rims rims;

    @Inject
    public Wheels(Rims rims,Tyres tyres) {
        this.rims = rims;
        this.tyres = tyres;
    }
}
