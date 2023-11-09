package com.example.dotascreen.mock

import com.example.dotascreen.R
import com.example.dotascreen.data.Comment


object MockObjects {
    val chipTextList = listOf("MOBA", "MULTIPLAYER", "STRATEGY")
    val videoList = listOf(R.drawable.gameplay1, R.drawable.gameplay2)
    const val dotaRating = 4.9f
    val comments = listOf(
        Comment(
            R.drawable.person1, "Auguste Conte", "February 14, 2023",
            "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers."
        ),
        Comment(
            R.drawable.person2, "Jang Marcelino", "February 14, 2023",
            "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers."
        )
    )
}
