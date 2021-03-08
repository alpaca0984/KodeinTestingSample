package com.example.kodeintestingsample.common

class HttpClientImpl : HttpClient {

    override suspend fun get(): HttpResponse {
        return HttpResponse("Actual API Response")
    }
}
