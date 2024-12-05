package com.example.examen_pm_cosas_aslkdfoijhsladekf_manu_hola_tema6

class Circulo (radio : Float = 0f, var color : String = "Rosita") : Circunferencia(){

    constructor(centro : Pair<Float, Float> = Pair(0f, 0f), posicion : Pair<Float, Float> = Pair(0f, 0f), color : String) : this(
        Math.sqrt(
            Math.pow((centro.first - posicion.first).toDouble(), 2.0) * Math.pow((centro.second - posicion.second).toDouble(), 2.0)
        ).toFloat(), color
    )

    fun area() : Float{
        return
    }
}