package com.nicolas.coilapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nicolas.coilapp.R

@Composable
fun Backwards(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
    ) {
        Image(
            painter = painterResource(id = R.drawable.backwards), // Replace with your image resource
            contentDescription = "Decorative elements",
            modifier = modifier.width(40.dp)
                .height(40.dp),
            contentScale = ContentScale.Crop // or ContentScale.Fit depending on your needs
        )
    }
}