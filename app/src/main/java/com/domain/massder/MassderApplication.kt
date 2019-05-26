package com.domain.massder

import android.app.Application
import com.domain.massder.module.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MassderApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val koin = startKoin {
            androidContext(this@MassderApplication)
            modules(dataModule)
        }
    }
}