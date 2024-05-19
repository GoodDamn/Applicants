package com.example.shitproject.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shitproject.models.EventModel
import com.example.shitproject.view_holder.EventViewHolder

class EventsAdapter(
    private val mViewModel: Array<EventModel>
): RecyclerView.Adapter<EventViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EventViewHolder {
        return EventViewHolder.create(
            parent.context
        )
    }

    override fun getItemCount(): Int {
        return mViewModel.size
    }

    override fun onBindViewHolder(
        holder: EventViewHolder,
        position: Int
    ) {
        mViewModel[position].let {
            holder.date = it.date
            holder.name = it.name
        }
    }

}