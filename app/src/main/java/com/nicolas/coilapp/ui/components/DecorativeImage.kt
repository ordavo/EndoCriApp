package com.nicolas.coilapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nicolas.coilapp.R

@Composable
fun DecorativeImage (
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = R.drawable.home_decoration), // Replace with your image resource
        contentDescription = "Decorative elements",
        modifier = modifier.fillMaxWidth()
            .height(200.dp),
        contentScale = ContentScale.Crop // or ContentScale.Fit depending on your needs
    )
}