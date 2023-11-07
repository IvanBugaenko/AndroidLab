package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreen.R
import com.example.dotascreen.mock.MockObjects


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

//        item {
//            VideoPreview(
//                previewResList = listOf(
//                    R.drawable.gameplay1,
//                    R.drawable.gameplay2,
//                ), contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
//            )
//        }
    }
}

@Preview
@Composable
fun DotaScreenPreview() {
    DotaScreen()
}