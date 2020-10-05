package com.example.dagger.car

import android.util.Log
import javax.inject.Inject

class DieselEngine : Engine {
    private  val TAG = "DieselEngine"
      val horsePower:Int
    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }

    override fun start() {
        Log.i(TAG, "Diesel Engine Started!!. Horse Power"+horsePower)
    }
}