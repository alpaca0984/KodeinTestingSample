package com.example.kodeintestingsample.animal

import com.example.kodeintestingsample.common.HttpClient
import com.example.kodeintestingsample.common.HttpResponse

class TestAnimalHttpClient : HttpClient {

    override suspend fun get(): HttpResponse {
        print("GET request is sent")
        return HttpResponse("Testing API Response")
    }
}
