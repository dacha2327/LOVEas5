package com.dacha.taskmanager1.data.local

import android.content.Context
import android.content.SharedPreferences
import com.dacha.loveas5.MainActivity
import javax.inject.Inject

class PrefOnBoarding(private val context: Context){
    private var pref:SharedPreferences = context.getSharedPreferences(PREF_BOARD , Context.MODE_PRIVATE)

    fun isonBoardingShow():Boolean{
        return pref.getBoolean(SHOW_BOARDING , false)
    }
    fun saveOnBoardingShow(isShow: Boolean){
        pref.edit().putBoolean(SHOW_BOARDING , isShow).apply()
    }


    companion object{
        const val PREF_BOARD = "pref.task"
        const val SHOW_BOARDING = "board"
    }
}