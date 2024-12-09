import java.util.*

fun main() {
    var sc = obrimScanner()

    //definim files i columnes
    val files = 20
    val butaques = 15
    //definim array
    val matriuCinema = Array(files) { Array(butaques) { '_' } }

    //mostrem el menu
    mostrarMenu(sc, matriuCinema)
}

fun obrimScanner(): Scanner {
    val sc: Scanner = Scanner(System.`in`)
    return sc
}

/**
 * Mostra el menú principal de l'aplicació i permet a l'usuari escollir entre diverses opcions
 *
 * @author Catalina Genovese
 *
 * @param sc L'objecte Scanner utilitzat per obtenir l'entrada de l'usuari.
 * @param mostrarMenu que mostrarà el menu per pantalla
 */
fun mostrarMenu(sc: Scanner, matriu: Array<Array<Char>>) {
    var opcio: Int

    do {
        println("\nMenú Principal")
        println("1. Buidar Sala")
        println("2. Veure butaques disponibles")
        println("3. Reservar butaques")
        println("4. Sortir")
        print("Seleccioneu una opció: ")

        opcio = sc.nextInt()

        when (opcio) {
            1 -> buidarSala(matriu)
            2 -> visualitzarButaques(matriu)
            3 -> reservarButaca(sc, matriu) // También se pasa el Scanner aquí
            4 -> println("Sortint del menú. Fins aviat!")
            else -> println("Opció no vàlida, torneu-ho a intentar.")
        }
    } while (opcio != 4)
}

/**
 * Buida totes les butaques de la sala
 *
 * @author Catalina Genovese
 *
 * @param buidarSala que mostrara la sala buida
 */
fun buidarSala(matriu: Array<Array<Char>>) {
    for (i in matriu.indices) {
        for (j in matriu[i].indices) {
            matriu[i][j] = '_'
        }
    }
    println("La sala ha estat buidada correctament.")
}

/**
 *
 * Usuari introdueix la fila i la butaca que vol reservar.
 *
 * @author Catalina Genovese
 * @param sc L'objecte Scanner utilitzat per obtenir l'entrada de l'usuari.
 * @param reservarButaca on podrem reservar una butaca especifica
 */

fun reservarButaca(sc: Scanner, matriu: Array<Array<Char>>) {
    println("Introduïu la fila: ")
    //li restem 1 perque coincideixi amb els indexs de l'array
    val fila = sc.nextInt() - 1
    println("Introduïu la butaca: ")
    val butaca = sc.nextInt() - 1

    if (fila in matriu.indices && butaca in matriu[0].indices) {
        if (matriu[fila][butaca] == '_') {
            matriu[fila][butaca] = 'X'
            println("S'ha reservat la vostra butaca.")
        } else {
            println("Aquesta butaca ja està ocupada.")
        }
    } else {
        println("Posició no vàlida. Si us plau, introduïu valors correctes.")
    }
}

/**
 * Mostra l'estat actual de la sala indicant quines butaques estan disponibles i quines estan reservades.
 *
 * @author Catalina Genovese
 * @param matriu Matriu que representa l'estat de les butaques de la sala de cinema.
 */
fun visualitzarButaques(matriu: Array<Array<Char>>) {
    println("\nEstat actual de la sala:")
    for (fila in matriu) {
        for (butaca in fila) {
            print(butaca)
        }
        println()

    }
}