package com.example.dagger.components

import com.example.dagger.car.Engine
import com.example.dagger.car.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {
    @Provides
    fun providePetrolEnigne(petrolEngine: PetrolEngine): Engine
    {
        return petrolEngine;
    }
}