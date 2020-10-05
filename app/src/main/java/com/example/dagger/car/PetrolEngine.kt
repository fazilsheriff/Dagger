package com.example.dagger.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine : Engine {
    private  val TAG = "PetrolEngine"
    @Inject
    constructor()
    override fun start() {
        Log.i(TAG, "Petrol Engine Started!!")
    }
}