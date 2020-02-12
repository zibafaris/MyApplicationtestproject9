package com.example.myapplicationa3.mvpAzhan

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationa3.R
import kotlinx.android.synthetic.main.activity_search.*

public class mvpTest : AppCompatActivity(), Contract.View {
    override fun getcityName() = edtcity.text.toString()

    override fun getcountryName() = edtcountry.text.toString()

    private val presenter : Contract.Presenter = presenterTest(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        btnreview.setOnClickListener {
            presenter.onLoginButtonClicked()
        }
    }

    override fun showSuccess() = Toast.makeText(this, "OK", Toast.LENGTH_LONG).show()

    override fun showError() = Toast.makeText(this, "Nokey", Toast.LENGTH_LONG).show()

    override fun getUserPass(): Pair<String, String> {
        val city  = getcityName()
        val country = getcountryName()

        return city to country
    }
}
