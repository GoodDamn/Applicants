package com.example.shitproject.view_holder

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.util.Log
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.shitproject.Application
import com.example.shitproject.activities.details.EventDetailsActivity
import com.example.shitproject.extensions.bound

class EventViewHolder(
    view: CardView,
    private val mImageViewPreview: ImageView,
    private val mTextViewName: TextView,
    private val mTextViewDate: TextView
): RecyclerView.ViewHolder(
    view
) {
    var date: String = "Date"
        set(v) {
            mTextViewDate.text = v
            field = v
        }

    var name: String = "Name"
        set(v) {
            mTextViewName.text = v
            field = v
        }

    var image: Drawable? = null
        set(v) {
            Log.d(TAG, "image: $image")
            mImageViewPreview.setImageDrawable(
                v
            )
            field = v
        }

    companion object {
        private const val TAG = "EventViewHolder"
        fun create(
            context: Context,
            parentWidth: Int
        ): EventViewHolder {
            val cardView = CardView(
                context
            )

            val imageViewPreview = ImageView(
                context
            )

            val backTextView = View(
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

            textViewDate.gravity = Gravity
                .CENTER_HORIZONTAL

            textViewDate.setTextSize(
                TypedValue.COMPLEX_UNIT_PX,
                h * 0.05f
            )

            backTextView.setBackgroundColor(
                0x99ffffff.toInt()
            )

            cardView.addView(
                imageViewPreview,
                -1,
                -1
            )

            backTextView.bound(
                0f,
                h * 0.5f,
                -1,
                -1
            )

            textViewName.bound(
                w * 0.1f,
                h * 0.6f,
                -1,
                -1
            )

            textViewDate.bound(
                0f,
                h - textViewDate.textSize,
                -1,
                textViewDate.textSize.toInt()
            )

            cardView.addView(
                backTextView
            )

            cardView.addView(
                textViewName
            )

            cardView.addView(
                textViewDate
            )

            cardView.bound(
                (parentWidth - w) * 0.5f,
                w * 0.1f,
                w.toInt(),
                h.toInt()
            )

            cardView.setOnClickListener {
                context.startActivity(
                    Intent(
                        context,
                        EventDetailsActivity::class.java
                    )
                )
            }

            return EventViewHolder(
                cardView,
                imageViewPreview,
                textViewName,
                textViewDate
            )
        }
    }
}