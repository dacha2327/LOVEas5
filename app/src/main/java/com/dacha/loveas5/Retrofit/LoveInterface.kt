package com.dacha.loveas5.Retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveInterface {
    @GET("getPercentage")
    fun calculateLove(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("X-RapidAPI-Key") key:String = "b9deb790b6msh56133561ae75cc0p186728jsnf9125dd3d10e",
        @Header("X-RapidAPI-Host") host:String = "love-calculator.p.rapidapi.com"
    ):Call<LoveModel>

}