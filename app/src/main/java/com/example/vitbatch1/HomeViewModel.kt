package com.example.vitbatch1

import android.os.CountDownTimer
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel:ViewModel() {
    var TAG = HomeViewModel::class.java.simpleName
    var count = 0
    var _seconds = MutableLiveData<Int>() //livedata = observable

    fun incrementCount(){
        count++
    }

    fun startTimer(){
        var timer = object: CountDownTimer(10_000,1_000){
            override fun onTick(millisUntilFinished: Long) {
                Log.i(TAG,"time remaining ="+millisUntilFinished)
                _seconds.value = millisUntilFinished.toInt()
            }

            override fun onFinish() {
                Log.i(TAG,"timer completed")
            }
        }.start()
    }
}