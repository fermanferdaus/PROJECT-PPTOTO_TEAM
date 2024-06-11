package com.uti.panduansuksesbertanisayuran.Class

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uti.panduansuksesbertanisayuran.R

class ContentAdapter {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemText: TextView = view.findViewById(R.id.item_text) // TextView untuk menampilkan judul item
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_content, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val (title, url) = contentList[position]
        holder.itemText.text = title

        holder.itemView.setOnClickListener {
            onItemClick(title, url)
        }
    }
}