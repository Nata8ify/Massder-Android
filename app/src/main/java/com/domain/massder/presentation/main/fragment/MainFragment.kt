package com.domain.massder.presentation.main.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.domain.massder.R
import com.domain.massder.data.model.getMockedRecommendMassager
import com.domain.massder.presentation._base.AbstractBaseFragment
import com.domain.massder.presentation.main.adapter.RecommendMassgerAdapter
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : AbstractBaseFragment() {

    companion object {
        fun newInstance() : MainFragment {
            return MainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return  hurryInflate(R.layout.fragment_main, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.rv_recommend_for_you.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = RecommendMassgerAdapter.newInstance(getMockedRecommendMassager())
        }
    }
}