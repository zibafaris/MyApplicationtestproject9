package com.example.myapplicationa3.retrofit

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationa3.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.example.myapplicationa3.retrofit.azhanInterface


class TestRetrofitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ret)


        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.aladhan.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        val timingInterface = retrofit.create(azhanInterface::class.java)


        timingInterface.getTimings("Iran", "Tehran", 8)
            .enqueue(object : Callback<jsonClass> {

                override fun onFailure(call: Call<jsonClass>, t: Throwable) {
                    Log.d("TAG", t.message)
                }

                override fun onResponse(
                    call: Call<jsonClass>,
                    response: Response<jsonClass>
                ) {
                    Log.d("TAG", response.body()?.data?.timings?.Maghrib)
                }

            })

    }
}
