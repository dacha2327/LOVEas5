package com.dacha.loveas5.Retrofit

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import java.io.Serializable

data class LoveModel (
  @SerializedName("fname")
  var firstName :String,
  @SerializedName("sname")
  var secondName :String,
  var percentage :String,
  var result:String
  ):Serializable