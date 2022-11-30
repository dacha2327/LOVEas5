package com.dacha.loveas5.OnBoard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dacha.loveas5.databinding.FragmentOnBoardingBinding
import com.dacha.taskmanager1.data.local.PrefOnBoarding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class onBoardingFragment: Fragment() {
    private lateinit var pref: PrefOnBoarding

    private lateinit var binding: FragmentOnBoardingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardingBinding.inflate(inflater , container , false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pref = PrefOnBoarding(requireContext())
        val adapter=onBoardingAdapter{
            pref.saveOnBoardingShow(true)
            findNavController().navigateUp()
        }
        binding.viewPager.adapter = adapter
        binding.wormDotsIndicator.setViewPager2(binding.viewPager)

    }
}