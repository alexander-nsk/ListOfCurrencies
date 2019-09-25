package com.example.listofcurrencies.components.mainscreen.backstage.di

import com.example.listofcurrencies.components.mainscreen.backstage.MainScreenPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MainScreenModule {
    @Provides
    @Singleton
    fun providesPresenter(): MainScreenPresenter = MainScreenPresenter()
}