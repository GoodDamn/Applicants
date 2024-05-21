package com.example.shitproject.activities

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.shitproject.Application

class MajorDetailsActivity
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

        textViewName.text = "Some title for major"
        textViewDescription.text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum." +
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

        scrollView.addView(
            layout
        )

        setContentView(
            scrollView
        )
    }

}