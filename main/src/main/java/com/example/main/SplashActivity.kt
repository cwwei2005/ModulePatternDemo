package com.example.main

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
//import com.github.mzule.activityrouter.annotation.Router
//import com.github.mzule.activityrouter.router.Routers
import kotlinx.android.synthetic.main.activity_splash.*

//@Router("main")
@Route(path = "/girls/list")
class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        tv.setOnClickListener {
            Log.e("tag","click..")
//            Routers.open(this, "module://news")
            ARouter.getInstance().build("/news/list").navigation()
        }
    }
}
