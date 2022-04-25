package net.islbd.dagger2binds.models.modules;

import net.islbd.dagger2binds.models.Engine;
import net.islbd.dagger2binds.models.PetrolEngine;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModules {

    @Binds
    abstract Engine bindsEngine(PetrolEngine engine);
}
