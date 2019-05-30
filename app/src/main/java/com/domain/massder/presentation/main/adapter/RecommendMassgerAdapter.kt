package com.domain.massder.presentation.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.domain.massder.R
import com.domain.massder.data.model.RecommendMassager
import com.domain.massder.presentation.main.viewholder.RecommendMassagerViewHolder

class RecommendMassgerAdapter : RecyclerView.Adapter<RecommendMassagerViewHolder>() {

    lateinit var massagers : List<RecommendMassager>

    companion object {
        fun newInstance(massagers : List<RecommendMassager>) : RecommendMassgerAdapter {
            return RecommendMassgerAdapter().apply {
                this@apply.massagers = massagers
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendMassagerViewHolder {
        return RecommendMassagerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recommend_massager, parent, false))
    }

    override fun onBindViewHolder(holder: RecommendMassagerViewHolder, position: Int) {
        holder.bind(massagers[position])
    }

    override fun getItemCount(): Int = massagers.size

}