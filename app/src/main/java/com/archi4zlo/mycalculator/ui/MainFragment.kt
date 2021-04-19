package com.archi4zlo.mycalculator.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.archi4zlo.mycalculator.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import android.view.animation.Animation

import android.view.animation.AlphaAnimation




@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainFragment constructor(
    private val welcomeString: String
): Fragment(R.layout.fragment_main) {

    private val TAG: String =  "MainFragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        inputAnimation()
        Log.d(TAG, "onViewCreated: ${welcomeString}")
    }
    fun inputAnimation(){
        val anim: Animation = AlphaAnimation(0.0f, 1.0f)
        anim.duration = 300 //You can manage the time of the blink with this parameter
        anim.startOffset = 20
        anim.repeatMode = Animation.REVERSE
        anim.repeatCount = Animation.INFINITE
        TVInputNumbers.startAnimation(anim)
    }
}