package com.example.kodeintestingsample

import com.example.kodeintestingsample.animal.di.animalModule
import com.example.kodeintestingsample.common.di.commonModule
import org.kodein.di.DI

val appKodein = DI {
    importAll(
        commonModule,
        animalModule
    )
}
