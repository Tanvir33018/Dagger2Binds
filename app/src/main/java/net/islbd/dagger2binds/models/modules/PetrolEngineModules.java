package net.islbd.dagger2binds.models.modules;

import net.islbd.dagger2binds.models.Engine;
import net.islbd.dagger2binds.models.PetrolEngine;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModules {

    private int horsePower;

    public PetrolEngineModules(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
     Engine providesEngine(){
        return new PetrolEngine(horsePower);
    };
}
