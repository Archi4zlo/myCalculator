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

import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.archi4zlo.mycalculator.model.MainViewModel
import com.archi4zlo.mycalculator.databinding.FragmentMainBinding


@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainFragment constructor(
    private val welcomeString: String
) : Fragment(R.layout.fragment_main) {

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentMainBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_main,
            container,
            false
        )
        val anim: Animation = AnimationUtils.loadAnimation(context, R.anim.anim)

        Toast.makeText(context, welcomeString, Toast.LENGTH_LONG).show()

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.mainViewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.currentExpression.observe(viewLifecycleOwner, {
            if (it.isEmpty()) {
                binding.TVInputNumbers.text = "|"
                binding.TVInputNumbers.startAnimation(anim)
            } else {
                binding.TVInputNumbers.text = it
            }

        })

        if (viewModel.currentExpression.value == "|") {
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
            if (viewModel.currentExpression.value?.length == 1) {
                viewModel.default()
                if (viewModel.currentExpression.value == "|") {
                    binding.TVInputNumbers.startAnimation(anim)
                    binding.textViewResult.text = ""
                } else {
                    viewModel.clear()
                    binding.textViewResult.text = ""
                }
            } else {
                viewModel.clear()
                binding.textViewResult.text = ""
            }


        }
        binding.buttonClear.setOnLongClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.clearAll()
            binding.textViewResult.text = ""
            binding.TVInputNumbers.startAnimation(anim)
            true
        }
        binding.buttonComma.setOnClickListener {
            binding.TVInputNumbers.clearAnimation()
            viewModel.comma()
        }
        binding.buttonQuil.setOnClickListener {
            val current = viewModel.currentExpression.value
            binding.textViewResult.text = current?.let { it1 -> viewModel.getResult(it1) }
        }

        return binding.root

    }
}