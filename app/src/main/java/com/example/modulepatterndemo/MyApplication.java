package com.example.modulepatterndemo;

import android.util.Log;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.common.BaseApplication;
//import com.github.mzule.activityrouter.annotation.Modules;

//@Modules({"main", "news"})
public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        boolean isDebug = true;
        if (isDebug){
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
        Log.e("tag", "MyApplication");
    }
}
