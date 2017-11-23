package com.example.paul7.myapplication

/**
 * Created by paul.liu on 2017/11/23.
 */

interface BasePresenter<T> {
    fun takeView(view : T)

    fun dropView()
}