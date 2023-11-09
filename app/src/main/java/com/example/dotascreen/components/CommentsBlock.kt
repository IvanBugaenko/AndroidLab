package com.example.dotascreen.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreen.R
import com.example.dotascreen.data.Comment
import com.example.dotascreen.ui.theme.AppTheme


@Composable
fun CommentBlock(
    comment: Comment,
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier
    ) {
        Row {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(36.dp)
            ) {
                Image(
                    painter = painterResource(comment.photo),
                    contentDescription = "User photo",
                    contentScale = ContentScale.Crop,
                )
            }
            Column(
                modifier = Modifier.padding(start = 16.dp)
            ) {
                Text(
                    text = comment.name,
                    style = AppTheme.TextStyle.Regular_16,
                    color = AppTheme.TextColors.HeaderTextColor
                )
                Text(
                    text = comment.date,
                    style = AppTheme.TextStyle.Regular_12_19,
                    color = AppTheme.TextColors.DateTextColor
                )
            }
        }
        Text(
            text = "\"${comment.message}\"",
            style = AppTheme.TextStyle.Regular_12_20,
            color = AppTheme.TextColors.CommentTextColor,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}

@Preview
@Composable
fun CommentBlockPreview(
) {
    CommentBlock(
        Comment(
            photo = R.drawable.person1, name = "Auguste Conte", date = "February 14, 2023",
            message = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers."
        )
    )
}
