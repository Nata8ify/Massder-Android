package com.domain.massder.presentation.main.viewholder

import android.view.View
import com.domain.massder.R
import com.domain.massder.data.model.RecommendMassager
import com.domain.massder.presentation._base.AbstractBaseViewHolder
import kotlinx.android.synthetic.main.item_recommend_massager.view.*

class RecommendMassagerViewHolder(itemView: View) : AbstractBaseViewHolder(itemView) {

    fun bind(massger: RecommendMassager) {
        itemView.tv_massager_name.text = massger.name
            itemView.rb_massager_rating.rating = massger.rating
            itemView.tv_rating_amount.text = massger.ratingAmount.toString()
            itemView.tv_operate_area.text = massger.operateArea
            itemView.tv_bio.text = massger.bio
            itemView.tv_service_fee.text = "฿${massger.serviceFee}"

            val isFreeCancel = if(massger.isFreeCancel) {getString(R.string.common_free_cancel)} else {""}
            itemView.tv_addition.text = " ${getString(R.string.common_per_person)} · $isFreeCancel"
    }
}