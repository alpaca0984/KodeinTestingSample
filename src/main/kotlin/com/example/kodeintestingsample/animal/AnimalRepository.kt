package com.example.kodeintestingsample.animal

import com.example.kodeintestingsample.common.HttpResponse

class AnimalRepository(
    private val api: AnimalApi
) {

    suspend fun getAnimals(): HttpResponse = api.getAnimals()

    suspend fun createAnimal() {
        api.createAnimal()
    }
}
