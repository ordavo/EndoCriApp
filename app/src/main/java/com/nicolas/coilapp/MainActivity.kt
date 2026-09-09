package com.nicolas.coilapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nicolas.coilapp.navigation.AppDestinations
import com.nicolas.coilapp.ui.theme.CoilappTheme
import com.nicolas.coilapp.ui.screens.HomeScreen
import com.nicolas.coilapp.ui.screens.AccessInfoScreen
import com.nicolas.coilapp.ui.screens.RegisterResultsScreen
import com.nicolas.coilapp.ui.screens.KnowMyProgressScreen
import com.nicolas.coilapp.ui.screens.Diabetes
import com.nicolas.coilapp.ui.screens.Dislipidemia
import com.nicolas.coilapp.ui.screens.DiabetesRisks
import com.nicolas.coilapp.ui.screens.DiabetesSymptoms
import com.nicolas.coilapp.ui.screens.DiabetesRecommendations
import com.nicolas.coilapp.ui.screens.DislipidemiaRisk
import com.nicolas.coilapp.ui.screens.DislipidemiaSymptoms
import com.nicolas.coilapp.ui.screens.DislipidemiaRecommendations
import com.nicolas.coilapp.ui.screens.ColaboradoresScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoilappTheme {
                val navController = rememberNavController() // Create a NavController
                val noAnimationSpec = tween<Float>(durationMillis = 0)
                NavHost(
                    navController = navController,
                    startDestination = AppDestinations.Home.route
                ) {
                    composable(
                        AppDestinations.Home.route,
                        enterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        exitTransition = { fadeOut(animationSpec = noAnimationSpec) },
                        popEnterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        popExitTransition = { fadeOut(animationSpec = noAnimationSpec) }
                    ) {
                        HomeScreen(navController = navController)
                    }

                    composable(
                        AppDestinations.AccessInfo.route,
                        enterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        exitTransition = { fadeOut(animationSpec = noAnimationSpec) },
                        popEnterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        popExitTransition = { fadeOut(animationSpec = noAnimationSpec) }
                    ) {
                        AccessInfoScreen(navController = navController)
                    }

                    composable(
                        AppDestinations.RegisterResults.route,
                        enterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        exitTransition = { fadeOut(animationSpec = noAnimationSpec) },
                        popEnterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        popExitTransition = { fadeOut(animationSpec = noAnimationSpec) }
                    ) {
                        RegisterResultsScreen()
                    }

                    composable(
                        AppDestinations.KnowMyProgress.route,
                        enterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        exitTransition = { fadeOut(animationSpec = noAnimationSpec) },
                        popEnterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        popExitTransition = { fadeOut(animationSpec = noAnimationSpec) }
                    ) {
                        KnowMyProgressScreen()
                    }

                    composable(AppDestinations.Colaboradores.route) {
                        ColaboradoresScreen(navController = navController)
                    }


                    composable(
                        AppDestinations.Diabetes.route,
                        enterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        exitTransition = { fadeOut(animationSpec = noAnimationSpec) },
                        popEnterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        popExitTransition = { fadeOut(animationSpec = noAnimationSpec) }
                    ) {
                        Diabetes(navController = navController)
                    }

                    composable(
                        AppDestinations.Dislipidemia.route,
                        enterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        exitTransition = { fadeOut(animationSpec = noAnimationSpec) },
                        popEnterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        popExitTransition = { fadeOut(animationSpec = noAnimationSpec) }
                    ) {
                        Dislipidemia(navController = navController)
                    }

                    composable(
                        AppDestinations.DiabetesRisks.route,
                        enterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        exitTransition = { fadeOut(animationSpec = noAnimationSpec) },
                        popEnterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        popExitTransition = { fadeOut(animationSpec = noAnimationSpec) }
                    ) {
                        DiabetesRisks(navController = navController)
                    }

                    composable(
                        AppDestinations.DiabetesSymptoms.route,
                        enterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        exitTransition = { fadeOut(animationSpec = noAnimationSpec) },
                        popEnterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        popExitTransition = { fadeOut(animationSpec = noAnimationSpec) }
                    ) {
                        DiabetesSymptoms(navController = navController)
                    }

                    composable(
                        AppDestinations.DiabetesRecommendations.route,
                        enterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        exitTransition = { fadeOut(animationSpec = noAnimationSpec) },
                        popEnterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        popExitTransition = { fadeOut(animationSpec = noAnimationSpec) }
                    ) {
                        DiabetesRecommendations(navController = navController)
                    }

                    composable(
                        AppDestinations.DislipidemiaRisks.route,
                        enterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        exitTransition = { fadeOut(animationSpec = noAnimationSpec) },
                        popEnterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        popExitTransition = { fadeOut(animationSpec = noAnimationSpec) }
                    ) {
                        DislipidemiaRisk(navController = navController)
                    }

                    composable(
                        AppDestinations.DislipidemiaSymptoms.route,
                        enterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        exitTransition = { fadeOut(animationSpec = noAnimationSpec) },
                        popEnterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        popExitTransition = { fadeOut(animationSpec = noAnimationSpec) }
                    ) {
                        DislipidemiaSymptoms(navController = navController)
                    }

                    composable(
                        AppDestinations.DislipidemiaRecommendations.route,
                        enterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        exitTransition = { fadeOut(animationSpec = noAnimationSpec) },
                        popEnterTransition = { fadeIn(animationSpec = noAnimationSpec) },
                        popExitTransition = { fadeOut(animationSpec = noAnimationSpec) }
                    ) {
                        DislipidemiaRecommendations(navController = navController)
                    }

                }
            }
        }
    }
}



