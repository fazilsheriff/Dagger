package com.example.dagger

import dagger.Component
import javax.inject.Inject

@Component(modules = [WheelModule::class])
public interface CarComponent {

    fun getCar():Car

    fun  inject(mainActivity: MainActivity)

}