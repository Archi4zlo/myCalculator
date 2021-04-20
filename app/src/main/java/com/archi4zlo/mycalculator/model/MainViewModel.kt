package com.archi4zlo.mycalculator.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var _currentExpression = MutableLiveData<String>()
    val currentExpression: LiveData<String>
        get() = _currentExpression


    init {
        _currentExpression.value = "|"
    }

    fun add0() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "0"
        } else {
            _currentExpression.value = "0"
        }
    }
    fun add1() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "1"
        } else {
            _currentExpression.value = "1"
        }
    }
    fun add2() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "2"
        } else {
            _currentExpression.value = "2"
        }
    }
    fun add3() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "3"
        } else {
            _currentExpression.value = "3"
        }
    }
    fun add4() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "4"
        } else {
            _currentExpression.value = "4"
        }
    }
    fun add5() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "5"
        } else {
            _currentExpression.value = "5"
        }
    }
    fun add6() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "6"
        } else {
            _currentExpression.value = "6"
        }
    }
    fun add7() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "7"
        } else {
            _currentExpression.value = "7"
        }
    }
    fun add8() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "8"
        } else {
            _currentExpression.value = "8"
        }
    }
    fun add9() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "9"
        } else {
            _currentExpression.value = "9"
        }
    }
    fun addDiv() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "\\"
        } else {
            _currentExpression.value = "\\"
        }
    }
    fun addMul() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "*"
        } else {
            _currentExpression.value = "*"
        }
    }
    fun addMinus() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "-"
        } else {
            _currentExpression.value = "-"
        }
    }
    fun addPlus() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "+"
        } else {
            _currentExpression.value = "+"
        }
    }
    fun comma(){
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + ","
        } else {
            _currentExpression.value = ","
        }
    }
    fun clear(){
        _currentExpression.value = "|"
    }

    fun getResult(currentExpression: String): String{

        return "result"
    }

}