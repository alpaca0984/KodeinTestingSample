package com.example.kodeintestingsample.animal.di

import com.example.kodeintestingsample.animal.AnimalApi
import com.example.kodeintestingsample.animal.AnimalRepository
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton

val animalModule = DI.Module("AnimalModule") {
    bind<AnimalApi>() with singleton { AnimalApi(instance()) }
    bind<AnimalRepository>() with singleton { AnimalRepository(instance()) }
}
