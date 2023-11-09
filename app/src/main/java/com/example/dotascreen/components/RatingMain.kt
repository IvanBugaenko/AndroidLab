package com.example.dotascreen.components


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
        modifier = modifier,
    ) {
        Row {
            Box {
                Text(
                    text = MockObjects.dotaRating.toString(),
                    color = AppTheme.TextColors.HeaderTextColor,
                    style = AppTheme.TextStyle.Bold_48
                )
            }
            Column(
                modifier = Modifier.padding(start = 16.dp, top = 17.dp)
            ) {
                RatingRow(rating = MockObjects.dotaRating, maxRating = 5)
                Text(
                    text = stringResource(R.string.number_of_reviews),
                    color = AppTheme.TextColors.DescriptionTextColor,
                    style = AppTheme.TextStyle.Regular_12,
                    modifier = Modifier.padding(top = 6.dp)
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
