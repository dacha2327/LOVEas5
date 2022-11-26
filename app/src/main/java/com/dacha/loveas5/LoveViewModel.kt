package com.dacha.loveas5

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dacha.loveas5.Retrofit.LoveModel

class LoveViewModel: ViewModel() {
    val repository= Repository()

    fun liveModel( firstName: String ,secondName: String): LiveData<LoveModel>{
        return repository.getLoveModel(firstName , secondName)
    }

}