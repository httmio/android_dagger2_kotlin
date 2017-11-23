package com.example.paul7.myapplication.Main

import com.example.paul7.myapplication.BasePresenter
import com.example.paul7.myapplication.BaseView

/**
 * Created by paul.liu on 2017/11/23.
 */

interface MainContract{

    interface View : BaseView<Presenter>{
        //do something

    }
    interface Presenter : BasePresenter<View>{

        //do something
    }

}