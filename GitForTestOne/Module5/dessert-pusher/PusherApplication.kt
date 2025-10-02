package com.example.android.dessertpusher

import android.app.Application

class PusherApplication : Applilation() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}