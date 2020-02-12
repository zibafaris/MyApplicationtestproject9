package com.example.myapplicationa3.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface azhanInterface {

    @GET("http://api.aladhan.com/v1/")
    fun getTimings(
        @Query("country") country: String,
        @Query("city") city: String,
        @Query("method") method: Int
        ): Call<jsonClass>
}