package com.domain.massder.presentation.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.domain.massder.R
import com.domain.massder.data.model.MassagePlan
import com.domain.massder.presentation.main.viewholder.MassagePlanViewHolder

class MassagePlanAdapter : RecyclerView.Adapter<MassagePlanViewHolder>() {
    lateinit var massagePlans: List<MassagePlan>

    companion object {
        fun newInstance(massagePlans: List<MassagePlan>): MassagePlanAdapter {
            return MassagePlanAdapter().apply {
                this@apply.massagePlans = massagePlans
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MassagePlanViewHolder {
        return MassagePlanViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_massage_plan, parent,false))
    }

    override fun getItemCount(): Int = massagePlans.size

    override fun onBindViewHolder(holder: MassagePlanViewHolder, position: Int) {
        holder.bind(massagePlans[position])
    }
}