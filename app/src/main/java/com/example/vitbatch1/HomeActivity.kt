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
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.vitbatch1.database.Item
import com.example.vitbatch1.database.ItemDao
import com.example.vitbatch1.database.ItemRoomDatabase
import com.example.vitbatch1.databinding.ActivityHomeBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.last
import kotlinx.coroutines.flow.single
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {
    var TAG = HomeActivity::class.java.simpleName    //"HomeActivity"
    private lateinit var binding: ActivityHomeBinding
    lateinit var dao: ItemDao
    lateinit var viewModel: HomeViewModel

    //var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var  database = ItemRoomDatabase.getDatabase(this)
        dao = database.itemDao()
        viewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        viewModel._seconds.observe(this, secsObserver);

       //binding.tvHome.setText(""+viewModel.count)
        binding.btnDbInsert.setOnClickListener{
            insertDataDb()
        }

        binding.btnFind.setOnClickListener{
            findItemDb(21)
        }

        binding.btnInc.setOnClickListener{
            //count++
            viewModel.incrementCount()
            binding.tvHome.setText(""+viewModel.count)
        }

        binding.btnTimer.setOnClickListener{
            viewModel.startTimer()
            binding.tvHome.setText(""+viewModel._seconds)
        }
    }

    fun add(a:Int,b:Int):Int{
        return a+b
    }

    private fun findItemDb(id: Int) {
        GlobalScope.launch(Dispatchers.Main) {
            var item = dao.getItem(id).first()
            binding.tvHome.setText(item.itemName)
        }
    }

    private fun insertDataDb() {
        GlobalScope.launch {
            var item = Item(21,"fruits",11.11,11)
            dao.insert(item)
        }
    }

    var secsObserver : Observer<Int> = object :Observer<Int>{
        override fun onChanged(observedValue: Int) {
            //receiving the update/notification
            binding.tvHome.setText(observedValue.toString())
        }
    }


}