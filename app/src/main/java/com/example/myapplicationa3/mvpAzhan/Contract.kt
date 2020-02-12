package com.example.myapplicationa3.mvpAzhan

interface Contract {

    interface View {
        fun getcityName(): String
        fun getcountryName(): String
        fun showSuccess()
        fun showError()
        fun getUserPass(): Pair<String, String>

    }

    interface Presenter : ParentPresenter {
        fun onLoginButtonClicked()
        fun onVerificationResponse(isValid: Boolean)
    }
    interface ParentPresenter {}
}