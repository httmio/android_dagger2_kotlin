package com.example.paul7.myapplication

import com.example.paul7.myapplication.model.AppComponent
import com.example.paul7.myapplication.model.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * Created by paul.liu on 2017/11/22.
 */
class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
       val appComponent : AppComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
        return appComponent
    }
}