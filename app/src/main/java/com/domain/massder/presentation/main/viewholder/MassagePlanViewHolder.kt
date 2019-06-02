package com.domain.massder.presentation.main.viewholder

import android.os.Build
import android.text.Layout
import android.view.View
import com.bumptech.glide.Glide
import com.domain.massder.data.model.MassagePlan
import com.domain.massder.presentation._base.AbstractBaseViewHolder
import kotlinx.android.synthetic.main.item_massage_plan.view.*

class MassagePlanViewHolder(itemView: View) : AbstractBaseViewHolder(itemView) {

    fun bind(massagePlan: MassagePlan) {
        Glide.with(getContext()).load(massagePlan.imageUrl).into(itemView.imv_massage_plan)
        itemView.tv_massage_plan_name.text = massagePlan.planName
        itemView.tv_massage_plan_description.apply {
            this@apply.text = "\t${massagePlan.description}"
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                this@apply.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            }
        }
    }
}