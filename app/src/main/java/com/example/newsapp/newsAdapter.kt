package com.example.newsapp

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class newsAdapter(items:ArrayList<String>): RecyclerView.Adapter<newsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): newsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: newsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return items.size
    }

}


class newsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
{
    val textTitle:TextView=itemView.findViewById(R.id.text_title)
}

