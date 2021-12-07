package br.com.projects.calculator.calc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalcViewModel : ViewModel() {
    private lateinit var _actualCalcNum: String
    private var _calcNum = MutableLiveData<String>()
    val calcNum: LiveData<String>
        get() = _calcNum

    fun setCalcNum(actualCalcNum: String) = actualCalcNum.also { _actualCalcNum = it }

    fun setCalcNumber(btnNum: String) {
        if (_actualCalcNum == "0") _calcNum.value = btnNum
        else _calcNum.value = _actualCalcNum + btnNum
    }

    fun cleanup(actualCalcNum: String, btnAction: String) {
        if (btnAction == "C") {
            when {
                actualCalcNum == "0" -> _calcNum.value = actualCalcNum
                actualCalcNum.length <= 1 -> _calcNum.value = "0"
                else -> _calcNum.value = actualCalcNum.dropLast(1)
            }
        } else _calcNum.value = "0"
    }


}