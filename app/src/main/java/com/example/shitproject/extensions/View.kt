package com.example.shitproject.extensions

import android.view.View
import android.widget.FrameLayout

fun View.bound(
    x: Float,
    y: Float,
    width: Int,
    height: Int
) {
    val params = FrameLayout.LayoutParams(
        width,
        height
    )

    params.leftMargin = x.toInt()
    params.topMargin = y.toInt()

    layoutParams = params
}