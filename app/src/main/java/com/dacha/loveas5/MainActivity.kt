package com.dacha.loveas5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.dacha.loveas5.databinding.ActivityMainBinding
import com.dacha.taskmanager1.data.local.PrefOnBoarding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var prefOnBoard : PrefOnBoarding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        prefOnBoard = PrefOnBoarding(this)

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        if (!prefOnBoard.isonBoardingShow()){
            navController.navigate(R.id.onBoardingFragment)
        }
    }
}