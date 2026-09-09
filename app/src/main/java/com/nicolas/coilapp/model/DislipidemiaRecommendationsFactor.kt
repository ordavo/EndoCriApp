package com.nicolas.coilapp.model

import com.nicolas.coilapp.R

data class DislipidemiaRecommendationsFactor(
    val id: Int,
    val description: String,
    val icon: Int
)

class DislipidemiaRecommendationsRepository  {
    fun getDislipidemiaRecommendations(): List<DislipidemiaRecommendationsFactor> {
        return listOf(
            DislipidemiaRecommendationsFactor(
                id = 1,
                description = "Seguir una dieta saludable que limite las grasas saturadas y trans," +
                        "evitando comidas fritas y carnes rojas.",
                icon = R.drawable.dislipidemia_recommendations_1
            ),
            DislipidemiaRecommendationsFactor(
                id = 2,
                description = "Consumir frutas, verduras, granos integrales, pollo, pescado, nueces" +
                        "y aceites vegetales.",
                icon = R.drawable.dislipidemia_recommendations_2
            ),
            DislipidemiaRecommendationsFactor(
                id = 3,
                description = "Realizar actividad física aeróbica de intensidad moderada, al menos" +
                        "150 minutos a la semana.",
                icon = R.drawable.dislipidemia_recommendations_3
            ),
            DislipidemiaRecommendationsFactor(
                id = 4,
                description = "Perder peso para reducirlos niveles de colesterol y triglicéridos.",
                icon = R.drawable.dislipidemia_recommendations_4
            ),
            DislipidemiaRecommendationsFactor(
                id = 5,
                description = "Dejar de fumar puede mejorar los niveles de HDL y reducir los " +
                        "triglicéridos.",
                icon = R.drawable.dislipidemia_recommendations_5
            ),
        )
    }
}
