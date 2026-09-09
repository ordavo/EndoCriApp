package com.nicolas.coilapp.ui.screens

import com.nicolas.coilapp.R
import com.nicolas.coilapp.model.Colaborador


class ColaboradoresRepository {
    fun getColaboradores(): List<Colaborador> {
        val nombres = listOf(
            "Sergio Ivan Galvis Motoa",
            "José Miguel Hinojosa Lezama",
            "Nancy de los Angeles Segura Azuara",
            "Arianna Cueva",
            "Jose Diego Vite",
            "Analí Medina",
            "José Luis Girón",
            "Julia Gonzalez",
            "Julieta Angel",
            "Nicolás Baracaldo",
            "Camilo Alvarez",
            "Benjamín Barraza",
            "Eugenia Leal",
            "Víctor Delgado",
            "Emiliano González"
        )


        return nombres.mapIndexed { index, nombre ->
            Colaborador(
                nombre = nombre,
                imagenResId = getDrawableId(index + 1) // +1 porque tus imágenes van de 1 a 15
            )
        }
    }

    private fun getDrawableId(index: Int): Int {
        return when (index) {
            1 -> R.drawable.colaborador1
            2 -> R.drawable.colaborador2
            3 -> R.drawable.colaborador3
            4 -> R.drawable.colaborador4
            5 -> R.drawable.colaborador5
            6 -> R.drawable.colaborador6
            7 -> R.drawable.colaborador7
            8 -> R.drawable.colaborador8
            9 -> R.drawable.colaborador9
            10 -> R.drawable.colaborador10
            11 -> R.drawable.colaborador11
            12 -> R.drawable.colaborador12
            13 -> R.drawable.colaborador13
            14 -> R.drawable.colaborador14
            15 -> R.drawable.colaborador16
            else -> R.drawable.colaborador1
        }
    }
}