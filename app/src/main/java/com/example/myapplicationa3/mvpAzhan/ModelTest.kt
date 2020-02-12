package com.example.myapplicationa3.mvpAzhan

class ModelTest(private val presenter: Contract.ParentPresenter) {

    fun checkcitycountry(country: String, city: String) {
        if (country == "Iran" && city == "Tehran")
            (presenter as Contract.Presenter).onVerificationResponse(true)
        else
            (presenter as Contract.Presenter).onVerificationResponse(false)
    }
}