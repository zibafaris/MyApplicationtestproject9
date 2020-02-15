package com.example.myapplicationa3.mvpAzhan

import android.util.Log
import com.example.myapplicationa3.retrofit.azhanInterface
import com.example.myapplicationa3.retrofit.jsonClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ModelTest(private val presenter: Contract.Presenter) {

    var azanSob=""
    var tolu=""
    var azanZohr=""
    var ghorub=""
    var maghrib=""
    var nimeshab=""

    fun fillTimes(country:String,city:String)
    {
        val retrofit= Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.aladhan.com/v1/")
            .build()
        val timesInterface=retrofit.create(azhanInterface::class.java)
        timesInterface.getTimings(city,country,8)
            .enqueue(object: Callback<jsonClass>{
                override fun onFailure(call: Call<jsonClass>, t: Throwable) {
                    Log.d("TAG",t.message)
                }

                override fun onResponse(
                    call: Call<jsonClass>,
                    response: Response<jsonClass>
                ) {

                    tolu=response.body()?.data?.timings?.Sunrise.toString()
                    azanSob=response.body()?.data?.timings?.Fajr.toString()
                    azanZohr=response.body()?.data?.timings?.Dhuhr.toString()
                    ghorub=response.body()?.data?.timings?.Maghrib.toString()
                    nimeshab=response.body()?.data?.timings?.Midnight.toString()
                    presenter.showResultPage()
                }
            })
    }
}
