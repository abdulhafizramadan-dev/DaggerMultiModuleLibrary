package com.gojek.daggermultimodulelibrary

import android.app.Application
import com.gojek.daggermultimodulelibrary.di.ApplicationComponent
import com.gojek.daggermultimodulelibrary.di.DaggerApplicationComponent
import com.gojek.detail_screen.di.DetailScreenComponent
import com.gojek.detail_screen.di.DetailScreenComponentProvider

class MainApplication: Application(), DetailScreenComponentProvider {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.create()
    }

    override fun provideDetailScreenComponent(): DetailScreenComponent {
        return applicationComponent.detailScreenComponent().create()
    }
}