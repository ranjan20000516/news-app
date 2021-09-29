package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycle_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

    }

    private fun data(): ArrayList<String> {

        val list = ArrayList<String>()
        for (i in 0 until 100) {
            list.add("item $i")
        }
        return list
    }
}