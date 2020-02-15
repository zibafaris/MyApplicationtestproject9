package com.example.myapplicationa3.mvpAzhan


interface Contract {

    interface MainView:parentView{
        fun openDrawer()
        fun OpenSearchPage()
    }

    interface ResultView:parentView
    {
    }

    interface SearchView:parentView
    {
        fun getCountryAndCity():Pair<String,String>
        fun OpenResultPage(model: ModelTest)
    }

    interface Presenter{
        fun btnSearchCityClicked()
        fun btnTimesClicked()
        fun BtnSearchClicked()
        fun showResultPage()
    }
    interface parentView{}
}