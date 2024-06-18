package com.example.vitbatch1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    var dataArray = arrayOf("india","hindi","australia","peacock","blue")
    var TAG = HomeActivity::class.java.simpleName    //"HomeActivity"
    lateinit var mySpinner: Spinner
    lateinit var myRecycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        mySpinner = findViewById(R.id.spinner) //taking handle
        myRecycler = findViewById(R.id.recyclerView)
        myRecycler.layoutManager = GridLayoutManager(this,2)
            //LinearLayoutManager(this)
        var wordsAdapter = WordsAdapter(dataArray)
        myRecycler.adapter = wordsAdapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        mySpinner.onItemSelectedListener = this
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

    fun getShowText(view: View) {
        var etUi:EditText = findViewById(R.id.etUItest)
        var text = etUi.text.toString()
        var tvUi:TextView = findViewById(R.id.tvUI)
        tvUi.setText(text)
    }

    //suspend itself --resume
    fun  downloadImage(){
        //50
        //10
        //11-20 - internnet/ db/ image processing
    }

    //http://openweathermap.com/getweather/city=bangalore
    fun getWeather(cityName:String):String{
        //query the db and get the data
        return  "{ temp:32, windspeed:40,}"
    }

    //http://openweathermap.com/getTemp/city=bangalore

    fun getTemp(city:String):Int{
        return 25
    }
}