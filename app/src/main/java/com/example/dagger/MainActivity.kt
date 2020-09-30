package com.example.dagger
/*1 What if there is many constructors
2 Analyse the code
3
* */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var component:CarComponent =DaggerCarComponent.create()
        component.inject(this)

        car=component.getCar()
        car.start()
    }
}