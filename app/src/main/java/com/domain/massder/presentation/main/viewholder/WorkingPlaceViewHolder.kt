package com.domain.massder.presentation.main.viewholder

import android.view.View
import com.bumptech.glide.Glide
import com.domain.massder.data.model.WorkingPlace
import com.domain.massder.presentation._base.AbstractBaseViewHolder
import kotlinx.android.synthetic.main.item_working_place.view.*

class WorkingPlaceViewHolder(itemView: View) : AbstractBaseViewHolder(itemView) {

    fun bind(workingPlace: WorkingPlace){
        Glide.with(getContext()).load(workingPlace.imageUrl).into(itemView.imv_working_place)
        itemView.tv_working_palce.text = workingPlace.placeName
    }
}