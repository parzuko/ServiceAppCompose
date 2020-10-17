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

@Composable
fun DefaultServiceAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
            colors = colors,
            typography = typography,
            shapes = shapes,
            content = content
    )
}

private val black700 = Color(0xff000000)
private val white200 = Color(0xffF5F5FD)
private val grey200 = Color(0xffABAFB8)
private val grey300 = Color(0xffF7F7F7)
private val yellow700 = Color(0xffFDE61C)
private val grey400 = Color(0xffDFE1F0)


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
        shapes = shapes,
        content = content
    )
}