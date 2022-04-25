package net.islbd.dagger2binds;


import net.islbd.dagger2binds.models.Car;
import net.islbd.dagger2binds.models.modules.PetrolEngineModules;

import dagger.Component;

@Component (modules = PetrolEngineModules.class)
public interface ApplicationComponent {

    public Car getCar();


}
