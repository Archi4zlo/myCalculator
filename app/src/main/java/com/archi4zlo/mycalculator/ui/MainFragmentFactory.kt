package com.archi4zlo.mycalculator.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

class MainFragmentFactory
@Inject constructor(
    private val welcomeString: String
) : FragmentFactory() {
    @ExperimentalCoroutinesApi
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            MainFragment::class.java.name -> {
                val fragment = MainFragment(welcomeString)
                fragment
            }
            else -> super.instantiate(classLoader, className)
        }
    }
}