package com.dacha.loveas5.Retrofit

import android.app.Application
import retrofit2.Retrofit

class App : Application() {

    companion object {
        lateinit var api: LoveInterface
    }

    override fun onCreate() {
        super.onCreate()
        api = Retrofit().api
    }
}