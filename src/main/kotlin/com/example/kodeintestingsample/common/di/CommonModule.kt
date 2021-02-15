package com.example.kodeintestingsample.common.di

import com.example.kodeintestingsample.common.HttpClient
import com.example.kodeintestingsample.common.HttpClientImpl
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.provider

val commonModule = DI.Module("CommonModule") {
    bind<HttpClient>() with provider { HttpClientImpl() }
}
