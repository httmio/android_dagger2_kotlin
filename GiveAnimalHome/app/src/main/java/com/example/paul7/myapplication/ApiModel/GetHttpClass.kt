package com.example.paul7.myapplication.ApiModel

import okhttp3.OkHttpClient

/**
 * Created by paul.liu on 2017/11/23.
 */

//OkHttp GET

class GetHttpClass{
    var mSite :String = ""

    fun GetHttpClass(site: String){
             this.mSite = site
    }

    var client : OkHttpClient = OkHttpClient()
}