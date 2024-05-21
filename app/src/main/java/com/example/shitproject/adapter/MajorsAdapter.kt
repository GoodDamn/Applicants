package com.example.shitproject.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shitproject.models.Major
import com.example.shitproject.view_holder.MajorViewHolder

class MajorsAdapter(
    private val mViewModel: Array<Major>
): RecyclerView.Adapter<MajorViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MajorViewHolder {
        return MajorViewHolder.create(
            parent.context,
            parent.measuredWidth
        )
    }

    override fun getItemCount(): Int {
        return mViewModel.size
    }

    override fun onBindViewHolder(
        holder: MajorViewHolder,
        position: Int
    ) {
        mViewModel[position].let {
            holder.name = it.name
        }
    }

}