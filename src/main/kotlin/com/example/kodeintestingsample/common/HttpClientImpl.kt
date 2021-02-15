package com.example.kodeintestingsample.common

class HttpClientImpl : HttpClient {

    override suspend fun get(): HttpResponse {
        print("GET request is sent")
        return HttpResponse("Actual API Response")
    }

    override suspend fun post() {
        print("POST request is sent")
    }
}
