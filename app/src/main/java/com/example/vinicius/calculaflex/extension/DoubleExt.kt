package com.example.vinicius.calculaflex.extension

fun Double.format(digits: Int) = String.format("%.${digits}f", this)