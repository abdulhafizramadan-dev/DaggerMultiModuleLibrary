package com.gojek.detail_screen.di

import com.gojek.detail_screen.DetailScreenActivity
import dagger.Subcomponent

@Subcomponent
interface DetailScreenComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): DetailScreenComponent
    }

    fun inject(activity: DetailScreenActivity)
}