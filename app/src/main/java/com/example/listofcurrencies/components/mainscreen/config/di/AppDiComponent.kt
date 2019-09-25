package com.example.listofcurrencies.components.mainscreen.config.di

import com.example.listofcurrencies.components.mainscreen.backstage.di.MainScreenModule
import com.example.listofcurrencies.components.mainscreen.ui.MainScreen
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        MainScreenModule::class
    ]
)
@Singleton
interface AppDiComponent {
    fun inject(mainScreenScreen: MainScreen)
}