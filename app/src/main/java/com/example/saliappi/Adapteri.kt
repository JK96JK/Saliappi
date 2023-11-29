package com.example.saliappi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView

class Adapteri (
    private val exerciseList : List<Pair<String, Double>>
) : RecyclerView.Adapter<Adapteri.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_todo,
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = exerciseList[position]
        holder.itemView.apply {
            textView3.text
        }
    }

    override fun getItemCount(): Int {
        return exerciseList.size
    }
}