package com.example.examen_pm_cosas_aslkdfoijhsladekf_manu_hola_tema6

import android.provider.MediaStore.Video

fun main(){

    var listaVideojuegos = listOf(
        Videojuego("The Kore Gang", "Wii", 2010),
        Videojuego("Super Mario Bros Wii", "Wii", 2009),
        Videojuego("Super Mario Galaxy", "Wii", 2010),
        Videojuego("Rayman", "Play Station", 1995),
        Videojuego("Tekken", "Play Station", 1994)
    )

//    println(mapaJuegos(listaVideojuegos).forEach{
//        println(it.toString())
//    })

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

    championsLeage(listaEquipoFutbol)
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

fun mapaJuegos(lista : List<Videojuego>) : HashMap<String, HashMap<Int, List<Videojuego>>>{

    var plataformas = plataformas(lista)

    var mapa : HashMap<String, HashMap<Int, List<Videojuego>>> = hashMapOf()
    var mapaAnios : HashMap<Int, List<Videojuego>>

    for (plataforma in plataformas){

        var listaPlataformas : MutableList<Videojuego> = mutableListOf()

        for (juego in lista){
            if (juego.plataforma == plataforma){
                listaPlataformas.add(juego)
            }
        }

        var anios = anios(listaPlataformas)
        mapaAnios  = hashMapOf()

        for (anio in anios){

            var listaAnios : MutableList<Videojuego> = mutableListOf()

            for (juego in lista){
                if (juego.anio == anio){
                    listaAnios.add(juego)
                }
            }

            mapaAnios.put(anio, listaAnios)
        }

        mapa.put(plataforma, mapaAnios)
    }

    return mapa
}

fun championsLeage(lista : List<EquipoFutbol>){

    var res : MutableList<EquipoFutbol> = mutableListOf()

    var listaNumUsados : MutableList<Int> = mutableListOf()

    for (it in 0 until lista.size step 2){

        var equipo1 = 0
        var equipo2 = 0

        do {
            equipo1 = (0..lista.size - 1).random()
        } while (equipo1 in listaNumUsados)
        listaNumUsados.add(equipo1)

        do {
            equipo2 = (0..lista.size - 1).random()
        } while (equipo2 in listaNumUsados)
        listaNumUsados.add(equipo2)

        val numAleatorio = Math.random()

        res.add(if (numAleatorio >= 0.5) lista[equipo1] else lista[equipo2])
    }

    res.forEach{
        println("Gano ${it.nombre}")
    }
}