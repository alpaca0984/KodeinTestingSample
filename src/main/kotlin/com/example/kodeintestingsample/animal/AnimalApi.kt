package com.example.kodeintestingsample.animal

import com.example.kodeintestingsample.common.HttpClient
import com.example.kodeintestingsample.common.HttpResponse

class AnimalApi(
    private val client: HttpClient
) {

    suspend fun getAnimals(): HttpResponse = client.get()

    suspend fun createAnimal() {
        client.post()
    }
}
