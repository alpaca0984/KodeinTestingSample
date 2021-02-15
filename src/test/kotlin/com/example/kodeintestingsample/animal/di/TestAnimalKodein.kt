package com.example.kodeintestingsample.animal.di

import com.example.kodeintestingsample.animal.AnimalApi
import com.example.kodeintestingsample.animal.AnimalRepository
import com.example.kodeintestingsample.animal.TestAnimalHttpClient
import com.example.kodeintestingsample.appKodein
import com.example.kodeintestingsample.common.HttpClient
import org.kodein.di.*

val testAnimalKodein = DI {
    extend(appKodein, copy = Copy {
        copy the binding<AnimalApi>()
        copy the binding<AnimalRepository>()
    })

    bind<HttpClient>(overrides = true) with provider { TestAnimalHttpClient() }
}
