package com.example.ecomm.ui

import android.app.Application
import com.example.ecomm.di.networkModule
import com.example.ecomm.di.repositoryModule
import com.example.ecomm.di.viewModelModule
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



}