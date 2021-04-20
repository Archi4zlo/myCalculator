package com.archi4zlo.mycalculator.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.archi4zlo.mycalculator.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import android.view.animation.Animation

import android.view.animation.AlphaAnimation
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.archi4zlo.mycalculator.model.MainViewModel
import com.archi4zlo.mycalculator.databinding.FragmentMainBinding


@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainFragment constructor(
    private val welcomeString: String
) : Fragment(R.layout.fragment_main) {

    private lateinit var viewModel: MainViewModel
    private val TAG: String = "MainFragment"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentMainBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_main,
            container,
            false
        )

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.mainViewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.currentExpression.observe(viewLifecycleOwner, Observer {
            binding.TVInputNumbers.text = it
        })

        if (viewModel.currentExpression.value == "|") {
            //Animation
            val anim: Animation = AlphaAnimation(0.0f, 1.0f)
            anim.duration = 300 //You can manage the time of the blink with this parameter
            anim.startOffset = 20
            anim.repeatMode = Animation.REVERSE
            anim.repeatCount = Animation.INFINITE
            binding.TVInputNumbers.startAnimation(anim)
        }

        binding.button0.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.add0()
        }
        binding.button1.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.add1()
        }
        binding.button2.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.add2()
        }
        binding.button3.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.add3()
        }
        binding.button4.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.add4()
        }
        binding.button5.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.add5()
        }
        binding.button6.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.add6()
        }
        binding.button7.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.add7()
        }
        binding.button8.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.add8()
        }
        binding.button9.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.add9()
        }
        binding.buttonDiv.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.addDiv()
        }
        binding.buttonMul.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.addMul()
        }
        binding.buttonMinus.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.addMinus()
        }
        binding.buttonPlus.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.addPlus()
        }
        binding.buttonClear.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.clear()
            binding.textViewResult.text=""
        }
        binding.buttonComma.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.comma()
        }
        binding.buttonEquil.setOnClickListener {
            val current = viewModel.currentExpression.value
            binding.textViewResult.text = current?.let { it1 -> viewModel.getResult(it1) }
        }

        return binding.root

    }
}