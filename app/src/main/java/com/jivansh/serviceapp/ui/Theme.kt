package com.jivansh.serviceapp.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScopeMarker

private val DarkColorPalette = darkColors(
        primary = purple200,
        primaryVariant = purple700,
        secondary = teal200
)

private val LightColorPalette = lightColors(
        primary = purple500,
        primaryVariant = purple700,
        secondary = teal200

        /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

private val ColorPalette = darkColors(
    background = black700,
    primary = white200,
    secondary = grey200,
    error = yellow700,
    primaryVariant = grey300,
    surface = grey400
)

@Composable
fun ServiceAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit){
    MaterialTheme(
        colors = ColorPalette,
        typography = typography,
        shapes = ServiceAppShapes,
        content = content
    )
}