package com.example.shitproject.models

import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable

data class EventModel(
    val preview: Drawable?,
    val name: String,
    val date: String
)