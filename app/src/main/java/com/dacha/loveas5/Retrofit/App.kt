package com.dacha.loveas5.Retrofit

import android.app.Application
import androidx.room.Room
import com.dacha.loveas5.room.TaskDatabase
import dagger.hilt.android.HiltAndroidApp
import retrofit2.Retrofit

@HiltAndroidApp
class App : Application() {

    companion object{
        lateinit var taskDatabase: TaskDatabase
    }

    override fun onCreate() {
        super.onCreate()
        taskDatabase =
            Room.databaseBuilder(applicationContext , TaskDatabase::class.java , "love")
                .allowMainThreadQueries().build()
    }

}