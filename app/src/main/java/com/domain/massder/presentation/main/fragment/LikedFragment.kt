package com.domain.massder.presentation.main.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.domain.massder.R
import com.domain.massder.presentation._base.AbstractBaseFragment

class LikedFragment : AbstractBaseFragment() {

    companion object {
        fun newInstance() : LikedFragment {
            return LikedFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return hurryInflate(R.layout.fragment_liked, container)
    }
}