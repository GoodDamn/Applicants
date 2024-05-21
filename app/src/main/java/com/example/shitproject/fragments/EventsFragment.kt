package com.example.shitproject.fragments

import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shitproject.R
import com.example.shitproject.adapter.EventsAdapter
import com.example.shitproject.models.EventModel
import kotlin.math.log

class EventsFragment
: Fragment() {

    companion object {
        private const val TAG = "EventsFragment"
    }
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val context = context
            ?: return null

        val recyclerView = RecyclerView(
            context
        )
        
        val data = arrayOf(
            EventModel(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.b
                ),
                "День открытых  дверей в Иннополисе",
                "24.04.2025 15:00 UTC+03"
            ),
            EventModel(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.ic_events
                ),
                "Экскурсия во VK",
                "22.04.2025 12:40 UTC+03"
            ),
            EventModel(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.logo
                ),
                "Экскурсия в LimeX",
                "27.04.2024 15:00 UTC+03"
            ),
        )

        recyclerView.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL,
            false
        )

        recyclerView.adapter = EventsAdapter(
            data
        )

        return recyclerView
    }

}