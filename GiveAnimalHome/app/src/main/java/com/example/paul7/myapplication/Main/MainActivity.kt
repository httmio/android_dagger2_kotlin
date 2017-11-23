package com.example.paul7.myapplication.Main

import android.os.Bundle
import com.example.paul7.myapplication.BaseActivity
import com.example.paul7.myapplication.R

/**
 * Created by paul.liu on 2017/11/22.
 */

class MainActivity : BaseActivity(), MainContract.View {


    var mPresenter: MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun hideProgress() {
    }

    override fun showProgress() {
    }
}