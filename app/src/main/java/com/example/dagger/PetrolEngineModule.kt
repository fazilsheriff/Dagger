package com.example.dagger

import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {
    @Provides
    fun providePetrolEnigne(petrolEngine: PetrolEngine):Engine
    {
        return petrolEngine;
    }
}