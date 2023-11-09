package com.example.dotascreen.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
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
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier
) {
    val lazyListState = rememberLazyListState()
    LazyRow(
        state = lazyListState,
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        modifier = modifier,
        contentPadding = contentPadding
    ) {
        items(videos) {
            video -> Video(
                video = video,
                modifier = Modifier.size(240.dp, 128.dp)
            )
        }
    }
}

@Composable
fun Video(
    video: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(video),
            contentDescription = "Gameplay video of Dota 2",
            contentScale = ContentScale.Crop,
            modifier = Modifier
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
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .blur(1.5.dp)
                .size(48.dp)
                .background(AppTheme.BgColors.PlayButtonBackgroundColor)
        )
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
    VideoPreviewRow(
        videos = MockObjects.videoList,
        contentPadding = PaddingValues(
            start = 24.dp,
            end = 24.dp
        )
    )
}
