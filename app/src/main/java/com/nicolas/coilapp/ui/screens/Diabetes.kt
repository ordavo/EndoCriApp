package com.nicolas.coilapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nicolas.coilapp.viewmodel.DiabetesViewModel
import kotlinx.coroutines.flow.collectLatest
import com.nicolas.coilapp.ui.components.MenuButton
import com.nicolas.coilapp.ui.components.SearchIcon
import com.nicolas.coilapp.ui.components.DecorativeImage
import com.nicolas.coilapp.ui.components.Backwards
import com.nicolas.coilapp.ui.theme.CoilappTheme

@Composable
fun Diabetes(
    navController: NavController,
    diabetesViewModel: DiabetesViewModel = viewModel(),
    modifier: Modifier = Modifier
) {
    LaunchedEffect(key1 = Unit) {
        diabetesViewModel.navigationEvents.collectLatest { destination ->
            navController.navigate(destination.route)
        }
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Backwards(
            modifier = Modifier.align(Alignment.TopStart)
                .padding(
                    top = 60.dp,
                ),
            onClick = { diabetesViewModel.onBackClick() }
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Top pink/accent section
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(MaterialTheme.colorScheme.tertiary),
                contentAlignment = Alignment.Center
            ) {
                // This creates the pink header section
            }

            // Main content area
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(60.dp))

                // App Title with Search Icon
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "DIABETES TIPO 2",
                        style = MaterialTheme.typography.headlineMedium.copy(
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        color = MaterialTheme.colorScheme.tertiary
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }

                Spacer(modifier = Modifier.height(80.dp))

                // Menu Buttons
                MenuButton(
                    text = "Factores de riesgo",
                    onClick = { diabetesViewModel.onDiabetesRisksClick() }
                )

                Spacer(modifier = Modifier.height(16.dp))

                MenuButton(
                    text = "Síntomas",
                    onClick = { diabetesViewModel.onDiabetesSymptomsClick() }
                )

                Spacer(modifier = Modifier.height(16.dp))

                MenuButton(
                    text = "Recomendaciones",
                    onClick = { diabetesViewModel.onDiabetesRecommendations() }
                )

                Spacer(modifier = Modifier.weight(1f))

                // Footer text
                Text(
                    text = "Equipo 2 - ITESM - UCC",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.8f),
                    textAlign = TextAlign.Center
                )

                Text(
                    text = "Versión 1.0",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.6f),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(300.dp))
            }
        }

        // Decorative circles at the bottom
        DecorativeImage(
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}