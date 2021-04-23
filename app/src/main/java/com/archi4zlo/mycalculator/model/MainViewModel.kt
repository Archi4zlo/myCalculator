@file:Suppress("unused", "unused", "unused", "unused")

package com.archi4zlo.mycalculator.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.script.ScriptEngineManager
import javax.script.ScriptEngine





class MainViewModel : ViewModel() {
    private var _currentExpression = MutableLiveData<String>()
    val currentExpression: LiveData<String>
        get() = _currentExpression
    private var _currentResult = MutableLiveData<String>()
    val currentResult: LiveData<String>
        get() = _currentResult

    private var _wasWriteSymbol = MutableLiveData<Boolean>()
    val wasWriteSymbol: LiveData<Boolean>
    get() = _wasWriteSymbol

    private var _wasWriteSymbolComma = MutableLiveData<Boolean>()
    val wasWriteSymbolComma: LiveData<Boolean>
        get() = _wasWriteSymbolComma

    private var _wasWriteOneComma = MutableLiveData<Boolean>()
    val wasOneSymbolComma: LiveData<Boolean>
        get() = _wasWriteOneComma
    private var _blockGetResult = MutableLiveData<Boolean>()
    val blockGetResult: LiveData<Boolean>
        get() = _blockGetResult

    init {
        _currentExpression.value = "|"
        _wasWriteSymbol.value = false
        _wasWriteSymbolComma.value = false
        _blockGetResult.value = false
    }
    fun default(){
        _currentExpression.value = "|"
    }
    private fun blockWriteSymbolCommaGetResult(){
        _wasWriteSymbol.value = false
        _wasWriteSymbolComma.value = false
        _blockGetResult.value =false
    }
    private fun unBlockWriteSymbolCommaGetResult(){
        _wasWriteSymbol.value = true
        _wasWriteSymbolComma.value = true
        _blockGetResult.value =true
    }
    fun add0() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "0"
            blockWriteSymbolCommaGetResult()
        } else {
            _currentExpression.value = "0"
            blockWriteSymbolCommaGetResult()
        }
    }
    fun add1() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "1"
            blockWriteSymbolCommaGetResult()
        } else {
            _currentExpression.value = "1"
            blockWriteSymbolCommaGetResult()
        }
    }
    fun add2() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "2"
            blockWriteSymbolCommaGetResult()
        } else {
            _currentExpression.value = "2"
            blockWriteSymbolCommaGetResult()
        }
    }
    fun add3() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "3"
            blockWriteSymbolCommaGetResult()
        } else {
            _currentExpression.value = "3"
            blockWriteSymbolCommaGetResult()
        }
    }
    fun add4() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "4"
            blockWriteSymbolCommaGetResult()
        } else {
            _currentExpression.value = "4"
            blockWriteSymbolCommaGetResult()
        }
    }
    fun add5() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "5"
            blockWriteSymbolCommaGetResult()
        } else {
            _currentExpression.value = "5"
            blockWriteSymbolCommaGetResult()
        }
    }
    fun add6() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "6"
            blockWriteSymbolCommaGetResult()
        } else {
            _currentExpression.value = "6"
            blockWriteSymbolCommaGetResult()
        }
    }
    fun add7() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "7"
            blockWriteSymbolCommaGetResult()
        } else {
            _currentExpression.value = "7"
            blockWriteSymbolCommaGetResult()
        }
    }
    fun add8() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "8"
            blockWriteSymbolCommaGetResult()
        } else {
            _currentExpression.value = "8"
            blockWriteSymbolCommaGetResult()
        }
    }
    fun add9() {
        if (_currentExpression.value != "|") {
            _currentExpression.value = _currentExpression.value + "9"
            blockWriteSymbolCommaGetResult()
        } else {
            _currentExpression.value = "9"
            blockWriteSymbolCommaGetResult()
        }
    }
    fun addDiv() {
        if (_wasWriteSymbol.value == false) {
            if (_currentExpression.value != "|") {
                _currentExpression.value = _currentExpression.value + "/"
                unBlockWriteSymbolCommaGetResult()
                _wasWriteOneComma.value = false
            } else {
                _currentExpression.value = "/"
                unBlockWriteSymbolCommaGetResult()
                _wasWriteOneComma.value = false
            }
        }
    }
    fun addMul() {
        if (_wasWriteSymbol.value == false) {
            if (_currentExpression.value != "|") {
                _currentExpression.value = _currentExpression.value + "*"
                unBlockWriteSymbolCommaGetResult()
                _wasWriteOneComma.value = false
            } else {
                _currentExpression.value = "*"
                unBlockWriteSymbolCommaGetResult()
                _wasWriteOneComma.value = false
            }
        }
    }
    fun addMinus() {
        if (_wasWriteSymbol.value == false) {
            if (_currentExpression.value != "|") {
                _currentExpression.value = _currentExpression.value + "-"
                unBlockWriteSymbolCommaGetResult()
                _wasWriteOneComma.value = false
            } else {
                _currentExpression.value = "-"
                unBlockWriteSymbolCommaGetResult()
                _wasWriteOneComma.value = false
            }
        }
    }
    fun addPlus() {
        if (_wasWriteSymbol.value == false){
            if (_currentExpression.value != "|") {
                _currentExpression.value = _currentExpression.value + "+"
                unBlockWriteSymbolCommaGetResult()
                _wasWriteOneComma.value = false
            } else {
                _currentExpression.value = "+"
                unBlockWriteSymbolCommaGetResult()
                _wasWriteOneComma.value = false
            }
        }

    }
    fun comma(){
        if (_wasWriteOneComma.value == false){
            if(_wasWriteSymbolComma.value == false){
                if (_currentExpression.value != "|") {
                    _currentExpression.value = _currentExpression.value + "."
                    unBlockWriteSymbolCommaGetResult()
                    _wasWriteOneComma.value = true
                } else {
                    _currentExpression.value = "."
                    unBlockWriteSymbolCommaGetResult()
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
        _currentExpression.value = deleteLastSymbol(_currentExpression.value)!!
        _wasWriteOneComma.value = false
        _wasWriteSymbol.value = false
        _wasWriteSymbolComma.value = false

    }


    fun getResult(currentExpression: String): String{
        return if (_blockGetResult.value == false){
            val manager = ScriptEngineManager()
            val engine: ScriptEngine = manager.getEngineByName("js")
            val result: Any = engine.eval(currentExpression)
            _currentResult.value = result.toString()
            result.toString()
        } else {
            _currentResult.value =""
            return ""
        }
    }

    companion object {
        private fun deleteLastSymbol(startString: String?): String? {
            var stringExpression = startString
            if (stringExpression != null) {
                if (stringExpression.isNotEmpty()){
                    stringExpression = stringExpression.substring(0, stringExpression.length - 1)
                }
            }
            return stringExpression
        }
    }

}