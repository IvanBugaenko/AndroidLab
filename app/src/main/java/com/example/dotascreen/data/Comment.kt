package com.example.dotascreen.data


import androidx.annotation.DrawableRes


data class Comment (
    @DrawableRes val photo: Int, val name: String,
    val date: String, val message: String
)
