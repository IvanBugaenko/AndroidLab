package com.example.dotascreen.components


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotascreen.R
import com.example.dotascreen.ui.theme.AppTheme


@Composable
fun DotaDescription(
    modifier: Modifier = Modifier
) {
    Text(
        text = stringResource(R.string.game_description),
        style = AppTheme.TextStyle.Regular_12_19,
        color = AppTheme.TextColors.DescriptionTextColor,
        modifier = modifier
    )
}

@Preview
@Composable
fun DotaDescriptionPreview() {
    DotaDescription()
}
