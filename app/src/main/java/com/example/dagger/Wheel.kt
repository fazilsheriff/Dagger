package com.example.dagger

import javax.inject.Inject

class Wheel {
    lateinit var tyres: Tyres
    lateinit var rims: Rims


@Inject
    constructor(tyres: Tyres,rims: Rims)
    {
        this.rims=rims
        this.tyres=tyres
    }
}