package com.example.dotascreen.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreen.mock.MockObjects
import com.example.dotascreen.ui.theme.AppTheme


@Composable
fun ScrollingChipsRow(
    texts: List<String>,
    modifier: Modifier = Modifier
) {
    val lazyListState = rememberLazyListState()
    LazyRow(
        state = lazyListState,
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier
    ) {
        items(texts) {
            text -> Chip(
                text = text,
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(AppTheme.BgColors.ChipBackgroundColor)
                    .padding(
                        horizontal = 10.dp,
                        vertical = 5.dp
                    )
            )
        }
    }
}

@Composable
fun Chip(
    text: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
    ) {
        Text(
            text = text,
            color = AppTheme.TextColors.ChipTextColor,
            style = AppTheme.TextStyle.Medium_10_12
        )
    }
}

@Preview
@Composable
fun ScrollingChipsRowPreview() {
    ScrollingChipsRow(MockObjects.chipTextList)
}
