package net.islbd.dagger2binds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import net.islbd.dagger2binds.models.Car;

public class MainActivity extends AppCompatActivity {

    ApplicationComponent applicationComponent;
    private Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        applicationComponent = DaggerApplicationComponent.create();
        car = applicationComponent.getCar();

        car.drive();


    }
}