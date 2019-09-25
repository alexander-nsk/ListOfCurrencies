package com.example.listofcurrencies.components.mainscreen.ui

import android.os.Bundle
import com.example.listofcurrencies.R
import com.example.listofcurrencies.abstracts.view.BaseCompatActivity
import com.example.listofcurrencies.components.mainscreen.backstage.MainScreenContract
import com.example.listofcurrencies.components.mainscreen.backstage.MainScreenPresenter
import com.example.listofcurrencies.components.mainscreen.config.di.CurrenciesApplication
import javax.inject.Inject

class MainScreen : BaseCompatActivity(), MainScreenContract.View {
    @Inject
    lateinit var presenter: MainScreenPresenter

    override fun init(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        CurrenciesApplication.get().injector.inject(this)
        presenter.attach(this)
    }
}
