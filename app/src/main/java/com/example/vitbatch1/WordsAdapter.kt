package com.example.vitbatch1

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class WordsAdapter : RecyclerView.Adapter<WordsAdapter.WordsViewHolder>() {


    //avinash -- buy row planks from market n give it to sundar
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsViewHolder {
        TODO("Not yet implemented")
    }

    //balaji --keeping count of no of items in the dataset n informs avinash
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    //chirag -- write the data on the row plank given by sundar
    override fun onBindViewHolder(holder: WordsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    //sundar -- maintain the reserve planks in the holder box
    class WordsViewHolder(itemView: View) : ViewHolder(itemView){

    }

}