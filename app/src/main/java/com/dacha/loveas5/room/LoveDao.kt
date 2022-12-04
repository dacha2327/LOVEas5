package com.dacha.loveas5.room

import androidx.room.*
import androidx.room.Dao
import com.dacha.loveas5.Retrofit.LoveModel

@Dao
interface LoveDao {

    @Insert
    fun  insert(loveModel: LoveModel)

    @Query("SELECT * from lovemodel ORDER BY firstName ASC")
    fun getAlphabetizedWords(): List<LoveModel>

    @Delete
    fun delete(loveModel: LoveModel)

    @Update
    fun update(loveModel: LoveModel)
}