package com.gojek.daggermultimodulelibrary.di

import com.gojek.core.di.CoreModule
import com.gojek.daggermultimodulelibrary.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [CoreModule::class])
@Singleton
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}