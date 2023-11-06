package com.example.dotascreen.ui.dotascreen


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.dotascreen.ui.theme.AppTheme


@Composable
fun MainScreen() {
    Surface(
        color = AppTheme.BgColors.BgColor,
        modifier = Modifier.fillMaxSize()
    ) {
        DotaScreen()
    }
}
