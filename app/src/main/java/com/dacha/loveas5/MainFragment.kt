package com.dacha.loveas5

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.dacha.loveas5.Retrofit.App
import com.dacha.loveas5.Retrofit.LoveModel
import com.dacha.loveas5.databinding.FragmentMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainFragment : Fragment() {

    val viewModel: LoveViewModel by viewModels()

    private lateinit var binding:FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClick()
    }

    fun initClick(){
        with(binding){
            btn.setOnClickListener{
               viewModel.liveModel(firstEd.text.toString() , secondEd.text.toString()).observe(
                   viewLifecycleOwner , Observer {
                       val bundle = Bundle()
                       bundle.putSerializable("loveModel",it!!)
                       findNavController().navigate(R.id.secondFragment,bundle)
                   }
               )
            }
        }
    }

}