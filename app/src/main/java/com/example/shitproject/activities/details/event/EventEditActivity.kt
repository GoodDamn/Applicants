package com.example.shitproject.activities.details.event

import android.os.Bundle
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.shitproject.Application
import com.example.shitproject.R
import com.example.shitproject.Roles

class EventEditActivity
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

        val textViewName = EditText(
            context
        )

        val textViewDescription = EditText(
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

        textViewName.hint = "Event Name"
        textViewDescription.hint = "Event description"

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