package com.nicolas.coilapp.ui.theme

import androidx.compose.ui.graphics.Color

val Main = Color(0xFFFEE7AA)
val Secondary = Color(0xFFFEEFC6)
val Accent = Color(0xFFEF486E)
val SoftBlack = Color(0xFF333333)
val Grey = Color(0xFFC7C7C7)

// Light theme colors
val LightColorScheme = androidx.compose.material3.lightColorScheme(
    primary = Main,
    secondary = Secondary,
    tertiary = Accent,
    background = Color.White,
    surface = Color.White,
    onPrimary = SoftBlack,
    onSecondary = SoftBlack,
    onTertiary = Color.White,
    onBackground = SoftBlack,
    onSurface = SoftBlack,
    outline = Grey
)

// Dark theme colors (optional)
val DarkColorScheme = androidx.compose.material3.darkColorScheme(
    primary = Main,
    secondary = Secondary,
    tertiary = Accent,
    background = SoftBlack,
    surface = Color(0xFF1C1C1C),
    onPrimary = SoftBlack,
    onSecondary = SoftBlack,
    onTertiary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    outline = Grey
)