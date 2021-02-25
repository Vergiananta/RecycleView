package com.example.myrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var itemListRecyclerView: RecyclerView
    private lateinit var itemListViewAdapter: ItemListViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemListRecyclerView = findViewById(R.id.itemList_recycleView)
        itemListViewAdapter = ItemListViewAdapter(arrayListOf(ItemData("Sari Roti", "Roti", 2)))

        itemListRecyclerView.layoutManager = LinearLayoutManager(this)
        itemListRecyclerView.adapter = itemListViewAdapter
    }


}