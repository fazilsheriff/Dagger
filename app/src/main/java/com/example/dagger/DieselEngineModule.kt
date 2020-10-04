package com.example.dagger

import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {
    @Provides
    fun provideDieselEnigne(dieselEngine: DieselEngine):Engine
    {
        return dieselEngine;
    }
}