package com.example.dagger.car

class Wheel {
    lateinit var tyres: Tyres
    lateinit var rims: Rims


    constructor(tyres: Tyres, rims: Rims)
    {
        this.rims=rims
        this.tyres=tyres
    }
}