package com.gojek.daggermultimodulelibrary

import android.app.Application
import com.gojek.daggermultimodulelibrary.di.ApplicationComponent
import com.gojek.daggermultimodulelibrary.di.DaggerApplicationComponent

class MainApplication: Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.create()
    }
}