package com.example.dotascreen.ui.theme


import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.style.LineHeightStyle


object AppTheme {

    object BgColors {
        val BgColor
            @Composable
            get() = Color(0xFF050B18)
        val IconBackgroundColor
            @Composable
            get() = Color.Black
        val ButtonColor
            @Composable
            get() = Color(0xFFF4D144)
    }

    object IconColors {
        val BorderColor
            @Composable
            get() = Color(0xFF1F2430)
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
                    fontSize = 48.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
        val Bold_20
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
        val Bold_16
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )

        val Regular_12_19
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
        val Regular_12_20
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 20.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
        val Regular_12
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
        val Regular_16
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
        val Regular_10
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 10.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )

        val Medium_10_12
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 10.sp,
                    lineHeight = 12.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
    }
}