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
            context: Context,
            parentWidth: Int
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

            val w = Application.WIDTH * 0.75f

            val h = w * 0.75f

            cardView.cardElevation = h * 0.05f
            cardView.radius = h * 0.1f

            textViewName.text = "Load name..."
            textViewDate.text = "Load date..."

            cardView.addView(
                textViewName,
                w.toInt(),
                -2
            )

            cardView.addView(
                textViewDate,
                w.toInt(),
                -2
            )

            val params = FrameLayout.LayoutParams(
                w.toInt(),
                h.toInt()
            )

            params.topMargin = (
                w * 0.1f
            ).toInt()

            params.leftMargin = (
                (parentWidth - w) * 0.5f
            ).toInt()

            cardView.layoutParams = params

            return EventViewHolder(
                cardView
            )
        }
    }
}