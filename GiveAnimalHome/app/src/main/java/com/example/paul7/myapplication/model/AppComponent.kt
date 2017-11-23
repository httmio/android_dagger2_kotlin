package com.example.paul7.myapplication.model

import com.example.paul7.myapplication.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by paul.liu on 2017/11/22.
 */


@Singleton
@Component(modules = arrayOf(ApplicationModule::class,
        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class))

interface AppComponent : AndroidInjector<DaggerApplication> {

    fun inject(application: App)

    override fun inject(instance: DaggerApplication?)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): AppComponent.Builder

        fun build(): AppComponent
    }
}