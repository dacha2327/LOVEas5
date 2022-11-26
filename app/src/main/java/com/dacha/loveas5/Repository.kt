package com.dacha.loveas5

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.dacha.loveas5.Retrofit.App.Companion.api
import com.dacha.loveas5.Retrofit.LoveModel
import com.dacha.loveas5.Retrofit.Retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {
    fun getLoveModel(firstName : String ,secondName: String):MutableLiveData<LoveModel>{
        val liveModel  = MutableLiveData<LoveModel>()
        Retrofit().api.calculateLove(firstName , secondName).enqueue(object :Callback<LoveModel>{
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                if (response.isSuccessful){
                    liveModel.postValue(response.body())
                }
            }

            override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                Log.e("ololo" ,"onFailure${t.message}")
            }
        })








        return liveModel
    }
}