package com.example.dotascreen.components


import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotascreen.R
import com.example.dotascreen.ui.theme.AppTheme


@Composable
fun RatingHeader(modifier: Modifier = Modifier) {
    Box (
        modifier = modifier
    ) {
        Text(
            text = stringResource(R.string.rating_header),
            color = AppTheme.TextColors.HeaderTextColor,
            style = AppTheme.TextStyle.Bold_16
        )
    }
}

@Preview
@Composable
fun RatingHeaderPreview() {
    RatingHeader()
}
