package com.example.examen_pm_cosas_aslkdfoijhsladekf_manu_hola_tema6

import android.provider.MediaStore.Video

fun main(){

    var listaVideojuegos = listOf(
        Videojuego("The Kore Gang", "Wii", 2010),
        Videojuego("Super Mario Bros Wii", "Wii", 2009),
        Videojuego("Super Mario Galaxy", "Wii", 2010)
    )

    var listaEquipoFutbol = listOf(
        EquipoFutbol("Barcelona", "Espania"),
        EquipoFutbol("Real Madrid", "Espania"),
        EquipoFutbol("Manchester United", "Espania"),
        EquipoFutbol("Bayer de Munich", "Espania"),
        EquipoFutbol("PSG", "Francia"),
        EquipoFutbol("Monaco", "Francia"),
        EquipoFutbol("Nice", "Francia"),
        EquipoFutbol("Lille", "Francia"),
        EquipoFutbol("Torino FC", "Italia"),
        EquipoFutbol("Bologna FC", "Italia"),
        EquipoFutbol("Juventus", "Italia"),
        EquipoFutbol("Inter", "Italia"),
        EquipoFutbol("Boca juniors", "Argentina"),
        EquipoFutbol("Lanus", "Argentina"),
        EquipoFutbol("Rivers", "Argentina"),
        EquipoFutbol("Tigre", "Argentina"),
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

fun anios(lista : List<Videojuego>) : MutableList<Int>{

    var plataformas : MutableList<Int> = mutableListOf()

    for (it in lista){
        if (!plataformas.contains(it.anio)){
            plataformas.add(it.anio)
        }
    }

    return plataformas
}

fun mapaJuegos(lista : List<Videojuego>) : HashMap<String, HashMap<Int, Videojuego>>{

    var plataformas = plataformas(lista)
    var anios = anios(lista)

    var mapa : HashMap<String, List<Videojuego>> = hashMapOf()

    for (plataforma in plataformas){

        var listaPlataformas : MutableList<Videojuego> = mutableListOf()

        for (juego in lista){
            if (juego.plataforma == plataforma){
                listaPlataformas.add(juego)
            }
        }

        mapa.put(plataforma, listaAux)
    }

    for (anio in anios){

        var listaAnios : MutableList<Videojuego> = mutableListOf()

    }

    for (juego in listaPlataformas){
        if (juego.anio =)
    }
    return mapa
}

fun championsLeage(lista : List<EquipoFutbol>){

    var res : MutableList<EquipoFutbol> = mutableListOf()

    for (it in 0 until lista.size step 2){

        var equipo1 = lista.get(it)
        var equipo2 = lista.get(it + 1)

        val numAleatorio = Math.random()

        res.add(if (numAleatorio >= 0.5) equipo1 else equipo2)
    }

    res.forEach{
        print("Gano ${it.nombre}")
    }
}