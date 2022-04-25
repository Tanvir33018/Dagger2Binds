package net.islbd.dagger2binds.models;

import android.util.Log;

import javax.inject.Inject;

public class Tyres {

    private static final String TAG = "Car";

    @Inject
    public Tyres() {
    }

    public void install(){
        Log.d(TAG, "Tyre Installed");
    }
}
