package com.example.dotascreen.components


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreen.R
import com.example.dotascreen.ui.theme.AppTheme


@Composable
fun InstallButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = AppTheme.BgColors.InstallButtonBackgroundColor,
            contentColor = AppTheme.TextColors.ButtonTextColor
        ),
        modifier = modifier
    ) {
        Text(
            text = stringResource(R.string.install_button),
            textAlign = TextAlign.Center,
            style = AppTheme.TextStyle.Bold_20,
            modifier = Modifier.padding(
                top = 8.dp,
                bottom = 8.dp,
            )
        )
    }
}

@Preview
@Composable
fun InstallButtonPreview() {
    InstallButton {

    }
}
