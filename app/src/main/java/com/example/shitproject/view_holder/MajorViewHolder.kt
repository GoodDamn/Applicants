package com.example.shitproject.view_holder

import android.content.Context
import android.content.Intent
import android.util.TypedValue
import android.view.Gravity
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.shitproject.Application
import com.example.shitproject.Roles
import com.example.shitproject.activities.details.major.MajorDetailsActivity
import com.example.shitproject.activities.details.major.MajorEditActivity
import com.example.shitproject.extensions.bound

class MajorViewHolder(
    view: CardView,
    private val mTextViewName: TextView
): RecyclerView.ViewHolder(
    view
) {
    var name: String = "Name"
        set(v) {
            mTextViewName.text = v
            field = v
        }

    companion object {
        fun create(
            context: Context,
            parentWidth: Int
        ): MajorViewHolder {

            val cardView = CardView(
                context
            )

            val textViewName = TextView(
                context
            )

            val w = parentWidth * 0.75f
            val h = w * 0.2f

            textViewName.setTextSize(
                TypedValue.COMPLEX_UNIT_PX,
                h * 0.4f
            )

            textViewName.gravity = Gravity
                .CENTER

            cardView.radius = h * 0.1f
            cardView.cardElevation = h * 0.05f

            cardView.bound(
                (parentWidth - w) * 0.5f,
                h * 0.3f,
                w.toInt(),
                -2
            )

            textViewName.bound(
                0f,
                0f,
                -1,
                -1,
            )

            cardView.addView(
                textViewName
            )

            cardView.setOnClickListener {
                context.startActivity(
                    Intent(
                        context,
                        if (Application.ROLE == Roles.APPLICANT)
                            MajorDetailsActivity::class.java
                        else MajorEditActivity::class.java
                    )
                )
            }

            return MajorViewHolder(
                cardView,
                textViewName
            )

        }
    }
}