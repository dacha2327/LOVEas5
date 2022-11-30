package com.dacha.loveas5.di

import android.app.Application
import android.content.Context
import com.dacha.loveas5.Retrofit.LoveInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
class AppModule {


    @Provides
    fun provideApi():LoveInterface{
        return retrofit2.Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com/").addConverterFactory(
            GsonConverterFactory.create()).build().create(LoveInterface::class.java)
    }




}