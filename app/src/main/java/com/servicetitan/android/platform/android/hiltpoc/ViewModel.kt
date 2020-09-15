package com.servicetitan.android.platform.android.hiltpoc

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

class MainViewModel @ViewModelInject constructor(private val someInt: Int): ViewModel() {

    fun sendAppName() = "appNameTest"

    fun sendInt() = someInt
}