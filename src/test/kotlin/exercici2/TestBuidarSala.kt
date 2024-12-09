import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestBuidarSala {

    @Test
    fun buidarSalaTotesLesButaquesOcupadesTest() {
        val matriuCinema = Array(3) { Array(3) { 'X' } }
        buidarSala(matriuCinema)
        for (fila in matriuCinema) {
            for (butaca in fila) {
                assertEquals('_', butaca)
            }
        }
    }

    @Test
    fun buidarSalaAlgunesButaquesOcupadesTest() {
        val matriuCinema = Array(3) { Array(3) { '_' } }
        matriuCinema[0][0] = 'X'
        matriuCinema[1][2] = 'X'
        buidarSala(matriuCinema)
        for (fila in matriuCinema) {
            for (butaca in fila) {
                assertEquals('_', butaca)
            }
        }
    }

    @Test
    fun buidarSalaTotesLesButaquesBuidesTest() {
        val matriuCinema = Array(3) { Array(3) { '_' } }
        buidarSala(matriuCinema)
        for (fila in matriuCinema) {
            for (butaca in fila) {
                assertEquals('_', butaca)
            }
        }
    }
}
