package com.example.videoreciver.service

import com.example.videoreciver.model.TokenRequest
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface RetrofitService {
    @GET("/settoken")
    fun sendToken(@Query("token") token: String, @Query("data") data: String): Call<ResponseBody>

}