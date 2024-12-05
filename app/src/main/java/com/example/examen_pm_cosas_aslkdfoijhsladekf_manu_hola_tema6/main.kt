package com.example.examen_pm_cosas_aslkdfoijhsladekf_manu_hola_tema6

import android.provider.MediaStore.Video

fun main(){

    var listaVideojuegos = listOf(
        Videojuego("The Kore Gang", "Wii", 2010),
        Videojuego("Super Mario Bros Wii", "Wii", 2009),
        Videojuego("Super Mario Galaxy", "Wii", 2010)
    )

}

fun filtraJuegos(lista : List<Videojuego>, anio : Int) : List<Videojuego>{
    var res : MutableList<Videojuego> = mutableListOf()

    for (it in lista){
        if (it.anio == anio){
            res.add(it)
        }
    }

    return res
}

fun plataformas(lista : List<Videojuego>) : MutableList<String>{

    var plataformas : MutableList<String> = mutableListOf()

    for (it in lista){
        if (!plataformas.contains(it.plataforma)){
            plataformas.add(it.plataforma)
        }
    }

    return plataformas
}

fun mapaJuegos(lista : List<Videojuego>) : HashMap<String, List<Videojuego>>{

    var plataformas = plataformas(lista)

    var mapa : HashMap<String, List<Videojuego>> = hashMapOf()

    for (plataforma in plataformas){

        var listaAux : MutableList<Videojuego> = mutableListOf()

        for (juego in lista){
            if (juego.plataforma == plataforma){
                listaAux.add(juego)
            }
        }

        mapa.put(plataforma, listaAux)
    }

    return mapa
}
