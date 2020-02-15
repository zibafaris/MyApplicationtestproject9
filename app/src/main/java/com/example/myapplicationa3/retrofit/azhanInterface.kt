package com.example.myapplicationa3.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface azhanInterface {

    @GET("timingsByCity")
    //http://api.aladhan.com/v1/timingsByCity?city=Tehran&country=Iran&method=8
    fun getTimings(
        @Query("city")city: String,
        @Query("country")country: String,
        @Query("method")method: Int
        ): Call<jsonClass>
}