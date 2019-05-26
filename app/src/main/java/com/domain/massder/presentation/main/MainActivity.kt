package com.domain.massder.presentation.main

import android.os.Bundle
import com.domain.massder.R
import com.domain.massder.presentation._base.AbstractBaseActivity

class MainActivity : AbstractBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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

}
