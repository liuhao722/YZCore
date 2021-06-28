package com.yunzhe.modules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.worth.framework.base.core.utils.L

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        L.e("info","1234567890-")
    }
}