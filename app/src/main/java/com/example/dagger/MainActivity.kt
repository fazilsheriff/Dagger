package com.example.dagger
/*1 What if there is many constructors
2 Analyse the code
3
* */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger.car.Car
import com.example.dagger.components.CarComponent
import com.example.dagger.components.DaggerCarComponent
import com.example.dagger.components.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var component: CarComponent = DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(100))

            .build()
        component.inject(this)

//    car=component.getCar()
        car.start()
    }
}