package com.example.jetpackcomposeassignment1.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Purple500,
    onPrimary = White,
    background = Color(0xFFF2F2F2),
    onBackground = Black,
    surface = White,
    onSurface = Black,
)

private val DarkColors = darkColorScheme(
    primary = Purple200,
    onPrimary = Black,
    background = Color(0xFF121212),
    onBackground = White,
    surface = Color(0xFF1E1E1E),
    onSurface = White,
)

@Composable
fun JetpackComposeAssignment1Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}
