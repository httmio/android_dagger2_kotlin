package com.example.paul7.myapplication

import android.os.Bundle
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by paul.liu on 2017/11/23.
 */
open class BaseActivity : DaggerAppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
         AndroidInjection.inject(this)
         super.onCreate(savedInstanceState)
    }
}