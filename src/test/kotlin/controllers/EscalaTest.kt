package org.example.exercici1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EscalaTest {

    @Test
    fun testEscala() {
        val punt = Punt(2.0f, 3.0f)
        val factor = 2.0f

        escala(punt, factor)

        assertEquals(Punt(4.0f, 6.0f), punt)
    }

    @Test
    fun testEscalaNegativa() {
        val punt = Punt(1.0f, 2.0f)
        val factor = -1.0f

        escala(punt, factor)

        assertEquals(Punt(-1.0f, -2.0f), punt)
    }

    @Test
    fun testEscalaZero() {
        val punt = Punt(5.0f, 5.0f)
        val factor = 0.0f

        escala(punt, factor)

        assertEquals(Punt(0.0f, 0.0f), punt)
    }
}
