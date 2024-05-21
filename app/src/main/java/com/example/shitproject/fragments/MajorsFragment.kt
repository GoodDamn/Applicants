package com.example.shitproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shitproject.R
import com.example.shitproject.adapter.EventsAdapter
import com.example.shitproject.adapter.MajorsAdapter
import com.example.shitproject.models.Event
import com.example.shitproject.models.Major

class MajorsFragment
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
            Major("09.03.01 Computer Science"),
            Major("09.03.03 Software engineering"),
            Major("10.01.00 Economics")
        )

        recyclerView.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL,
            false
        )

        recyclerView.adapter = MajorsAdapter(
            data
        )

        return recyclerView
    }

}