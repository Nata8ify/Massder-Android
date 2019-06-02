package com.domain.massder.presentation.main

import android.content.Intent
import android.os.Bundle
import androidx.core.view.marginTop
import com.domain.massder.R
import com.domain.massder.presentation._base.AbstractBaseActivity
import com.domain.massder.presentation.main.fragment.LikedFragment
import com.domain.massder.presentation.main.fragment.MainFragment
import com.domain.massder.presentation.main.fragment.MessageFragment
import com.domain.massder.presentation.profile.ProfileActivity
import com.jakewharton.rxbinding2.view.RxView
import com.jakewharton.rxbinding2.view.clicks
import io.reactivex.rxkotlin.subscribeBy
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_menu_tab.*

class MainActivity : AbstractBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun initPostCreateView() {
        super.initPostCreateView()
    }

    override fun initPostCreateListener() {
        RxView.clicks(tv_tab_main).subscribeBy {
            supportFragmentManager.beginTransaction().replace(ll_main_container.id, MainFragment.newInstance()).commit()
        }
        RxView.clicks(tv_tab_liked).subscribeBy {
            supportFragmentManager.beginTransaction().replace(ll_main_container.id, LikedFragment.newInstance()).commit()
        }
        RxView.clicks(tv_tab_message).subscribeBy {
            supportFragmentManager.beginTransaction().replace(ll_main_container.id, MessageFragment.newInstance()).commit()
        }
        RxView.clicks(tv_tab_profile).subscribeBy {
            val profileActivityIntent = Intent(applicationContext, ProfileActivity::class.java)
            startActivity(profileActivityIntent)
        }
    }

    override fun initPostCreateObserver() {
//        mainViewModel.exception.observe(this@MainActivity, Observer {
//            when (it) {
//                is SocketTimeoutException -> {
//                    showAlertDialog(
//                        getString(R.string.ghost_retry_connect_sentence),
//                        posButtonTitle = R.string.common_retry,
//                        posDialog = DialogInterface.OnClickListener { dialog, which ->
//                            mainViewModel.loadSpots() // Action : Retry
//                        })
//                }
//            }
//        })
//        mainViewModel.isLoading.observe(this@MainActivity, Observer { isLoading ->
//            if (isLoading) {
//                showLoadingDialog()
//            } else {
//                hideLoadingDialog()
//            }
//        })
    }

    override fun initPostCreateAction() {
        tv_tab_main.performClick()
    }
}
