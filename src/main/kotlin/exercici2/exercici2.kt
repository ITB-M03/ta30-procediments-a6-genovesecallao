package org.example.controllers

import java.util.*

data class Punt(
    var x: Float,
    var y: Float
)

fun main() {
    val sc: Scanner = obrimScanner().useLocale(Locale.US)

}

fun obrimScanner(): Scanner {
    val sc: Scanner = Scanner(System.`in`)
    return sc
}

