package com.tuo.dagger2forandroid

import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var chef: Chef

    @Inject
    lateinit var menu: Menu



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("onCreate", menu.toString() + chef.cook())
    }
}
