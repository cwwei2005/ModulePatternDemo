package com.example.main

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
//import com.github.mzule.activityrouter.annotation.Router
//import com.github.mzule.activityrouter.router.Routers
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.toast

@Route(path = "/main/SplashActivity")
class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        bt_news.setOnClickListener { ARouter.getInstance().build("/news/NewsMainActivity").navigation() }
        bt_getFragment.setOnClickListener {
            val fragment:Fragment = ARouter.getInstance().build("/news/NewsFragment").navigation() as Fragment
            toast("find fragment ${fragment.toString()}")
        }
        bt_music.setOnClickListener {
            ARouter.getInstance()
                .build("/news/NewsWebviewActivity")
                .withString("url", "file:///android_asset/schame-test.html")
                .withBoolean("boolean", false)
                .navigation()
        }
    }
}
