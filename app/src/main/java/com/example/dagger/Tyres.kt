package com.example.dagger

import android.util.Log
import javax.inject.Inject

class Tyres {
    private  val TAG = "Tyres"
@Inject
    constructor()

    fun setMeter() {
        Log.i(TAG, "setMeter: ")
    }
}