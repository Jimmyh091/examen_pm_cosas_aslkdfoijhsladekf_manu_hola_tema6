package com.example.examen_pm_cosas_aslkdfoijhsladekf_manu_hola_tema6

open class Circunferencia (var radio : Float = 0f) {

    constructor(centro : Pair<Float, Float> = Pair(0f, 0f), posicion : Pair<Float, Float> = Pair(0f, 0f)) : this(
        Math.sqrt(
            Math.pow((centro.first - posicion.first).toDouble(), 2.0) * Math.pow((centro.second - posicion.second).toDouble(), 2.0)
        ).toFloat()
    )

    fun longitud() : Float{
        return (radio * radio * Math.PI).toFloat()
    }

    override fun toString(): String {
        return "El circulo tiene como radio $radio, y como longitud ${longitud()}"
    }
}