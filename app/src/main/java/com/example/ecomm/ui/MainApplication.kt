package com.example.ecomm.ui

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.example.ecomm.util.networkModule
import com.example.ecomm.util.repositoryModule
import com.example.ecomm.util.viewModelModule
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(
                viewModelModule,
                repositoryModule,
                networkModule
            ))
        }
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

}