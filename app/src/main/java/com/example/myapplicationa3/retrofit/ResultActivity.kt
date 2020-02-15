package com.example.myapplicationa3.retrofit

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationa3.R
import com.example.myapplicationa3.mvpAzhan.Contract
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity(),Contract.ResultView{

    @SuppressLint("NewApi", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var intent = getIntent()

        txtSunrise.text = "toloe : "+intent.getStringExtra("toloe")
        txtFajr.text = "Azan Sobh : "+ intent.getStringExtra("Sobh")
        txtDhuhur.text = "Azane Zohr : "+intent.getStringExtra("Zohr")
        txtSunset.text = "Maghroub : "+intent.getStringExtra("ghorub")
        txtMidnight.text = "Nime Shab : "+intent.getStringExtra("nimeshab")
    }
}
