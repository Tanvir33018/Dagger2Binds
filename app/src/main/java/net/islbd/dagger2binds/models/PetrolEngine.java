package net.islbd.dagger2binds.models;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    private static final String TAG = "Car";
    private int horsePower;


    public PetrolEngine(int horsePower) {
        this.horsePower = horsePower;
    }


    @Override
    public void start() {
        Log.d(TAG, "Engine Started...HorsePower "+horsePower);
    }
}
