package org.example.controllers

import java.util.*

data class Punt(
    var x: Float,
    var y: Float
)

fun main() {
    val sc: Scanner = obrimScanner()
    var sala= iniciemSala(sc)

    menuPrincipal(sc, sala)

}

fun obrimScanner(): Scanner {
    val sc: Scanner = Scanner(System.`in`)
    return sc
}

fun menuPrincipal(sc: Scanner, sala: Array<Array<String>>) {
    var opcio: Int = -1

    while (opcio != 5) {
        println("\n--- MENÚ CINEMA ---")
        println("1. Mostrar sala")
        println("2. Buidar sala")
        println("3. Reservar seient")
        println("4. Cancel·lar reserva")
        println("5. Sortir")

        print("Selecciona una opció: ")
        opcio = sc.nextInt()

        when (opcio) {
//            1 -> mostrarSala(sala)
            2 -> println(buidarSala(sala))
//
//            3 -> reservarSeient(sc, sala)
//            4 -> cancelarReserva(sc, sala)
            5 -> println("Adéu!")
            else -> println("Opció no vàlida. Torna a intentar-ho.")
        }
    }
}

fun iniciemSala (sc:Scanner): Array<Array<String>> {
    var fila=15
    var columna=20
    var sala= Array(fila) {Array(columna) { "_" } }

    return sala
}

fun buidarSala (sala: Array<Array<String>> ):  Array<Array<String>>  {
    for(x in 0 until sala.size){
        for(y in 0 until sala.size){
            sala[x][y]= "_"
        }
    }
    return sala
}