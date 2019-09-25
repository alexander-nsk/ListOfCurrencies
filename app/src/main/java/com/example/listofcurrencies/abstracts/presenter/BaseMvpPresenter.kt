package com.example.listofcurrencies.abstracts.presenter

import com.example.listofcurrencies.abstracts.view.BaseView

interface BaseMvpPresenter<V: BaseView> {
    var isAttached: Boolean
    fun attach(view: V)
    fun detach()
}