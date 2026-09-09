package com.nicolas.coilapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.nicolas.coilapp.model.DiabetesRiskRepository
import com.nicolas.coilapp.ui.components.Backwards
import com.nicolas.coilapp.ui.components.FactorCard
import com.nicolas.coilapp.viewmodel.AccessInfoViewModel
import kotlinx.coroutines.flow.collectLatest

@Composable
fun DiabetesSymptoms(
    modifier: Modifier = Modifier,
    navController: NavController,
    accessInfoViewModel: AccessInfoViewModel = viewModel(),
) {

    LaunchedEffect(key1 = Unit) {
        accessInfoViewModel.navigationEvents.collectLatest { destination ->
            navController.navigate(destination.route)
        }
    }

    val repository = remember { DiabetesRiskRepository() }
    val symptomps = remember { repository.getDiabetesSymptomps() }

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
            onClick = { accessInfoViewModel.onDiabetesClick() }
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
                text = "DIABETES TIPO 2",
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
                items(symptomps) { factor ->
                    FactorCard(factor = factor)
                }
            }
        }
    }
}