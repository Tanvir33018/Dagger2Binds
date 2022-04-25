package net.islbd.dagger2binds.models;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private Engine engine;
    private Wheels wheels;
    private static final String TAG = "Car";

    @Inject
    public Car( Engine engine,Wheels wheels) {
        this.wheels = wheels;
        this.engine = engine;
    }
    public void drive(){
        engine.start();
        Log.d(TAG, "driving... ");
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListner(this);
    }
}
