package com.nicolas.coilapp.model

import com.nicolas.coilapp.R

data class HealthFactor(
    val id: Int,
    val title: String,
    val description: String,
    val icon: Int
)

class DiabetesRiskRepository {
    fun getDiabetesRisks(): List<HealthFactor> {
        return listOf(
            HealthFactor(
                id = 1,
                title = "Antecedentes Familiares",
                description = "Tener familiares con diabetes aumenta el riesgo, debido a la genética y a los hábitos compartidos en casa.",
                icon = R.drawable.risk_1
            ),
            HealthFactor(
                id = 2,
                title = "Sobrepeso u obesidad",
                description = "El exceso de grasa corporal, especialmente en el abdomen, afecta la acción de la insulina",
                icon = R.drawable.risk_2
            ),
            HealthFactor(
                id = 3,
                title = "Acumulación de grasa en la cintura",
                description = "Tener forma corporal tipo \"manzana\" se asocia con mayor riesgo metabólico que el peso general.",
                icon = R.drawable.risk_3
            ),
            HealthFactor(
                id = 4,
                title = "Sedentarismo",
                description = "Pasar muchas horas sentado y hacer poca actividad física reduce la capacidad del cuerpo para usar el azúcar correctamente.",
                icon = R.drawable.risk_4
            ),
            HealthFactor(
                id = 5,
                title = "Fumar",
                description = "Fumar aumenta la inflamación en el cuerpo y afecta el metabolismo, aumentando el riesgo de diabetes.",
                icon = R.drawable.risk_5
            ),
            HealthFactor(
                id = 6,
                title = "Consumo excesivo de alcohol",
                description = "Tomar alcohol en exceso daña el hígado y puede causar aumento de grasa abdominal y azúcar en sangre.",
                icon = R.drawable.risk_6
            ),
            HealthFactor(
                id = 7,
                title = "Hipertensión",
                description = "Se relaciona con problemas en la regulación de la insulina y aumenta el riesgo de desarrollar diabetes.",
                icon = R.drawable.risk_7
            ),
            HealthFactor(
                id = 8,
                title = "Colesterol HDL bajo (colesterol “bueno”)",
                description = "Niveles bajos dificultan la eliminación del colesterol malo y se asocian con problemas metabólicos.",
                icon = R.drawable.risk_8
            ),
            HealthFactor(
                id = 9,
                title = "Triglicéridos elevados",
                description = "Altos niveles suelen estar relacionados con mala alimentación y obesidad, lo que aumenta el riesgo de diabetes.",
                icon = R.drawable.risk_9
            ),
            HealthFactor(
                id = 10,
                title = "Estrés crónico",
                description = "El estrés prolongado libera hormonas que suben el azúcar en sangre y favorecen la acumulación de grasa.",
                icon = R.drawable.risk_10
            ),
            HealthFactor(
                id = 11,
                title = "Mala alimentación",
                description = "El consumo frecuente de harinas refinadas, comida chatarra y alimentos procesados con conservantes altera el metabolismo, eleva el azúcar en sangre y favorece el aumento de peso, aumentando el riesgo de diabetes.",
                icon = R.drawable.risk_11
            ),
        )
    }

    fun getDiabetesSymptomps(): List<HealthFactor> {
       return listOf(
           HealthFactor(
               id = 1,
               title = "Aumento en la frecuencia de orinar",
               description = "",
               icon = R.drawable.diabetes_symp_1
           ),
           HealthFactor(
               id = 2,
               title = "Sed excesiva",
               description = "",
               icon = R.drawable.diabetes_symp_2
           ),
           HealthFactor(
               id = 3,
               title = "Fatiga",
               description = "",
               icon = R.drawable.diabetes_symp_3
           ),
           HealthFactor(
               id = 4,
               title = "Manchas osucras en la piel (acantosis nigricans)",
               description = "",
               icon = R.drawable.diabetes_symp_4
           ),
           HealthFactor(
               id = 5,
               title = "Visión borrosa",
               description = "",
               icon = R.drawable.diabetes_symp_5
           ),
           HealthFactor(
               id = 6,
               title = "Pérdida de peso sin causa aparente",
               description = "",
               icon = R.drawable.diabetes_symp_6
           ),
           HealthFactor(
               id = 7,
               title = "Infecciones recurrentes",
               description = "",
               icon = R.drawable.diabetes_symp_7
           ),
       )
    }

    fun getDiabetesRecommendations() : List<HealthFactor> {
        return listOf(
            HealthFactor(
                id = 1,
                title = "Realizar al menos 150 minutos de actividad física a la semana",
                description = "",
                icon = R.drawable.diabetes_recom_1
            ),
            HealthFactor(
                id = 2,
                title = "Seguir una dieta saludable, baja en grasas y enfocada en reducir calorias",
                description = "",
                icon = R.drawable.diabetes_recom_2
            ),
            HealthFactor(
                id = 3,
                title = "Bajar un 7% del peso corporal para reducir significativamente el riesgo de DM2",
                description = "",
                icon = R.drawable.risk_2
            ),
        )
    }
}