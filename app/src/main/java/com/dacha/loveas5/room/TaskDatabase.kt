package com.dacha.loveas5.room

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase
import com.dacha.loveas5.Retrofit.LoveModel

@Database(entities = [LoveModel::class] , version = 1)
abstract class TaskDatabase: RoomDatabase(){
    abstract fun loveDao() : LoveDao


}