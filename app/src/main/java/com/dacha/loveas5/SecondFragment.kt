package com.dacha.loveas5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dacha.loveas5.Retrofit.LoveModel
import com.dacha.loveas5.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val loveModel = arguments?.getSerializable("loveModel") as LoveModel
        with(binding) {
            fname.text = loveModel.firstName
            sname.text = loveModel.secondName
            procent.text = loveModel.percentage
            result.text = loveModel.result
        }
    }
}