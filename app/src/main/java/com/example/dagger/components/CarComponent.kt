package com.example.dagger.components

import com.example.dagger.MainActivity
import com.example.dagger.car.Car
import dagger.Component

@Component(modules = [WheelModule::class, DieselEngineModule::class])
public interface CarComponent {

    fun getCar(): Car

    fun  inject(mainActivity: MainActivity)

}