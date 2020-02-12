package com.example.myapplicationa3.mvpAzhan


class presenterTest(private val view: Contract.View) : Contract.Presenter {

    private val model = ModelTest(this)

    override fun onLoginButtonClicked() {
        val (country, city) = view.getUserPass()
        model.checkcitycountry(country, city )
    }

    override fun onVerificationResponse(isValid: Boolean) {
        if (isValid)
            view.showSuccess()
        else
            view.showError()
    }
}