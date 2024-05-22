package com.example.shitproject.activities.details

import android.os.Bundle
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.shitproject.Application
import com.example.shitproject.R
import com.example.shitproject.Roles
import com.example.shitproject.extensions.bound
import kotlin.math.roundToInt

class EventDetailsActivity
: AppCompatActivity() {

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        val context = this

        val scrollView = ScrollView(
            context
        )

        val layout = LinearLayout(
            context
        )

        val imageViewPreview = ImageView(
            context
        )

        val textViewName = TextView(
            context
        )

        val textViewDescription = TextView(
            context
        )

        layout.orientation = LinearLayout
            .VERTICAL

        imageViewPreview.setImageDrawable(
            ContextCompat.getDrawable(
                context,
                R.drawable.b
            )
        )

        textViewName.setTextSize(
            TypedValue.COMPLEX_UNIT_PX,
            Application.WIDTH * 0.07f
        )

        textViewName.setTextColor(
            0xff000000.toInt()
        )

        textViewName.text = "Some title for event"
        textViewDescription.text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum." +
            "\n\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum." +
            "\n\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."

        layout.addView(
            imageViewPreview,
            -1,
            (Application.WIDTH * 0.5f).toInt()
        )

        layout.addView(
            textViewName,
            -1,
            -2
        )

        layout.addView(
            textViewDescription,
            -1,
            -2
        )

        if (Application.ROLE == Roles.APPLICANT) {
            val btnAccept = Button(
                context
            )
            btnAccept.text = "Accept"
            layout.addView(
                btnAccept,
                -1,
                -2
            )
        }

        scrollView.addView(
            layout,
            -1,
            -1
        )

        scrollView.layoutParams = ViewGroup
            .LayoutParams(-1,-1)

        setContentView(
            scrollView
        )
    }

}