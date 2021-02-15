package com.example.kodeintestingsample.animal

import com.example.kodeintestingsample.animal.di.testAnimalKodein
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.kodein.di.instance

@ExperimentalCoroutinesApi
class AnimalIntegrationTest {

    val animalRepository: AnimalRepository by testAnimalKodein.instance()

    @Nested
    inner class `getAnimals()` {

        @Test
        fun `it fetches data`() = runBlockingTest {
            val actual = animalRepository.getAnimals()
            assertThat(actual.data).isEqualTo("Testing API Response")
        }
    }
}
