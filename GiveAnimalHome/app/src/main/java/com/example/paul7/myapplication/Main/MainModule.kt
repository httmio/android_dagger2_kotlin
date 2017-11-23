package com.example.paul7.myapplication.Main

import com.example.paul7.myapplication.model.ActivityScoped
import dagger.Binds
import dagger.Module

/**
 * Created by paul.liu on 2017/11/22.
 */

/**
 * This is Dagger module. We use this to pass in the View dependency to the
 * {@link MainPresenter}
 * */
@Module
abstract class MainModule{
    //如果需要靜態先使用kotlin靜態方法之後加上@JvmStatic
    //@JvmStatic
    @ActivityScoped
    @Binds
    abstract fun mainPresenter(presenter: MainPresenter): MainContract.Presenter

}