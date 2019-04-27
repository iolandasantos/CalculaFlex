package br.com.iolandasantos.calculaflex.extensions

fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f",this)