package com.example.dagger

import dagger.Component
import javax.inject.Inject

@Component
public interface CarComponent {

    fun getCar():Car

//    fun  inject(mainActivity: MainActivity)

}