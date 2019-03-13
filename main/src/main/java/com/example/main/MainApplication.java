package com.example.main;

import android.util.Log;
import com.example.common.BaseApplication;

public class MainApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("tag", "MainApplication");
    }
}
