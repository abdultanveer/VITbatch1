package com.example.vitbatch1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener,
    AdapterView.OnItemClickListener {
    var TAG = HomeActivity::class.java.simpleName    //"HomeActivity"
    lateinit var mySpinner: Spinner
    lateinit var myListview:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        mySpinner = findViewById(R.id.spinner) //taking handle
        myListview = findViewById(R.id.listView)
        myListview.isClickable = true

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        mySpinner.onItemSelectedListener = this
        myListview.setOnItemClickListener(this)
        //get intent which sttarted this activity
        //get the extras from that intent
        //get the string with mykey
      /*  var data = intent.extras?.getString("mykey")
        Log.i("homeactivity",data.toString())
        //put the data either in a log or on the textview
        var homeTextView:TextView = findViewById(R.id.tvHome)
        homeTextView.setText(data)*/
    }

    override fun onItemSelected(adpater: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var item:String = adpater?.getItemAtPosition(position).toString()
      Log.i(TAG, item )
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    override fun onItemClick(adpater: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var item:String = adpater?.getItemAtPosition(position).toString()
        Log.i(TAG, item )    }
}