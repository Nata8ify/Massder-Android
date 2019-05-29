package com.domain.massder.presentation._base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class AbstractBaseFragment : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initPostViewCreatedView()
        initPostViewCreatedListener()
        initPostViewCreatedObserver()
    }

    open fun initPostViewCreatedView(){}
    open fun initPostViewCreatedListener(){}
    open fun initPostViewCreatedObserver(){}

    protected fun hurryInflate(layoutId: Int, container: ViewGroup?) : View {
        return LayoutInflater.from(context).inflate(layoutId, container, false)
    }
}