package com.example.dagger

import android.util.Log
import javax.inject.Inject

class Car {
    private  val TAG = "Car"
    lateinit var engine: Engine
    lateinit var wheel: Wheel
    lateinit var tyres: Tyres
    lateinit var rims: Rims
@Inject
    constructor(engine: Engine, wheel: Wheel) {
        this.engine = engine
        this.wheel = wheel
    }
//    @Inject
//    constructor(tyres: Tyres,rims: Rims,engine: Engine)
//    {
//        this.tyres=tyres
//        this.rims=rims
//        this.engine=engine
//    }

    fun start()
    {
        Log.i(TAG, "start: Car is started..")
//engine.startEngine()
    }
    //Method injection
    @Inject
    fun enableRemote(remote: Remote)
    {
        remote.setListerner(this)
    }
}