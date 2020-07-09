package com.servicetitan.android.platform.android.hiltpoc.fragment

import androidx.fragment.app.Fragment

abstract class BaseFragment<VM>: Fragment() {

    abstract val viewModel: VM
}