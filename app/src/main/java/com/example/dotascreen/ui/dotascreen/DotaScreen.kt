package com.example.dotascreen.ui.dotascreen


import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreen.components.CommentBlock
import com.example.dotascreen.components.DotaDescription
import com.example.dotascreen.components.InstallButton
import com.example.dotascreen.components.RatingHeader
import com.example.dotascreen.components.RatingMain
import com.example.dotascreen.components.ScrollingChipsRow
import com.example.dotascreen.components.VideoPreviewRow
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
            ScrollingChipsRow(
                texts = MockObjects.chipTextList,
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        top = 16.dp
                    )
            )
        }
        item {
            DotaDescription(
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        top = 24.dp,
                        end = 24.dp
                    )
            )
        }
        item {
            VideoPreviewRow(
                videos = MockObjects.videoList,
                contentPadding = PaddingValues(
                    start = 24.dp,
                    top = 24.dp,
                    end = 24.dp
                )
            )
        }
        item {
            RatingHeader(
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        top = 24.dp,
                        end = 24.dp
                    )
            )
        }
        item {
            RatingMain(
                modifier = Modifier.padding(start = 24.dp))
        }
        itemsIndexed(MockObjects.comments) {
            index, comment -> CommentBlock(
                comment = comment,
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        top = 24.dp,
                        end = 24.dp
                    )
            )
            if (index < MockObjects.comments.lastIndex) {
                Divider(
                    color = AppTheme.BgColors.DividerBackgroundColor,
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(
                            top = 24.dp,
                            start = 38.dp,
                            end = 38.dp
                        )
                )
            }
        }
        item {
            InstallButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 40.dp,
                        bottom = 38.dp,
                    )
            ) {
                Toast.makeText(context, "CLICKED", Toast.LENGTH_LONG).show()
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
