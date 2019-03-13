package com.example.main.debug;

import android.app.Application;
import android.util.Log;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("tag", "debug MainApplication");
    }
}
