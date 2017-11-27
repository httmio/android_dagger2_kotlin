package com.example.paul7.myapplication.Main

/**
 * Created by paul.liu on 2017/11/23.
 */
class MainPresenter @Inject constructor(): MainContract.Presenter {

    var mView : MainContract.View? = null

    override fun dropView() {
        mView = null
    }

    override fun takeView(view: MainContract.View) {
        mView = view
    }

}