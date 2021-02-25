package com.example.myrecycleview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecycleview.databinding.LayoutRecycleViewBinding

class ItemListViewHolder(val view : View) : RecyclerView.ViewHolder(view) {

    val binding = LayoutRecycleViewBinding.bind(view)

    fun bind(itemData: ItemData) {
        binding.apply {
            itemNameTextView.setText(itemData.nama)
            itemCategoryTextView.setText(itemData.category)
            itemQtyTextView.setText(itemData.quantity)
        }

    }
}