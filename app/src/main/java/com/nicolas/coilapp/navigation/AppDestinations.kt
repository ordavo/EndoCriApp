package com.nicolas.coilapp.navigation

import com.nicolas.coilapp.ui.screens.ColaboradoresScreen

/**
 * Sealed class to define all the navigation routes in the application.
 * This provides a type-safe way to define routes and their arguments.
 */
sealed class AppDestinations(val route: String) {
    // Defines the route for the Home Screen.
    object Home : AppDestinations("home_screen")

    // Defines the route for the Access Information Screen.
    object AccessInfo : AppDestinations("access_info_screen")

    // Defines the route for the Register Results Screen.
    object RegisterResults : AppDestinations("register_results_screen")

    // Defines the route for the Know My Progress Screen.
    object KnowMyProgress : AppDestinations("know_my_progress_screen")

    // Defines the route for the Diabetes Menu
    object Diabetes: AppDestinations("diabetes")

    // Defines the route for the Dislipidemia Menu
    object Dislipidemia : AppDestinations("dislipidemia")

    //Define the roite fot the colaboradore Menu
    object Colaboradores : AppDestinations("colaboradores_screen")

    // Routes risk symptoms recommendations
    object DiabetesRisks : AppDestinations("diabetes_risks")

    object DiabetesSymptoms : AppDestinations("diabetes_symptoms")

    object DiabetesRecommendations : AppDestinations("diabetes_recommendations")

    object DislipidemiaRisks : AppDestinations("dislipidemia_risks")

    object DislipidemiaSymptoms : AppDestinations("dislipidemia_symptoms")

    object DislipidemiaRecommendations : AppDestinations("dislipidemia_recommendations")


    // Add more destinations here as your app grows
    // Example with arguments:
    // object DetailScreen : AppDestinations("detail_screen/{itemId}") {
    //     fun createRoute(itemId: String) = "detail_screen/$itemId"
    // }
}