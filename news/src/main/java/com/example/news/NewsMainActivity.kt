package com.example.news

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route

//import com.github.mzule.activityrouter.annotation.Router

//@Router("news")
@Route(path = "/news/list")
class NewsMainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.news_activity_main)
    }
}
