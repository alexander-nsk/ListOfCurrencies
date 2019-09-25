package com.example.listofcurrencies.components.mainscreen.config.di

import android.app.Application
import com.example.listofcurrencies.components.mainscreen.backstage.di.MainScreenModule

class CurrenciesApplication : Application() {
    lateinit var injector: AppDiComponent
        private set

    override fun onCreate() {
        super.onCreate()

        INSTANCE = this
        injector = DaggerAppDiComponent.builder()
            .mainScreenModule(MainScreenModule())
            .build()
    }

    companion object {
        private lateinit var INSTANCE: CurrenciesApplication
        @JvmStatic
        fun get(): CurrenciesApplication = INSTANCE
    }
}