package com.example.dotascreen.ui.dotascreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
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

//все вместе должно быть
@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier
) {
    HeaderBackground(
        painter = painterResource(R.drawable.dota_main),
        modifier = modifier
    ) {

    }
}

@Composable
private fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(modifier = modifier) {
        Column(
            verticalArrangement = Arrangement.spacedBy(-15.dp)
        ) {
            Image(painter = painter, contentDescription = "Preview of Dota 2", modifier = modifier.fillMaxSize().heightIn(300.dp, 350.dp), contentScale = ContentScale.Crop)
            DotaLogo()
        }
    }
}

@Preview
@Composable
private fun DotaLogo() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(17.dp),
        modifier = Modifier.padding(25.dp, 0.dp, 0.dp, 0.dp)
    ) {
        Box(modifier = Modifier
            .size(90.dp)
            .clip(RoundedCornerShape(17.dp))
            .border(1.dp, AppTheme.IconColors.BorderColor, shape = RoundedCornerShape(17.dp))
            .background(AppTheme.IconColors.IconBackgroundColor)
            .padding(17.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(R.drawable.logo), contentDescription = "Logo of Dota 2", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        }

        Column (verticalArrangement = Arrangement.spacedBy(7.dp),) {
            Text(text = stringResource(R.string.game_name), style = AppTheme.TextStyle.Bold_20, color = AppTheme.TextColors.HeaderTextColor)
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(7.dp)
            ) {
                Image(painter = painterResource(R.drawable.stars), contentDescription = "Rate of Dota 2", modifier = Modifier.height(12.dp).fillMaxHeight(), contentScale = ContentScale.Crop)
                Text(text = "70м", style = AppTheme.TextStyle.Regular_12, color = AppTheme.TextColors.DateTextColor)
            }
        }
    }
}
