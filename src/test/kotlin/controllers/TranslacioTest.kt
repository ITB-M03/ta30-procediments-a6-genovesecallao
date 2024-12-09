package org.example.exercici1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TranslacioTest {

    @Test
    fun testTranslacio() {
        val punt1 = Punt(1.0f, 2.0f)
        val punt2 = Punt(3.0f, 4.0f)

        translacio(punt1, punt2)

        assertEquals(Punt(4.0f, 6.0f), punt1)
    }

    @Test
    fun testTranslacioNegativa() {
        val punt1 = Punt(5.0f, 5.0f)
        val punt2 = Punt(-2.0f, -3.0f)

        translacio(punt1, punt2)

        assertEquals(Punt(3.0f, 2.0f), punt1)
    }

    @Test
    fun testTranslacioZero() {
        val punt1 = Punt(7.0f, 8.0f)
        val punt2 = Punt(0.0f, 0.0f)

        translacio(punt1, punt2)

        assertEquals(Punt(7.0f, 8.0f), punt1)
    }
}
