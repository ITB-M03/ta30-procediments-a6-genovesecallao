package org.example.controllers
import java.util.*

data class Punt (
    var x:Float,
    var y:Float
)
fun main() {
    val sc: Scanner = obrimScanner().useLocale(Locale.US)

    // Crear un punto solicitando las coordenadas al usuario
    val punt = Punt (
     x= definimNombres(sc, "Inserta un num en el eix de les X: "),
     y= definimNombres(sc, "Inserta un'altre num en el eix de les Y: ")
    )


    mostraPunt(punt.x, punt.y)

    //demanem num
    var a= definimNombres(sc, "Inserta un num")
    var b= definimNombres(sc, "Inserta un num")

    // Realizar la translación
    OperacioTranslacio(punt, a, b)

    // actaulizamos valor
    mostraPunt(punt.x, punt.y)
}
fun obrimScanner(): Scanner {
    val sc: Scanner = Scanner(System.`in`)
    return sc
}

fun definimNombres (sc:Scanner, msg:String) : Float {
    print(msg)
    var num:Float
    num=sc.nextFloat()

    return num
}

fun mostraPunt(x:Float, y:Float) {

    println("(${String.format(Locale.US, "%.6f", x)}, ${String.format(Locale.US, "%.6f", y)})")
}


fun OperacioTranslacio(punt: Punt, a: Float, b: Float) {
    punt.x += a
    punt.y += b

}