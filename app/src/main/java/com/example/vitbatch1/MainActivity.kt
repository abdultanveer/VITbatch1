package com.example.vitbatch1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.vitbatch1.kotlinexs.Employee

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // var myEmp = Employee("abdul")
    }

    fun clickHandler(view: View) {
        Log.i("MainActivity-clickhandler","button clicked")
     /*  var dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:98765432"))  //intent= intention
        var webIntent: Intent = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ndtv.com"))
        startActivity(webIntent)*/

        var hIntent:Intent = Intent(this,HomeActivity::class.java)
        hIntent.putExtra("mykey","android-vit-abdul")
        startActivity(hIntent)
    }
}