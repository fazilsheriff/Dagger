package com.example.dagger.components

import com.example.dagger.car.Rims
import com.example.dagger.car.Tyres
import com.example.dagger.car.Wheel
import dagger.Module
import dagger.Provides

@Module
class WheelModule {

    @Provides
    fun provideRimes(): Rims {
        return Rims()
    }

    @Provides
    fun provideTyres(): Tyres {
        lateinit  var tyres: Tyres
        tyres.setMeter()
        return Tyres()
    }
    
    @Provides
    fun provideWheels(tyres: Tyres, rims: Rims): Wheel {
        return  Wheel(tyres,rims)
    }

}