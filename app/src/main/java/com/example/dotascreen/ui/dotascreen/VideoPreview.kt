package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreen.mock.MockObjects
import com.example.dotascreen.ui.theme.AppTheme


@Composable
fun VideoPreviewRow(
    videos : List<Int>,
    modifier: Modifier = Modifier
) {
    val lazyListState = rememberLazyListState()
    LazyRow(
        state = lazyListState,
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        modifier = modifier.padding(start = 24.dp, top = 24.dp, bottom = 0.dp, end = 24.dp)
    ) {
        items(videos) {
                video -> Video(video)
        }
    }
}

@Composable
fun Video(
    video: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.size(240.dp, 128.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(video),
            contentDescription = "Gameplay video of Dota 2",
            contentScale = ContentScale.Crop,
            modifier = modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(12.dp))
        )
        PlayButton()
    }
}

@Composable
fun PlayButton(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(CircleShape)
            .blur(1.5.dp)
            .size(48.dp)
            .background(AppTheme.BgColors.PlayButtonBackgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Rounded.PlayArrow,
            contentDescription = "Play icon",
            tint = AppTheme.BgColors.PlayIconBackgroundColor
        )
    }
}

@Preview
@Composable
fun ScrollingVideoRowPreview() {
    VideoPreviewRow(MockObjects.VideoList)
}
