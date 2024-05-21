package com.example.shitproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shitproject.adapter.EventsAdapter
import com.example.shitproject.models.EventModel

class EventsFragment
    : Fragment() {

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
                "День открытых  дверей в Иннополисе",
                "24.04.2025 15:00 UTC+03"
            ),
            EventModel(
                "Экскурсия во VK",
                "22.04.2025 12:40 UTC+03"
            ),
            EventModel(
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