package com.example.dagger.components

import com.example.dagger.car.DieselEngine
import com.example.dagger.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {
    @Binds
    abstract fun bindsDieselEnigne(dieselEngine: DieselEngine): Engine
}
