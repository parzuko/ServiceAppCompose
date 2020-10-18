package com.jivansh.serviceapp.ui

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.unit.sp
import com.jivansh.serviceapp.R

// Set of Material typography styles to start with
val typography = Typography(
        body1 = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
        )
        /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)
private val OpenSans = fontFamily(
        font(R.font.opensans_regular),
        font(R.font.opensans_semi, FontWeight.W500),
        font(R.font.opensans_bold, FontWeight.W600)
)

val ServiceTypography = Typography(
        h1 = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.W700,
                fontSize = 42.sp
        ),
        h2 = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.W700,
                fontSize = 38.sp
        ),
        h3 = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.W600,
                fontSize = 34.sp
        ),
        h4 = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.W600,
                fontSize = 30.sp
        ),
        h5 = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.W600,
                fontSize = 24.sp
        ),
        h6 = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.Normal,
                fontSize = 20.sp
        ),
        subtitle1 = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.W600,
                fontSize = 16.sp
        ),
        subtitle2 = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.W500,
                fontSize = 14.sp
        ),
        body1 = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
        ),
        body2 = TextStyle(
                fontFamily = OpenSans,
                fontSize = 14.sp
        ),
        button = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp
        ),
        caption = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp
        ),
        overline = TextStyle(
                fontFamily = OpenSans,
                fontWeight = FontWeight.W500,
                fontSize = 12.sp
        )
)