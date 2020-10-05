package com.example.dagger.components

import com.example.dagger.car.DieselEngine
import com.example.dagger.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
 class DieselEngineModule {
     var horsePower:Int

    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }

    @Provides
     fun providesDieselEnigne(): Engine{

        return DieselEngine(horsePower)
    }
}
