package com.domain.massder.presentation.profile

import android.os.Bundle
import com.domain.massder.R
import com.domain.massder.presentation._base.AbstractBaseActivity

class ProfileActivity : AbstractBaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    override fun initPostCreateObserver() {
//        spotViewModel.exception.observe(this@ProfileActivity, Observer {
//            when (it) {
//                is SocketTimeoutException -> {
//                    Toast.makeText(
//                        this@ProfileActivity,
//                        getString(R.string.ghost_retry_connect_sentence),
//                        Toast.LENGTH_LONG
//                    ).show()
//                    showAlertDialog(
//                        it.localizedMessage,
//                        posButtonTitle = R.string.common_retry,
//                        posDialog = DialogInterface.OnClickListener { dialog, which ->
//                            spotViewModel.loadSpots() // Action : Retry
//                        })
//                }
//            }
//        })
//        spotViewModel.isLoading.observe(this, Observer { isLoading ->
//            if (isLoading) {
//                showLoadingDialog()
//            } else {
//                hideLoadingDialog()
//            }
//        })
    }

}
