package com.tuo.dagger2forandroid

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2019/1/18 11:17
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class MyApplication : Application(), HasActivityInjector {


    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        DaggerMyAppComponent.create().inject(this)
        super.onCreate()

    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

}