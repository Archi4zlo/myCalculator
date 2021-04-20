package com.archi4zlo.mycalculator.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import java.util.*





class MainViewModel : ViewModel() {
    private var _currentExpression = MutableLiveData<String>()
    val currentExpression: LiveData<String>
        get() = _currentExpression

    private var _wasWriteSymbol = MutableLiveData<Boolean>()
    val wasWriteSymbol: LiveData<Boolean>
    get() = _wasWriteSymbol

    private var _wasWriteSymbolComma = MutableLiveData<Boolean>()
    val wasWriteSymbolComma: LiveData<Boolean>
        get() = _wasWriteSymbolComma

    private var _wasWriteOneComma = MutableLiveData<Boolean>()
    val wasOneSymbolComma: LiveData<Boolean>
        get() = _wasWriteOneComma


    init {
        _currentExpression.value = "|"
        _wasWriteSymbol.value = false
        _wasWriteSymbolComma.value = false
    }
    fun default(){
        _currentExpression.value = "|"
    }

    fun add0() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "0"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        } else {
            _currentExpression.value = "0"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        }
    }
    fun add1() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "1"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        } else {
            _currentExpression.value = "1"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        }
    }
    fun add2() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "2"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        } else {
            _currentExpression.value = "2"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        }
    }
    fun add3() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "3"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        } else {
            _currentExpression.value = "3"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        }
    }
    fun add4() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "4"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        } else {
            _currentExpression.value = "4"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        }
    }
    fun add5() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "5"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        } else {
            _currentExpression.value = "5"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        }
    }
    fun add6() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "6"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        } else {
            _currentExpression.value = "6"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        }
    }
    fun add7() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "7"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        } else {
            _currentExpression.value = "7"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        }
    }
    fun add8() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "8"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        } else {
            _currentExpression.value = "8"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        }
    }
    fun add9() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "9"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        } else {
            _currentExpression.value = "9"
            _wasWriteSymbol.value = false
            _wasWriteSymbolComma.value = false
        }
    }
    fun addDiv() {
        if (_wasWriteSymbol.value == false) {
            if (_currentExpression.value != "|") {
                _currentExpression.value = _currentExpression.value + "/"
                _wasWriteSymbol.value = true
                _wasWriteSymbolComma.value = true
                _wasWriteOneComma.value = false
            } else {
                _currentExpression.value = "/"
                _wasWriteSymbol.value = true
                _wasWriteSymbolComma.value = true
                _wasWriteOneComma.value = false
            }
        }
    }
    fun addMul() {
        if (_wasWriteSymbol.value == false) {
            if (_currentExpression.value != "|") {
                _currentExpression.value = _currentExpression.value + "*"
                _wasWriteSymbol.value = true
                _wasWriteSymbolComma.value = true
                _wasWriteOneComma.value = false
            } else {
                _currentExpression.value = "*"
                _wasWriteSymbol.value = true
                _wasWriteSymbolComma.value = true
                _wasWriteOneComma.value = false
            }
        }
    }
    fun addMinus() {
        if (_wasWriteSymbol.value == false) {
            if (_currentExpression.value != "|") {
                _currentExpression.value = _currentExpression.value + "-"
                _wasWriteSymbol.value = true
                _wasWriteSymbolComma.value = false
                _wasWriteOneComma.value = false
            } else {
                _currentExpression.value = "-"
                _wasWriteSymbol.value = true
                _wasWriteSymbolComma.value = true
                _wasWriteOneComma.value = false
            }
        }
    }
    fun addPlus() {
        if (_wasWriteSymbol.value == false){
            if (_currentExpression.value != "|") {
                _currentExpression.value = _currentExpression.value + "+"
                _wasWriteSymbol.value = true
                _wasWriteSymbolComma.value = true
                _wasWriteOneComma.value = false
            } else {
                _currentExpression.value = "+"
                _wasWriteSymbol.value = true
                _wasWriteSymbolComma.value = true
                _wasWriteOneComma.value = false
            }
        }

    }
    fun comma(){
        if (_wasWriteOneComma.value == false){
            if(_wasWriteSymbolComma.value == false){
                if (_currentExpression.value != "|") {
                    _currentExpression.value = _currentExpression.value + "."
                    _wasWriteSymbol.value = true
                    _wasWriteSymbolComma.value = true
                    _wasWriteOneComma.value = true
                } else {
                    _currentExpression.value = "."
                    _wasWriteSymbol.value = true
                    _wasWriteSymbolComma.value = true
                    _wasWriteOneComma.value = true
                }
            }
        }

    }
    fun clearAll(){
        _currentExpression.value = "|"
        _wasWriteOneComma.value = false
        _wasWriteSymbol.value = false
        _wasWriteSymbolComma.value = false
    }

    fun clear(){
        _currentExpression.value = Companion.deleteLastSymbol(_currentExpression.value)!!
        _wasWriteOneComma.value = false
        _wasWriteSymbol.value = false
        _wasWriteSymbolComma.value = false

    }


    fun getResult(currentExpression: String): String{
        val manager = ScriptEngineManager()
        val engine: ScriptEngine = manager.getEngineByName("js")
        val result: Any = engine.eval(currentExpression)
        return result.toString()
    }

    companion object {
        private fun deleteLastSymbol(startString: String?): String? {
            var stringExpression = startString
            if (stringExpression != null) {
                if (stringExpression.isNotEmpty()){
                    stringExpression = stringExpression.substring(0, stringExpression.length - 1)
                }
            }
//            if (stringExpression)
            return stringExpression
        }
    }

}