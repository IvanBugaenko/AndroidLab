package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreen.R
import com.example.dotascreen.mock.MockObjects
import com.example.dotascreen.ui.theme.AppTheme

@Composable
fun RatingMain(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .padding(start = 24.dp),
    ) {
        Row {
            Box {
                Text(
                    text = MockObjects.DotaRating.toString(),
                    color = AppTheme.TextColors.HeaderTextColor,
                    style = AppTheme.TextStyle.Bold_48
                )
            }
            Column(
                modifier = modifier.padding(start = 16.dp, top = 17.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.stars),
                    contentDescription = "Rate of Dota 2",
                    modifier = modifier
                        .height(12.dp)
                        .fillMaxHeight(),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = stringResource(R.string.number_of_reviews),
                    color = AppTheme.TextColors.DescriptionTextColor,
                    style = AppTheme.TextStyle.Regular_12,
                    modifier = modifier.padding(top = 6.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun RatingMainPreview() {
    RatingMain()
}