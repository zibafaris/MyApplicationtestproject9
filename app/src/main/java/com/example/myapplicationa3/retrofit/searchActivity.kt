package com.example.myapplicationa3.retrofit

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationa3.R

@Suppress("DEPRECATION")
public class searchActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val btnreview: Button = findViewById(R.id.btnreview)
        val edtcity: EditText = findViewById(R.id.edtcity)
        val edtCountry: EditText = findViewById(R.id.edtcountry)

        edtcity.setText(
            PreferenceManager.getDefaultSharedPreferences(this).getString(
                "city",
                ""
            )
        )
        edtCountry.setText(
            PreferenceManager.getDefaultSharedPreferences(this).getString(
                "country",
                ""
            )
        )

        btnreview.setOnClickListener(View.OnClickListener {
            val i = Intent(this, TestRetrofitActivity ::class.java)
            startActivity(intent)
            i.putExtra("city", edtcity.getText().toString())
            i.putExtra("country", edtCountry.getText().toString())

            startActivityForResult(i, 352)
        })

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 352 && resultCode == Activity.RESULT_OK) {

            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("city", data!!.getStringExtra("city")).apply()
            PreferenceManager.getDefaultSharedPreferences(this).edit()
                .putString("country", data.getStringExtra("country")).apply()

            Toast.makeText(this, "register your data successfull", Toast.LENGTH_LONG)
                .show()
        } else {

            Toast.makeText(this, "re enter your data Please", Toast.LENGTH_LONG).show()
        }
    }
}
