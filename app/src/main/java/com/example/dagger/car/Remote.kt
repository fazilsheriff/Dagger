package com.example.dagger.car

import android.util.Log
import javax.inject.Inject

class Remote {
    private  val TAG = "Remote"
    @Inject
    constructor()

    fun setListerner(car: Car){
        Log.i(TAG, "setListerner: ")
    }
}