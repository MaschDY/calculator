package br.com.projects.calculator.calc
import android.widget.EditText
import androidx.core.widget.doOnTextChanged

// TODO()
//fun EditText.setOnLostFocus(block: () -> Unit) {
//    setOnFocusChangeListener { _, hasFocus -> if (hasFocus.not()) block() }
//}
//
//typealias TextFieldBinder = (String, String) -> Unit
//
//fun EditText.bindField(binder: TextFieldBinder) {
//    doOnTextChanged { text, _, _, _ -> binder(text?.toString() ?: "", false) }
//    setOnLostFocus { binder(text?.toString() ?: "", true) }
//}