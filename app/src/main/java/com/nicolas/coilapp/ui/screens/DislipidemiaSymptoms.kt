package com.nicolas.coilapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.nicolas.coilapp.ui.components.Backwards

import com.nicolas.coilapp.model.DislipidemiaSymptomsFactor
import com.nicolas.coilapp.model.DislipidemiaSymptomsRepository
import com.nicolas.coilapp.viewmodel.AccessInfoViewModel
import kotlinx.coroutines.flow.collectLatest

@Composable
fun DislipidemiaSymptoms(
    modifier: Modifier = Modifier,
    navController: NavController,
    accessInfoViewModel: AccessInfoViewModel = viewModel(),
) {
    val repository = remember { DislipidemiaSymptomsRepository() }
    val symptomsFactors = remember { repository.getDislipidemiaSymptomps() }

    LaunchedEffect(key1 = Unit) {
        accessInfoViewModel.navigationEvents.collectLatest { destination ->
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
            onClick = { accessInfoViewModel.onDislipidemiaClick() }
        )

        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally // Centers content horizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(MaterialTheme.colorScheme.tertiary),
                contentAlignment = Alignment.Center
            ) {
                // This creates the pink header section
            }
            Text(
                text = "DISLIPIDEMIA",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                ),
                color = MaterialTheme.colorScheme.tertiary
            )
            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = "SÍNTOMAS",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 20.sp,
                ),
                color = MaterialTheme.colorScheme.onPrimary
            )

            Spacer(modifier = Modifier.width(8.dp))

            LazyColumn(
                modifier = modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    Text(
                        text = "Generalmente no causa síntomas en etapas tempranas; suele detectarse en análisis " +
                                "de sangre.\n\n" +
                                "" +
                                "Puede llevar al desarrollo de enfermedades cardiovasculares si no se trata.\n\n" +
                                "" +
                                "Signos y síntomas en casos avanzados o severos:",

                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontSize = 16.sp
                        ),
                        color = MaterialTheme.colorScheme.onPrimary,
                        modifier = Modifier.padding(horizontal = 16.dp),
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                    )
                }
                items(symptomsFactors) { factor ->
                    FactorCardsSymtoms(factor = factor)
                }
            }
        }
    }
}

@Composable
fun FactorCardsSymtoms(
    factor: DislipidemiaSymptomsFactor, modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondary
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Left side: Text content
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = factor.description,
                    style = MaterialTheme.typography.bodyMedium,
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            // Right side: Image in a container
            Card(
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onTertiary),
                modifier = Modifier.size(100.dp, 120.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = factor.icon), // Replace with your image resource
                        contentDescription = "Decorative elements",
                        modifier = modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop // or ContentScale.Fit depending on your needs
                    )
                }
            }
        }
    }
}
