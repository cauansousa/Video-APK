package com.example.videoreciver.request

import android.util.Log
import com.example.videoreciver.model.TokenRequest
import com.example.videoreciver.service.RetrofitService
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitRequest {

    fun setToken(token: String, data: String) {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://app-basic-spring-7b7b095b6c9d.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiService = retrofit.create(RetrofitService::class.java)

        apiService.sendToken(token, data).enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                Log.d("RESPONSE", "Enviado")
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
            }
        })
    }
}