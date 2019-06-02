package com.domain.massder.presentation.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.domain.massder.R
import com.domain.massder.data.model.WorkingPlace
import com.domain.massder.presentation.main.viewholder.WorkingPlaceViewHolder

class WorkingPlaceAdapter : RecyclerView.Adapter<WorkingPlaceViewHolder>() {
    lateinit var workingPlaces: List<WorkingPlace>

    companion object {
        fun newInstance(workingPlaces: List<WorkingPlace>): WorkingPlaceAdapter {
            return WorkingPlaceAdapter().apply {
                this@apply.workingPlaces = workingPlaces
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkingPlaceViewHolder {
        return WorkingPlaceViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_working_place, parent,false))
    }

    override fun getItemCount(): Int = workingPlaces.size

    override fun onBindViewHolder(holder: WorkingPlaceViewHolder, position: Int) {
        holder.bind(workingPlaces[position])
    }
}