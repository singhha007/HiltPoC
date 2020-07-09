package com.servicetitan.android.platform.android.hiltpoc.di

import android.app.Application
import com.servicetitan.android.platform.android.hiltpoc.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class BaseModule {

    @Provides
    fun getString(application: Application) = application.getString(R.string.app_name)

    @Provides
    fun getInt() = 5
}