package com.dacha.loveas5

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dacha.loveas5.Retrofit.App
import com.dacha.loveas5.Retrofit.LoveModel
import com.dacha.loveas5.databinding.FragmentMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainFragment : Fragment() {

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
                App.api.calculateLove(firstEd.text.toString() , secondEd.text.toString()).enqueue(object:
                    Callback<LoveModel> {
                    override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                        if (response.isSuccessful){
                            Log.e("ololo", "onResponse: ${response.body()}", )
                            val bundle = Bundle()
                            bundle.putSerializable("loveModel",response.body())
                            findNavController().navigate(R.id.secondFragment,bundle)
                        }

                    }
                    override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                        Log.e("ololo" ,"Failure: ${t.message}")
                    }

                })
            }
        }
    }

}