package com.nicolas.coilapp.model

import com.nicolas.coilapp.R

data class DislipidemiaRiskFactor(
    val id: Int,
    val title: String,
    val description: String,
    val icon: Int
)

class DislipidemiaRiskRepository  {
    fun getDislipedimiaRisks(): List<DislipidemiaRiskFactor> {
        return listOf(
            DislipidemiaRiskFactor(
                id = 1,
                title = "Inactividad física",
                description = "El sedentarismo reduce el colesterol bueno (HDL) y afecta la eliminacion de grasas.",
                icon = R.drawable.dislipidemia_risk_1
            ),

            DislipidemiaRiskFactor(
                id = 2,
                title = "Dieta no saludable",
                description = "Una alimentación rica en grasas saturadas y trans eleva el colesterol malo (LDL), mientras" +
                        "que el exceso de azúcares y harinas refinadas aumenta los triglicéridos. La falta de grasas saludables" +
                        "también contribuye a la disminución del colesterol bueno (HDL).",
                icon = R.drawable.dislipidemia_risk_2
            ),

            DislipidemiaRiskFactor(
                id = 3,
                title = "Obesidad",
                description = "Aumenta la producción de grasas dañinas y disminuye el colesterol bueno.",
                icon = R.drawable.dislipidemia_risk_3
            ),

            DislipidemiaRiskFactor(
                id = 4,
                title = "Diabetes",
                description = "Afecta el metabolismo de grasas, elevando triglicéridos y colesterol malo.",
                icon = R.drawable.dislipidemia_risk_4
            ),

            DislipidemiaRiskFactor(
                id = 5,
                title = "Hipotiroidismo",
                description = "Disminuye la capacidad del cuerpo para eliminar el colesterol malo.",
                icon = R.drawable.dislipidemia_risk_5
            ),

            DislipidemiaRiskFactor(
                id = 6,
                title = "Enfermedad renal crónica",
                description = "Afecta la eliminación de grasas y disminuye el HDL.",
                icon = R.drawable.dislipidemia_risk_6
            ),

            DislipidemiaRiskFactor(
                id = 7,
                title = "Enfermedad hepática",
                description = "Puede alterar la producción y eliminación de coresterol y triglicéridos.",
                icon = R.drawable.dislipidemia_risk_7
            ),

            DislipidemiaRiskFactor(
                id = 8,
                title = "Abuso de alcohol",
                description = "Aumenta la producción de triglicéridos en el hígado.",
                icon = R.drawable.dislipidemia_risk_8
            ),

            DislipidemiaRiskFactor(
                id = 9,
                title = "Tabaquismo",
                description = "Fumar reduce el colesterol bueno y favorece la inflamación.",
                icon = R.drawable.dislipidemia_risk_9
            ),

            DislipidemiaRiskFactor(
                id = 10,
                title = "Estrés crónico",
                description = "El estrés prolongado libera hormonas que sube el azúcar en sangre y" +
                        "favorecen la acumulación de grasa.",
                icon = R.drawable.dislipidemia_risk_10
            ),

            DislipidemiaRiskFactor(
                id = 11,
                title = "Uso de ciertos medicamentos",
                description = "Algunos fármacos como esteroides, anticonceptivos y otros pueden alterar " +
                        "los niveles de colesterol y triglicéridos.",
                icon = R.drawable.dislipidemia_risk_11
            ),
        )
    }


}


