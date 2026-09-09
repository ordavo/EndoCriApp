package com.nicolas.coilapp.model

import com.nicolas.coilapp.R

data class DislipidemiaSymptomsFactor(
    val id: Int,
    val description: String,
    val icon: Int
)

class DislipidemiaSymptomsRepository  {
    fun getDislipidemiaSymptomps(): List<DislipidemiaSymptomsFactor> {
        return listOf(
            DislipidemiaSymptomsFactor(
                id = 1,
                description = "Bultos amarillos de grasa en la piel, especialmente en los párpados, " +
                        "manos o tendones",
                icon = R.drawable.dislipidemia_symptoms_1
            ),

            DislipidemiaSymptomsFactor(
                id = 2,
                description = "Puede llevar al desarrollo de enfermedades cardiovasculares si no se " +
                        "trata.",
                icon = R.drawable.dislipidemia_symptoms_2
            ),

            DislipidemiaSymptomsFactor(
                id = 3,
                description = "Anillo blanco o gris al rededor del iris del ojo, señald e colesterol " +
                        "alto",
                icon = R.drawable.dislipidemia_symptoms_3
            ),

            DislipidemiaSymptomsFactor(
                id = 4,
                description = "Vasos del ojo con apariencia lechosa, que puden causar visión borrosa " +
                        "por triglicéridos muy altos.",
                icon = R.drawable.dislipidemia_symptoms_4
            ),

            DislipidemiaSymptomsFactor(
                id = 5,
                description = "Dolor o calambres en las piernas al caminar, por mala circulación.",
                icon = R.drawable.dislipidemia_symptoms_5
            ),

            DislipidemiaSymptomsFactor(
                id = 6,
                description = "Dolor en el pecho al hacer esfuerzo, por arterias del corazón obstruidas.",
                icon = R.drawable.dislipidemia_symptoms_6
            ),

            DislipidemiaSymptomsFactor(
                id = 7,
                description = "Debilidad repentina, dificultad para hablar o ver, señales de posible " +
                        "problema en el cerebro por mala circulación.",
                icon = R.drawable.dislipidemia_symptoms_7
            ),
        )
    }
}