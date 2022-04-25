package net.islbd.dagger2binds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import net.islbd.dagger2binds.models.Car;
import net.islbd.dagger2binds.models.modules.PetrolEngineModules;

public class MainActivity extends AppCompatActivity {

    ApplicationComponent applicationComponent;
    private Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        applicationComponent = DaggerApplicationComponent.builder()
                .petrolEngineModules(new PetrolEngineModules(100))
                .build();
        car = applicationComponent.getCar();

        car.drive();


    }
}