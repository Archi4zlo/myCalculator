package com.archi4zlo.mycalculator.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.archi4zlo.mycalculator.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainFragment constructor(
    private val welcomeString: String
): Fragment(R.layout.fragment_main) {

    private val TAG: String =  "MainFragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        Log.d(TAG, "onViewCreated: ${welcomeString}")
    }
}