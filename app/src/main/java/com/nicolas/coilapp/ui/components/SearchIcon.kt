package com.nicolas.coilapp.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun SearchIcon() {
    Canvas(
        modifier = Modifier.size(24.dp)
    ) {
        val center = Offset(size.width * 0.4f, size.height * 0.4f)
        val radius = size.minDimension * 0.25f

        // Draw magnifying glass circle
        drawCircle(
            color = Color(0xFFEF486E),
            radius = radius,
            center = center,
            style = Stroke(width = 3.dp.toPx())
        )

        // Draw handle
        drawLine(
            color = Color(0xFFEF486E),
            start = Offset(center.x + radius * 0.7f, center.y + radius * 0.7f),
            end = Offset(size.width * 0.8f, size.height * 0.8f),
            strokeWidth = 3.dp.toPx()
        )
    }
}