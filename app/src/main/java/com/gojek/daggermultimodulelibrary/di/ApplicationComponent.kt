package com.gojek.daggermultimodulelibrary.di

import com.gojek.core.di.CoreModule
import com.gojek.daggermultimodulelibrary.MainActivity
import com.gojek.detail_screen.di.DetailScreenComponent
import com.gojek.detail_screen.di.DetailScreenModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [CoreModule::class, DetailScreenModule::class])
@Singleton
interface ApplicationComponent {
    fun inject(activity: MainActivity)

    fun detailScreenComponent(): DetailScreenComponent.Factory
}