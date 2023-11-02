package com.example.dotascreen.ui.dotascreen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.dotascreen.ui.theme.AppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun MainScreen() {

    ApplySystemBarColors()

    Surface(
        color = AppTheme.BgColors.BgColor,
        modifier = Modifier.fillMaxSize()
    ) {
        DotaScreen()
    }
}


@Composable
private fun ApplySystemBarColors() {
    val systemUiController = rememberSystemUiController()

    SideEffect {
        systemUiController.setStatusBarColor(color = Color.Transparent)
        systemUiController.setNavigationBarColor(color = Color.Transparent)
    }
}
