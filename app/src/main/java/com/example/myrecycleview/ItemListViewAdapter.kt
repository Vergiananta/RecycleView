package com.example.myrecycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemListViewAdapter(val items : ArrayList<ItemData>)
    : RecyclerView.Adapter<ItemListViewHolder>() {

//    RecyclerView memanggil method ini setiap kali perlu membuat ViewHolder baru.
//    Metode ini membuat serta menginisialisasi ViewHolder dan View-nya yang diatribusikan,
//    tetapi tidak mengisi konten tampilan—ViewHolder belum terikat dengan data tertentu.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
    : ItemListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_recycle_view,
            parent,false)
        return ItemListViewHolder(view)
    }

    // RecycleView memanggil method ini untuk mengdistribusikan ViewHolder dengan data
    override fun onBindViewHolder(holder: ItemListViewHolder, position: Int) {
        val product = items.get(position)
        holder.bind(product)
    }

    // RecycleView memanggil method ini untuk mendapatkan ukuran setData
    override fun getItemCount() = items.size
}