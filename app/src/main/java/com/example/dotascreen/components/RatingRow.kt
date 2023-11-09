package com.example.dotascreen.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.math.floor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreen.R


@Composable
fun RatingRow(
    rating: Float,
    maxRating: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        val star_int = floor(rating).toInt()
        for (i in 1..maxRating) {
            if (i <= star_int) {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.star),
                    contentDescription = "Integer star",
                    tint = Color.Unspecified,
                    modifier = Modifier.padding(end = 4.dp)
                )
            }
            else if (i == star_int + 1) {
                if (rating - star_int == 0f) {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.empty_star),
                        contentDescription = "Empty star",
                        tint = Color.Unspecified,
                        modifier = Modifier.padding(end = 4.dp)
                    )
                }
                else {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.half_star),
                        contentDescription = "Half star",
                        tint = Color.Unspecified,
                        modifier = Modifier.padding(end = 4.dp)
                    )
                }
            }
            else {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.empty_star),
                    contentDescription = "Empty star",
                    tint = Color.Unspecified,
                    modifier = Modifier.padding(end = 4.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun RatingRowPreview() {
    RatingRow(
        2.6f, 5
    )
}
