package com.domain.massder.presentation.main.adapter

import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter

@Deprecated("Rather use simple fragment's replacement function than this view pager.")
class MenuTabPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    private lateinit var menuFragments : List<Fragment>

    companion object {
        fun newInstance(fm: FragmentManager?, vararg menu : Fragment) : MenuTabPagerAdapter{
            return MenuTabPagerAdapter(fm).apply {
                this@apply.menuFragments = menuFragments.toList()
            }
        }
    }

    override fun getItem(position: Int): Fragment = menuFragments[position]

    override fun getCount(): Int = menuFragments.size
}