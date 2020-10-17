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

private val background = Color(0xff000000)
private val mainCard = Color(0xffF5F5FD)
private val hint = Color(0xffABAFB8)
private val shadowButtons = Color(0xffF7F7F7)
private val stars = Color(0xffFDE61C)
private val bottomToggle = Color(0xffDFE1F0)


private val ColorPallete = darkColors(
    background = background,
    primary = mainCard,
    secondary = hint,
    error = stars,
    primaryVariant = shadowButtons,
    surface = bottomToggle
)

@Composable
fun ServiceAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit){
    val colors = ColorPallete

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}