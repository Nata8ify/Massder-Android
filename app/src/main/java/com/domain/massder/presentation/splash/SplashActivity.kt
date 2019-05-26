package com.domain.massder.presentation.splash

import android.os.Bundle
import android.widget.Toast
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import com.domain.massder.Manifest
import com.domain.massder.R
import com.domain.massder.presentation._base.AbstractBaseActivity
import com.domain.massder.presentation.main.MainActivity

class SplashActivity : AbstractBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Dexter.withActivity(this)
            .withPermissions(Manifest.permission.ACCESS_FINE_LOCATION)
            .withListener(object : MultiplePermissionsListener{
                override fun onPermissionsChecked(report: MultiplePermissionsReport?) {
                    if(report?.isAnyPermissionPermanentlyDenied == true){
                        Toast.makeText(this@SplashActivity, "Location Service is Necessary!", Toast.LENGTH_LONG).show()
                        finish()
                    } else {
                        startActivity(MainActivity::class.java)
                        finish()
                    }
                }

                override fun onPermissionRationaleShouldBeShown(
                    permissions: MutableList<PermissionRequest>?,
                    token: PermissionToken?
                ) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }
            }).check()
    }
}
