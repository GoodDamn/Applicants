package com.example.shitproject.models

import android.graphics.drawable.Drawable

data class Event(
    val preview: Drawable?,
    val name: String,
    val date: String
)