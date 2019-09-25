package com.example.listofcurrencies.components.mainscreen.backstage

import com.example.listofcurrencies.abstracts.presenter.BaseMvpPresenter
import com.example.listofcurrencies.abstracts.view.BaseView

interface MainScreenContract {
    interface Presenter : BaseMvpPresenter<View>
    interface View : BaseView
}