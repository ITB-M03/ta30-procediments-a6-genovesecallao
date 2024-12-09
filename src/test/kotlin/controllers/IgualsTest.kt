package org.example.exercici1

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class IgualsTest {

    @Test
    fun testIgualsTrue() {
        val punt1 = Punt(3.0f, 4.0f)
        val punt2 = Punt(3.0f, 4.0f)

        assertTrue(iguals(punt1, punt2))
    }

    @Test
    fun testIgualsFalse() {
        val punt1 = Punt(1.0f, 2.0f)
        val punt2 = Punt(3.0f, 4.0f)

        assertFalse(iguals(punt1, punt2))
    }

    @Test
    fun testIgualsDiferentSignes() {
        val punt1 = Punt(-3.0f, 4.0f)
        val punt2 = Punt(3.0f, -4.0f)

        assertFalse(iguals(punt1, punt2))
    }
}
