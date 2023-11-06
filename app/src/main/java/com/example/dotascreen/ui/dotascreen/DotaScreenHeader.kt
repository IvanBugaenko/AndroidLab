package com.example.dotascreen.ui.dotascreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreen.R
import com.example.dotascreen.ui.theme.AppTheme


@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier
) {
    HeaderBackground(
        painter = painterResource(R.drawable.dota_main),
        modifier = modifier
    ) {
        Box(
            modifier = modifier.padding(start = 24.dp, top = 274.dp)
        ) {
            Row {
                DotaLogo()
                Column(modifier = modifier.padding(start = 12.dp, top = 34.dp)) {
                    Text(
                        text = stringResource(R.string.game_name),
                        style = AppTheme.TextStyle.Bold_20,
                        color = AppTheme.TextColors.HeaderTextColor
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = modifier.padding(top = 6.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.stars),
                            contentDescription = "Rate of Dota 2",
                            modifier = modifier
                                .padding(end = 10.dp)
                                .height(12.dp)
                                .fillMaxHeight(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = stringResource(R.string.number_of_ratings), style = AppTheme.TextStyle.Regular_12, color = AppTheme.TextColors.DateTextColor)
                    }
                }
            }
        }
    }
}

@Composable
private fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(modifier = modifier) {
        Image(
            painter = painter,
            contentDescription = "Preview of Dota 2",
            modifier = modifier
                .fillMaxSize()
                .height(294.dp),
            contentScale = ContentScale.Crop
        )
        content()
    }
}

@Composable
private fun DotaLogo(modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .size(88.dp)
        .clip(RoundedCornerShape(12.dp))
        .border(2.dp, AppTheme.IconColors.BorderColor, shape = RoundedCornerShape(12.dp))
        .background(AppTheme.BgColors.IconBackgroundColor)
        .padding(17.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(painter = painterResource(R.drawable.logo), contentDescription = "Logo of Dota 2", modifier = modifier.fillMaxSize(), contentScale = ContentScale.Crop)
    }
}

@Preview
@Composable
fun DotaLogoPreview() {
    DotaLogo()
}
