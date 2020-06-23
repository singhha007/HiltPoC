package com.servicetitan.android.platform.android.hiltpoc.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.servicetitan.android.platform.android.hiltpoc.MainViewModel
import com.servicetitan.android.platform.android.hiltpoc.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.view.*
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment() {

    @Inject
    lateinit var appName: String

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        Toast.makeText(requireContext(), mainViewModel.sendAppName(), Toast.LENGTH_LONG).show()
        view.fragmentAppName.text = appName
        return view
    }
}