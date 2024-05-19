package com.example.shitproject.view_holder

import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.shitproject.Application

class EventViewHolder(
    view: View
): RecyclerView.ViewHolder(
    view
) {
    var date: String = "Date"
    var name: String = "Name"
    companion object {
        fun create(
            context: Context
        ): EventViewHolder {
            val cardView = CardView(
                context
            )

            val textViewName = TextView(
                context
            )

            val textViewDate = TextView(
                context
            )

            val w = Application.WIDTH * 0.5f

            val h = w * 0.5f

            cardView.cardElevation = h * 0.1f
            cardView.radius = h * 0.1f

            cardView.addView(
                textViewName,
                -1,
                -2
            )

            cardView.addView(
                textViewDate,
                -1,
                -2
            )

            val params = FrameLayout.LayoutParams(
                w.toInt(),
                h.toInt()
            )

            params.topMargin = (w * 0.1f)
                .toInt()

            cardView.layoutParams = params

            return EventViewHolder(
                cardView
            )
        }
    }
}