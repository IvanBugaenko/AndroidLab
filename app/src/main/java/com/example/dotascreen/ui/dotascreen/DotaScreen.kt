package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreen.R
import com.example.dotascreen.mock.MockObjects
import com.example.dotascreen.ui.theme.AppTheme


@Composable
fun DotaScreen() {

    val context = LocalContext.current
    val lazyListState = rememberLazyListState()

    LazyColumn(
        state = lazyListState,
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            DotaScreenHeader()
        }
        item {
            ScrollingChipsRow(MockObjects.ChipTextList)
        }
        item {
            DotaDescription()
        }
        item {
            VideoPreviewRow(MockObjects.VideoList)
        }
        item {
            RatingHeader()
        }
        item {
            RatingMain()
        }
        item {
            InstallButton() {

            }
        }
    }
}

@Preview
@Composable
fun DotaScreenPreview() {
    Surface(
        color = AppTheme.BgColors.BgColor,
    ) {
        DotaScreen()
    }
}