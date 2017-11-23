package com.example.paul7.myapplication.model

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

/**
 * Created by paul.liu on 2017/11/22.
 */
@Module
abstract class ApplicationModule {
    @Binds
    abstract fun bindContext(application: Application): Context
}