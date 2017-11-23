package com.example.paul7.myapplication.model

import com.example.paul7.myapplication.Main.MainActivity
import com.example.paul7.myapplication.Main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by paul.liu on 2017/11/22.
 */
@Module
 abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = arrayOf(MainModule::class))
    abstract fun mainActivity()  : MainActivity
}