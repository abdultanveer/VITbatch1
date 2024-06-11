package com.example.vitbatch1

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //get intent which sttarted this activity
        //get the extras from that intent
        //get the string with mykey
        var data = intent.extras?.getString("mykey")
        Log.i("homeactivity",data.toString())
        //put the data either in a log or on the textview
        var homeTextView:TextView = findViewById(R.id.tvHome)
        homeTextView.setText(data)
    }
}