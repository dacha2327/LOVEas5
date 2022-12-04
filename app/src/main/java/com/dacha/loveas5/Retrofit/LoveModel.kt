package com.dacha.loveas5.Retrofit

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import retrofit2.Call
import java.io.Serializable
@Entity
data class LoveModel (
  @SerializedName("fname")
  var firstName :String,
  @SerializedName("sname")
  var secondName :String,
  var percentage :String,
  var result:String,
  @PrimaryKey(autoGenerate = true)
  var id : Long? = null
  ):Serializable