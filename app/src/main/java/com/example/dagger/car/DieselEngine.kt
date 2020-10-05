package com.example.dagger.car

import android.util.Log
import javax.inject.Inject

class DieselEngine : Engine {
    private  val TAG = "DieselEngine"
    @Inject
    constructor()

    override fun start() {
        Log.i(TAG, "Diesel Engine Started!!")
    }
}