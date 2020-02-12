package com.example.myapplicationa3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplicationa3.retrofit.searchActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val listItem= arrayListOf("Prayer Times","....","....","....","....","....")

        recycler.layoutManager = LinearLayoutManager(this)

//        val button1 = button1
        button1.setOnClickListener()
        {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        val clickListener:(String)->Unit={
            Toast.makeText(this,it, Toast.LENGTH_SHORT).show()
        }
        val adapter=ListAdapter(listItem,this)
        recycler.adapter=adapter

    }
    fun onClick(name: String?) {
        Toast.makeText(this,name, Toast.LENGTH_SHORT).show()
        val intent = Intent(this, searchActivity::class.java)
        startActivity(intent)

    }

}
