package com.domain.massder.presentation.main.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.domain.massder.R
import com.domain.massder.getMockedRecommendMassager
import com.domain.massder.getMockedWorkingPlace
import com.domain.massder.presentation._base.AbstractBaseFragment
import com.domain.massder.presentation.main.adapter.RecommendMassgerAdapter
import com.domain.massder.presentation.main.adapter.WorkingPlaceAdpter
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
        view.rv_where_we_go.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)
            adapter = WorkingPlaceAdpter.newInstance(getMockedWorkingPlace())
        }
    }
}