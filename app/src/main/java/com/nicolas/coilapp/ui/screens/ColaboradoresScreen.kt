package com.nicolas.coilapp.ui.screens

import com.nicolas.coilapp.model.Colaborador
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.runtime.remember
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.nicolas.coilapp.viewmodel.ColaboradoresViewModel
import com.nicolas.coilapp.ui.screens.ColaboradoresRepository
import kotlinx.coroutines.flow.collectLatest
import com.nicolas.coilapp.ui.components.MenuButton
import com.nicolas.coilapp.ui.components.SearchIcon
import com.nicolas.coilapp.ui.components.DecorativeImage
import com.nicolas.coilapp.ui.components.Backwards
import com.nicolas.coilapp.R // Importa tus recursos

@Composable
fun ColaboradoresScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    colaboradoresViewModel: ColaboradoresViewModel = viewModel()
) {
    val repository = remember { ColaboradoresRepository() }
    val colaboradores = remember { repository.getColaboradores() }

    LaunchedEffect(key1 = Unit) {
        colaboradoresViewModel.navigationEvents.collectLatest { destination ->
            navController.navigate(destination.route)
        }
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Backwards(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 60.dp),
            onClick = { colaboradoresViewModel.onBackClick() }
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(MaterialTheme.colorScheme.tertiary),
                contentAlignment = Alignment.Center
            ) {}

            Text(
                text = "EQUIPO DE COLABORADORES",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                ),
                color = MaterialTheme.colorScheme.tertiary,
                modifier = Modifier.padding(top = 16.dp)
            )

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(colaboradores.size) { index ->
                    val colaborador = colaboradores[index]
                    ColaboradorCard(colaborador = colaborador)
                }
            }

            }
    }
}

@Composable
fun ColaboradorCard(
    colaborador: Colaborador,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondary
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = colaborador.nombre,
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Card(
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.size(100.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onTertiary)
            ) {
                Image(
                    painter = painterResource(id = colaborador.imagenResId),
                    contentDescription = "Imagen de ${colaborador.nombre}",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}


