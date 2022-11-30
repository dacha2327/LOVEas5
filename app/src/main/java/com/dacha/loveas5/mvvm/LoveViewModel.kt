package com.dacha.loveas5.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dacha.loveas5.Retrofit.LoveModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoveViewModel @Inject constructor(private val repository: Repository): ViewModel() {


    fun liveModel( firstName: String ,secondName: String): LiveData<LoveModel>{
        return repository.getLoveModel(firstName , secondName)
    }

}