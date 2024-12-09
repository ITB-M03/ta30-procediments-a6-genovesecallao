package org.example.exercici1

import java.util.*

data class Punt(
    var x: Float,
    var y: Float
)

fun main() {
    val sc: Scanner = obrimScanner().useLocale(Locale.US)

    // Crear un punto solicitando las coordenadas al usuario
    val punt = Punt(
        x = definimNombres(sc, "Inserta un num en el eix de les X: "),
        y = definimNombres(sc, "Inserta un'altre num en el eix de les Y: ")
    )


    mostraPunt(punt.x, punt.y)

    //demanem num
    var a = definimNombres(sc, "Inserta un num: ")
    var b = definimNombres(sc, "Inserta un num: ")

    // Realizar la translación
    var punt2 =Punt(a,b)
    translacio(punt, punt2)

// actaulizamos valor
    mostraPunt(punt.x, punt.y)

    //multiplicacio
    escala(punt, a)

    // actaulizamos valor
    mostraPunt(punt.x, punt.y)

    //son iguals
    if(iguals(punt, punt2)){
        println("Si")
    }
    else {
        println("No")
    }

}

fun obrimScanner(): Scanner {
    val sc: Scanner = Scanner(System.`in`)
    return sc
}

fun definimNombres(sc: Scanner, msg: String): Float {
    print(msg)
    var num: Float
    num = sc.nextFloat()

    return num
}

fun mostraPunt(x: Float, y: Float) {

    println("(${String.format(Locale.US, "%.6f", x)}, ${String.format(Locale.US, "%.6f", y)})")
}


fun translacio(punt1: Punt, punt2: Punt) {
    punt1.x += punt2.x
    punt1.y += punt2.y

}

fun escala(punt: Punt, a: Float) {
    punt.x *= a
    punt.y *= a
}

fun iguals(punt1: Punt, punt2: Punt): Boolean {
    var sonIguals = false

    if (punt1 == punt2) {
        sonIguals = true
    }

    return sonIguals
}