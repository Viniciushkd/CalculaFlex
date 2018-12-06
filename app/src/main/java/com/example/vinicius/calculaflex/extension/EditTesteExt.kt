package com.example.vinicius.calculaflex.extension

import android.widget.EditText

fun EditText.getValue() = this.text.toString()

fun EditText.getDouble() = this.getValue().toDouble()