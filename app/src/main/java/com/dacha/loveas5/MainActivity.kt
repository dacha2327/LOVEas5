package com.dacha.loveas5

import android.content.Intent
import android.net.DnsResolver
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dacha.loveas5.Retrofit.App
import com.dacha.loveas5.Retrofit.LoveInterface
import com.dacha.loveas5.Retrofit.LoveModel
import com.dacha.loveas5.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response





class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}