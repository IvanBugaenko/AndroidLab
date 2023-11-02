package com.example.dotascreen.ui.theme


import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color


object AppTheme {
    object BgColors {
        val BgColor
            @Composable
            get() = Color(0xFF050B18)
    }

    object ButtonColors {
        val ButtonColor
            @Composable
            get() = Color(0xFFF4D144)
    }

    object TextColors {
        val ButtonTextColor
            @Composable
            get() = Color(0xFF050B18)
        val DescriptionTextColor
            @Composable
            get() = Color(0xB2EEF2FB)
        val HeaderTextColor
            @Composable
            get() = Color.White
        val DateTextColor
            @Composable
            get() = Color(0x66FFFFFF)
        val CommentTextColor
            @Composable
            get() = Color(0xFFA8ADB7)
        val GameCategoryTextColor
            @Composable
            get() = Color(0xFF41A0E7)
    }

    object TextStyle {
        val Bold_48
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 48.sp
                )
        val Bold_20
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
        val Bold_16
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
        val Regular_12
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp
                )
        val Regular_16
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
        val Regular_10
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 10.sp
                )
    }
}