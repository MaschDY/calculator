package br.com.projects.calculator.calc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalcViewModel : ViewModel() {
    private var _calcNum = MutableLiveData<String>()
    val calcNum: LiveData<String> // TODO(): Fazer observe na fragment
        get() = _calcNum

    fun setCalcNumber(actualCalcNum: String, btnNum: String) {
        if (actualCalcNum == "0") _calcNum.value = btnNum
        else _calcNum.value = actualCalcNum + btnNum
    }

    fun cleanup(actualCalcNum: String, btnAction: String) {
        if (btnAction == "C") {
            when {
                actualCalcNum == "0" -> _calcNum.value = actualCalcNum
                actualCalcNum.length == 1 -> _calcNum.value = "0"
                else -> actualCalcNum.dropLast(1)
            }
        } else _calcNum.value = "0"
    }


}